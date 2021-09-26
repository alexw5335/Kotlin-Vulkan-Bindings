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
 *     struct VkImageSparseMemoryRequirementsInfo2 {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkImage          image
 *     }
 */
@JvmInline
value class ImageSparseMemoryRequirementsInfo2(override val address: Long) : Addressable {
	
	
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
		
		val NULL = ImageSparseMemoryRequirementsInfo2(0)
		
		fun malloc(allocator: Allocator) = ImageSparseMemoryRequirementsInfo2(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.IMAGE_SPARSE_MEMORY_REQUIREMENTS_INFO_2
		}
		
		fun calloc(allocator: Allocator) = ImageSparseMemoryRequirementsInfo2(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.IMAGE_SPARSE_MEMORY_REQUIREMENTS_INFO_2
		}
	
	}


}