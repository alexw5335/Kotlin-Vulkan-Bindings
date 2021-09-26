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
 *     struct VkPresentInfoKHR {
 *         VkStructureType   sType
 *         void*             pNext
 *         uint32_t          waitSemaphoreCount
 *         VkSemaphore**     pWaitSemaphores
 *         uint32_t          swapchainCount
 *         VkSwapchainKHR**  pSwapchains
 *         uint32_t**        pImageIndices
 *         VkResult**        pResults
 *     }
 */
@JvmInline
value class PresentInfoKHR(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var waitSemaphoreCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	var pWaitSemaphores: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[3], value) }
	
	var swapchainCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value) }
	
	var pSwapchains: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[5], value) }
	
	var pImageIndices: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[6])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[6], value) }
	
	var pResults: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[7])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[7], value) }
	
	
	
	var waitSemaphores: NativePointerBuffer
		get()      = NativePointerBuffer(Unsafe.getNativePointer(address + LAYOUT.offsets[3]), waitSemaphoreCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[3], value.address); waitSemaphoreCount = value.capacity }
	
	var swapchains: NativePointerBuffer
		get()      = NativePointerBuffer(Unsafe.getNativePointer(address + LAYOUT.offsets[5]), swapchainCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[5], value.address); swapchainCount = value.capacity }
	
	var imageIndices: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getNativePointer(address + LAYOUT.offsets[6]), swapchainCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[6], value.address); swapchainCount = value.capacity }
	
	var results: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getNativePointer(address + LAYOUT.offsets[7]), swapchainCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[7], value.address); swapchainCount = value.capacity }
	
	
	
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
			member(NativeSizes.POINTER)
			member(NativeSizes.POINTER)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = PresentInfoKHR(0)
		
		fun malloc(allocator: Allocator) = PresentInfoKHR(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PRESENT_INFO
		}
		
		fun calloc(allocator: Allocator) = PresentInfoKHR(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PRESENT_INFO
		}
	
	}


}