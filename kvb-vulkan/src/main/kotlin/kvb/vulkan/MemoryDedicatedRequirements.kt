// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.Unsafe

/**
 *     struct VkMemoryDedicatedRequirements {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkBool32         prefersDedicatedAllocation
 *         VkBool32         requiresDedicatedAllocation
 *     }
 */
@JvmInline
value class MemoryDedicatedRequirements(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var prefersDedicatedAllocation: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var requiresDedicatedAllocation: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)


}