package codegen

import codegen.core.PrimitiveGenerator
import codegen.vulkan.VulkanCWrapperGenerator
import codegen.vulkan.VulkanGenerator
import codegen.vulkan.parse.VulkanParser
import codegen.vulkan.scrape.VulkanScraper
import java.nio.file.Paths



private fun genVulkan() {
	val generator = VulkanGenerator(
		registry    = VulkanScraper.scrape(Paths.get("vk.xml")),
		directory   = Paths.get("gen/vulkan"),
		cDirectory  = Paths.get("gen/c"),
		packageName = "kvb.vulkan"
	)

	//generator.genConstants()
	//generator.genEnums()
	//generator.genStructs()
	//generator.genUtilClasses()
	//generator.genHandles()
	//generator.genStructAllocations()
	//generator.genCommandsKotlin()
	//generator.genCommandsC()
	generator.genCWrapper()
}



private fun genPrimitives() {
	val generator = PrimitiveGenerator(
		directory = Paths.get("gen/direct"),
		packageName = "kvb.core.memory.direct"
	)

	generator.generate()
}



private fun genVulkanCWrapper() {
	val generator = VulkanCWrapperGenerator(
		registry = VulkanParser.parse(Paths.get("vk.xml")),
		directory = Paths.get("gen/c")
	)

	generator.genDef()
	generator.genCmd()
}



fun main() {
	//genVulkan()
	//genVulkanCWrapper()
	genVulkanCWrapper()
}