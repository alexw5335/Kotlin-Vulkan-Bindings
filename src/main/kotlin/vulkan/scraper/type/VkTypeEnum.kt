package vulkan.scraper.type

import memory.Primitive
import vulkan.scraper.VkScraperUtils
import vulkan.scraper.element.VkEnumEntry
import vulkan.scraper.list.VkElementList

/**
 * A C enum type that can be either 32- or 64-bit.
 */
data class VkTypeEnum(
	override val name    : String,
	val entries	         : VkElementList<VkEnumEntry>,
	override val aliased : Boolean = false
) : VkType {


	/**
	 * Standard shortened name with the removal of the "Vk" prefix and of any extension postfixes.
	 */
	override val shortName = VkScraperUtils.enumShortName(name)



	/**
	 * If this enum represents the possible flag values of a bitmask.
	 */
	val isFlags: Boolean



	/**
	 * If this enum must be represented by a 64-bit integer or a 32-bit integer. There are currently only two 64-bit
	 * enums: VkAccessFlags2KHR and VkPipelineStageFlagBits2KHR.
	 */
	val is64Bit: Boolean



	init {
		when {
			shortName.endsWith("FlagBits2") 	-> { isFlags = true; is64Bit = true }
			shortName.endsWith("FlagBits") 		-> { isFlags = true; is64Bit = false }
			else							 	-> { isFlags = false; is64Bit = false }
		}
	}



	/**
	 * The native primitive used to represent this enum is chosen based on the bit-width of the enum. A 64-bit enum uses
	 * a [NativeTypes.INT64_T], whereas a 32-bit enum (the majority of enums) uses a [NativeTypes.INT32_T].
	 */
	override val primitive = if(is64Bit) Primitive.LONG else Primitive.INT



	/**
	 * The common prefix shared by all entries in this enum. This is determined from the enum's name. Note that there
	 * are some exceptions to this. For example, most of the VkResult enum entries do not start with the enum's prefix.
	 * Also, some enum entries contain typos that remain due to backwards compatibility. When generating short enum
	 * entry names, the name must be checked to make sure that it does begin with this prefix before removing it.
	 */
	val prefix = VkScraperUtils.enumPrefix(this)



	/**
	 * The string used for getting the value of this enum. This differs for normal enums and flag enums.
	 */
	val valueString = if(isFlags) "bitfield" else "id"



	/**
	 * Flag enums are replaced by their bitmasks during final generation.
	 */
	override val genName get() = if(isFlags) bitmask.shortName else shortName



	/**
	 * If this is a FlagBits type, then this variable will be set to the bitmask that will contain these flags.
	 */
	lateinit var bitmask: VkTypeBitmask


}