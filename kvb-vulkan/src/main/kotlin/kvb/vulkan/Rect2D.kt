// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkRect2D {
 *         VkOffset2D  offset
 *         VkExtent2D  extent
 *     }
 */
@JvmInline
value class Rect2D(override val address: Long) : Addressable {
	
	
	var offset: Offset2D
		get()      = Offset2D(address + 0)
		set(value) = Unsafe.copy(value.address, address + 0, 8)
	
	var extent: Extent2D
		get()      = Extent2D(address + 8)
		set(value) = Unsafe.copy(value.address, address + 8, 8)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 16
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = Rect2D(offset(index))
		
		operator fun set(index: Int, value: Rect2D) = Unsafe.copy(value.address, offset(index), 16)
		
		inline fun forEach(block: (Rect2D) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (Rect2D) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, Rect2D) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}