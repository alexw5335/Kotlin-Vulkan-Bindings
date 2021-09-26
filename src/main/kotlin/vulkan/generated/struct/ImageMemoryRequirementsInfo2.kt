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
 *     struct VkImageMemoryRequirementsInfo2 {
 *         VkStructureType  sType
 *         void*            pNext
 *         VkImage          image
 *     }
 */
@JvmInline
value class ImageMemoryRequirementsInfo2(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var image: ImageH
		get()      = ImageH(Unsafe.getNativePointer(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[2], value.address) }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(NativeSizes.POINTER)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = ImageMemoryRequirementsInfo2(0)
		
		fun malloc(allocator: Allocator) = ImageMemoryRequirementsInfo2(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.IMAGE_MEMORY_REQUIREMENTS_INFO_2
		}
		
		fun calloc(allocator: Allocator) = ImageMemoryRequirementsInfo2(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.IMAGE_MEMORY_REQUIREMENTS_INFO_2
		}
	
	}


}