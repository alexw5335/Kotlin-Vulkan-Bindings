// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkCoarseSampleLocationNV {
 *         uint32_t  pixelX
 *         uint32_t  pixelY
 *         uint32_t  sample
 *     }
 */
@JvmInline
value class CoarseSampleLocation(override val address: Long) : Addressable {
	
	
	var pixelX: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pixelY: Int
		get()      = Unsafe.getInt(address + 4)
		set(value) = Unsafe.setInt(address + 4, value)
	
	var sample: Int
		get()      = Unsafe.getInt(address + 8)
		set(value) = Unsafe.setInt(address + 8, value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 12
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = CoarseSampleLocation(offset(index))
		
		operator fun set(index: Int, value: CoarseSampleLocation) = Unsafe.copy(value.address, offset(index), 12)
		
		inline fun forEach(block: (CoarseSampleLocation) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (CoarseSampleLocation) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, CoarseSampleLocation) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}