package scraper.kvb.codegen.vulkan.type

import scraper.kvb.codegen.vulkan.naming.NamedList
import scraper.writer.procedural.Primitive

class VkEnum(
	override val name      : String,
	override val genName   : String,
	override val shouldGen : Boolean,
	override val primitive : Primitive,
	val is64Bit            : Boolean,
	val entries            : NamedList<VkEnumEntry>
) : VkType