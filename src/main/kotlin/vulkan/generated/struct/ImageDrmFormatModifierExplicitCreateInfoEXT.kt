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
 *     struct VkImageDrmFormatModifierExplicitCreateInfoEXT {
 *         VkStructureType        sType
 *         void*                  pNext (must be null)
 *         uint64_t               drmFormatModifier
 *         uint32_t               drmFormatModifierPlaneCount
 *         VkSubresourceLayout**  pPlaneLayouts
 *     }
 */
@JvmInline
value class ImageDrmFormatModifierExplicitCreateInfoEXT(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var drmFormatModifier: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[2], value) }
	
	var drmFormatModifierPlaneCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value) }
	
	var pPlaneLayouts: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[4], value) }
	
	
	
	var planeLayouts: SubresourceLayout.Buffer
		get()      = SubresourceLayout.Buffer(Unsafe.getNativePointer(address + LAYOUT.offsets[4]), drmFormatModifierPlaneCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[4], value.address); drmFormatModifierPlaneCount = value.capacity }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(8)
			member(4)
			member(NativeSizes.POINTER)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = ImageDrmFormatModifierExplicitCreateInfoEXT(0)
		
		fun malloc(allocator: Allocator) = ImageDrmFormatModifierExplicitCreateInfoEXT(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.IMAGE_DRM_FORMAT_MODIFIER_EXPLICIT_CREATE_INFO
		}
		
		fun calloc(allocator: Allocator) = ImageDrmFormatModifierExplicitCreateInfoEXT(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.IMAGE_DRM_FORMAT_MODIFIER_EXPLICIT_CREATE_INFO
		}
	
	}


}