package scraper.scraper

import scraper.VulkanScraper
import java.nio.file.Path

class VulkanGenerator(
	val vkxmlPath: Path,
	val directory: Path,
	val packageName: String
) {


	val scraper = VulkanScraper(vkxmlPath)
}