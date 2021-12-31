package scraper.kvb.codegen.vulkan

import scraper.kvb.codegen.vulkan.type.VkCommand
import scraper.kvb.codegen.vulkan.type.VkConstant
import scraper.kvb.codegen.vulkan.type.VkType

class ScrapedRegistry(
	val types     : List<VkType>,
	val commands  : List<VkCommand>,
	val constants : List<VkConstant>
)