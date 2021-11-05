// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.Unsafe

/**
 *     struct VkMemoryRequirements {
 *         VkDeviceSize  size
 *         VkDeviceSize  alignment
 *         uint32_t      memoryTypeBits
 *     }
 */
@JvmInline
value class MemoryRequirements(override val address: Long) : Addressable {
	
	
	var size: Long
		get()      = Unsafe.getLong(address + 0)
		set(value) = Unsafe.setLong(address + 0, value)
	
	var alignment: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var memoryTypeBits: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)


}