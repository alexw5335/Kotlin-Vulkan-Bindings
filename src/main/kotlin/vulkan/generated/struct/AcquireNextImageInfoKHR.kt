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
 *     struct VkAcquireNextImageInfoKHR {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkSwapchainKHR   swapchain
 *         uint64_t         timeout
 *         VkSemaphore      semaphore
 *         VkFence          fence
 *         uint32_t         deviceMask
 *     }
 */
@JvmInline
value class AcquireNextImageInfoKHR(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var swapchain: SwapchainH
		get()      = SwapchainH(Unsafe.getNativePointer(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[2], value.address) }
	
	var timeout: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[3], value) }
	
	var semaphore: SemaphoreH
		get()      = SemaphoreH(Unsafe.getNativePointer(address + LAYOUT.offsets[4]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[4], value.address) }
	
	var fence: FenceH
		get()      = FenceH(Unsafe.getNativePointer(address + LAYOUT.offsets[5]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[5], value.address) }
	
	var deviceMask: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[6])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[6], value) }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(NativeSizes.POINTER)
			member(8)
			member(NativeSizes.POINTER)
			member(NativeSizes.POINTER)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = AcquireNextImageInfoKHR(0)
		
		fun malloc(allocator: Allocator) = AcquireNextImageInfoKHR(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.ACQUIRE_NEXT_IMAGE_INFO
		}
		
		fun calloc(allocator: Allocator) = AcquireNextImageInfoKHR(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.ACQUIRE_NEXT_IMAGE_INFO
		}
	
	}


}