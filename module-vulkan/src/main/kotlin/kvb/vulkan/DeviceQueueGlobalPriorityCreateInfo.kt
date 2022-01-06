// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_EXT_global_priority

 *     struct VkDeviceQueueGlobalPriorityCreateInfoEXT {
 *         VkStructureType           sType
 *         void*                     pNext (must be null)
 *         VkQueueGlobalPriorityEXT  globalPriority
 *     }
 */
@JvmInline
value class DeviceQueueGlobalPriorityCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var globalPriority: QueueGlobalPriority
		get()      = _QueueGlobalPriority(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)


}