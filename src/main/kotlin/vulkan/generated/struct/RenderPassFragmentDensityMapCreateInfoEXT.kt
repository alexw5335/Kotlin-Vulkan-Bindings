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
 *     struct VkRenderPassFragmentDensityMapCreateInfoEXT {
 *         VkStructureType        sType
 *         void*                  pNext (must be null)
 *         VkAttachmentReference  fragmentDensityMapAttachment
 *     }
 */
@JvmInline
value class RenderPassFragmentDensityMapCreateInfoEXT(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var fragmentDensityMapAttachment: AttachmentReference
		get()      = AttachmentReference(address + LAYOUT.offsets[2])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[2], value.structSize) }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(AttachmentReference.LAYOUT)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = RenderPassFragmentDensityMapCreateInfoEXT(0)
		
		fun malloc(allocator: Allocator) = RenderPassFragmentDensityMapCreateInfoEXT(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.RENDER_PASS_FRAGMENT_DENSITY_MAP_CREATE_INFO
		}
		
		fun calloc(allocator: Allocator) = RenderPassFragmentDensityMapCreateInfoEXT(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.RENDER_PASS_FRAGMENT_DENSITY_MAP_CREATE_INFO
		}
	
	}


}