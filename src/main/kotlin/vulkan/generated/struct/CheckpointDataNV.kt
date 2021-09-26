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
 *     struct VkCheckpointDataNV {
 *         VkStructureType          sType
 *         void*                    pNext (must be null)
 *         VkPipelineStageFlagBits  stage
 *         void*                    pCheckpointMarker
 *     }
 */
@JvmInline
value class CheckpointDataNV(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var stage: PipelineStageFlags
		get()      = PipelineStageFlags(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.bitfield) }
	
	var pCheckpointMarker: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[3], value) }
	
	
	
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		val asPersistentList get() = List(capacity) { get(it).asPersistent }
		
		operator fun get(index: Int) = CheckpointDataNV(offset(index))
		
		operator fun set(index: Int, value: CheckpointDataNV) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (CheckpointDataNV) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (CheckpointDataNV) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "CheckpointDataNV[$capacity]"
	
	}
	
	
	
	class Persistent(
		val sType: StructureType,
		val stage: PipelineStageFlags,
	) {
		override fun toString() = "CheckpointDataNV(" + 
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
			member(4)
			member(NativeSizes.POINTER)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = CheckpointDataNV(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = CheckpointDataNV(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.CHECKPOINT_DATA
		}
		
		fun calloc(allocator: Allocator) = CheckpointDataNV(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.CHECKPOINT_DATA
		}
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.CHECKPOINT_DATA }
		}
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.CHECKPOINT_DATA }
		}
	
	}


}