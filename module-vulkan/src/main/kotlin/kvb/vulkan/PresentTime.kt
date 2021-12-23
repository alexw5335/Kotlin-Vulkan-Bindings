// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkPresentTimeGOOGLE {
 *         uint32_t  presentID
 *         uint64_t  desiredPresentTime
 *     }
 */
@JvmInline
value class PresentTime(override val address: Long) : Addressable {
	
	
	var presentID: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var desiredPresentTime: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 16
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = PresentTime(offset(index))
		
		operator fun set(index: Int, value: PresentTime) = Unsafe.copy(value.address, offset(index), 16)
		
		inline fun forEach(block: (PresentTime) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (PresentTime) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, PresentTime) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}