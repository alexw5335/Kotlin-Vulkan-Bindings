// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_VERSION_1_1

 *     struct VkFormatProperties2 {
 *         VkStructureType     sType
 *         void*               pNext
 *         VkFormatProperties  formatProperties
 *     }
 * 
 *     Valid pNext types:
 *         - VkDrmFormatModifierPropertiesListEXT
 *         - VkVideoProfilesKHR
 *         - VkVideoProfileKHR
 *         - VkVideoDecodeH264ProfileEXT
 *         - VkVideoDecodeH265ProfileEXT
 *         - VkVideoEncodeH264ProfileEXT
 *         - VkVideoEncodeH265ProfileEXT
 *         - VkFormatProperties3KHR
 *         - VkDrmFormatModifierPropertiesList2EXT
 */
@JvmInline
value class FormatProperties2(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var formatProperties: FormatProperties
		get()      = FormatProperties(address + 16)
		set(value) = Unsafe.copy(value.address, address + 16, 12)


}