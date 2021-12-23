// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkStridedDeviceAddressRegionKHR {
 *         VkDeviceAddress  deviceAddress
 *         VkDeviceSize     stride
 *         VkDeviceSize     size
 *     }
 */
@JvmInline
value class StridedDeviceAddressRegion(override val address: Long) : Addressable {
	
	
	var deviceAddress: Long
		get()      = Unsafe.getLong(address + 0)
		set(value) = Unsafe.setLong(address + 0, value)
	
	var stride: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var size: Long
		get()      = Unsafe.getLong(address + 16)
		set(value) = Unsafe.setLong(address + 16, value)


}