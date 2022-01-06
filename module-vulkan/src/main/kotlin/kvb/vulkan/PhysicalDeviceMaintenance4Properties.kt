// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_KHR_maintenance4

 *     struct VkPhysicalDeviceMaintenance4PropertiesKHR {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkDeviceSize     maxBufferSize
 *     }
 */
@JvmInline
value class PhysicalDeviceMaintenance4Properties(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var maxBufferSize: Long
		get()      = Unsafe.getLong(address + 16)
		set(value) = Unsafe.setLong(address + 16, value)


}