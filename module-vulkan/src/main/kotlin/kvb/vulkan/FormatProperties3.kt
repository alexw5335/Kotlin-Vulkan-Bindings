// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_KHR_format_feature_flags2

 *     struct VkFormatProperties3KHR {
 *         VkStructureType           sType
 *         void*                     pNext (must be null)
 *         VkFormatFeatureFlags2KHR  linearTilingFeatures
 *         VkFormatFeatureFlags2KHR  optimalTilingFeatures
 *         VkFormatFeatureFlags2KHR  bufferFeatures
 *     }
 */
@JvmInline
value class FormatProperties3(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var linearTilingFeatures: FormatFeatureFlags2
		get()      = FormatFeatureFlags2(Unsafe.getLong(address + 16))
		set(value) = Unsafe.setLong(address + 16, value.value)
	
	var optimalTilingFeatures: FormatFeatureFlags2
		get()      = FormatFeatureFlags2(Unsafe.getLong(address + 24))
		set(value) = Unsafe.setLong(address + 24, value.value)
	
	var bufferFeatures: FormatFeatureFlags2
		get()      = FormatFeatureFlags2(Unsafe.getLong(address + 32))
		set(value) = Unsafe.setLong(address + 32, value.value)


}