package kvb.codegen.vulkan.scraper.type

import kvb.codegen.vulkan.VkGenUtils
import kvb.codegen.writer.procedural.Primitive

class VkTypeBitmask(
	override val name: String,
	val requires: String?,
	val bitvalues: String?
): VkType {


	val shortName = VkGenUtils.bitmaskShortName(name)



	/**
	 * 64-bit bitmasks use [bitvalues] rather than [requires] to specify their [enum].
	 */
	val is64Bit = bitvalues != null



	/**
	 * Some bitmasks are empty and reserved for future use or are simply not used.
	 */
	val implemented = requires != null || (is64Bit && bitvalues != null)



	/**
	 * If extra functions should be generated for this bitmask.
	 */
	val isExtraGen get() = VkGenUtils.extraGenBitmasks.contains(name)



	/*
	Type implementation
	 */



	override val primitive = if(is64Bit) Primitive.LONG else Primitive.INT

	override val shouldGen get() = VkGenUtils.shouldGenBitmask(this)

	override val genName get() = if(shouldGen) shortName else primitive.kName



	/*
	Lateinit
	 */



	/**
	 * The enum type that represents the bit values.
	 */
	var enum: VkTypeEnum? = null


}