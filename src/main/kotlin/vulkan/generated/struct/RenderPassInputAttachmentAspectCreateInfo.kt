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
 *     struct VkRenderPassInputAttachmentAspectCreateInfo {
 *         VkStructureType                     sType
 *         void*                               pNext (must be null)
 *         uint32_t                            aspectReferenceCount
 *         VkInputAttachmentAspectReference**  pAspectReferences
 *     }
 */
@JvmInline
value class RenderPassInputAttachmentAspectCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var aspectReferenceCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	var pAspectReferences: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[3], value) }
	
	
	
	var aspectReferences: InputAttachmentAspectReference.Buffer
		get()      = InputAttachmentAspectReference.Buffer(Unsafe.getNativePointer(address + LAYOUT.offsets[3]), aspectReferenceCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[3], value.address); aspectReferenceCount = value.capacity }
	
	
	
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
		
		val NULL = RenderPassInputAttachmentAspectCreateInfo(0)
		
		fun malloc(allocator: Allocator) = RenderPassInputAttachmentAspectCreateInfo(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.RENDER_PASS_INPUT_ATTACHMENT_ASPECT_CREATE_INFO
		}
		
		fun calloc(allocator: Allocator) = RenderPassInputAttachmentAspectCreateInfo(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.RENDER_PASS_INPUT_ATTACHMENT_ASPECT_CREATE_INFO
		}
	
	}


}