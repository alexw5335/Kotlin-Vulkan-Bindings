// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkBindIndexBufferIndirectCommandNV {
 *         VkDeviceAddress  bufferAddress
 *         uint32_t         size
 *         VkIndexType      indexType
 *     }
 */
@JvmInline
value class BindIndexBufferIndirectCommand(override val address: Long) : Addressable {
	
	
	var bufferAddress: Long
		get()      = Unsafe.getLong(address + 0)
		set(value) = Unsafe.setLong(address + 0, value)
	
	var size: Int
		get()      = Unsafe.getInt(address + 8)
		set(value) = Unsafe.setInt(address + 8, value)
	
	var indexType: IndexType
		get()      = _IndexType(Unsafe.getInt(address + 12))
		set(value) = Unsafe.setInt(address + 12, value.value)


}