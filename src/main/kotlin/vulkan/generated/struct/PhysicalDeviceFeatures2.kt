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
 *     struct VkPhysicalDeviceFeatures2 {
 *         VkStructureType           sType
 *         void*                     pNext
 *         VkPhysicalDeviceFeatures  features
 *     }
 */
@JvmInline
value class PhysicalDeviceFeatures2(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var features: PhysicalDeviceFeatures
		get()      = PhysicalDeviceFeatures(address + LAYOUT.offsets[2])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[2], value.structSize) }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(PhysicalDeviceFeatures.LAYOUT)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = PhysicalDeviceFeatures2(0)
		
		fun malloc(allocator: Allocator) = PhysicalDeviceFeatures2(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_FEATURES_2
		}
		
		fun calloc(allocator: Allocator) = PhysicalDeviceFeatures2(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_FEATURES_2
		}
	
	}


}