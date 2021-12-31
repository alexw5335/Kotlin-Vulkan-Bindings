package scraper.kvb.codegen.vulkan.type

import scraper.kvb.codegen.vulkan.naming.Named

class VkEnumEntry(
	override val name : String,
	val genName       : String,
	val value         : String,
	val shouldGen     : Boolean
) : Named