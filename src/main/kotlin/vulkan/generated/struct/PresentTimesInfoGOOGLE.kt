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
 *     struct VkPresentTimesInfoGOOGLE {
 *         VkStructureType        sType
 *         void*                  pNext (must be null)
 *         uint32_t               swapchainCount
 *         VkPresentTimeGOOGLE**  pTimes
 *     }
 */
@JvmInline
value class PresentTimesInfoGOOGLE(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var swapchainCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	var pTimes: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[3], value) }
	
	
	
	var times: PresentTimeGOOGLE.Buffer
		get()      = PresentTimeGOOGLE.Buffer(Unsafe.getNativePointer(address + LAYOUT.offsets[3]), swapchainCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[3], value.address); swapchainCount = value.capacity }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(NativeSizes.POINTER)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = PresentTimesInfoGOOGLE(0)
		
		fun malloc(allocator: Allocator) = PresentTimesInfoGOOGLE(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PRESENT_TIMES_INFO
		}
		
		fun calloc(allocator: Allocator) = PresentTimesInfoGOOGLE(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PRESENT_TIMES_INFO
		}
	
	}


}