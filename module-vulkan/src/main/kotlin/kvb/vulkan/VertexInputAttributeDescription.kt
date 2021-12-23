// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkVertexInputAttributeDescription {
 *         uint32_t  location
 *         uint32_t  binding
 *         VkFormat  format
 *         uint32_t  offset
 *     }
 */
@JvmInline
value class VertexInputAttributeDescription(override val address: Long) : Addressable {
	
	
	var location: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var binding: Int
		get()      = Unsafe.getInt(address + 4)
		set(value) = Unsafe.setInt(address + 4, value)
	
	var format: Format
		get()      = Format(Unsafe.getInt(address + 8))
		set(value) = Unsafe.setInt(address + 8, value.value)
	
	var offset: Int
		get()      = Unsafe.getInt(address + 12)
		set(value) = Unsafe.setInt(address + 12, value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 16
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = VertexInputAttributeDescription(offset(index))
		
		operator fun set(index: Int, value: VertexInputAttributeDescription) = Unsafe.copy(value.address, offset(index), 16)
		
		inline fun forEach(block: (VertexInputAttributeDescription) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (VertexInputAttributeDescription) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, VertexInputAttributeDescription) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}