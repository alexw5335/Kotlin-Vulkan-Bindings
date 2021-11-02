// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkPipelineExecutableStatisticKHR {
 *         VkStructureType                         sType
 *         void*                                   pNext (must be null)
 *         char                                    name[256]
 *         char                                    description[256]
 *         VkPipelineExecutableStatisticFormatKHR  format
 *         VkPipelineExecutableStatisticValueKHR   value
 *     }
 */
@JvmInline
value class PipelineExecutableStatistic(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var name: DirectByteBuffer
		get()      = DirectByteBuffer(address + 16, 256)
		set(value) = Unsafe.copy(value.address, address + 16, value.byteSize)
	
	var description: DirectByteBuffer
		get()      = DirectByteBuffer(address + 272, 256)
		set(value) = Unsafe.copy(value.address, address + 272, value.byteSize)
	
	var format: PipelineExecutableStatisticFormat
		get()      = PipelineExecutableStatisticFormat.values().first { it.value == Unsafe.getInt(address + 528) }
		set(value) = Unsafe.setInt(address + 528, value.value)
	
	var value: PipelineExecutableStatisticValue
		get()      = PipelineExecutableStatisticValue(address + 536)
		set(value) = Unsafe.copy(value.address, address + 536, 8)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 544
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = PipelineExecutableStatistic(offset(index))
		
		operator fun set(index: Int, value: PipelineExecutableStatistic) = Unsafe.copy(value.address, offset(index), 544)
		
		inline fun forEach(block: (PipelineExecutableStatistic) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (PipelineExecutableStatistic) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, PipelineExecutableStatistic) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}