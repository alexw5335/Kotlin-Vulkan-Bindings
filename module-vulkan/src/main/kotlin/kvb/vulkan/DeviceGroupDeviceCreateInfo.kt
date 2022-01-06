// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_VERSION_1_1

 *     struct VkDeviceGroupDeviceCreateInfo {
 *         VkStructureType    sType
 *         void*              pNext (must be null)
 *         uint32_t           physicalDeviceCount
 *         VkPhysicalDevice*  pPhysicalDevices
 *     }
 */
@JvmInline
value class DeviceGroupDeviceCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var physicalDeviceCount: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var pPhysicalDevices: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	
	
	var physicalDevices: DirectLongBuffer
		get()      = DirectLongBuffer(Unsafe.getLong(address + 24), physicalDeviceCount)
		set(value) { Unsafe.setLong(address + 24, value.address); physicalDeviceCount = value.capacity }


}