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
 *     struct VkGraphicsPipelineShaderGroupsCreateInfoNV {
 *         VkStructureType                      sType
 *         void*                                pNext (must be null)
 *         uint32_t                             groupCount
 *         VkGraphicsShaderGroupCreateInfoNV**  pGroups
 *         uint32_t                             pipelineCount
 *         VkPipeline**                         pPipelines
 *     }
 */
@JvmInline
value class GraphicsPipelineShaderGroupsCreateInfoNV(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var groupCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	var pGroups: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[3], value) }
	
	var pipelineCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value) }
	
	var pPipelines: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[5], value) }
	
	
	
	var groups: GraphicsShaderGroupCreateInfoNV.Buffer
		get()      = GraphicsShaderGroupCreateInfoNV.Buffer(Unsafe.getNativePointer(address + LAYOUT.offsets[3]), groupCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[3], value.address); groupCount = value.capacity }
	
	var pipelines: NativePointerBuffer
		get()      = NativePointerBuffer(Unsafe.getNativePointer(address + LAYOUT.offsets[5]), pipelineCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[5], value.address); pipelineCount = value.capacity }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(NativeSizes.POINTER)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = GraphicsPipelineShaderGroupsCreateInfoNV(0)
		
		fun malloc(allocator: Allocator) = GraphicsPipelineShaderGroupsCreateInfoNV(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.GRAPHICS_PIPELINE_SHADER_GROUPS_CREATE_INFO
		}
		
		fun calloc(allocator: Allocator) = GraphicsPipelineShaderGroupsCreateInfoNV(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.GRAPHICS_PIPELINE_SHADER_GROUPS_CREATE_INFO
		}
	
	}


}