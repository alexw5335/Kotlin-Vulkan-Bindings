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
 *     struct VkImageDrmFormatModifierListCreateInfoEXT {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint32_t         drmFormatModifierCount
 *         uint64_t**       pDrmFormatModifiers
 *     }
 */
@JvmInline
value class ImageDrmFormatModifierListCreateInfoEXT(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var drmFormatModifierCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	var pDrmFormatModifiers: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[3], value) }
	
	
	
	var drmFormatModifiers: DirectLongBuffer
		get()      = DirectLongBuffer(Unsafe.getNativePointer(address + LAYOUT.offsets[3]), drmFormatModifierCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[3], value.address); drmFormatModifierCount = value.capacity }
	
	
	
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
		
		val NULL = ImageDrmFormatModifierListCreateInfoEXT(0)
		
		fun malloc(allocator: Allocator) = ImageDrmFormatModifierListCreateInfoEXT(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.IMAGE_DRM_FORMAT_MODIFIER_LIST_CREATE_INFO
		}
		
		fun calloc(allocator: Allocator) = ImageDrmFormatModifierListCreateInfoEXT(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.IMAGE_DRM_FORMAT_MODIFIER_LIST_CREATE_INFO
		}
	
	}


}