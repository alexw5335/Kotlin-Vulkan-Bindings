package kvb.codegen.vulkan.scraper.element

import kvb.codegen.vulkan.scraper.Named
import kvb.codegen.vulkan.scraper.GenUtils.dropPostfix

class VkConstant(
	override val name : String,
	val value         : String,
	val isAliased     : Boolean = false
): Named {


	val shouldGen = !isAliased

	val genName = name.dropPostfix.dropLastWhile { it == '_' }


}