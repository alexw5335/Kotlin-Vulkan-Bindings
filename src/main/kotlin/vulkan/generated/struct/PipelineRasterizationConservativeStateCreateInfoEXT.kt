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
 *     struct VkPipelineRasterizationConservativeStateCreateInfoEXT {
 *         VkStructureType                                         sType
 *         void*                                                   pNext (must be null)
 *         VkPipelineRasterizationConservativeStateCreateFlagsEXT  flags (reserved, must be zero)
 *         VkConservativeRasterizationModeEXT                      conservativeRasterizationMode
 *         float                                                   extraPrimitiveOverestimationSize
 *     }
 */
@JvmInline
value class PipelineRasterizationConservativeStateCreateInfoEXT(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var flags: PipelineRasterizationConservativeStateCreateFlags
		get()      = PipelineRasterizationConservativeStateCreateFlags(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.bitfield) }
	
	var conservativeRasterizationMode: ConservativeRasterizationMode
		get()      = ConservativeRasterizationMode(Unsafe.getInt(address + LAYOUT.offsets[3]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value.id) }
	
	var extraPrimitiveOverestimationSize: Float
		get()      = Unsafe.getFloat(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setFloat(address + LAYOUT.offsets[4], value) }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(4)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = PipelineRasterizationConservativeStateCreateInfoEXT(0)
		
		fun malloc(allocator: Allocator) = PipelineRasterizationConservativeStateCreateInfoEXT(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PIPELINE_RASTERIZATION_CONSERVATIVE_STATE_CREATE_INFO
		}
		
		fun calloc(allocator: Allocator) = PipelineRasterizationConservativeStateCreateInfoEXT(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PIPELINE_RASTERIZATION_CONSERVATIVE_STATE_CREATE_INFO
		}
	
	}


}