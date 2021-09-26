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
 *     struct VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkBool32         perViewPositionAllComponents
 *     }
 */
@JvmInline
value class PhysicalDeviceMultiviewPerViewAttributesPropertiesNVX(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var perViewPositionAllComponents: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	
	
	class Persistent(
		val sType: StructureType,
		val perViewPositionAllComponents: Int,
	) {
		override fun toString() = "PhysicalDeviceMultiviewPerViewAttributesPropertiesNVX(" + 
			"sType=$sType, " +
			"perViewPositionAllComponents=$perViewPositionAllComponents)"
	}
	
	
	
	val asPersistent get() = Persistent(
		sType, 
		perViewPositionAllComponents, 
	)
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = PhysicalDeviceMultiviewPerViewAttributesPropertiesNVX(0)
		
		fun malloc(allocator: Allocator) = PhysicalDeviceMultiviewPerViewAttributesPropertiesNVX(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_MULTIVIEW_PER_VIEW_ATTRIBUTES_PROPERTIES
		}
		
		fun calloc(allocator: Allocator) = PhysicalDeviceMultiviewPerViewAttributesPropertiesNVX(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_MULTIVIEW_PER_VIEW_ATTRIBUTES_PROPERTIES
		}
	
	}


}