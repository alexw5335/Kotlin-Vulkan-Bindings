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
 *     struct VkCheckpointData2NV {
 *         VkStructureType           sType
 *         void*                     pNext (must be null)
 *         VkPipelineStageFlags2KHR  stage
 *         void*                     pCheckpointMarker
 *     }
 */
@JvmInline
value class CheckpointData2NV(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var stage: PipelineStageFlags2
		get()      = PipelineStageFlags2(Unsafe.getLong(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[2], value.bitfield) }
	
	var pCheckpointMarker: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[3], value) }
	
	
	
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		val asPersistentList get() = List(capacity) { get(it).asPersistent }
		
		operator fun get(index: Int) = CheckpointData2NV(offset(index))
		
		operator fun set(index: Int, value: CheckpointData2NV) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (CheckpointData2NV) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (CheckpointData2NV) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "CheckpointData2NV[$capacity]"
	
	}
	
	
	
	class Persistent(
		val sType: StructureType,
		val stage: PipelineStageFlags2,
	) {
		override fun toString() = "CheckpointData2NV(" + 
			"sType=$sType, " +
			"stage=$stage)"
	}
	
	
	
	val asPersistent get() = Persistent(
		sType, 
		stage, 
	)
	
	
	
	val asBuffer get() = Buffer(address, 1)
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(8)
			member(NativeSizes.POINTER)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = CheckpointData2NV(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = CheckpointData2NV(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.CHECKPOINT_DATA_2
		}
		
		fun calloc(allocator: Allocator) = CheckpointData2NV(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.CHECKPOINT_DATA_2
		}
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.CHECKPOINT_DATA_2 }
		}
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.CHECKPOINT_DATA_2 }
		}
	
	}


}