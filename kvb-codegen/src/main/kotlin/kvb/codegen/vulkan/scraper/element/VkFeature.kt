package kvb.codegen.vulkan.scraper.element

import kvb.codegen.vulkan.scraper.list.VkElementList
import kvb.codegen.vulkan.scraper.list.VkTypeList

class VkFeature(override val name: String) : VkProvider {


	override val types = VkTypeList()

	override val commands = VkElementList<VkCommand>()

	override var genName = name

	override val shouldGen = true


}