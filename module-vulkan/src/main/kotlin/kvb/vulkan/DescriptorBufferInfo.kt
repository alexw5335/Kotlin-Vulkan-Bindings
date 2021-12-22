// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkDescriptorBufferInfo {
 *         VkBuffer      buffer
 *         VkDeviceSize  offset
 *         VkDeviceSize  range
 *     }
 */
@JvmInline
value class DescriptorBufferInfo(override val address: Long) : Addressable {
	
	
	var buffer: BufferH
		get()      = BufferH(Unsafe.getLong(address + 0))
		set(value) = Unsafe.setLong(address + 0, value.address)
	
	var offset: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var range: Long
		get()      = Unsafe.getLong(address + 16)
		set(value) = Unsafe.setLong(address + 16, value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 24
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = DescriptorBufferInfo(offset(index))
		
		operator fun set(index: Int, value: DescriptorBufferInfo) = Unsafe.copy(value.address, offset(index), 24)
		
		inline fun forEach(block: (DescriptorBufferInfo) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (DescriptorBufferInfo) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, DescriptorBufferInfo) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}