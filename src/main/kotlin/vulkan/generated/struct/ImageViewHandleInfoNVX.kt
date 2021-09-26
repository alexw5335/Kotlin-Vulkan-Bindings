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
 *     struct VkImageViewHandleInfoNVX {
 *         VkStructureType   sType
 *         void*             pNext (must be null)
 *         VkImageView       imageView
 *         VkDescriptorType  descriptorType
 *         VkSampler         sampler
 *     }
 */
@JvmInline
value class ImageViewHandleInfoNVX(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var imageView: ImageViewH
		get()      = ImageViewH(Unsafe.getNativePointer(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[2], value.address) }
	
	var descriptorType: DescriptorType
		get()      = DescriptorType(Unsafe.getInt(address + LAYOUT.offsets[3]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value.id) }
	
	var sampler: SamplerH
		get()      = SamplerH(Unsafe.getNativePointer(address + LAYOUT.offsets[4]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[4], value.address) }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(NativeSizes.POINTER)
			member(4)
			member(NativeSizes.POINTER)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = ImageViewHandleInfoNVX(0)
		
		fun malloc(allocator: Allocator) = ImageViewHandleInfoNVX(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.IMAGE_VIEW_HANDLE_INFO
		}
		
		fun calloc(allocator: Allocator) = ImageViewHandleInfoNVX(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.IMAGE_VIEW_HANDLE_INFO
		}
	
	}


}