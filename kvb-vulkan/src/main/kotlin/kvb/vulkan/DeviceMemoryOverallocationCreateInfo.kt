// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.Unsafe

/**
 *     struct VkDeviceMemoryOverallocationCreateInfoAMD {
 *         VkStructureType                    sType
 *         void*                              pNext (must be null)
 *         VkMemoryOverallocationBehaviorAMD  overallocationBehavior
 *     }
 */
@JvmInline
value class DeviceMemoryOverallocationCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var overallocationBehavior: MemoryOverallocationBehavior
		get()      = _MemoryOverallocationBehavior(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)


}