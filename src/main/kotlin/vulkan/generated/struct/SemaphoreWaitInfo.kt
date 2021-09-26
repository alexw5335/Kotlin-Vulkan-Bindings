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
 *     struct VkSemaphoreWaitInfo {
 *         VkStructureType       sType
 *         void*                 pNext (must be null)
 *         VkSemaphoreWaitFlags  flags
 *         uint32_t              semaphoreCount
 *         VkSemaphore**         pSemaphores
 *         uint64_t**            pValues
 *     }
 */
@JvmInline
value class SemaphoreWaitInfo(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var flags: SemaphoreWaitFlags
		get()      = SemaphoreWaitFlags(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.bitfield) }
	
	var semaphoreCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value) }
	
	var pSemaphores: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[4], value) }
	
	var pValues: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[5], value) }
	
	
	
	var semaphores: NativePointerBuffer
		get()      = NativePointerBuffer(Unsafe.getNativePointer(address + LAYOUT.offsets[4]), semaphoreCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[4], value.address); semaphoreCount = value.capacity }
	
	var values: DirectLongBuffer
		get()      = DirectLongBuffer(Unsafe.getNativePointer(address + LAYOUT.offsets[5]), semaphoreCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[5], value.address); semaphoreCount = value.capacity }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(4)
			member(NativeSizes.POINTER)
			member(NativeSizes.POINTER)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = SemaphoreWaitInfo(0)
		
		fun malloc(allocator: Allocator) = SemaphoreWaitInfo(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.SEMAPHORE_WAIT_INFO
		}
		
		fun calloc(allocator: Allocator) = SemaphoreWaitInfo(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.SEMAPHORE_WAIT_INFO
		}
	
	}


}