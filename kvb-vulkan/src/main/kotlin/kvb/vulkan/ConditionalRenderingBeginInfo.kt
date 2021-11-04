// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkConditionalRenderingBeginInfoEXT {
 *         VkStructureType                 sType
 *         void*                           pNext (must be null)
 *         VkBuffer                        buffer
 *         VkDeviceSize                    offset
 *         VkConditionalRenderingFlagsEXT  flags
 *     }
 */
@JvmInline
value class ConditionalRenderingBeginInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var buffer: BufferH
		get()      = BufferH(Unsafe.getLong(address + 16))
		set(value) = Unsafe.setLong(address + 16, value.address)
	
	var offset: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var flags: ConditionalRenderingFlags
		get()      = ConditionalRenderingFlags(Unsafe.getInt(address + 32))
		set(value) = Unsafe.setInt(address + 32, value.value)


}