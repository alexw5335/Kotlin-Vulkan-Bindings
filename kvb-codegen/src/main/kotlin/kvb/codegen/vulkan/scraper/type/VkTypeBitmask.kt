package kvb.codegen.vulkan.scraper.type

import kvb.codegen.writer.procedural.Primitive

class VkTypeBitmask(
	override val name: String,
	val is64Bit: Boolean,
	val enumName: String?
): VkType {


	/**
	 * 64-bit bitmasks are represented by [Long] and 32-bit bitmasks are represented by [Int].
	 */
	override val primitive = if(is64Bit) Primitive.LONG else Primitive.INT



	/**
	 * Some bitmasks are empty and reserved for future use or are simply not used.
	 */
	val implemented = enumName != null



	/**
	 * The enum type that represents the bit values.
	 */
	var enum: VkTypeEnum? = null


}