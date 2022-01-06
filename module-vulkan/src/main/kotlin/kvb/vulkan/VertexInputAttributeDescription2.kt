// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_EXT_vertex_input_dynamic_state

 *     struct VkVertexInputAttributeDescription2EXT {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint32_t         location
 *         uint32_t         binding
 *         VkFormat         format
 *         uint32_t         offset
 *     }
 */
@JvmInline
value class VertexInputAttributeDescription2(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var location: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var binding: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var format: Format
		get()      = Format(Unsafe.getInt(address + 24))
		set(value) = Unsafe.setInt(address + 24, value.value)
	
	var offset: Int
		get()      = Unsafe.getInt(address + 28)
		set(value) = Unsafe.setInt(address + 28, value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 32
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = VertexInputAttributeDescription2(offset(index))
		
		operator fun set(index: Int, value: VertexInputAttributeDescription2) = Unsafe.copy(value.address, offset(index), 32)
		
		inline fun forEach(block: (VertexInputAttributeDescription2) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (VertexInputAttributeDescription2) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, VertexInputAttributeDescription2) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}