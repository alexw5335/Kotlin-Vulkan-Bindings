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
 *     struct VkPipelineFragmentShadingRateEnumStateCreateInfoNV {
 *         VkStructureType                     sType
 *         void*                               pNext (must be null)
 *         VkFragmentShadingRateTypeNV         shadingRateType
 *         VkFragmentShadingRateNV             shadingRate
 *         VkFragmentShadingRateCombinerOpKHR  combinerOps[2]
 *     }
 */
@JvmInline
value class PipelineFragmentShadingRateEnumStateCreateInfoNV(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var shadingRateType: FragmentShadingRateType
		get()      = FragmentShadingRateType(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.id) }
	
	var shadingRate: FragmentShadingRate
		get()      = FragmentShadingRate(Unsafe.getInt(address + LAYOUT.offsets[3]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value.id) }
	
	var combinerOps: DirectIntBuffer
		get()      = DirectIntBuffer(address + LAYOUT.offsets[4], 2)
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[4], value.byteSize) }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(4)
			array(4, 2)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = PipelineFragmentShadingRateEnumStateCreateInfoNV(0)
		
		fun malloc(allocator: Allocator) = PipelineFragmentShadingRateEnumStateCreateInfoNV(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PIPELINE_FRAGMENT_SHADING_RATE_ENUM_STATE_CREATE_INFO
		}
		
		fun calloc(allocator: Allocator) = PipelineFragmentShadingRateEnumStateCreateInfoNV(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PIPELINE_FRAGMENT_SHADING_RATE_ENUM_STATE_CREATE_INFO
		}
	
	}


}