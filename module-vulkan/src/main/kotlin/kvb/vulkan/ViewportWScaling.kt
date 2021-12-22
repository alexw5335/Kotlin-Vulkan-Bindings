// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkViewportWScalingNV {
 *         float  xcoeff
 *         float  ycoeff
 *     }
 */
@JvmInline
value class ViewportWScaling(override val address: Long) : Addressable {
	
	
	var xcoeff: Float
		get()      = Unsafe.getFloat(address + 0)
		set(value) = Unsafe.setFloat(address + 0, value)
	
	var ycoeff: Float
		get()      = Unsafe.getFloat(address + 4)
		set(value) = Unsafe.setFloat(address + 4, value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 8
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = ViewportWScaling(offset(index))
		
		operator fun set(index: Int, value: ViewportWScaling) = Unsafe.copy(value.address, offset(index), 8)
		
		inline fun forEach(block: (ViewportWScaling) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (ViewportWScaling) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, ViewportWScaling) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}