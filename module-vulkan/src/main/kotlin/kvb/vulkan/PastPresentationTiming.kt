// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkPastPresentationTimingGOOGLE {
 *         uint32_t  presentID
 *         uint64_t  desiredPresentTime
 *         uint64_t  actualPresentTime
 *         uint64_t  earliestPresentTime
 *         uint64_t  presentMargin
 *     }
 */
@JvmInline
value class PastPresentationTiming(override val address: Long) : Addressable {
	
	
	var presentID: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var desiredPresentTime: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var actualPresentTime: Long
		get()      = Unsafe.getLong(address + 16)
		set(value) = Unsafe.setLong(address + 16, value)
	
	var earliestPresentTime: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var presentMargin: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 40
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = PastPresentationTiming(offset(index))
		
		operator fun set(index: Int, value: PastPresentationTiming) = Unsafe.copy(value.address, offset(index), 40)
		
		inline fun forEach(block: (PastPresentationTiming) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (PastPresentationTiming) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, PastPresentationTiming) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}