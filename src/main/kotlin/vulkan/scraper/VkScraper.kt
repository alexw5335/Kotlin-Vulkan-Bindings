package vulkan.scraper

import memory.Primitive
import vulkan.scraper.VkScraperUtils.err
import vulkan.scraper.element.*
import vulkan.scraper.list.VkElementList
import vulkan.scraper.list.VkTypesList
import vulkan.scraper.type.*
import vulkan.scraper.xml.VkXmlElement
import vulkan.scraper.xml.VkXmlParser

/**
 * Reads the vk.xml registry file. May easily be broken by newer Vulkan versions. The format of the vk.xml file can be
 * found here: https://www.khronos.org/registry/vulkan/specs/1.2/registry.html.
 */
class VkScraper(private val registry: VkXmlElement) {


	/*
	Elements
	 */



	val platforms = VkElementList<VkPlatform>()

	val apiConstants = VkElementList<VkApiConstant>()

	val types = VkTypesList()

	val commands = VkElementList<VkCommand>()

	val features = VkElementList<VkFeature>()

	val extensions = VkElementList<VkExtension>()



	/*
	Exposed functions
	 */



	fun scrape() {
		scrapePlatforms()
		scrapeAPIConstants()
		scrapeTypes()
		scrapeEnums()
		scrapeStructs()
		scrapeCommands()
		scrapeFeatures()
		scrapeExtensions()
	}



	companion object {

		fun create(path: String) = VkScraper(VkXmlParser.parse(path)).also { it.scrape() }

	}



	/*
	Variables
	 */



	/**
	 * Used to keep track of command re-declarations in features and extensions.
	 */
	private val commandNames = HashSet<String>()

	/**
	 * All <extension> elements in the <extensions> element that are not disabled. Disabled extensions should never be
	 * processed.
	 */
	private val extensionElements = registry.getElement("extensions").getElements("extension")
		.filter { it["supported"] != "disabled" }



	/*
	Platforms
	 */



	private fun scrapePlatforms() {
		for(element in registry.getElement("platforms").getElements("platform")) {
			platforms.add(
				VkPlatform(element.attrib("name"), element.attrib("protect"))
			)
		}
	}



	/*
	API Constants
	 */



	private fun scrapeAPIConstantElement(element: VkXmlElement): VkApiConstant {
		val name = element.attrib("name")

		element["alias"]?.let {
			return apiConstants.fromName(it).copy(name = name, aliased = true)
		}

		val rawValue = element.attrib("value")

		// Represents an Int literal.
		rawValue.toIntOrNull()?.let {
			return VkApiConstant(name, rawValue, it, null)
		}

		// Vulkan's C bit manipulations work unaltered for java but not for Kotlin. Values must be hardcoded.
		// Note: Only in the API Constants enum block do bit inversions occur.
		// Note: Must convert to unsigned. Cannot use Integer.MAX_VALUE.
		return when(rawValue) {
			"(~0ULL)" 	-> VkApiConstant(name, "${ULong.MAX_VALUE.toLong()}", 	longValue = ULong.MAX_VALUE.toLong())
			"(~0U)" 	-> VkApiConstant(name, "${UInt.MAX_VALUE.toInt()}", 	intValue = UInt.MAX_VALUE.toInt())
			"(~0U-1)" 	-> VkApiConstant(name, "${UInt.MAX_VALUE.toInt() - 1}", intValue = UInt.MAX_VALUE.toInt() - 1)
			"(~0U-2)" 	-> VkApiConstant(name, "${UInt.MAX_VALUE.toInt() - 2}", intValue = UInt.MAX_VALUE.toInt() - 2)
			"1000.0f"	-> VkApiConstant(name, rawValue, 						floatValue = 1000.0f)
			else		-> err("invalid api constant value: $rawValue", element)
		}
	}



	private fun scrapeAPIConstants() {
		registry.children.first { it["name"] == "API Constants" }.children.forEach {
			apiConstants.add(scrapeAPIConstantElement(it))
		}
	}



	/*
	Types
	 */



	private fun scrapeTypeElement(element: VkXmlElement) : VkType {
		val name = element["name"]
			?: element.getElement("name").text
			?: err("Type element lacks name", element)

		element["alias"]?.let {
			return when(val aliased = types.fromName(it)) {
				is VkTypeUnimplemented  -> aliased.copy(name = name, aliased = true)
				is VkTypePrimitive      -> aliased.copy(name = name, aliased = true)
				is VkTypeStruct         -> aliased.copy(name = name, aliased = true)
				is VkTypeBitmask        -> aliased.copy(name = name, aliased = true)
				is VkTypeEnum           -> aliased.copy(name = name, aliased = true)
				is VkTypeHandle         -> aliased.copy(name = name, aliased = true)
				is VkTypeFuncPointer    -> aliased.copy(name = name, aliased = true)
				is VkTypeNative         -> aliased.copy(name = name, aliased = true)
				is VkTypeVoid           -> VkTypeVoid
				else                    -> throw RuntimeException("Unhandled alias type")
			}
		}

		element["category"]?.let { categoryString ->
			if(categoryString == "bitmask") {
				return when(element.getElement("type").text) {
					"VkFlags" 	-> VkTypeBitmask(name, element["requires"], element["bitvalues"], false)
					"VkFlags64" -> VkTypeBitmask(name, element["requires"], element["bitvalues"], true)
					else -> err(element)
				}
			}

			if(categoryString == "basetype") {
				element.getElementOrNull("type")?.text?.let {
					return VkTypePrimitive(name, Primitive.resolveNative(it))
				}

				// Special cases for redefined platform-specific structs.
				// These are treated in the same way as the other native types.
				// Thees are 'incomplete type definitions' that avoid unnecessary compile-time dependencies.
				// So, they do not have 'requires' tags, unlike the other native types.
				return when(element.getElement("name").text) {
					"ANativeWindow" 	-> VkTypeNative(name, VkScraperUtils.resolveNativeType(name))
					"AHardwareBuffer" 	-> VkTypeNative(name, VkScraperUtils.resolveNativeType(name))
					"CAMetalLayer" 		-> VkTypeNative(name, VkScraperUtils.resolveNativeType(name))
					else 				-> err(element)
				}
			}

			when(categoryString) {
				"enum" 			-> return VkTypeEnum(name, VkElementList())
				"handle" 		-> return VkTypeHandle(name, element["parent"])
				"funcpointer" 	-> return VkTypeFuncPointer(name)
				"struct"		-> return VkTypeStruct(name, false, returnedOnly = element["returnedonly"] == "true")
				"union"			-> return VkTypeStruct(name, true, returnedOnly = element["returnedonly"] == "true")
			}

			// Unneeded types, e.g. includes, defines.
			return VkTypeUnimplemented(name)
		}

		// Lack of category attribute signifies primitive type (e.g. uint32_t) or platform-specific type (e.g. Display)
		element["requires"].let {
			// Primitives, null is a special case for int.
			if (it == "vk_platform" || it == null) {
				// Special case for void*.
				if(name == "void") return VkTypeVoid

				return VkTypePrimitive(name, Primitive.resolveNative(name))
			}

			// Platform-specific type. NOTE: Only windows types are fully implemented. Other sizes will be incorrect.
			return VkTypeNative(name, VkScraperUtils.resolveNativeType(name))
		}
	}



	private fun scrapeTypes() = registry.getElement("types").getElements("type").forEach {
		types.add(scrapeTypeElement(it))
	}



	/*
	Structs
	 */



	private fun scrapeStructElement(element: VkXmlElement) {
		val struct = types.structs.fromName(element.attrib("name"))

		element["alias"]?.let {
			struct.members.addAll(types.structs.fromName(it).members)
			return
		}

		struct.members.addAll(element.getElements("member").mapIndexed(::scrapeVar))

		// Populating the lateinit variables of the members.
		for(m in struct.members) {
			m.struct = struct

			if(m.isArray && m.type is VkTypeStruct)
				m.type.usedInArray = true

			if(struct.returnedOnly)
				if(m.type is VkTypeStruct)
					m.type.hasPersistent = true

			if(m.varLen != null)
				m.varLenVariable = struct.members.firstOrNull { it.name == m.varLen }
					?: err("variable array length refers to unrecognised struct member: ${m.varLen}")
		}

		element["structextends"]?.let {
			it.split(',').map(types.structs::fromName).forEach { extends ->
				extends.pNextValues.add(struct)
				struct.extends.add(extends)
			}
		}
	}



	private fun scrapeStructs() = registry.getElement("types").children.forEach {
		if(it["category"] == "struct" || it["category"] == "union") scrapeStructElement(it)
	}



	/*
	Commands
	 */



	private fun scrapeCommandElement(element: VkXmlElement): VkCommand {
		element["alias"]?.let {
			return commands.fromName(it).copy(
				name 			= element.attrib("name"),
				aliased 		= true
			)
		}

		val proto = element.getElement("proto")

		val name = proto.getElement("name").textNotNull

		val returnType = proto.getElement("type").textNotNull.let {
			if(it == "void")
				null
			else
				types.fromName(it)
		}

		val params = element.getElements("param").mapIndexed(::scrapeVar)

		for(p in params)
			if(p.isArray && p.type is VkTypeStruct)
				p.type.usedInArray = true

		// All first parameters are one of these (except for the four standalone commands).
		val type = when(params.first().type.name) {
			"VkInstance" 		-> VkCommand.Type.INSTANCE
			"VkPhysicalDevice" 	-> VkCommand.Type.INSTANCE
			"VkDevice" 			-> VkCommand.Type.DEVICE
			"VkQueue" 			-> VkCommand.Type.DEVICE
			"VkCommandBuffer" 	-> VkCommand.Type.DEVICE
			else 				-> VkCommand.Type.STANDALONE
		}

		return VkCommand(
			name 		= name,
			type 		= type,
			returnType 	= returnType,
			params 		= params
		)
	}



	private fun scrapeCommands() = registry.getElement("commands").getElements("command").forEach {
		commands.add(scrapeCommandElement(it))
	}



	/*
	Features
	 */



	private fun scrapeFeatureElement(element: VkXmlElement): VkFeature {
		val featureTypes = VkTypesList()
		val featureCommands = ArrayList<VkCommand>()

		for(require in element.getElements("require"))
			for(e in require.children)
				when(e.type) {
					"type" 		-> featureTypes.add(types.fromName(e.attrib("name")))
					"command" 	-> {
						// Skip re-declarations
						val name = e.attrib("name")
						if(!commandNames.contains(name)) {
							featureCommands.add(commands.fromName(name))
							commandNames.add(name)
						}
					}
				}

		return VkFeature(
			name 		= element.attrib("name"),
			types 		= featureTypes,
			commands 	= featureCommands
		)
	}



	private fun scrapeFeatures() = registry.getElements("feature").forEach {
		features.add(scrapeFeatureElement(it))
	}



	/*
	Extensions
	 */



	private fun scrapeExtensionElement(element: VkXmlElement): VkExtension {
		val type = when(element.attrib("type")) {
			"instance" 	-> VkExtension.Type.INSTANCE
			"device" 	-> VkExtension.Type.DEVICE
			else 		-> err(element)
		}

		val extensionTypes = VkTypesList()
		val extensionCommands = ArrayList<VkCommand>()

		for(require in element.getElements("require"))
			for(e in require.children)
				when(e.type) {
					"type" 		-> extensionTypes.add(types.fromName(e.attrib("name")))
					"command" 	-> {
						// Skip re-declarations
						val name = e.attrib("name")
						if(!commandNames.contains(name)) {
							extensionCommands.add(commands.fromName(name))
							commandNames.add(name)
						}
					}
				}

		return VkExtension(
			name 		= element.attrib("name"),
			type 		= type,
			types 		= extensionTypes,
			commands	= extensionCommands,
			platform 	= element["platform"]?.let { platforms.fromName(it) }
		)
	}



	private fun scrapeExtensions() = extensionElements.forEach {
		extensions.add(scrapeExtensionElement(it))
	}



	/*
	Enums
	 */



	private fun scrapeEnumValue(element: VkXmlElement, enum: VkTypeEnum, extNumber: Int?): String {
		// Value may be negated at the end.
		var enumValue: String? = null

		// Direct value.
		element["value"]?.let {
			enumValue = it
		}

		// Alias to anther enum.
		element["alias"]?.let {
			enumValue = enum.entries.fromName(it).enumValue
		}

		// Bit-pos as part of a bitmask.
		element["bitpos"]?.let {
			enumValue = if(enum.is64Bit)
				(1L shl it.toInt()).toString()
			else
				(1 shl it.toInt()).toString()
		}

		// Extension offset, see scripts/generator.py file in the KhronosGroup/Vulkan-Docs registry for the formula.
		element["offset"]?.let {
			if(extNumber == null) err("invalid extension number")
			enumValue = (1000000000 + (extNumber - 1) * 1000 + it.toInt()).toString()
		}

		if(enumValue == null) err("invalid enum entry", element)

		// A 'dir="-"' attribute indicates a negative value (only occurs for VkResult).
		return if(element["dir"] == "-")
			"-$enumValue"
		else
			enumValue!!
	}



	private fun scrapeEnumElement(element: VkXmlElement, enum: VkTypeEnum, extNumber: Int?): VkEnumEntry {
		val name = element.attrib("name")

		return VkEnumEntry(
			name 		= name,
			shortName 	= VkScraperUtils.enumEntryShortName(name, enum),
			enumValue 	= scrapeEnumValue(element, enum, element["extnumber"]?.toInt() ?: extNumber)
		)
	}



	private fun scrapeEnumsElement(element: VkXmlElement) {
		val name = element.attrib("name")
		if(name == "API Constants") return

		val enum = types.fromName(name) as VkTypeEnum

		for(e in element.getElements("enum"))
			enum.entries.add(scrapeEnumElement(e, enum, 0))
	}



	private fun scrapeExtensionEnumEntryElement(element: VkXmlElement, extNumber: Int?) {
		// Extensions can add enum entries to enums, denoted by the 'extends' attribute.
		val enum = types.enums.fromName(element["extends"] ?: return)
		val entry = scrapeEnumElement(element, enum, extNumber)

		// Some extensions redefine core enums, skip these.
		if(enum.entries.elementsByName[entry.name] != null) return

		enum.entries.add(entry)
	}



	private fun scrapeEnums() {
		// Core enums
		for(enum in registry.getElements("enums"))
			scrapeEnumsElement(enum)

		// Note: Scrape features before extensions. Some extension enum entries alias feature enum entries.
		for(feature in registry.getElements("feature"))
			for(require in feature.getElements("require"))
				for(enum in require.getElements("enum"))
					scrapeExtensionEnumEntryElement(enum, null)

		// Extension enums
		for(extension in extensionElements)
			for(require in extension.getElements("require"))
				for(enum in require.getElements("enum"))
					scrapeExtensionEnumEntryElement(enum, extension["number"]?.toInt())

		// Populate the bit enums of the bitmasks and FlagBits enums.
		for(bitmask in types.bitmasks) {
			// 'requires' is used for 32-bit bitmasks. 'bitvalues' is used for 64-bit bitmasks.
			(bitmask.requires ?: bitmask.bitvalues)?.let {
				val enum = types.enums.fromName(it)
				bitmask.enum = enum
				enum.bitmask = bitmask
			}
		}
	}



	/*
	Struct members and command parameters (collectively called VkVar).
	 */



	/**
	 * Scrapes a struct member or a command parameter [element].
	 */
	private fun scrapeVar(index: Int, element: VkXmlElement) = VkVar(
		name 			= element.getElement("name").textNotNull,
		type 			= types.fromName(element.getElement("type").textNotNull),
		isPointer 		= element.text?.contains('*') ?: false,	// A bit of a hack.
		isArray			= isArray(element),
		isOptional 		= element["optional"]?.equals("true") ?: false,
		constLen 		= constArrayLength(element),
		varLen			= variableArrayLength(element),
		altLen			= element["altlen"],
		isStringPointer	= element["len"] == "null-terminated",
		values 			= sTypeValue(element),
		modifier 		= varModifier(element),
		index 			= index
	)



	/**
	 * Determines the VkStructureType enum represented by the [element]'s 'values' attribute.
	 */
	private fun sTypeValue(element: VkXmlElement): String? = element["values"]?.let {
		// For some reason, the <structs> tag still contains structs from disabled extensions.
		// The only extension that does this is the ANDROID_native_buffer extension.
		// Perhaps check structs for being part of a disabled extension?

		if(it == "VK_STRUCTURE_TYPE_NATIVE_BUFFER_ANDROID" ||
			it == "VK_STRUCTURE_TYPE_SWAPCHAIN_IMAGE_CREATE_INFO_ANDROID" ||
			it == "VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENTATION_PROPERTIES_ANDROID") return null

		types.enums.fromName("VkStructureType").entries.fromName(it).shortName
	}



	/**
	 * If the [element] (that represents a struct member or a command parameter) is an array. If the element has a 'len'
	 * attribute (see [variableArrayLength]) or it has a constant array length (e.g. [3], see [constArrayLength]), then it
	 * is an array. The 'len' attribute is never null for arrays in structs. The constant array length is never null for
	 * arrays in command parameters. Note that this is primarily for structs, as there are very few command parameter
	 * arrays and their size isn't useful to know anyway.
	 */
	private fun isArray(element: VkXmlElement): Boolean {
		return element["len"] != null || constArrayLength(element) != null
	}



	/**
	 * Used for struct members or array lengths with [] array identifiers.
	 */
	private fun constArrayLength(element: VkXmlElement): Int? {
		// Edge case for VkAccelerationStructureVersionInfoKHR.
		if(element["len"] == "2*ename:VK_UUID_SIZE") return 32

		// No const array length.
		if(element.text == null || !element.textNotNull.contains('[')) return null

		// If [] with no specified array length, then the array length is given as an attribute named 'enum'.
		// The attribute refers to an API constant.
		return element.textNotNull.split('[').last().substringBefore(']').let {
			if(it.isEmpty())
				apiConstants.fromName(element.getElement("enum").textNotNull).intValue ?: err(it)
			else
				it.toInt()
		}
	}



	/**
	 * Determines the C data type modifier of an element that is either a command parameter or a struct member. E.g.
	 * const char * const* is represented as const * const* in the element's text, which is then matched to
	 * [VkModifier.CONST_POINTER_CONST_POINTER]. This is a hack and will not catch edge-cases that are introduced
	 * whenever the registry is updated.
	 */
	private fun varModifier(element: VkXmlElement): VkModifier {
		// Modifiers are given as the VkXmlElement's text. They are not specified as separate elements/attributes.
		val text = element.text ?: return VkModifier.NONE

		// Array strings cannot be matched using VkModifier and so must be handled separately. All are const.
		if(text.contains('[')) return VkModifier.CONST_ARRAY

		// Edge case for VkAccelerationStructureInstanceKHR.
		if(text.startsWith(':')) return VkModifier.NONE

		return VkModifier.values().first { it.identifier == text }
	}



	/**
	 * If the [element] is an array whose size is determined by another variable in a struct, then that variable's name
	 * is returned. Otherwise, null is returned.
	 */
	private fun variableArrayLength(element: VkXmlElement): String? {
		val len = element["len"] ?: return null

		return when {
			// Of the form "variable,null-terminated. Only 3 instances where this occurs:
			// ppEnabledLayerNames, ppEnabledExtensionNames, ppGeometries.
			// Only the first part of the len string matters for these ones.
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
			// Warning: This will not catch new edge-cases.
			else								-> len
		}
	}


}