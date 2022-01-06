// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_KHR_performance_query

 *     struct VkPerformanceCounterDescriptionKHR {
 *         VkStructureType                          sType
 *         void*                                    pNext (must be null)
 *         VkPerformanceCounterDescriptionFlagsKHR  flags
 *         char                                     name[256]
 *         char                                     category[256]
 *         char                                     description[256]
 *     }
 */
@JvmInline
value class PerformanceCounterDescription(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: PerformanceCounterDescriptionFlags
		get()      = PerformanceCounterDescriptionFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var name: DirectByteBuffer
		get()      = DirectByteBuffer(address + 20, 256)
		set(value) = Unsafe.copy(value.address, address + 20, value.byteSize)
	
	var category: DirectByteBuffer
		get()      = DirectByteBuffer(address + 276, 256)
		set(value) = Unsafe.copy(value.address, address + 276, value.byteSize)
	
	var description: DirectByteBuffer
		get()      = DirectByteBuffer(address + 532, 256)
		set(value) = Unsafe.copy(value.address, address + 532, value.byteSize)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 792
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = PerformanceCounterDescription(offset(index))
		
		operator fun set(index: Int, value: PerformanceCounterDescription) = Unsafe.copy(value.address, offset(index), 792)
		
		inline fun forEach(block: (PerformanceCounterDescription) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (PerformanceCounterDescription) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, PerformanceCounterDescription) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}