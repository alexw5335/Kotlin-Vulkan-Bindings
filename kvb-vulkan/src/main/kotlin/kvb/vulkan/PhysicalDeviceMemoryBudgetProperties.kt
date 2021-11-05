// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.Unsafe
import kvb.core.memory.direct.DirectLongBuffer

/**
 *     struct VkPhysicalDeviceMemoryBudgetPropertiesEXT {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkDeviceSize     heapBudget[16]
 *         VkDeviceSize     heapUsage[16]
 *     }
 */
@JvmInline
value class PhysicalDeviceMemoryBudgetProperties(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var heapBudget: DirectLongBuffer
		get()      = DirectLongBuffer(address + 16, 16)
		set(value) = Unsafe.copy(value.address, address + 16, value.byteSize)
	
	var heapUsage: DirectLongBuffer
		get()      = DirectLongBuffer(address + 144, 16)
		set(value) = Unsafe.copy(value.address, address + 144, value.byteSize)


}