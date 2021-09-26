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
 *     struct VkPipelineVertexInputStateCreateInfo {
 *         VkStructureType                        sType
 *         void*                                  pNext
 *         VkPipelineVertexInputStateCreateFlags  flags (reserved, must be zero)
 *         uint32_t                               vertexBindingDescriptionCount
 *         VkVertexInputBindingDescription**      pVertexBindingDescriptions
 *         uint32_t                               vertexAttributeDescriptionCount
 *         VkVertexInputAttributeDescription**    pVertexAttributeDescriptions
 *     }
 */
@JvmInline
value class PipelineVertexInputStateCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var flags: PipelineVertexInputStateCreateFlags
		get()      = PipelineVertexInputStateCreateFlags(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.bitfield) }
	
	var vertexBindingDescriptionCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value) }
	
	var pVertexBindingDescriptions: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[4], value) }
	
	var vertexAttributeDescriptionCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[5], value) }
	
	var pVertexAttributeDescriptions: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[6])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[6], value) }
	
	
	
	var vertexBindingDescriptions: VertexInputBindingDescription.Buffer
		get()      = VertexInputBindingDescription.Buffer(Unsafe.getNativePointer(address + LAYOUT.offsets[4]), vertexBindingDescriptionCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[4], value.address); vertexBindingDescriptionCount = value.capacity }
	
	var vertexAttributeDescriptions: VertexInputAttributeDescription.Buffer
		get()      = VertexInputAttributeDescription.Buffer(Unsafe.getNativePointer(address + LAYOUT.offsets[6]), vertexAttributeDescriptionCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[6], value.address); vertexAttributeDescriptionCount = value.capacity }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(NativeSizes.POINTER)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = PipelineVertexInputStateCreateInfo(0)
		
		fun malloc(allocator: Allocator) = PipelineVertexInputStateCreateInfo(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PIPELINE_VERTEX_INPUT_STATE_CREATE_INFO
		}
		
		fun calloc(allocator: Allocator) = PipelineVertexInputStateCreateInfo(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PIPELINE_VERTEX_INPUT_STATE_CREATE_INFO
		}
	
	}


}