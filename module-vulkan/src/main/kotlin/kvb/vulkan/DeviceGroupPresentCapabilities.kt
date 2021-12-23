// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkDeviceGroupPresentCapabilitiesKHR {
 *         VkStructureType                   sType
 *         void*                             pNext (must be null)
 *         uint32_t                          presentMask[32]
 *         VkDeviceGroupPresentModeFlagsKHR  modes
 *     }
 */
@JvmInline
value class DeviceGroupPresentCapabilities(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var presentMask: DirectIntBuffer
		get()      = DirectIntBuffer(address + 16, 32)
		set(value) = Unsafe.copy(value.address, address + 16, value.byteSize)
	
	var modes: DeviceGroupPresentModeFlags
		get()      = DeviceGroupPresentModeFlags(Unsafe.getInt(address + 144))
		set(value) = Unsafe.setInt(address + 144, value.value)


}