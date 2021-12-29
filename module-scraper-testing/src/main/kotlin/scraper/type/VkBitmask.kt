package scraper.type

import scraper.writer.procedural.Primitive

class VkBitmask(
	override val name      : String,
	override val genName   : String,
	override val shouldGen : Boolean,
	override val primitive : Primitive,
	val is64Bit            : Boolean,
	val enumName           : String?
) : VkType