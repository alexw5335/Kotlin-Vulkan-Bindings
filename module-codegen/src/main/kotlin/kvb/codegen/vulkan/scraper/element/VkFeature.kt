package kvb.codegen.vulkan.scraper.element

import kvb.codegen.vulkan.scraper.list.NamedList
import kvb.codegen.vulkan.scraper.list.TypeList

class VkFeature(override val name: String) : VkProvider {


	override val types = TypeList()

	override val commands = NamedList<VkCommand>()

	override val shouldGen = true


}