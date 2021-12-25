package kvb.codegen.vulkan.scraper.element

import kvb.codegen.vulkan.scraper.Named
import kvb.codegen.vulkan.scraper.list.NamedList
import kvb.codegen.vulkan.scraper.list.TypeList

sealed interface VkProvider : Named {
	

	val types: TypeList

	val commands: NamedList<VkCommand>

	val shouldGen: Boolean


}