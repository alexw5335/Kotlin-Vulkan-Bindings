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
 *     struct VkQueueFamilyCheckpointProperties2NV {
 *         VkStructureType           sType
 *         void*                     pNext (must be null)
 *         VkPipelineStageFlags2KHR  checkpointExecutionStageMask
 *     }
 */
@JvmInline
value class QueueFamilyCheckpointProperties2NV(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var checkpointExecutionStageMask: PipelineStageFlags2
		get()      = PipelineStageFlags2(Unsafe.getLong(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[2], value.bitfield) }
	
	
	
	class Persistent(
		val sType: StructureType,
		val checkpointExecutionStageMask: PipelineStageFlags2,
	) {
		override fun toString() = "QueueFamilyCheckpointProperties2NV(" + 
			"sType=$sType, " +
			"checkpointExecutionStageMask=$checkpointExecutionStageMask)"
	}
	
	
	
	val asPersistent get() = Persistent(
		sType, 
		checkpointExecutionStageMask, 
	)
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(8)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = QueueFamilyCheckpointProperties2NV(0)
		
		fun malloc(allocator: Allocator) = QueueFamilyCheckpointProperties2NV(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.QUEUE_FAMILY_CHECKPOINT_PROPERTIES_2
		}
		
		fun calloc(allocator: Allocator) = QueueFamilyCheckpointProperties2NV(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.QUEUE_FAMILY_CHECKPOINT_PROPERTIES_2
		}
	
	}


}