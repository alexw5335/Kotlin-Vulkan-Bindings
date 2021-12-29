package scraper.type

import scraper.naming.Named

class VkEnumEntry(
	override val name : String,
	val genName       : String,
	val value         : String,
	val shouldGen     : Boolean
) : Named