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
 *     struct VkFramebufferAttachmentsCreateInfo {
 *         VkStructureType                     sType
 *         void*                               pNext (must be null)
 *         uint32_t                            attachmentImageInfoCount
 *         VkFramebufferAttachmentImageInfo**  pAttachmentImageInfos
 *     }
 */
@JvmInline
value class FramebufferAttachmentsCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var attachmentImageInfoCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	var pAttachmentImageInfos: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[3], value) }
	
	
	
	var attachmentImageInfos: FramebufferAttachmentImageInfo.Buffer
		get()      = FramebufferAttachmentImageInfo.Buffer(Unsafe.getNativePointer(address + LAYOUT.offsets[3]), attachmentImageInfoCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[3], value.address); attachmentImageInfoCount = value.capacity }
	
	
	
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
		
		val NULL = FramebufferAttachmentsCreateInfo(0)
		
		fun malloc(allocator: Allocator) = FramebufferAttachmentsCreateInfo(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.FRAMEBUFFER_ATTACHMENTS_CREATE_INFO
		}
		
		fun calloc(allocator: Allocator) = FramebufferAttachmentsCreateInfo(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.FRAMEBUFFER_ATTACHMENTS_CREATE_INFO
		}
	
	}


}