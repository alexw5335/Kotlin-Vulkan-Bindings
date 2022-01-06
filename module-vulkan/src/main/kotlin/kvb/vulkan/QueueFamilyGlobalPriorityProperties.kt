// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_EXT_global_priority_query

 *     struct VkQueueFamilyGlobalPriorityPropertiesEXT {
 *         VkStructureType           sType
 *         void*                     pNext (must be null)
 *         uint32_t                  priorityCount
 *         VkQueueGlobalPriorityEXT  priorities[16]
 *     }
 */
@JvmInline
value class QueueFamilyGlobalPriorityProperties(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var priorityCount: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var priorities: DirectIntBuffer
		get()      = DirectIntBuffer(address + 20, 16)
		set(value) = Unsafe.copy(value.address, address + 20, value.byteSize)


}