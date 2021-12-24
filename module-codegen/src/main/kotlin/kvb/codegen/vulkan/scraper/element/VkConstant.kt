package kvb.codegen.vulkan.scraper.element

import kvb.codegen.vulkan.scraper.VkGenUtils.dropPostfix

class VkConstant(
	override val name : String,
	val value         : String,
	val isAliased     : Boolean = false
): VkNamed {


	val shouldGen = !isAliased

	val genName = name.dropPostfix.dropLastWhile { it == '_' }


}