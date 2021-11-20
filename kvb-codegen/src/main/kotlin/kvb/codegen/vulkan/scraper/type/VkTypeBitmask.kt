package kvb.codegen.vulkan.scraper.type

import kvb.codegen.vulkan.VkGenUtils
import kvb.codegen.vulkan.scraper.element.VkProvider
import kvb.codegen.writer.procedural.Primitive

class VkTypeBitmask(
	override val name: String,
	val requires: String?,
	val bitvalues: String?
): VkType {


	/*
	Type implementation
	 */



	override val shortName = VkGenUtils.bitmaskShortName(name)

	override val primitive = if(is64Bit) Primitive.LONG else Primitive.INT

	override lateinit var provider: VkProvider



	/*
	Properties
	 */



	/**
	 * 64-bit bitmasks use [bitvalues] rather than [requires] to specify their [enum].
	 */
	val is64Bit get() = bitvalues != null



	/**
	 * Some bitmasks are empty and reserved for future use or are simply not used.
	 */
	val implemented get() = requires != null || (is64Bit && bitvalues != null)



	/**
	 * If extra functions should be generated for this bitmask.
	 */
	val isExtraGen get() = VkGenUtils.extraGenBitmasks.contains(name)



	/*
	Lateinit
	 */



	/**
	 * The enum type that represents the bit values.
	 */
	var enum: VkTypeEnum? = null


}