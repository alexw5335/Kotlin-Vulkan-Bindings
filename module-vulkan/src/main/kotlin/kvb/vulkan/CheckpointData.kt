// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkCheckpointDataNV {
 *         VkStructureType          sType
 *         void*                    pNext (must be null)
 *         VkPipelineStageFlagBits  stage
 *         void*                    pCheckpointMarker
 *     }
 */
@JvmInline
value class CheckpointData(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var stage: PipelineStageFlags
		get()      = PipelineStageFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var pCheckpointMarker: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 32
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = CheckpointData(offset(index))
		
		operator fun set(index: Int, value: CheckpointData) = Unsafe.copy(value.address, offset(index), 32)
		
		inline fun forEach(block: (CheckpointData) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (CheckpointData) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, CheckpointData) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}