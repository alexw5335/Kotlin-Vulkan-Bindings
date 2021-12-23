// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkFormatProperties {
 *         VkFormatFeatureFlags  linearTilingFeatures
 *         VkFormatFeatureFlags  optimalTilingFeatures
 *         VkFormatFeatureFlags  bufferFeatures
 *     }
 */
@JvmInline
value class FormatProperties(override val address: Long) : Addressable {
	
	
	var linearTilingFeatures: FormatFeatureFlags
		get()      = FormatFeatureFlags(Unsafe.getInt(address + 0))
		set(value) = Unsafe.setInt(address + 0, value.value)
	
	var optimalTilingFeatures: FormatFeatureFlags
		get()      = FormatFeatureFlags(Unsafe.getInt(address + 4))
		set(value) = Unsafe.setInt(address + 4, value.value)
	
	var bufferFeatures: FormatFeatureFlags
		get()      = FormatFeatureFlags(Unsafe.getInt(address + 8))
		set(value) = Unsafe.setInt(address + 8, value.value)


}