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
 *     struct VkPipelineVertexInputDivisorStateCreateInfoEXT {
 *         VkStructureType                              sType
 *         void*                                        pNext (must be null)
 *         uint32_t                                     vertexBindingDivisorCount
 *         VkVertexInputBindingDivisorDescriptionEXT**  pVertexBindingDivisors
 *     }
 */
@JvmInline
value class PipelineVertexInputDivisorStateCreateInfoEXT(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var vertexBindingDivisorCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	var pVertexBindingDivisors: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[3], value) }
	
	
	
	var vertexBindingDivisors: VertexInputBindingDivisorDescriptionEXT.Buffer
		get()      = VertexInputBindingDivisorDescriptionEXT.Buffer(Unsafe.getNativePointer(address + LAYOUT.offsets[3]), vertexBindingDivisorCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[3], value.address); vertexBindingDivisorCount = value.capacity }
	
	
	
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
		
		val NULL = PipelineVertexInputDivisorStateCreateInfoEXT(0)
		
		fun malloc(allocator: Allocator) = PipelineVertexInputDivisorStateCreateInfoEXT(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO
		}
		
		fun calloc(allocator: Allocator) = PipelineVertexInputDivisorStateCreateInfoEXT(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO
		}
	
	}


}