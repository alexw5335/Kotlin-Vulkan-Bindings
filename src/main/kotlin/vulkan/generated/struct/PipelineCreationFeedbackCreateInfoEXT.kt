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
 *     struct VkPipelineCreationFeedbackCreateInfoEXT {
 *         VkStructureType                  sType
 *         void*                            pNext (must be null)
 *         VkPipelineCreationFeedbackEXT*   pPipelineCreationFeedback
 *         uint32_t                         pipelineStageCreationFeedbackCount
 *         VkPipelineCreationFeedbackEXT**  pPipelineStageCreationFeedbacks
 *     }
 */
@JvmInline
value class PipelineCreationFeedbackCreateInfoEXT(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var pPipelineCreationFeedback: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[2], value) }
	
	var pipelineStageCreationFeedbackCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value) }
	
	var pPipelineStageCreationFeedbacks: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[4], value) }
	
	
	
	var pipelineCreationFeedback: PipelineCreationFeedbackEXT
		get()      = PipelineCreationFeedbackEXT(Unsafe.getNativePointer(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[2], value.address) }
	
	var pipelineStageCreationFeedbacks: PipelineCreationFeedbackEXT.Buffer
		get()      = PipelineCreationFeedbackEXT.Buffer(Unsafe.getNativePointer(address + LAYOUT.offsets[4]), pipelineStageCreationFeedbackCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[4], value.address); pipelineStageCreationFeedbackCount = value.capacity }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(NativeSizes.POINTER)
			member(4)
			member(NativeSizes.POINTER)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = PipelineCreationFeedbackCreateInfoEXT(0)
		
		fun malloc(allocator: Allocator) = PipelineCreationFeedbackCreateInfoEXT(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PIPELINE_CREATION_FEEDBACK_CREATE_INFO
		}
		
		fun calloc(allocator: Allocator) = PipelineCreationFeedbackCreateInfoEXT(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PIPELINE_CREATION_FEEDBACK_CREATE_INFO
		}
	
	}


}