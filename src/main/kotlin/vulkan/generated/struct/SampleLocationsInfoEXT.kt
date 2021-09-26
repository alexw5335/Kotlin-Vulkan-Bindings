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
 *     struct VkSampleLocationsInfoEXT {
 *         VkStructureType        sType
 *         void*                  pNext (must be null)
 *         VkSampleCountFlagBits  sampleLocationsPerPixel
 *         VkExtent2D             sampleLocationGridSize
 *         uint32_t               sampleLocationsCount
 *         VkSampleLocationEXT**  pSampleLocations
 *     }
 */
@JvmInline
value class SampleLocationsInfoEXT(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var sampleLocationsPerPixel: SampleCountFlags
		get()      = SampleCountFlags(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.bitfield) }
	
	var sampleLocationGridSize: Extent2D
		get()      = Extent2D(address + LAYOUT.offsets[3])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[3], value.structSize) }
	
	var sampleLocationsCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value) }
	
	var pSampleLocations: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[5], value) }
	
	
	
	var sampleLocations: SampleLocationEXT.Buffer
		get()      = SampleLocationEXT.Buffer(Unsafe.getNativePointer(address + LAYOUT.offsets[5]), sampleLocationsCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[5], value.address); sampleLocationsCount = value.capacity }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(Extent2D.LAYOUT)
			member(4)
			member(NativeSizes.POINTER)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = SampleLocationsInfoEXT(0)
		
		fun malloc(allocator: Allocator) = SampleLocationsInfoEXT(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.SAMPLE_LOCATIONS_INFO
		}
		
		fun calloc(allocator: Allocator) = SampleLocationsInfoEXT(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.SAMPLE_LOCATIONS_INFO
		}
	
	}


}