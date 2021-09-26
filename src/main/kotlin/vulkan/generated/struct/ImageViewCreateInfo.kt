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
 *     struct VkImageViewCreateInfo {
 *         VkStructureType          sType
 *         void*                    pNext
 *         VkImageViewCreateFlags   flags
 *         VkImage                  image
 *         VkImageViewType          viewType
 *         VkFormat                 format
 *         VkComponentMapping       components
 *         VkImageSubresourceRange  subresourceRange
 *     }
 */
@JvmInline
value class ImageViewCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var flags: ImageViewCreateFlags
		get()      = ImageViewCreateFlags(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.bitfield) }
	
	var image: ImageH
		get()      = ImageH(Unsafe.getNativePointer(address + LAYOUT.offsets[3]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[3], value.address) }
	
	var viewType: ImageViewType
		get()      = ImageViewType(Unsafe.getInt(address + LAYOUT.offsets[4]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value.id) }
	
	var format: Format
		get()      = Format(Unsafe.getInt(address + LAYOUT.offsets[5]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[5], value.id) }
	
	var components: ComponentMapping
		get()      = ComponentMapping(address + LAYOUT.offsets[6])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[6], value.structSize) }
	
	var subresourceRange: ImageSubresourceRange
		get()      = ImageSubresourceRange(address + LAYOUT.offsets[7])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[7], value.structSize) }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(4)
			member(ComponentMapping.LAYOUT)
			member(ImageSubresourceRange.LAYOUT)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = ImageViewCreateInfo(0)
		
		fun malloc(allocator: Allocator) = ImageViewCreateInfo(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.IMAGE_VIEW_CREATE_INFO
		}
		
		fun calloc(allocator: Allocator) = ImageViewCreateInfo(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.IMAGE_VIEW_CREATE_INFO
		}
	
	}


}