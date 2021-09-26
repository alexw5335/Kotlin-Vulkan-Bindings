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
 *     struct VkCopyAccelerationStructureToMemoryInfoKHR {
 *         VkStructureType                     sType
 *         void*                               pNext (must be null)
 *         VkAccelerationStructureKHR          src
 *         VkDeviceOrHostAddressKHR            dst
 *         VkCopyAccelerationStructureModeKHR  mode
 *     }
 */
@JvmInline
value class CopyAccelerationStructureToMemoryInfoKHR(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var src: AccelerationStructureH
		get()      = AccelerationStructureH(Unsafe.getNativePointer(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[2], value.address) }
	
	var dst: DeviceOrHostAddressKHR
		get()      = DeviceOrHostAddressKHR(address + LAYOUT.offsets[3])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[3], value.structSize) }
	
	var mode: CopyAccelerationStructureMode
		get()      = CopyAccelerationStructureMode(Unsafe.getInt(address + LAYOUT.offsets[4]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value.id) }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(NativeSizes.POINTER)
			member(DeviceOrHostAddressKHR.LAYOUT)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = CopyAccelerationStructureToMemoryInfoKHR(0)
		
		fun malloc(allocator: Allocator) = CopyAccelerationStructureToMemoryInfoKHR(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.COPY_ACCELERATION_STRUCTURE_TO_MEMORY_INFO
		}
		
		fun calloc(allocator: Allocator) = CopyAccelerationStructureToMemoryInfoKHR(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.COPY_ACCELERATION_STRUCTURE_TO_MEMORY_INFO
		}
	
	}


}