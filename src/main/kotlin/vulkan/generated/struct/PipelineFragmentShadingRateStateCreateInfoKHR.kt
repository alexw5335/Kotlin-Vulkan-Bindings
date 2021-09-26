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
 *     struct VkPipelineFragmentShadingRateStateCreateInfoKHR {
 *         VkStructureType                     sType
 *         void*                               pNext (must be null)
 *         VkExtent2D                          fragmentSize
 *         VkFragmentShadingRateCombinerOpKHR  combinerOps[2]
 *     }
 */
@JvmInline
value class PipelineFragmentShadingRateStateCreateInfoKHR(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var fragmentSize: Extent2D
		get()      = Extent2D(address + LAYOUT.offsets[2])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[2], value.structSize) }
	
	var combinerOps: DirectIntBuffer
		get()      = DirectIntBuffer(address + LAYOUT.offsets[3], 2)
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[3], value.byteSize) }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(Extent2D.LAYOUT)
			array(4, 2)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = PipelineFragmentShadingRateStateCreateInfoKHR(0)
		
		fun malloc(allocator: Allocator) = PipelineFragmentShadingRateStateCreateInfoKHR(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PIPELINE_FRAGMENT_SHADING_RATE_STATE_CREATE_INFO
		}
		
		fun calloc(allocator: Allocator) = PipelineFragmentShadingRateStateCreateInfoKHR(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PIPELINE_FRAGMENT_SHADING_RATE_STATE_CREATE_INFO
		}
	
	}


}