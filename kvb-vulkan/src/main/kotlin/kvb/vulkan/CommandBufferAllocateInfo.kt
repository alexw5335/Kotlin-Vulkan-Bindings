// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.Unsafe

/**
 *     struct VkCommandBufferAllocateInfo {
 *         VkStructureType       sType
 *         void*                 pNext (must be null)
 *         VkCommandPool         commandPool
 *         VkCommandBufferLevel  level
 *         uint32_t              commandBufferCount
 *     }
 */
@JvmInline
value class CommandBufferAllocateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var commandPool: CommandPoolH
		get()      = CommandPoolH(Unsafe.getLong(address + 16))
		set(value) = Unsafe.setLong(address + 16, value.address)
	
	var level: CommandBufferLevel
		get()      = _CommandBufferLevel(Unsafe.getInt(address + 24))
		set(value) = Unsafe.setInt(address + 24, value.value)
	
	var commandBufferCount: Int
		get()      = Unsafe.getInt(address + 28)
		set(value) = Unsafe.setInt(address + 28, value)


}