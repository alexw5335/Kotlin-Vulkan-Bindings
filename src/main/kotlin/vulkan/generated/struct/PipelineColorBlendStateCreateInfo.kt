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
 *     struct VkPipelineColorBlendStateCreateInfo {
 *         VkStructureType                        sType
 *         void*                                  pNext
 *         VkPipelineColorBlendStateCreateFlags   flags (reserved, must be zero)
 *         VkBool32                               logicOpEnable
 *         VkLogicOp                              logicOp
 *         uint32_t                               attachmentCount
 *         VkPipelineColorBlendAttachmentState**  pAttachments
 *         float                                  blendConstants[4]
 *     }
 */
@JvmInline
value class PipelineColorBlendStateCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var flags: PipelineColorBlendStateCreateFlags
		get()      = PipelineColorBlendStateCreateFlags(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.bitfield) }
	
	var logicOpEnable: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value) }
	
	var logicOp: LogicOp
		get()      = LogicOp(Unsafe.getInt(address + LAYOUT.offsets[4]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value.id) }
	
	var attachmentCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[5], value) }
	
	var pAttachments: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[6])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[6], value) }
	
	var blendConstants: DirectFloatBuffer
		get()      = DirectFloatBuffer(address + LAYOUT.offsets[7], 4)
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[7], value.byteSize) }
	
	
	
	var attachments: PipelineColorBlendAttachmentState.Buffer
		get()      = PipelineColorBlendAttachmentState.Buffer(Unsafe.getNativePointer(address + LAYOUT.offsets[6]), attachmentCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[6], value.address); attachmentCount = value.capacity }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(4)
			member(4)
			member(4)
			member(NativeSizes.POINTER)
			array(4, 4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = PipelineColorBlendStateCreateInfo(0)
		
		fun malloc(allocator: Allocator) = PipelineColorBlendStateCreateInfo(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PIPELINE_COLOR_BLEND_STATE_CREATE_INFO
		}
		
		fun calloc(allocator: Allocator) = PipelineColorBlendStateCreateInfo(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PIPELINE_COLOR_BLEND_STATE_CREATE_INFO
		}
	
	}


}