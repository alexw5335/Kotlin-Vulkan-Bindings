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
 *     struct VkDeviceGroupSubmitInfo {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint32_t         waitSemaphoreCount
 *         uint32_t**       pWaitSemaphoreDeviceIndices
 *         uint32_t         commandBufferCount
 *         uint32_t**       pCommandBufferDeviceMasks
 *         uint32_t         signalSemaphoreCount
 *         uint32_t**       pSignalSemaphoreDeviceIndices
 *     }
 */
@JvmInline
value class DeviceGroupSubmitInfo(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var waitSemaphoreCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	var pWaitSemaphoreDeviceIndices: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[3], value) }
	
	var commandBufferCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value) }
	
	var pCommandBufferDeviceMasks: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[5], value) }
	
	var signalSemaphoreCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[6])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[6], value) }
	
	var pSignalSemaphoreDeviceIndices: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[7])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[7], value) }
	
	
	
	var waitSemaphoreDeviceIndices: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getNativePointer(address + LAYOUT.offsets[3]), waitSemaphoreCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[3], value.address); waitSemaphoreCount = value.capacity }
	
	var commandBufferDeviceMasks: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getNativePointer(address + LAYOUT.offsets[5]), commandBufferCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[5], value.address); commandBufferCount = value.capacity }
	
	var signalSemaphoreDeviceIndices: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getNativePointer(address + LAYOUT.offsets[7]), signalSemaphoreCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[7], value.address); signalSemaphoreCount = value.capacity }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(NativeSizes.POINTER)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = DeviceGroupSubmitInfo(0)
		
		fun malloc(allocator: Allocator) = DeviceGroupSubmitInfo(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.DEVICE_GROUP_SUBMIT_INFO
		}
		
		fun calloc(allocator: Allocator) = DeviceGroupSubmitInfo(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.DEVICE_GROUP_SUBMIT_INFO
		}
	
	}


}