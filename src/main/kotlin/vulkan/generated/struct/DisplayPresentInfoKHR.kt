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
 *     struct VkDisplayPresentInfoKHR {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkRect2D         srcRect
 *         VkRect2D         dstRect
 *         VkBool32         persistent
 *     }
 */
@JvmInline
value class DisplayPresentInfoKHR(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var srcRect: Rect2D
		get()      = Rect2D(address + LAYOUT.offsets[2])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[2], value.structSize) }
	
	var dstRect: Rect2D
		get()      = Rect2D(address + LAYOUT.offsets[3])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[3], value.structSize) }
	
	var persistent: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value) }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(Rect2D.LAYOUT)
			member(Rect2D.LAYOUT)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = DisplayPresentInfoKHR(0)
		
		fun malloc(allocator: Allocator) = DisplayPresentInfoKHR(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.DISPLAY_PRESENT_INFO
		}
		
		fun calloc(allocator: Allocator) = DisplayPresentInfoKHR(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.DISPLAY_PRESENT_INFO
		}
	
	}


}