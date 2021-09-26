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
 *     struct VkImageDrmFormatModifierPropertiesEXT {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint64_t         drmFormatModifier
 *     }
 */
@JvmInline
value class ImageDrmFormatModifierPropertiesEXT(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var drmFormatModifier: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[2], value) }
	
	
	
	class Persistent(
		val sType: StructureType,
		val drmFormatModifier: Long,
	) {
		override fun toString() = "ImageDrmFormatModifierPropertiesEXT(" + 
			"sType=$sType, " +
			"drmFormatModifier=$drmFormatModifier)"
	}
	
	
	
	val asPersistent get() = Persistent(
		sType, 
		drmFormatModifier, 
	)
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(8)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = ImageDrmFormatModifierPropertiesEXT(0)
		
		fun malloc(allocator: Allocator) = ImageDrmFormatModifierPropertiesEXT(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.IMAGE_DRM_FORMAT_MODIFIER_PROPERTIES
		}
		
		fun calloc(allocator: Allocator) = ImageDrmFormatModifierPropertiesEXT(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.IMAGE_DRM_FORMAT_MODIFIER_PROPERTIES
		}
	
	}


}