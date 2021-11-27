package kvb.codegen.vulkan.scraper.element

class VkConstant(
	override val name : String,
	val value         : String,
	val isAliased     : Boolean = false
) : VkGenElement {


	override var genName = name

	override val shouldGen = !isAliased


}