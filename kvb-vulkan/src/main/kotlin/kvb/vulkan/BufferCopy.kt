// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkBufferCopy {
 *         VkDeviceSize  srcOffset
 *         VkDeviceSize  dstOffset
 *         VkDeviceSize  size
 *     }
 */
@JvmInline
value class BufferCopy(override val address: Long) : Addressable {
	
	
	var srcOffset: Long
		get()      = Unsafe.getLong(address + 0)
		set(value) = Unsafe.setLong(address + 0, value)
	
	var dstOffset: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var size: Long
		get()      = Unsafe.getLong(address + 16)
		set(value) = Unsafe.setLong(address + 16, value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 24
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = BufferCopy(offset(index))
		
		operator fun set(index: Int, value: BufferCopy) = Unsafe.copy(value.address, offset(index), 24)
		
		inline fun forEach(block: (BufferCopy) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (BufferCopy) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, BufferCopy) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}