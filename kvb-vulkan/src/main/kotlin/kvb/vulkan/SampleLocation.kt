// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe

/**
 *     struct VkSampleLocationEXT {
 *         float  x
 *         float  y
 *     }
 */
@JvmInline
value class SampleLocation(override val address: Long) : Addressable {
	
	
	var x: Float
		get()      = Unsafe.getFloat(address + 0)
		set(value) = Unsafe.setFloat(address + 0, value)
	
	var y: Float
		get()      = Unsafe.getFloat(address + 4)
		set(value) = Unsafe.setFloat(address + 4, value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 8
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = SampleLocation(offset(index))
		
		operator fun set(index: Int, value: SampleLocation) = Unsafe.copy(value.address, offset(index), 8)
		
		inline fun forEach(block: (SampleLocation) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (SampleLocation) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, SampleLocation) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}