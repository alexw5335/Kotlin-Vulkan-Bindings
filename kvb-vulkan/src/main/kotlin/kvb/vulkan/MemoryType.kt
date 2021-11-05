// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe

/**
 *     struct VkMemoryType {
 *         VkMemoryPropertyFlags  propertyFlags
 *         uint32_t               heapIndex
 *     }
 */
@JvmInline
value class MemoryType(override val address: Long) : Addressable {
	
	
	var propertyFlags: MemoryPropertyFlags
		get()      = MemoryPropertyFlags(Unsafe.getInt(address + 0))
		set(value) = Unsafe.setInt(address + 0, value.value)
	
	var heapIndex: Int
		get()      = Unsafe.getInt(address + 4)
		set(value) = Unsafe.setInt(address + 4, value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 8
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = MemoryType(offset(index))
		
		operator fun set(index: Int, value: MemoryType) = Unsafe.copy(value.address, offset(index), 8)
		
		inline fun forEach(block: (MemoryType) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (MemoryType) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, MemoryType) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}