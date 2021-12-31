package scraper.kvb.codegen.vulkan.type

import scraper.kvb.codegen.vulkan.naming.Named

class VkConstant(
	override val name : String,
	val genName       : String,
	val shouldGen     : Boolean,
	val value         : String,
	val aliased       : Boolean
) : Named