// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_VERSION_1_0

 *     struct VkOffset2D {
 *         int32_t  x
 *         int32_t  y
 *     }
 */
@JvmInline
value class Offset2D(override val address: Long) : Addressable {
	
	
	var x: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var y: Int
		get()      = Unsafe.getInt(address + 4)
		set(value) = Unsafe.setInt(address + 4, value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 8
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = Offset2D(offset(index))
		
		operator fun set(index: Int, value: Offset2D) = Unsafe.copy(value.address, offset(index), 8)
		
		inline fun forEach(block: (Offset2D) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (Offset2D) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, Offset2D) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}