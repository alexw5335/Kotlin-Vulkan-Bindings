package kvb.codegen.vulkan.scrape

import kvb.codegen.vulkan.name.NamedList
import kvb.codegen.vulkan.name.Postfix
import kvb.codegen.vulkan.name.ShortNameList
import kvb.codegen.vulkan.parse.*
import kvb.codegen.vulkan.scrape.ScraperUtils.camelToSnakeCase
import kvb.codegen.writer.Primitive
import java.nio.file.Path

class VulkanScraper(private val registry: ParsedRegistry) {


	companion object {
		fun scrape(vkxmlPath: Path) = VulkanScraper(VulkanParser.parse(vkxmlPath)).scrape()
	}



	private val shortNames = ShortNameList()

	private val types = NamedList<Type>()

	private val commands = NamedList<Command>()

	private val constants = NamedList<Constant>()

	private val providers = NamedList<Provider>()



	/*
	Scraping
	 */



	private fun convertElements() {
		for(typeElement in registry.typeElements)
			types.add(typeElement.convert())

		for(commandElement in registry.commandElements)
			commands.add(commandElement.convert())

		for(constant in registry.constantElements)
			constants.add(constant.convert())

		for(provider in registry.providerElements) when(provider) {
			is FeatureElement -> providers.add(provider.convert())
			is ExtensionElement -> providers.add(provider.convert())
		}
	}



	private fun populateElements() {
		for(type in types)
			if(type is StructType)
				populateStruct(type)

		for(command in commands)
			populateCommand(command)
	}



	fun scrape() : ScrapedRegistry {
		for(provider in registry.providerElements)
			populateShortNames(provider)

		convertElements()
		populateElements()

		val genTypes     = NamedList<Type>()
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

		return ScrapedRegistry(genTypes, genCommands, genConstants, genProviders)
	}



	/*
	Conditions
	 */



	private val extensionsToGen = setOf(
		"VK_EXT_debug_utils",
		"VK_KHR_display",
		"VK_KHR_surface",
		"VK_KHR_win32_surface",
		"VK_KHR_swapchain"
	)

	

	private val ProviderElement.shouldGen get() =
		this !is ExtensionElement || extensionsToGen.contains(name)
		//this !is ExtensionElement ||
		//(deprecatedBy == null && !disabled)

	private val CommandElement.shouldGen get() =
		alias == null

	private val EnumEntryElement.shouldGen get() =
		alias == null && (extension == null || registry.providerElements.fromName(extension).shouldGen)

	private val TypeElement.shouldGen get() = when(this) {
		is BitmaskElement -> enumName != null
		is EnumElement    -> name != "VkStructureType"
		is StructElement  -> true
		is HandleElement  -> true
		else              -> false
	}



	/*
	Naming
	 */



	private val StructElement.genName get() = shortNames.get(name)

	private val HandleElement.genName get() = shortNames.get(name) + "H"

	private val CommandElement.genName get() = shortNames.get(name)
	
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



	private fun populateShortNames(provider: ProviderElement) {
		if(!provider.shouldGen) return

		for(type in provider.types) {
			if(type.shouldGen)
				shortNames.add(type.name, type.shortName)

			if(type is EnumElement)
				for(entry in type.entries)
					if(entry.shouldGen)
						shortNames.add(entry.name, entry.shortName)
		}

		for(command in provider.commands)
			if(command.shouldGen)
				shortNames.add(command.name, command.shortName)
	}



	/*
	Type conversion
	 */


	
	fun TypeElement.convert(): Type = when(this) {
		is BitmaskElement -> BitmaskType(
			name, genName, shouldGen, Primitive.integer(is64Bit), is64Bit, enumName
		)

		is StructElement -> StructType(
			name, genName, shouldGen, Primitive.LONG, isUnion
		)

		is HandleElement -> HandleType(
			name, genName, shouldGen, Primitive.LONG
		)

		is PrimitiveElement -> PrimitiveType(
			name, shouldGen, ScraperUtils.resolvePrimitive(primitiveName)
		)

		is NativeElement -> PrimitiveType(
			name, shouldGen, ScraperUtils.resolveNative(name)
		)

		is FuncPointerElement -> PrimitiveType(
			name, shouldGen, Primitive.LONG
		)

		is EnumElement -> {
			val prefix = when {
				!isFlagBits -> Postfix.drop(name).camelToSnakeCase + "_"
				!is64Bit    -> Postfix.drop(name).dropLast(8).camelToSnakeCase + "_"
				else        -> Postfix.drop(name).dropLast(9).camelToSnakeCase + "_2_"
			}

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

			EnumType(
				name, genName, shouldGen, Primitive.integer(is64Bit), is64Bit, isFlagBits, entries
			)
		}

		is VoidTypeElement -> VoidType

		is AliasedTypeElement -> AliasedType(name, alias)

		else -> UnusedType(name)
	}



	/*
	Var conversion
	 */



	private fun VarElement.convert() = Var(
		name     = name,
		type     = types.fromName(type).resolveAlias,
		optional = optional,
		modifier = varModifier(modifier),
		index    = index,
		len      = len,
		altLen   = altLen,
		varLen   = variableArrayLength(len),
		constLen = constLen,
		sType    = sType?.let { (types.fromName(type) as EnumType).entries.fromName(it).value }
	)



	private val Type.resolveAlias: Type
		get() = if(this is AliasedType)
			types.fromName(alias).resolveAlias
		else
			this



	/**
	 * Determines the modifier of a C parameter or struct member.
	 */
	private fun varModifier(modifier: String?): Modifier {
		if(modifier == null) return Modifier.NONE

		// Edge case for VkAccelerationStructureInstanceKHR.
		if(modifier.startsWith(':')) return Modifier.NONE

		if(modifier.contains('[')) return Modifier.ARRAY

		// Matching the text with a modifier relies on text being condensed in the XML parser.
		// e.g. 'const <type>void</type>*' becomes 'const*'.
		return Modifier.values().first { it.identifier == modifier }
	}



	/**
	 * Returns the name of the struct member that determines another member's array length.
	 */
	private fun variableArrayLength(len: String?): String? = when {
		// No variable length
		len == null -> null

		// Of the form "variable,null-terminated". Only 3 instances where this occurs:
		// ppEnabledLayerNames, ppEnabledExtensionNames, ppGeometries.
		// Only the first part of the len string matters for these.
		len.contains(',') 					-> len.split(',')[0]

		// Only 2 cases, too complex to create convenience functions for these.
		len.startsWith("latexmath") 		-> null

		// Handled as a constant array length (=32)
		len == "2*ename:VK_UUID_SIZE"		-> null

		// Only for char*. These are handled separately during generation.
		len == "null-terminated"			-> null

		// Edge-case - refers to a variable of a variable within the struct.
		len == "pBuildInfo-geometryCount" 	-> null

		// By this point, the length should refer to another variable in a struct.
		// Warning: This will not catch new edge-cases. New edge-cases will produce compile errors.
		else								-> len
	}



	/*
	Command conversion
	 */



	private fun CommandElement.convert() = Command(
		name       = name,
		genName    = genName,
		shouldGen  = alias == null,
		type       = determineType(),
		returnType = returnType?.let(types::fromName),
		params     = params.map { it.convert() }
	)



	private fun CommandElement.determineType(): CommandType {
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



	/*
	Provider conversion
	 */



	private fun NamedList<TypeElement>.convertTypes() = NamedList<Type>().also {
		for(element in this)
			if(element.shouldGen)
				it.add(types.fromName(element.name))
	}



	private fun NamedList<CommandElement>.convertCommands() = NamedList<Command>().also {
		for(element in this)
			if(element.shouldGen)
				it.add(commands.fromName(element.name))
	}



	private fun FeatureElement.convert() = Feature(
		name      = name,
		shouldGen = true,
		types     = types.convertTypes(),
		commands  = commands.convertCommands()
	)



	private fun ExtensionElement.convert() = Extension(
		name         = name,
		shouldGen    = shouldGen,
		types        = types.convertTypes(),
		commands     = commands.convertCommands(),
		number       = number,
		platform     = platform,
		deprecatedBy = deprecatedBy,
		promotedTo   = promotedTo,
		disabled     = disabled
	)



	/*
	Constant conversion
	 */



	private fun ConstantElement.convert() = Constant(
		name      = name,
		genName   = name,
		shouldGen = alias == null,
		cValue    = cValue,
		value     = value
	)



	/*
	Lateinit population
	 */



	private fun populateStruct(type: StructType) {
		val structElement = registry.typeElements.fromName(type.name) as StructElement

		for(varElement in structElement.members)
			type.members.add(varElement.convert())

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



	private fun populateCommand(command: Command) {
		for(p in command.params)
			if(p.isArray && p.type is StructType)
				p.type.requiresBuffer = true
	}


}