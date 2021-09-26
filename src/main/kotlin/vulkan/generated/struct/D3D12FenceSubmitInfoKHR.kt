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
 *     struct VkD3D12FenceSubmitInfoKHR {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint32_t         waitSemaphoreValuesCount
 *         uint64_t**       pWaitSemaphoreValues
 *         uint32_t         signalSemaphoreValuesCount
 *         uint64_t**       pSignalSemaphoreValues
 *     }
 */
@JvmInline
value class D3D12FenceSubmitInfoKHR(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var waitSemaphoreValuesCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	var pWaitSemaphoreValues: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[3], value) }
	
	var signalSemaphoreValuesCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value) }
	
	var pSignalSemaphoreValues: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[5], value) }
	
	
	
	var waitSemaphoreValues: DirectLongBuffer
		get()      = DirectLongBuffer(Unsafe.getNativePointer(address + LAYOUT.offsets[3]), waitSemaphoreValuesCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[3], value.address); waitSemaphoreValuesCount = value.capacity }
	
	var signalSemaphoreValues: DirectLongBuffer
		get()      = DirectLongBuffer(Unsafe.getNativePointer(address + LAYOUT.offsets[5]), signalSemaphoreValuesCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[5], value.address); signalSemaphoreValuesCount = value.capacity }
	
	
	
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
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = D3D12FenceSubmitInfoKHR(0)
		
		fun malloc(allocator: Allocator) = D3D12FenceSubmitInfoKHR(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.D3D12_FENCE_SUBMIT_INFO
		}
		
		fun calloc(allocator: Allocator) = D3D12FenceSubmitInfoKHR(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.D3D12_FENCE_SUBMIT_INFO
		}
	
	}


}