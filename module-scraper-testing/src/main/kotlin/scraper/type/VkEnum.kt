package scraper.type

import scraper.naming.NamedList
import scraper.properties.Primitive

class VkEnum(
	override val name      : String,
	override val genName   : String,
	override val shouldGen : Boolean,
	override val primitive : Primitive,
	val is64Bit            : Boolean,
	val entries            : NamedList<VkEnumEntry>
) : VkType