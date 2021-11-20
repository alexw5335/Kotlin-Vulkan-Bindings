package kvb.codegen.vulkan.scraper.element

import kvb.codegen.vulkan.VkGenUtils

class VkConstant(
	override val name : String,
	val value         : String,
	val isAliased     : Boolean = false
) : VkElement {


	val shortName = VkGenUtils.constantShortName(name)


}