// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_VERSION_1_1

 *     struct VkMemoryRequirements2 {
 *         VkStructureType       sType
 *         void*                 pNext
 *         VkMemoryRequirements  memoryRequirements
 *     }
 * 
 *     Valid pNext types:
 *         - VkMemoryDedicatedRequirements
 */
@JvmInline
value class MemoryRequirements2(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var memoryRequirements: MemoryRequirements
		get()      = MemoryRequirements(address + 16)
		set(value) = Unsafe.copy(value.address, address + 16, 24)


}