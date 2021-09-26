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
 *     struct VkPipelineSampleLocationsStateCreateInfoEXT {
 *         VkStructureType           sType
 *         void*                     pNext (must be null)
 *         VkBool32                  sampleLocationsEnable
 *         VkSampleLocationsInfoEXT  sampleLocationsInfo
 *     }
 */
@JvmInline
value class PipelineSampleLocationsStateCreateInfoEXT(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var sampleLocationsEnable: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	var sampleLocationsInfo: SampleLocationsInfoEXT
		get()      = SampleLocationsInfoEXT(address + LAYOUT.offsets[3])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[3], value.structSize) }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(SampleLocationsInfoEXT.LAYOUT)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = PipelineSampleLocationsStateCreateInfoEXT(0)
		
		fun malloc(allocator: Allocator) = PipelineSampleLocationsStateCreateInfoEXT(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PIPELINE_SAMPLE_LOCATIONS_STATE_CREATE_INFO
		}
		
		fun calloc(allocator: Allocator) = PipelineSampleLocationsStateCreateInfoEXT(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PIPELINE_SAMPLE_LOCATIONS_STATE_CREATE_INFO
		}
	
	}


}