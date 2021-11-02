// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkVertexInputBindingDescription {
 *         uint32_t           binding
 *         uint32_t           stride
 *         VkVertexInputRate  inputRate
 *     }
 */
@JvmInline
value class VertexInputBindingDescription(override val address: Long) : Addressable {
	
	
	var binding: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var stride: Int
		get()      = Unsafe.getInt(address + 4)
		set(value) = Unsafe.setInt(address + 4, value)
	
	var inputRate: VertexInputRate
		get()      = VertexInputRate.values().first { it.value == Unsafe.getInt(address + 8) }
		set(value) = Unsafe.setInt(address + 8, value.value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 12
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = VertexInputBindingDescription(offset(index))
		
		operator fun set(index: Int, value: VertexInputBindingDescription) = Unsafe.copy(value.address, offset(index), 12)
		
		inline fun forEach(block: (VertexInputBindingDescription) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (VertexInputBindingDescription) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, VertexInputBindingDescription) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}