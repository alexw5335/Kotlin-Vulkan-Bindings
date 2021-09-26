package vulkan.scraper.type

import memory.Primitive
import vulkan.scraper.VkScraperUtils

/**
 * Represents a Vulkan bitmask type. This is also referred to as a bitfield or as Flags. In the Vulkan registry, it is
 * represented by the VkFlags and VkFlags64 data types.
 *
 * - There are currently only two 64-bit bitmasks: VkAccessFlags2KHR and VkPipelineStageFlagBits2KHR.
 * - [requires] gives the name of the flags enum that makes up this bitmask.
 * - [bitvalues] is the same as [requires] but it is only used for 64-bit bitmasks.
 */
data class VkTypeBitmask(override val name		: String,
						 val requires			: String?,
						 val bitvalues			: String?,
						 val is64Bit			: Boolean,
						 override val aliased	: Boolean = false): VkType {


	override val shortName = VkScraperUtils.bitmaskShortName(name)

	override val genName = shortName

	override val primitive = if(is64Bit) Primitive.LONG else Primitive.INT

	/**
	 * Some bitmasks are empty and reserved for future use or are simply not used.
	 */
	val implemented = requires != null || (is64Bit && bitvalues != null)

	/**
	 * The enum type that represents the bit values.
	 */
	lateinit var enum: VkTypeEnum


}