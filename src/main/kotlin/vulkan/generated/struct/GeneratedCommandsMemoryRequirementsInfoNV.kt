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
 *     struct VkGeneratedCommandsMemoryRequirementsInfoNV {
 *         VkStructureType             sType
 *         void*                       pNext (must be null)
 *         VkPipelineBindPoint         pipelineBindPoint
 *         VkPipeline                  pipeline
 *         VkIndirectCommandsLayoutNV  indirectCommandsLayout
 *         uint32_t                    maxSequencesCount
 *     }
 */
@JvmInline
value class GeneratedCommandsMemoryRequirementsInfoNV(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var pipelineBindPoint: PipelineBindPoint
		get()      = PipelineBindPoint(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.id) }
	
	var pipeline: PipelineH
		get()      = PipelineH(Unsafe.getNativePointer(address + LAYOUT.offsets[3]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[3], value.address) }
	
	var indirectCommandsLayout: IndirectCommandsLayoutH
		get()      = IndirectCommandsLayoutH(Unsafe.getNativePointer(address + LAYOUT.offsets[4]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[4], value.address) }
	
	var maxSequencesCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[5], value) }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(NativeSizes.POINTER)
			member(NativeSizes.POINTER)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = GeneratedCommandsMemoryRequirementsInfoNV(0)
		
		fun malloc(allocator: Allocator) = GeneratedCommandsMemoryRequirementsInfoNV(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.GENERATED_COMMANDS_MEMORY_REQUIREMENTS_INFO
		}
		
		fun calloc(allocator: Allocator) = GeneratedCommandsMemoryRequirementsInfoNV(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.GENERATED_COMMANDS_MEMORY_REQUIREMENTS_INFO
		}
	
	}


}