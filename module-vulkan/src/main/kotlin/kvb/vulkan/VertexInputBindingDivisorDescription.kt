// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_EXT_vertex_attribute_divisor

 *     struct VkVertexInputBindingDivisorDescriptionEXT {
 *         uint32_t  binding
 *         uint32_t  divisor
 *     }
 */
@JvmInline
value class VertexInputBindingDivisorDescription(override val address: Long) : Addressable {
	
	
	var binding: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var divisor: Int
		get()      = Unsafe.getInt(address + 4)
		set(value) = Unsafe.setInt(address + 4, value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 8
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = VertexInputBindingDivisorDescription(offset(index))
		
		operator fun set(index: Int, value: VertexInputBindingDivisorDescription) = Unsafe.copy(value.address, offset(index), 8)
		
		inline fun forEach(block: (VertexInputBindingDivisorDescription) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (VertexInputBindingDivisorDescription) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, VertexInputBindingDivisorDescription) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}