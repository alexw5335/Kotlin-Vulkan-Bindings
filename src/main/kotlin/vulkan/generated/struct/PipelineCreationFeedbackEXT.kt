// This file has been automatically generated.

package vulkan.generated.struct

import memory.NativeSizes
import memory.type.DirectBuffer
import memory.struct.LayoutBuilder
import memory.allocation.Allocator
import memory.Unsafe
import memory.type.Addressable

import vulkan.generated.enumeration.*
import memory.primitive.*
import vulkan.generated.handle.*

/**
 *     struct VkPipelineCreationFeedbackEXT {
 *         VkPipelineCreationFeedbackFlagsEXT  flags
 *         uint64_t                            duration
 *     }
 */
@JvmInline
value class PipelineCreationFeedbackEXT(override val address: Long) : Addressable {
	
	
	var flags: PipelineCreationFeedbackFlags
		get()      = PipelineCreationFeedbackFlags(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.bitfield) }
	
	var duration: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[1], value) }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		val asPersistentList get() = List(capacity) { get(it).asPersistent }
		
		operator fun get(index: Int) = PipelineCreationFeedbackEXT(offset(index))
		
		operator fun set(index: Int, value: PipelineCreationFeedbackEXT) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (PipelineCreationFeedbackEXT) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (PipelineCreationFeedbackEXT) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "PipelineCreationFeedbackEXT[$capacity]"
	
	}
	
	
	
	class Persistent(
		val flags: PipelineCreationFeedbackFlags,
		val duration: Long,
	) {
		override fun toString() = "PipelineCreationFeedbackEXT(" + 
			"flags=$flags, " +
			"duration=$duration)"
	}
	
	
	
	val asPersistent get() = Persistent(
		flags, 
		duration, 
	)
	
	
	
	val asBuffer get() = Buffer(address, 1)
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(8)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = PipelineCreationFeedbackEXT(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = PipelineCreationFeedbackEXT(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = PipelineCreationFeedbackEXT(allocator.calloc(SIZE, ALIGNMENT))
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity)
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity)
	
	}


}