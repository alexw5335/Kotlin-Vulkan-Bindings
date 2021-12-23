// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkPhysicalDeviceMemoryProperties2 {
 *         VkStructureType                   sType
 *         void*                             pNext
 *         VkPhysicalDeviceMemoryProperties  memoryProperties
 *     }
 * 
 *     Valid pNext types:
 *         - VkPhysicalDeviceMemoryBudgetPropertiesEXT
 */
@JvmInline
value class PhysicalDeviceMemoryProperties2(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var memoryProperties: PhysicalDeviceMemoryProperties
		get()      = PhysicalDeviceMemoryProperties(address + 16)
		set(value) = Unsafe.copy(value.address, address + 16, 520)


}