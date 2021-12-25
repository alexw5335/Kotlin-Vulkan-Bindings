package scraper

import scraper.xml.VkXmlElement
import scraper.xml.VkXmlParser

class Scraper(private val registry: VkXmlElement) {


	/*
	Exceptions
	 */



	private class VkScrapeException(message: String) : RuntimeException(message)

	private fun err(message: String): Nothing = throw VkScrapeException(message)

	private fun err(message: String, element: VkXmlElement): Nothing = err("$message. element=$element")

	private fun err(element: VkXmlElement): Nothing = err("invalid element: $element")



	/*
	Scraping
	 */



	companion object {

		fun scrape(path: String) = Scraper(VkXmlParser.parse(path)).also { it.scrape() }

	}



	fun scrape() {
		scrapeTypeElements()
		scrapeEnumElements()
	}



	/*
	Variables
	 */



	val typeElements = NamedList<TypeElement>()

	val enumElements = NamedList<EnumElement>()



	/*
	Type elements
	 */



	private fun scrapeTypeElements() {
		for(element in registry.child("types"))
			if(element.type == "type")
				typeElements.add(scrapeTypeElement(element))
	}



	private fun scrapeTypeElement(element: VkXmlElement): TypeElement {
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

			"handle"       -> return HandleTypeElement(name)
			"struct"       -> return StructTypeElement(name, false)
			"union"        -> return StructTypeElement(name, true)

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



	fun scrapeEnumEntryElement(element: VkXmlElement, extNumber: Int): EnumEntryElement {
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
				(1000000000 + (extNumber!! - 1) * 1000 + it.toInt()).toString()
			}

			?: err("Invalid enum value", element)

		if(element["dir"] == "-")
			value = "-$value"

		return EnumEntryElement(name, value, null)
	}



	fun scrapeEnumElement(element: VkXmlElement): EnumElement {
		val name = element["name"] ?: err(element)
		val entries = ArrayList<EnumEntryElement>()

		for(child in element)
			if(child.type == "enum")
				entries.add(scrapeEnumEntryElement(child, 0))

		return EnumElement(name, entries)
	}



	fun scrapeEnumElements() {
		for(element in registry)
			if(element.type == "enums")
				enumElements.add(scrapeEnumElement(element))
	}



	/*
	Struct elements
	 */



	fun scrapeStructElement(element: VkXmlElement): StructElement {
		val name = element["name"] ?: err(element)
		val members = element.children("member").mapIndexed(::scrapeVarElement)

		return StructElement(name, members)
	}

	fun scrapeStructElements() {
		for(element in registry.child("structs"))
	}


	/*
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
				m.varLenVariable = struct.members.first { it.name == m.varLen }
		}

		// Populating possible pNext values.
		element["structextends"]?.let {
			it.split(',').map(types.structs::fromName).forEach { extends ->
				extends.pNextValues.add(struct)
				struct.extends.add(extends)
			}
		}
	}
	 */


	fun scrapeVarElement(index: Int, element: VkXmlElement) = VarElement(
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
	private fun varModifier(element: VkXmlElement): Modifier {
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