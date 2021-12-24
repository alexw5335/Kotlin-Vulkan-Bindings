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

		typeElements.forEach {
			if(it is EnumTypeElement)
				println(it.name + "  " + it.is64Bit + "  " + it.isFlagBits)
		}
	}



	/*
	Variables
	 */



	val typeElements = NamedList<TypeElement>()



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


}