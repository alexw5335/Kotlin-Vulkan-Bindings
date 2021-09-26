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
 *     struct VkSubpassDescriptionDepthStencilResolve {
 *         VkStructureType          sType
 *         void*                    pNext (must be null)
 *         VkResolveModeFlagBits    depthResolveMode
 *         VkResolveModeFlagBits    stencilResolveMode
 *         VkAttachmentReference2*  pDepthStencilResolveAttachment
 *     }
 */
@JvmInline
value class SubpassDescriptionDepthStencilResolve(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var depthResolveMode: ResolveModeFlags
		get()      = ResolveModeFlags(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.bitfield) }
	
	var stencilResolveMode: ResolveModeFlags
		get()      = ResolveModeFlags(Unsafe.getInt(address + LAYOUT.offsets[3]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value.bitfield) }
	
	var pDepthStencilResolveAttachment: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[4], value) }
	
	
	
	var depthStencilResolveAttachment: AttachmentReference2
		get()      = AttachmentReference2(Unsafe.getNativePointer(address + LAYOUT.offsets[4]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[4], value.address) }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(4)
			member(NativeSizes.POINTER)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = SubpassDescriptionDepthStencilResolve(0)
		
		fun malloc(allocator: Allocator) = SubpassDescriptionDepthStencilResolve(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.SUBPASS_DESCRIPTION_DEPTH_STENCIL_RESOLVE
		}
		
		fun calloc(allocator: Allocator) = SubpassDescriptionDepthStencilResolve(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.SUBPASS_DESCRIPTION_DEPTH_STENCIL_RESOLVE
		}
	
	}


}