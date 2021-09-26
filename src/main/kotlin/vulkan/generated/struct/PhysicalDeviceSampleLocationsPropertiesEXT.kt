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
 *     struct VkPhysicalDeviceSampleLocationsPropertiesEXT {
 *         VkStructureType     sType
 *         void*               pNext (must be null)
 *         VkSampleCountFlags  sampleLocationSampleCounts
 *         VkExtent2D          maxSampleLocationGridSize
 *         float               sampleLocationCoordinateRange[2]
 *         uint32_t            sampleLocationSubPixelBits
 *         VkBool32            variableSampleLocations
 *     }
 */
@JvmInline
value class PhysicalDeviceSampleLocationsPropertiesEXT(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var sampleLocationSampleCounts: SampleCountFlags
		get()      = SampleCountFlags(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.bitfield) }
	
	var maxSampleLocationGridSize: Extent2D
		get()      = Extent2D(address + LAYOUT.offsets[3])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[3], value.structSize) }
	
	var sampleLocationCoordinateRange: DirectFloatBuffer
		get()      = DirectFloatBuffer(address + LAYOUT.offsets[4], 2)
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[4], value.byteSize) }
	
	var sampleLocationSubPixelBits: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[5], value) }
	
	var variableSampleLocations: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[6])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[6], value) }
	
	
	
	class Persistent(
		val sType: StructureType,
		val sampleLocationSampleCounts: SampleCountFlags,
		val maxSampleLocationGridSize: Extent2D.Persistent,
		val sampleLocationCoordinateRange: FloatArray,
		val sampleLocationSubPixelBits: Int,
		val variableSampleLocations: Int,
	) {
		override fun toString() = "PhysicalDeviceSampleLocationsPropertiesEXT(" + 
			"sType=$sType, " +
			"sampleLocationSampleCounts=$sampleLocationSampleCounts, " +
			"maxSampleLocationGridSize=$maxSampleLocationGridSize, " +
			"sampleLocationCoordinateRange=$sampleLocationCoordinateRange, " +
			"sampleLocationSubPixelBits=$sampleLocationSubPixelBits, " +
			"variableSampleLocations=$variableSampleLocations)"
	}
	
	
	
	val asPersistent get() = Persistent(
		sType, 
		sampleLocationSampleCounts, 
		maxSampleLocationGridSize.asPersistent, 
		sampleLocationCoordinateRange.asArray, 
		sampleLocationSubPixelBits, 
		variableSampleLocations, 
	)
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(Extent2D.LAYOUT)
			array(4, 2)
			member(4)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = PhysicalDeviceSampleLocationsPropertiesEXT(0)
		
		fun malloc(allocator: Allocator) = PhysicalDeviceSampleLocationsPropertiesEXT(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_SAMPLE_LOCATIONS_PROPERTIES
		}
		
		fun calloc(allocator: Allocator) = PhysicalDeviceSampleLocationsPropertiesEXT(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_SAMPLE_LOCATIONS_PROPERTIES
		}
	
	}


}