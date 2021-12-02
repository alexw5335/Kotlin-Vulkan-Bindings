package kvb.codegen.vulkan.scraper.type

import kvb.codegen.writer.procedural.Primitive

class VkTypeBitmask(
	override val name: String,
	val is64Bit: Boolean,
	val enumName: String?
): VkType {


	override val primitive = if(is64Bit) Primitive.LONG else Primitive.INT

	val implemented = enumName != null

	var enum: VkTypeEnum? = null

	override val shouldGen get() = implemented && enum != null && enum!!.entries.isNotEmpty()


}