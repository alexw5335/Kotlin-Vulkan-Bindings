package scraper

import scraper.xml.XmlElement
import scraper.xml.XmlParser

class Scraper(private val registry: XmlElement) {


	/*
	Exceptions
	 */



	private class VkScrapeException(message: String) : RuntimeException(message)

	private fun err(message: String): Nothing = throw VkScrapeException(message)

	private fun err(message: String, element: XmlElement): Nothing = err("$message. element=$element")

	private fun err(element: XmlElement): Nothing = err("invalid element: $element")



	/*
	Scraping
	 */



	companion object {

		fun scrape(path: String) = Scraper(XmlParser.parse(path)).also { it.scrape() }

	}



	private fun scrapeElements() {
		for(element in registry) {
			when (element.type) {
				"platforms" ->
					for(child in element)
						if(child.type == "platform")
							platformElements.add(PlatformElement(child.attrib("name"), child.attrib("protect")))

				"commands" ->
					for(child in element)
						if(child.type == "command")
							commandElements.add(scrapeCommandElement(child))

				"types" ->
					for(child in element)
						if(child.type == "type")
							typeElements.add(scrapeTypeElement(child))

				"enums"     -> scrapeEnumsElement(element)
				"feature"   -> featureElements.add(scrapeFeatureElement(element))
				"extension" -> extensionElements.add(scrapeExtensionElement(element))
			}
		}
	}



	fun scrape() {
		scrapeElements()
	}



	val ExtensionElement.shouldGen get() = deprecatedBy == null && !disabled && promotedTo != "VK_VERSION_1_1"



	val CommandElement.shouldGen get() = alias != null && name != "vkGetInstanceProcAddr"



	val TypeElement.shouldGen get() = when(this) {
		is BitmaskTypeElement -> enumName != null && enumsElements.fromName(enumName).entries.isNotEmpty()
		is EnumTypeElement    -> name != "VkStructureType" && enumsElements.fromName(name).entries.isNotEmpty()
		is StructTypeElement  -> true
		is HandleTypeElement  -> true
		else                  -> false
	}



	/*
	Variables
	 */



	val commandElements = NamedList<CommandElement>()

	val platformElements = NamedList<PlatformElement>()

	val constantElements = NamedList<ConstantElement>()

	val typeElements = NamedList<TypeElement>()

	val enumsElements = NamedList<EnumsElement>()

	val featureElements = NamedList<FeatureElement>()

	val extensionElements = NamedList<ExtensionElement>()



	/*
	Constant elements
	 */



	private fun scrapeConstantElement(element: XmlElement): ConstantElement {
		val name = element["name"] ?: err(element)

		element["alias"]?.let {
			return ConstantElement(name, "", true)
		}

		val value = element.attrib("value")

		// Int literal
		value.toIntOrNull()?.let {
			return ConstantElement(name, value)
		}

		// Hardcoded, may need to be updated in the future.
		return when(value) {
			"(~0ULL)" 	-> ConstantElement(name, "-1L")
			"(~0U)" 	-> ConstantElement(name, "-1")
			"(~0U-1)" 	-> ConstantElement(name, "-2")
			"(~0U-2)" 	-> ConstantElement(name, "-3")
			"(~1U)"     -> ConstantElement(name, "-2")
			"(~2U)"     -> ConstantElement(name, "-3")
			"1000.0f"	-> ConstantElement(name, "1000.0f")
			"1000.0F"   -> ConstantElement(name, "1000.0f")
			else		-> err("invalid api constant value: $value", element)
		}
	}



	/*
	Type elements
	 */



	private fun scrapeTypeElement(element: XmlElement): TypeElement {
		val name = element["name"] ?: element.child("name").text ?: err(element)

		element["alias"]?.let {
			return AliasTypeElement(name, it)
		}

		when(element["category"]) {
			null -> { }

			"enum" -> return EnumTypeElement(
				name        = name,
				is64Bit     = name.contains("FlagBits2"),
				isFlagBits  = name.contains("FlagBits")
			)

			"bitmask" -> return BitmaskTypeElement(
				name     = name,
				is64Bit  = element["bitvalues"] != null,
				enumName = element["requires"] ?: element["bitvalues"]
			)

			"basetype" -> {
				element.childOrNull("type")?.text?.let {
					return PrimitiveTypeElement(name, it)
				}

				// Redefined native types (ANativeWindow, CAMetalLayer, AHardwareBuffer)
				return NativeTypeElement(name)
			}

			"struct" -> return StructTypeElement(
				name = name,
				isUnion = false,
				members = element.children("member").mapIndexed(::scrapeVarElement)
			)

			"union" -> return StructTypeElement(
				name = name,
				isUnion = true,
				members = element.children("member").mapIndexed(::scrapeVarElement)
			)

			"handle" -> return HandleTypeElement(name)

			// Unimportant types, e.g. defines, includes, function pointers.
			else -> return MiscTypeElement(name)
		}

		val requires = element["requires"]

		if(requires == "vk_platform" || name == "int")
			return PrimitiveTypeElement(name, name)

		return NativeTypeElement(name)
	}



	/*
	Enum elements
	 */



	private fun scrapeEnumEntryElement(element: XmlElement, extNumber: Int): EnumEntryElement {
		val name = element["name"] ?: err(element)

		element["alias"]?.let {
			return EnumEntryElement(name, null, it)
		}

		var value =
			element["value"]

			?: element["bitpos"]?.let {
				(1L shl it.toInt()).toString()
			}

			// See scripts/generator.py file in the KhronosGroup/Vulkan-Docs repository for the formula.
			?: element["offset"]?.let {
				(1000000000 + ((element["extnumber"]?.toInt() ?: extNumber) - 1) * 1000 + it.toInt()).toString()
			}

			?: err("Invalid enum value", element)

		if(element["dir"] == "-")
			value = "-$value"

		return EnumEntryElement(name, value, null)
	}



	private fun scrapeEnumsElement(element: XmlElement) {
		val name = element["name"] ?: err(element)

		if(name == "API Constants") {
			for(child in element)
				if(child.type == "enum")
					constantElements.add(scrapeConstantElement(child))
			return
		}

		val entries = ArrayList<EnumEntryElement>()

		for(child in element)
			if(child.type == "enum")
				entries.add(scrapeEnumEntryElement(child, 0))

		enumsElements.add(EnumsElement(name, entries, HashMap()))
	}



	/*
	Feature and extension elements
	 */



	private fun scrapeFeatureElement(element: XmlElement): FeatureElement {
		val name = element["name"] ?: err(element)
		val types = ArrayList<String>()
		val commands = ArrayList<String>()

		for(require in element.children) {
			if(require.type != "require") continue

			for(element2 in require.children) {
				when(element2.type) {
					"type"    -> types.add(element2["name"]!!)
					"command" -> commands.add(element2["name"]!!)
					"enum"    -> {
						val enum = enumsElements.fromName(element2["extends"] ?: continue)
						enum.extensionEntries[name] = scrapeEnumEntryElement(element2, 0)
					}
				}
			}
		}

		return FeatureElement(name, types, commands)
	}



	private fun scrapeExtensionElement(element: XmlElement): ExtensionElement {
		val name = element["name"] ?: err(element)
		val number = element["number"]?.toInt() ?: err(element)
		val types = ArrayList<String>()
		val commands = ArrayList<String>()

		for(require in element.children) {
			if(require.type != "require") continue

			for(element2 in require.children) {
				when(element2.type) {
					"type"    -> types.add(element2["name"]!!)
					"command" -> commands.add(element2["name"]!!)
					"enum"    -> {
						val enum = enumsElements.fromName(element2["extends"] ?: continue)
						enum.extensionEntries[name] = scrapeEnumEntryElement(element2, number)
					}
				}
			}
		}

		return ExtensionElement(
			name,
			number,
			element["platform"],
			element["deprecatedby"],
			element["promotedTo"],
			element["disabled"] == "true",
			types,
			commands
		)
	}



	/*
	Command elements
	 */



	private fun scrapeCommandElement(element: XmlElement): CommandElement {
		element["alias"]?.let {
			val aliased = commandElements.fromName(it)
			return CommandElement(element.attrib("name"), aliased.returnType, aliased.params, it)
		}

		val proto      = element.child("proto")
		val name       = proto.child("name").text!!
		val returnType = proto.child("type").text!!.takeUnless { it == "void" }
		val params     = element.children("param").mapIndexed(::scrapeVarElement)

		return CommandElement(name, returnType, params, null)
	}



	private fun scrapeCommandsElement(element: XmlElement) {
		for(child in element)
			if(child.type == "command")
				commandElements.add(scrapeCommandElement(element))
	}



	/*
	Var elements
	 */



	private fun scrapeVarElement(index: Int, element: XmlElement) = VarElement(
		name     = element.child("name").text ?: err(element),
		type     = element.child("type").text ?: err(element),
		optional = element["optional"]?.equals("true") ?: false,
		modifier = varModifier(element),
		index    = index,
		len      = element["len"],
		altLen   = element["altlen"],
		sType    = element["values"],
	)



	/**
	 * Determines the modifier of a C parameter or struct member.
	 */
	private fun varModifier(element: XmlElement): Modifier {
		// Modifiers are given as the VkXmlElement's text. They are not specified as separate elements/attributes.
		val text = element.text ?: return Modifier.NONE

		// Edge case for VkAccelerationStructureInstanceKHR.
		if(text.startsWith(':')) return Modifier.NONE

		// Arrays are handled separately.
		if(text.contains('[')) return Modifier.ARRAY

		// Matching the text with a modifier relies on text being condensed in the XML parser.
		// e.g. 'const <type>void</type>*' becomes 'const*'.
		return Modifier.values().first { it.identifier == text }
	}


}