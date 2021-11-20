package kvb.codegen.vulkan.scraper

import kvb.codegen.vulkan.scraper.VkScraperUtils.err
import kvb.codegen.vulkan.scraper.element.*
import kvb.codegen.vulkan.scraper.type.*
import kvb.codegen.vulkan.scraper.list.VkElementList
import kvb.codegen.vulkan.scraper.list.VkProviderList
import kvb.codegen.vulkan.scraper.list.VkTypeList
import kvb.codegen.vulkan.scraper.xml.VkXmlElement
import kvb.codegen.vulkan.scraper.xml.VkXmlParser

class VkScraper(private val registry: VkXmlElement) {


	companion object {
		fun scrape(path: String) = VkScraper(VkXmlParser.parse(path)).also { it.scrape() }
	}



	fun scrape() {
		scrapePlatforms()
		scrapeConstants()
		scrapeTypes()
		scrapeEnums()
		scrapeCommands()
		scrapeFeatures()
		scrapeExtensions()
		scrapeStructs()
	}



	/*
	Variables
	 */



	val constants = VkElementList<VkConstant>()

	val platforms = VkElementList<VkPlatform>()

	val types = VkTypeList()

	val commands = VkElementList<VkCommand>()

	val providers = VkProviderList()



	/*
	Platforms
	 */



	private fun scrapePlatforms() {
		for(element in registry.child("platforms").children)
			if(element.type == "platform")
				platforms.add(VkPlatform(element.attrib("name"), element.attrib("protect")))
	}



	/*
	Constants
	 */



	private fun scrapeConstantElement(element: VkXmlElement): VkConstant {
		val name = element.attrib("name")

		// Keep aliases, may be referenced as an array length
		element["alias"]?.let {
			return VkConstant(name, constants.fromName(it).value, isAliased = true)
		}

		val value = element.attrib("value")

		// Int literal
		value.toIntOrNull()?.let {
			return VkConstant(name, value)
		}

		// Hardcoded, may need to be updated in the future.
		return when(value) {
			"(~0ULL)" 	-> VkConstant(name, "${ULong.MAX_VALUE.toLong()}L")
			"(~0U)" 	-> VkConstant(name, "${UInt.MAX_VALUE.toInt()}")
			"(~0U-1)" 	-> VkConstant(name, "${UInt.MAX_VALUE.toInt() - 1}")
			"(~0U-2)" 	-> VkConstant(name, "${UInt.MAX_VALUE.toInt() - 2}")
			"1000.0f"	-> VkConstant(name, value)
			else		-> err("invalid api constant value: $value", element)
		}
	}



	private fun scrapeConstants() {
		for(element in registry.child("enums").children)
			if(element.type == "enum")
				constants.add(scrapeConstantElement(element))
	}



	/*
	Types
	 */



	/**
	 * Scrapes a 'type' element. Does not fill in struct members nor enum entries. These will be populated after all
	 * types have been scraped.
	 */
	private fun scrapeTypeElement(element: VkXmlElement): VkType {
		val name = element["name"]
			?: element.child("name").text // Flags
			?: err(element)

		element["alias"]?.let {
			return VkTypeAliased(name, types.fromName(it))
		}

		element["category"]?.let { category ->
			if(category == "bitmask") {
				return VkTypeBitmask(name, element["requires"], element["bitvalues"])
			}

			if(category == "basetype") {
				// VkSampleMash, VkBool32, VkFlags, VkFlags64, VkDeviceSize, VkDeviceAddress.
				// All are typedefs of uint32_t or uint64_t.
				element.childOrNull("type")?.text?.let {
					return VkTypePrimitive(name, VkScraperUtils.resolvePrimitive(it))
				}

				// Special cases for redefined platform-specific structs, treated as native types.
				// 'ANativeWindow', 'AHardwareBuffer', and 'CAMetalLayer'.
				// These are 'incomplete type definitions' that avoid unnecessary compile-time dependencies.
				// So, they do not have 'requires' tags, unlike the other platform-specific native types.
				return VkTypeNative(name, VkScraperUtils.resolveNativeType(name))
			}

			when(category) {
				"enum"        -> return VkTypeEnum(name)
				"handle"      -> return VkTypeHandle(name, element["parent"])
				"funcpointer" -> return VkTypeFuncPointer(name)
				"struct"      -> return VkTypeStruct(name, false)
				"union"       -> return VkTypeStruct(name, true)
			}

			// Unneeded types such as includes and defines.
			return VkTypeUnimplemented(name)
		}

		// If there is no category attribute, then the type is either a primitive or a platform-specific native type.
		element["requires"].let { requires ->
			// Primitive type. Null is a special case for int.
			if(requires == "vk_platform" || requires == null) {
				// Special case for void*
				if(name == "void") return VkTypeVoid

				return VkTypePrimitive(name, VkScraperUtils.resolvePrimitive(name))
			}

			// Platform-specific native type.
			return VkTypeNative(name, VkScraperUtils.resolveNativeType((name)))
		}
	}



	/**
	 * Scrapes all 'type' elements in the 'types' element. Struct and enum types will initially be empty. They will be
	 * populated when [scrapeStructs] and [scrapeEnums] are called.
	 */
	private fun scrapeTypes() {
		for(element in registry.child("types").children)
			if(element.type == "type")
				types.add(scrapeTypeElement(element))
	}



	/*
	Structs
	 */



	private fun scrapeStructElement(element: VkXmlElement) {
		// Aliased structs are skipped.
		val struct = types.structs.elementsByName[element.attrib("name")] ?: return

		struct.members.addAll(element.children("member").mapIndexed(::scrapeVar))

		// Populating some lateinit variables.
		for(m in struct.members) {
			m.struct = struct

			if(m.isArray && m.type is VkTypeStruct)
				m.type.requiresBuffer = true

			if(m.varLen != null)
				m.varLenVariable = struct.members.fromName(m.varLen)
		}

		// Populating possible pNext values.
		element["structextends"]?.let {
			it.split(',').map(types.structs::fromName).forEach { extends ->
				extends.pNextValues.add(struct)
				struct.extends.add(extends)
			}
		}
	}



	private fun scrapeStructs() {
		for(element in registry.child("types").children) {
			if(element["category"] == "struct" || element["category"] == "union")
				scrapeStructElement(element)
		}
	}



	/*
	Commands
	 */



	private fun scrapeCommandElement(element: VkXmlElement): VkCommand {
		element["alias"]?.let {
			val aliased = commands.fromName(it)

			return VkCommand(
				element.attrib("name"),
				aliased.type,
				aliased.returnType,
				aliased.params,
				true
			)
		}

		val proto      = element.child("proto")
		val typeText   = proto.child("type").text!!
		val name       = proto.child("name").text!!
		val returnType = if(typeText == "void") null else types.fromName(typeText)
		val params     = VkElementList<VkVar>()

		params.addAll(element.children("param").mapIndexed(::scrapeVar))

		// Populating some lateinit variables.
		for(p in params)
			if(p.isArray && p.type is VkTypeStruct)
				p.type.requiresBuffer = true

		// vkGetDeviceProcAddr is resolved by vkGetInstanceProcAddr.
		val type = if(name == "vkGetDeviceProcAddr")
			VkCommand.Type.INSTANCE
		else when(params.first().type.name) {
			"VkInstance"        -> VkCommand.Type.INSTANCE
			"VkPhysicalDevice"  -> VkCommand.Type.INSTANCE
			"VkDevice"          -> VkCommand.Type.DEVICE
			"VkQueue"           -> VkCommand.Type.DEVICE
			"VkCommandBuffer"   -> VkCommand.Type.DEVICE
			else                -> VkCommand.Type.STANDALONE
		}

		return VkCommand(name, type, returnType, params, false)
	}



	private fun scrapeCommands() {
		for(element in registry.child("commands").children)
			if(element.type == "command")
				commands.add(scrapeCommandElement(element))
	}



	/*
	Features
	 */



	private fun scrapeFeatureElement(element: VkXmlElement): VkFeature {
		val feature = VkFeature(element.attrib("name"))

		for(require in element.children) {
			if(require.type != "require") continue

			for(element2 in require.children) {
				when(element2.type) {
					"type"    -> feature.types.add(this.types.fromName(element2.attrib("name")))
					"command" -> feature.commands.add(this.commands.fromName(element2.attrib("name")))
					"enum"    -> scrapeExtensionEnumElement(element2, feature)
				}
			}
		}

		return feature
	}



	private fun scrapeFeatures() {
		for(element in registry.children)
			if(element.type == "feature")
				providers.add(scrapeFeatureElement(element))
	}



	/*
	Extensions
	 */



	private fun scrapeExtensionElement(element: VkXmlElement): VkExtension {
		val extension = VkExtension(
			name         = element.attrib("name"),
			platform     = element["platform"]?.let(platforms::fromName),
			deprecatedBy = element["deprecatedby"],
			promotedTo   = element["promotedto"],
			disabled     = element["supported"] == "disabled",
			number       = element["number"]?.toInt() ?: err("No extension number", element)
		)

		for(require in element.children) {
			if(require.type != "require") continue

			for(element2 in require.children) {
				when(element2.type) {
					"type"    -> extension.types.add(this.types.fromName(element2.attrib("name")))
					"command" -> extension.commands.add(this.commands.fromName(element2.attrib("name")))
					"enum"    -> scrapeExtensionEnumElement(element2, extension)
				}
			}
		}

		return extension
	}



	private fun scrapeExtensions() {
		for(element in registry.child("extensions").children)
			if(element.type == "extension")
				providers.add(scrapeExtensionElement(element))
	}



	/*
	Enums
	 */



	private fun scrapeEnumValue(element: VkXmlElement, enum: VkTypeEnum, extNumber: Int?): String {
		fun unsigned(): String {
			element["value"]?.let {
				return it
			}

			element["alias"]?.let {
				return enum.entries.fromName(it).valueString
			}

			// Part of a bitmask.
			element["bitpos"]?.let {
				return ((if(enum.is64Bit) 1L else 1) shl it.toInt()).toString()
			}

			// Extension enum, See scripts/generator.py file in the KhronosGroup/Vulkan-Docs repository for the formula.
			element["offset"]?.let {
				return (1000000000 + (extNumber!! - 1) * 1000 + it.toInt()).toString()
			}

			err("Invalid enum value", element)
		}

		// Value may be negated.
		return (element["dir"] ?: "") + unsigned()
	}



	private fun scrapeEnumElement(element: VkXmlElement, enum: VkTypeEnum, extNumber: Int): VkEnumEntry {
		val name = element.attrib("name")

		return VkEnumEntry(
			name       = name,
			valueString  = scrapeEnumValue(element, enum, element["extnumber"]?.toInt() ?: extNumber),
			enum       = enum,
			isAliased  = element["alias"] != null
		)
	}



	private fun scrapeExtensionEnumElement(element: VkXmlElement, provider: VkProvider) {
		// Extensions can add enum entries to enums, denoted by the 'extends' attribute.
		// If it lacks an 'extends', then it denotes a constant.
		val enum = types.enums.fromName(element["extends"] ?: return)
		val entry = scrapeEnumElement(element, enum, if(provider is VkExtension) provider.number else 0)

		entry.provider = provider

		// Some extensions redefine core enums, skip these.
		if(enum.entries.elementsByName[entry.name] != null) return

		enum.entries.add(entry)
	}



	private fun scrapeEnums() {
		for(element in registry.children) {
			if(element.type != "enums" || element["name"] == "API Constants") continue

			val enum = types.fromName(element.attrib("name")) as VkTypeEnum

			for(e in element.children)
				if(e.type == "enum")
					enum.entries.add(scrapeEnumElement(e, enum, 0))
		}

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
	Parameter and struct member scraping
	 */



	private fun scrapeVar(index: Int, element: VkXmlElement) = VkVar(
		name       = element.child("name").text!!,
		type       = varType(element),
		isOptional = element["optional"]?.equals("true") ?: false,
		len        = element["len"],
		constLen   = constArrayLength(element),
		varLen     = variableArrayLength(element),
		altLen     = element["altlen"],
		sType      = element["values"]?.let { types.enums.fromName("VkStructureType").entries.fromName(it) },
		modifier   = varModifier(element),
		index      = index
	)



	/**
	 * Determines the type of a var element. If the type aliases another type, returns that type instead.
	 */
	private fun varType(element: VkXmlElement): VkType {
		val type = types.fromName(element.child("type").text!!)

		return if(type is VkTypeAliased)
			type.alias
		else
			type
	}



	/**
	 * Determines the modifier of a C parameter or struct member.
	 */
	private fun varModifier(element: VkXmlElement): VkModifier {
		// Modifiers are given as the VkXmlElement's text. They are not specified as separate elements/attributes.
		val text = element.text ?: return VkModifier.NONE

		// Edge case for VkAccelerationStructureInstanceKHR.
		if(text.startsWith(':')) return VkModifier.NONE

		// Arrays are handled separately.
		if(text.contains('[')) return VkModifier.ARRAY

		// Matching the text with a modifier relies on text being condensed in the XML parser.
		// e.g. 'const <type>void</type>*' becomes 'const*'.
		return VkModifier.values().first { it.identifier == text }
	}



	/**
	 * Used for struct members or array lengths with [] array identifiers.
	 */
	private fun constArrayLength(element: VkXmlElement): Int? {
		// Edge case for VkAccelerationStructureVersionInfoKHR.
		if(element["len"] == "2*ename:VK_UUID_SIZE") return 32

		// No const array length.
		if(element.text == null || !element.text.contains('[')) return null

		// If [] with no specified array length, then the array length is given as an attribute named 'enum'.
		// The attribute refers to an API constant.
		return element.text.split('[').last().substringBefore(']').let {
			if(it.isEmpty())
				constants.fromName(element.child("enum").text!!).value.toInt()
			else
				it.toInt()
		}
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