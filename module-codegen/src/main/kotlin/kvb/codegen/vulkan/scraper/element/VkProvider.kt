package kvb.codegen.vulkan.scraper.element

import kvb.codegen.vulkan.scraper.list.VkNamedList
import kvb.codegen.vulkan.scraper.list.VkTypeList

sealed interface VkProvider : VkNamed {
	

	val types: VkTypeList

	val commands: VkNamedList<VkCommand>

	val shouldGen: Boolean


}