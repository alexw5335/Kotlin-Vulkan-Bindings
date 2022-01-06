// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_KHR_acceleration_structure

 *     union VkDeviceOrHostAddressConstKHR {
 *         VkDeviceAddress  deviceAddress
 *         void*            hostAddress
 *     }
 */
@JvmInline
value class DeviceOrHostAddressConst(override val address: Long) : Addressable {
	
	
	var deviceAddress: Long
		get()      = Unsafe.getLong(address + 0)
		set(value) = Unsafe.setLong(address + 0, value)
	
	var hostAddress: Long
		get()      = Unsafe.getLong(address + 0)
		set(value) = Unsafe.setLong(address + 0, value)


}