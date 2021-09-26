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
 *     struct VkPhysicalDeviceFragmentDensityMapPropertiesEXT {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkExtent2D       minFragmentDensityTexelSize
 *         VkExtent2D       maxFragmentDensityTexelSize
 *         VkBool32         fragmentDensityInvocations
 *     }
 */
@JvmInline
value class PhysicalDeviceFragmentDensityMapPropertiesEXT(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var minFragmentDensityTexelSize: Extent2D
		get()      = Extent2D(address + LAYOUT.offsets[2])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[2], value.structSize) }
	
	var maxFragmentDensityTexelSize: Extent2D
		get()      = Extent2D(address + LAYOUT.offsets[3])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[3], value.structSize) }
	
	var fragmentDensityInvocations: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value) }
	
	
	
	class Persistent(
		val sType: StructureType,
		val minFragmentDensityTexelSize: Extent2D.Persistent,
		val maxFragmentDensityTexelSize: Extent2D.Persistent,
		val fragmentDensityInvocations: Int,
	) {
		override fun toString() = "PhysicalDeviceFragmentDensityMapPropertiesEXT(" + 
			"sType=$sType, " +
			"minFragmentDensityTexelSize=$minFragmentDensityTexelSize, " +
			"maxFragmentDensityTexelSize=$maxFragmentDensityTexelSize, " +
			"fragmentDensityInvocations=$fragmentDensityInvocations)"
	}
	
	
	
	val asPersistent get() = Persistent(
		sType, 
		minFragmentDensityTexelSize.asPersistent, 
		maxFragmentDensityTexelSize.asPersistent, 
		fragmentDensityInvocations, 
	)
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(Extent2D.LAYOUT)
			member(Extent2D.LAYOUT)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = PhysicalDeviceFragmentDensityMapPropertiesEXT(0)
		
		fun malloc(allocator: Allocator) = PhysicalDeviceFragmentDensityMapPropertiesEXT(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_PROPERTIES
		}
		
		fun calloc(allocator: Allocator) = PhysicalDeviceFragmentDensityMapPropertiesEXT(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_PROPERTIES
		}
	
	}


}