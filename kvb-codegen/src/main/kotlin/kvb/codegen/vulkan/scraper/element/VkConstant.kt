package kvb.codegen.vulkan.scraper.element

import kvb.codegen.vulkan.VkGenUtils

class VkConstant(
	override val name : String,
	val value         : String,
	val isAliased     : Boolean = false
) : VkGenElement {


	override val shouldGen = VkGenUtils.shouldGenConstant(this)

	override val genName = VkGenUtils.constantShortName(name)


}