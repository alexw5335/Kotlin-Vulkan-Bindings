// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkCommandBufferBeginInfo {
 *         VkStructureType                  sType
 *         void*                            pNext
 *         VkCommandBufferUsageFlags        flags
 *         VkCommandBufferInheritanceInfo*  pInheritanceInfo
 *     }
 * 
 *     Valid pNext types:
 *         - VkDeviceGroupCommandBufferBeginInfo
 */
@JvmInline
value class CommandBufferBeginInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: CommandBufferUsageFlags
		get()      = CommandBufferUsageFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var pInheritanceInfo: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	
	
	var inheritanceInfo: CommandBufferInheritanceInfo
		get()      = CommandBufferInheritanceInfo(Unsafe.getLong(address + 24))
		set(value) { Unsafe.setLong(address + 24, value.address) }


}