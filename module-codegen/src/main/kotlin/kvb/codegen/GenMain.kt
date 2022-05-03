package kvb.codegen

import kvb.codegen.vulkan.VulkanGenerator
import kvb.codegen.vulkan.scrape.VulkanScraper
import java.nio.file.Paths



private fun genVulkan() {
	val generator = VulkanGenerator(
		VulkanScraper.scrape(Paths.get("vk.xml")),
		Paths.get("gen/vulkan"),
		Paths.get("gen/c"),
		"kvb.vulkan"
	)

	//generator.genCommands()
	//generator.genCommandsC()
	//generator.genConstants()
	//generator.genProviders()
	//generator.genUtils()
	generator.genAssembly()
}



fun main() {
	genVulkan()
}