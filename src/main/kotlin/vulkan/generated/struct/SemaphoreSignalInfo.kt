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
 *     struct VkSemaphoreSignalInfo {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkSemaphore      semaphore
 *         uint64_t         value
 *     }
 */
@JvmInline
value class SemaphoreSignalInfo(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var semaphore: SemaphoreH
		get()      = SemaphoreH(Unsafe.getNativePointer(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[2], value.address) }
	
	var value: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[3], value) }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(NativeSizes.POINTER)
			member(8)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = SemaphoreSignalInfo(0)
		
		fun malloc(allocator: Allocator) = SemaphoreSignalInfo(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.SEMAPHORE_SIGNAL_INFO
		}
		
		fun calloc(allocator: Allocator) = SemaphoreSignalInfo(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.SEMAPHORE_SIGNAL_INFO
		}
	
	}


}