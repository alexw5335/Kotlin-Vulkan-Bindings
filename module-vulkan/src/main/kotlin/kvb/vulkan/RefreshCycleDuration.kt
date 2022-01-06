// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_GOOGLE_display_timing

 *     struct VkRefreshCycleDurationGOOGLE {
 *         uint64_t  refreshDuration
 *     }
 */
@JvmInline
value class RefreshCycleDuration(override val address: Long) : Addressable {
	
	
	var refreshDuration: Long
		get()      = Unsafe.getLong(address + 0)
		set(value) = Unsafe.setLong(address + 0, value)


}