package kvb.codegen.vulkan.scraper.element

import kvb.codegen.vulkan.scraper.list.VkNamedList
import kvb.codegen.vulkan.scraper.list.VkTypeList

class VkFeature(override val name: String) : VkProvider {


	override val types = VkTypeList()

	override val commands = VkNamedList<VkCommand>()

	override val shouldGen = true


}