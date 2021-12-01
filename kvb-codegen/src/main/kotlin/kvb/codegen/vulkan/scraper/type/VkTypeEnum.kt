package kvb.codegen.vulkan.scraper.type

import kvb.codegen.vulkan.scraper.element.VkEnumEntry
import kvb.codegen.vulkan.scraper.list.VkElementList
import kvb.codegen.writer.procedural.Primitive

class VkTypeEnum(override val name: String, val isFlagBits: Boolean, val is64Bit: Boolean) : VkType {


	override val primitive = if(is64Bit) Primitive.LONG else Primitive.INT

	val entries = VkElementList<VkEnumEntry>()

	var bitmask: VkTypeBitmask? = null


}