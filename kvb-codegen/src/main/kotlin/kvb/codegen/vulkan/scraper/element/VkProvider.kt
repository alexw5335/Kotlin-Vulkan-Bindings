package kvb.codegen.vulkan.scraper.element

import kvb.codegen.vulkan.scraper.list.VkElementList
import kvb.codegen.vulkan.scraper.list.VkTypeList

sealed interface VkProvider : VkElement {


	val types: VkTypeList

	val commands: VkElementList<VkCommand>


}