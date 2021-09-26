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
 *     struct VkPhysicalDeviceShadingRateImagePropertiesNV {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkExtent2D       shadingRateTexelSize
 *         uint32_t         shadingRatePaletteSize
 *         uint32_t         shadingRateMaxCoarseSamples
 *     }
 */
@JvmInline
value class PhysicalDeviceShadingRateImagePropertiesNV(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var shadingRateTexelSize: Extent2D
		get()      = Extent2D(address + LAYOUT.offsets[2])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[2], value.structSize) }
	
	var shadingRatePaletteSize: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value) }
	
	var shadingRateMaxCoarseSamples: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value) }
	
	
	
	class Persistent(
		val sType: StructureType,
		val shadingRateTexelSize: Extent2D.Persistent,
		val shadingRatePaletteSize: Int,
		val shadingRateMaxCoarseSamples: Int,
	) {
		override fun toString() = "PhysicalDeviceShadingRateImagePropertiesNV(" + 
			"sType=$sType, " +
			"shadingRateTexelSize=$shadingRateTexelSize, " +
			"shadingRatePaletteSize=$shadingRatePaletteSize, " +
			"shadingRateMaxCoarseSamples=$shadingRateMaxCoarseSamples)"
	}
	
	
	
	val asPersistent get() = Persistent(
		sType, 
		shadingRateTexelSize.asPersistent, 
		shadingRatePaletteSize, 
		shadingRateMaxCoarseSamples, 
	)
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(Extent2D.LAYOUT)
			member(4)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = PhysicalDeviceShadingRateImagePropertiesNV(0)
		
		fun malloc(allocator: Allocator) = PhysicalDeviceShadingRateImagePropertiesNV(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_SHADING_RATE_IMAGE_PROPERTIES
		}
		
		fun calloc(allocator: Allocator) = PhysicalDeviceShadingRateImagePropertiesNV(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_SHADING_RATE_IMAGE_PROPERTIES
		}
	
	}


}