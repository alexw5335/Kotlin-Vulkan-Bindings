package codegen

import codegen.vulkan.VulkanGenerator
import codegen.vulkan.scrape.VulkanScraper
import java.nio.file.Paths

fun main() {
	VulkanGenerator(VulkanScraper.scrape(Paths.get("vk.xml")), Paths.get("gen"), "kvb.vulkan")
}