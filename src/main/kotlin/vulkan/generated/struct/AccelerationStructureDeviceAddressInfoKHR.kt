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
 *     struct VkAccelerationStructureDeviceAddressInfoKHR {
 *         VkStructureType             sType
 *         void*                       pNext (must be null)
 *         VkAccelerationStructureKHR  accelerationStructure
 *     }
 */
@JvmInline
value class AccelerationStructureDeviceAddressInfoKHR(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var accelerationStructure: AccelerationStructureH
		get()      = AccelerationStructureH(Unsafe.getNativePointer(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[2], value.address) }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(NativeSizes.POINTER)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = AccelerationStructureDeviceAddressInfoKHR(0)
		
		fun malloc(allocator: Allocator) = AccelerationStructureDeviceAddressInfoKHR(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.ACCELERATION_STRUCTURE_DEVICE_ADDRESS_INFO
		}
		
		fun calloc(allocator: Allocator) = AccelerationStructureDeviceAddressInfoKHR(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.ACCELERATION_STRUCTURE_DEVICE_ADDRESS_INFO
		}
	
	}


}