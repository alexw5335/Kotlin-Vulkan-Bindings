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
 *     struct VkCopyMemoryToAccelerationStructureInfoKHR {
 *         VkStructureType                     sType
 *         void*                               pNext (must be null)
 *         VkDeviceOrHostAddressConstKHR       src
 *         VkAccelerationStructureKHR          dst
 *         VkCopyAccelerationStructureModeKHR  mode
 *     }
 */
@JvmInline
value class CopyMemoryToAccelerationStructureInfoKHR(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var src: DeviceOrHostAddressConstKHR
		get()      = DeviceOrHostAddressConstKHR(address + LAYOUT.offsets[2])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[2], value.structSize) }
	
	var dst: AccelerationStructureH
		get()      = AccelerationStructureH(Unsafe.getNativePointer(address + LAYOUT.offsets[3]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[3], value.address) }
	
	var mode: CopyAccelerationStructureMode
		get()      = CopyAccelerationStructureMode(Unsafe.getInt(address + LAYOUT.offsets[4]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value.id) }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(DeviceOrHostAddressConstKHR.LAYOUT)
			member(NativeSizes.POINTER)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = CopyMemoryToAccelerationStructureInfoKHR(0)
		
		fun malloc(allocator: Allocator) = CopyMemoryToAccelerationStructureInfoKHR(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.COPY_MEMORY_TO_ACCELERATION_STRUCTURE_INFO
		}
		
		fun calloc(allocator: Allocator) = CopyMemoryToAccelerationStructureInfoKHR(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.COPY_MEMORY_TO_ACCELERATION_STRUCTURE_INFO
		}
	
	}


}