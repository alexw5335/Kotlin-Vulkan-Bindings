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
 *     struct VkAllocationCallbacks {
 *         void*                                 pUserData
 *         PFN_vkAllocationFunction              pfnAllocation
 *         PFN_vkReallocationFunction            pfnReallocation
 *         PFN_vkFreeFunction                    pfnFree
 *         PFN_vkInternalAllocationNotification  pfnInternalAllocation
 *         PFN_vkInternalFreeNotification        pfnInternalFree
 *     }
 */
@JvmInline
value class AllocationCallbacks(override val address: Long) : Addressable {
	
	
	var pUserData: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[0])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[0], value) }
	
	var pfnAllocation: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var pfnReallocation: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[2], value) }
	
	var pfnFree: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[3], value) }
	
	var pfnInternalAllocation: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[4], value) }
	
	var pfnInternalFree: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[5], value) }
	
	
	
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(NativeSizes.POINTER)
			member(NativeSizes.POINTER)
			member(NativeSizes.POINTER)
			member(NativeSizes.POINTER)
			member(NativeSizes.POINTER)
			member(NativeSizes.POINTER)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = AllocationCallbacks(0)
		
		fun malloc(allocator: Allocator) = AllocationCallbacks(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = AllocationCallbacks(allocator.calloc(SIZE, ALIGNMENT))
	
	}


}