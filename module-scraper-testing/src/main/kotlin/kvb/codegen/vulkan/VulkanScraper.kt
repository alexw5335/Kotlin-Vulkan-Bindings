package kvb.codegen.vulkan

import kvb.codegen.vulkan.*
import scraper.kvb.codegen.writer.procedural.Primitive
import scraper.kvb.codegen.vulkan.GenUtils.camelToSnakeCase
import scraper.kvb.codegen.vulkan.naming.NamedList
import scraper.kvb.codegen.vulkan.naming.Postfix
import scraper.kvb.codegen.vulkan.naming.ShortNameList
import scraper.kvb.codegen.vulkan.type.*

class VulkanScraper(private val registry: ParsedRegistry) {


	private val shortNames = ShortNameList()

	private val types = NamedList<VkType>()

	private val commands = NamedList<VkCommand>()

	private val constants = NamedList<VkConstant>()



	fun scrape() : ScrapedRegistry {
		populateShortNames()
		convertElements()

		val genTypes = ArrayList<VkType>()
		val genCommands = ArrayList<VkCommand>()
		val genConstants = ArrayList<VkConstant>()

		for(provider in registry.providerElements) {
			if(!provider.shouldGen) continue

			for(typeElement in provider.types)
				if(typeElement.shouldGen)
					genTypes.add(types.fromName(typeElement.name))

			for(commandElement in provider.commands)
				if(commandElement.shouldGen)
					genCommands.add(commands.fromName(commandElement.name))
		}

		return ScrapedRegistry(genTypes, genCommands, genConstants)
	}



	/*
	Short names
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
		this !is ExtensionElement || (deprecatedBy == null && !disabled && promotedTo != "VK_VERSION_1_1")



	private val CommandElement.shouldGen get() =
		alias != null && name != "vkGetInstanceProcAddr"



	private val EnumEntryElement.shouldGen get() =
		alias == null && (extension == null || registry.providerElements.fromName(extension).shouldGen)



	private val TypeElement.shouldGen get() = when(this) {
		is BitmaskElement -> enumName != null && enumNotEmpty(enumName)
		is EnumElement -> name != "VkStructureType" && enumNotEmpty(name)
		is StructElement -> true
		is HandleElement -> true
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

		val entries = NamedList<VkEnumEntry>()

		fun value(entry: EnumEntryElement): String =
			entry.value ?:
			value(this.entries.first { it.name == entry.alias })

		for(entry in this.entries) {
			entries.add(VkEnumEntry(
				entry.name,
				enumEntryGenName(entry.name, prefix),
				value(entry),
				entry.shouldGen
			))
		}

		return VkEnum(
			name,
			genName,
			shouldGen,
			Primitive.integer(is64Bit),
			is64Bit,
			entries
		)
	}



	private val TypeElement.convert: VkType get() = when(this) {
		is EnumElement -> convertEnum

		is BitmaskElement -> VkBitmask(
			name,
			genName,
			shouldGen,
			Primitive.integer(is64Bit),
			is64Bit,
			enumName
		)

		is StructElement -> VkStruct(
			name,
			genName,
			shouldGen,
			Primitive.LONG
		)

		is HandleElement -> VkHandle(
			name,
			genName,
			shouldGen,
			Primitive.LONG
		)

		is PrimitiveElement -> VkPrimitiveType(
			name,
			name,
			shouldGen,
			GenUtils.resolvePrimitive(primitiveName)
		)

		is NativeElement -> VkNativeType(
			name,
			shouldGen,
			GenUtils.resolveNative(name)
		)

		is FuncPointerElement -> VkPrimitiveType(
			name,
			"Long",
			shouldGen,
			Primitive.LONG
		)

		else -> VkUnusedType(name)
	}



	private val VarElement.convert get() = VkVar(
		name     = name,
		type     = types.fromName(type),
		optional = optional,
		modifier = modifier,
		index    = index,
		len      = len,
		altLen   = altLen,
		varLen   = varLen,
		constLen = constLen,
		sType    = sType?.let { (types.fromName(type) as VkEnum).entries.fromName(it).value }
	)



	private val CommandElement.convert get() = VkCommand(
		name       = name,
		genName    = shortNames.get(name),
		shouldGen  = alias == null,
		returnType = returnType?.let(types::fromName),
		params     = params.map { it.convert }
	)



	private val ConstantElement.convert get() = VkConstant(
		name      = name,
		genName   = name,
		shouldGen = !aliased,
		value     = value,
		aliased   = aliased
	)



	private fun convertElements() {
		for(typeElement in registry.typeElements)
			types.add(typeElement.convert)

		// Populate late-init variables
		for(type in types) {
			if(type is VkStruct) {
				val structElement = registry.typeElements.fromName(type.name) as StructElement

				for(varElement in structElement.members) {
					type.members.add(varElement.convert)
				}

				for(extendsName in structElement.extends) {
					val extends = types.fromName(extendsName) as VkStruct
					extends.pNext.add(type)
					type.extends.add(extends)
				}

				for(m in type.members) {
					m.struct = type

					if(m.isArray && m.type is VkStruct)
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
				if(p.isArray && p.type is VkStruct)
					p.type.requiresBuffer = true
	}


}