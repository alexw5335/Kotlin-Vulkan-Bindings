package codegen.vulkan.scrape

import codegen.vulkan.name.NamedList
import codegen.vulkan.name.Postfix
import codegen.vulkan.name.ShortNameList
import codegen.vulkan.parse.*
import codegen.vulkan.scrape.ScraperUtils.camelToSnakeCase
import codegen.writer.Primitive
import java.nio.file.Path

class VulkanScraper private constructor(private val registry: ParsedRegistry) {


	companion object {
		fun scrape(registry: ParsedRegistry) = VulkanScraper(registry).scrape()
		fun scrape(vkxmlPath: Path) = scrape(VulkanParser.parse(vkxmlPath))
	}



	private val shortNames = ShortNameList()

	private val types = NamedList<VkType>()

	private val commands = NamedList<Command>()

	private val constants = NamedList<Constant>()

	private val providers = NamedList<Provider>()



	fun scrape() : ScrapedRegistry {
		populateShortNames()
		convertElements()

		val genTypes     = NamedList<VkType>()
		val genCommands  = NamedList<Command>()
		val genConstants = NamedList<Constant>()
		val genProviders = NamedList<Provider>()

		for(provider in registry.providerElements) {
			if(!provider.shouldGen) continue

			for(typeElement in provider.types)
				if(typeElement.shouldGen)
					genTypes.add(types.fromName(typeElement.name))

			for(commandElement in provider.commands)
				if(commandElement.shouldGen)
					genCommands.add(commands.fromName(commandElement.name))
		}

		for(constant in constants)
			if(constant.shouldGen)
				genConstants.add(constant)

		for(provider in providers)
			if(provider.shouldGen)
				genProviders.add(provider)

		val namesToProviders = HashMap<String, Provider>()

		for(provider in providers) {
			for(type in provider.types)
				namesToProviders[type.name] = provider

			for(command in provider.commands)
				namesToProviders[command.name] = provider
		}

		return ScrapedRegistry(genTypes, genCommands, genConstants, genProviders, namesToProviders)
	}



	/*
	Naming
	 */



	private fun addTypeShortName(element: TypeElement) {
		if(element.shouldGen)
			shortNames.add(element.name, element.shortName)

		if(element is EnumElement)
			for(entry in element.entries)
				if(entry.shouldGen)
					shortNames.add(entry.name, entry.shortName)
	}



	private fun addCommandShortName(element: CommandElement) {
		if(element.shouldGen)
			shortNames.add(element.name, element.shortName)
	}



	private fun populateShortNames() {
		for(provider in registry.providerElements) {
			if(!provider.shouldGen) continue

			for(type in provider.types)
				addTypeShortName(type)

			for(command in provider.commands)
				addCommandShortName(command)
		}
	}



	/*
	Conditions
	 */



	private val ProviderElement.shouldGen get() =
		this !is ExtensionElement ||
			(deprecatedBy == null && !disabled && (promotedTo == null || promotedTo == "VK_VERSION_1_2"))



	private val CommandElement.shouldGen get() = alias == null



	private val EnumEntryElement.shouldGen get() =
		alias == null && (extension == null || registry.providerElements.fromName(extension).shouldGen)



	private val TypeElement.shouldGen get() = when(this) {
		is BitmaskElement -> enumName != null && enumNotEmpty(enumName)
		is EnumElement    -> name != "VkStructureType" && enumNotEmpty(name)
		is StructElement  -> true
		is HandleElement  -> true
		else              -> false
	}



	private fun enumNotEmpty(name: String) =
		(registry.typeElements.fromName(name) as EnumElement).entries.isNotEmpty()



	/*
	Naming
	 */



	private val StructElement.genName get() = shortNames.get(name)



	private val HandleElement.genName get() = shortNames.get(name) + "H"



	private val BitmaskElement.genName get() = when {
		shouldGen -> shortNames.get(name)
		is64Bit   -> "Long"
		else      -> "Int"
	}



	private val EnumElement.genName get() = when {
		!shouldGen -> if(is64Bit) "Long" else "Int"
		isFlagBits -> shortNames.get(name.replace("FlagBits", "Flags"))
		else       -> shortNames.get(name)
	}



	private val EnumElement.prefix get() = when {
		!isFlagBits -> Postfix.drop(name).camelToSnakeCase + "_"
		!is64Bit    -> Postfix.drop(name).dropLast(8).camelToSnakeCase + "_"
		else        -> Postfix.drop(name).dropLast(9).camelToSnakeCase + "_2_"
	}



	private fun enumEntryGenName(name: String, prefix: String): String {
		// There are about 4 exceptional entries in the registry that don't start with their enum's entry prefix.
		// There is also the VkResult enum that is only prefixed by VK_
		// In these cases, remove the VK_. Otherwise, remove the whole prefix
		val prefixLength = if(!name.startsWith(prefix)) 3 else prefix.length

		// Drop underscore
		var shortName = shortNames.get(name).drop(prefixLength)

		// Enum names cannot start with digits, prefix with underscore
		if(shortName[0].isDigit()) shortName = "_$shortName"

		// Remove _BIT at the end of bitmask enums (occurs before extension postfix)
		if(shortName.endsWith("_BIT")) shortName = shortName.dropLast(4)

		return shortName
	}



	private fun String.drop(start: Int, end: Int) = substring(start, length - end)

	private val TypeElement.shortName get() = name.drop(2, Postfix.length(name))

	private val CommandElement.shortName get() = name.drop(2, Postfix.length(name)).replaceFirstChar { it.lowercase() }

	private val EnumEntryElement.shortName get() = name.dropLast(Postfix.underscoredLength(name))



	/*
	Element conversion
	 */



	private val EnumElement.convertEnum: VkType get() {
		val prefix = prefix
		val entries = NamedList<EnumEntry>()

		fun value(entry: EnumEntryElement): String =
			entry.value ?:
			value(this.entries.first { it.name == entry.alias })

		for(entry in this.entries) {
			entries.add(EnumEntry(
				name      = entry.name,
				genName   = enumEntryGenName(entry.name, prefix),
				value     = value(entry),
				shouldGen = entry.shouldGen
			))
		}

		return EnumType(
			name,
			genName,
			shouldGen,
			Primitive.integer(is64Bit),
			is64Bit,
			isFlagBits,
			entries
		)
	}



	private val TypeElement.convert: VkType get() = when(this) {
		is EnumElement -> convertEnum

		is BitmaskElement -> BitmaskType(
			name,
			genName,
			shouldGen,
			Primitive.integer(is64Bit),
			is64Bit,
			enumName
		)

		is StructElement -> StructType(
			name,
			genName,
			shouldGen,
			Primitive.LONG,
			isUnion
		)

		is HandleElement -> HandleType(
			name,
			genName,
			shouldGen,
			Primitive.LONG
		)

		is PrimitiveElement -> PrimitiveType(
			name,
			ScraperUtils.resolvePrimitive(primitiveName).kName,
			shouldGen,
			ScraperUtils.resolvePrimitive(primitiveName)
		)

		is NativeElement -> NativeType(
			name,
			ScraperUtils.resolveNative(name).kName,
			shouldGen,
			ScraperUtils.resolveNative(name)
		)

		is FuncPointerElement -> PrimitiveType(
			name,
			"Long",
			shouldGen,
			Primitive.LONG
		)

		is VoidTypeElement -> VoidType

		is AliasedTypeElement -> AliasedType(name, alias)

		else -> UnusedType(name)
	}



	private val VarElement.convert get() = Var(
		name     = name,
		type     = types.fromName(type).resolveAlias,
		optional = optional,
		modifier = modifier,
		index    = index,
		len      = len,
		altLen   = altLen,
		varLen   = varLen,
		constLen = constLen,
		sType    = sType?.let { (types.fromName(type) as EnumType).entries.fromName(it).value }
	)



	private val VkType.resolveAlias: VkType get() = if(this is AliasedType)
		types.fromName(alias).resolveAlias
	else
		this



	private val CommandElement.determineType: CommandType get() {
		if(name == "vkGetInstanceProcAddr") return CommandType.STANDALONE
		if(name == "vkGetDeviceProcAddr") return CommandType.INSTANCE

		return when(params.first().type) {
			"VkInstance"       -> CommandType.INSTANCE
			"VkPhysicalDevice" -> CommandType.INSTANCE
			"VkDevice"         -> CommandType.DEVICE
			"VkQueue"          -> CommandType.DEVICE
			"VkCommandBuffer"  -> CommandType.DEVICE
			else               -> CommandType.STANDALONE
		}
	}



	private val CommandElement.convert get() = Command(
		name       = name,
		genName    = shortNames.get(name),
		shouldGen  = alias == null,
		type       = determineType,
		returnType = returnType?.let(types::fromName),
		params     = params.map { it.convert }
	)



	private val ConstantElement.convert get() = Constant(
		name      = name,
		genName   = name,
		shouldGen = !aliased,
		value     = value,
		aliased   = aliased
	)



	private val NamedList<TypeElement>.convertTypes get() = NamedList<VkType>().also {
		for(element in this)
			if(element.shouldGen)
				it.add(types.fromName(element.name))
	}



	private val NamedList<CommandElement>.convertCommands get() = NamedList<Command>().also {
		for(element in this)
			if(element.shouldGen)
				it.add(commands.fromName(element.name))
	}



	private val FeatureElement.convert get() = Feature(
		name      = name,
		shouldGen = true,
		types     = types.convertTypes,
		commands  = commands.convertCommands
	)



	private val ExtensionElement.convert get() = Extension(
		name         = name,
		shouldGen    = shouldGen,
		types        = types.convertTypes,
		commands     = commands.convertCommands,
		number       = number,
		platform     = platform,
		deprecatedBy = deprecatedBy,
		promotedTo   = promotedTo,
		disabled     = disabled
	)



	private fun convertElements() {
		for(typeElement in registry.typeElements)
			types.add(typeElement.convert)

		// Populate late-init variables
		for(type in types) {
			if(type is StructType) {
				val structElement = registry.typeElements.fromName(type.name) as StructElement

				for(varElement in structElement.members) {
					type.members.add(varElement.convert)
				}

				for(extendsName in structElement.extends) {
					val extends = types.fromName(extendsName) as StructType
					extends.pNext.add(type)
					type.extends.add(extends)
				}

				for(m in type.members) {
					m.struct = type

					if(m.isArray && m.type is StructType)
						m.type.requiresBuffer = true

					if(m.varLen != null)
						m.varLenVariable = type.members.first { it.name == m.varLen }
				}
			}
		}

		for(commandElement in registry.commandElements)
			commands.add(commandElement.convert)

		// Populate late-init variables
		for(command in commands)
			for(p in command.params)
				if(p.isArray && p.type is StructType)
					p.type.requiresBuffer = true

		for(constant in registry.constantElements)
			constants.add(constant.convert)

		for(provider in registry.providerElements) when(provider) {
			is FeatureElement   -> providers.add(provider.convert)
			is ExtensionElement -> providers.add(provider.convert)
		}
	}


}