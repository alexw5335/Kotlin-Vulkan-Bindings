// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkPipelineCreationFeedbackEXT {
 *         VkPipelineCreationFeedbackFlagsEXT  flags
 *         uint64_t                            duration
 *     }
 */
@JvmInline
value class PipelineCreationFeedback(override val address: Long) : Addressable {
	
	
	var flags: PipelineCreationFeedbackFlags
		get()      = PipelineCreationFeedbackFlags(Unsafe.getInt(address + 0))
		set(value) = Unsafe.setInt(address + 0, value.value)
	
	var duration: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 16
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = PipelineCreationFeedback(offset(index))
		
		operator fun set(index: Int, value: PipelineCreationFeedback) = Unsafe.copy(value.address, offset(index), 16)
		
		inline fun forEach(block: (PipelineCreationFeedback) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (PipelineCreationFeedback) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, PipelineCreationFeedback) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}