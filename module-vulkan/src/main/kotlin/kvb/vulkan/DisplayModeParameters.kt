// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_KHR_display

 *     struct VkDisplayModeParametersKHR {
 *         VkExtent2D  visibleRegion
 *         uint32_t    refreshRate
 *     }
 */
@JvmInline
value class DisplayModeParameters(override val address: Long) : Addressable {
	
	
	var visibleRegion: Extent2D
		get()      = Extent2D(address + 0)
		set(value) = Unsafe.copy(value.address, address + 0, 8)
	
	var refreshRate: Int
		get()      = Unsafe.getInt(address + 8)
		set(value) = Unsafe.setInt(address + 8, value)


}