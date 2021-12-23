package kvb.scraper

class VkScraper(private val registry: VkXmlElement) {


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
		fun scrape(path: String) = VkScraper(VkXmlParser.parse(path)).also { it.scrape() }
	}



	fun scrape() {

	}

/*

	sealed interface VkType {

	}



	fun scrapeTypeElement(element: VkXmlElement): VkType {
		val name = element["name"]
			?: element.child("name").text
			?: err(element)

		element["alias"].let {
			return VkType(name, VkTypeCategory.ALIAS, alias = it)
		}

		element["category"]?.let { category ->
			if(category == "bitmask") {
				return VkType(
					name,
					VkTypeCategory.BITMASK,
					is64Bit = element["bitvalues"] != null,

				)
			}
		}
	}*/


}