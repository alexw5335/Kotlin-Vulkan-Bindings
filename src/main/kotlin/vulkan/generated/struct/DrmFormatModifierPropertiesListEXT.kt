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
 *     struct VkDrmFormatModifierPropertiesListEXT {
 *         VkStructureType                     sType
 *         void*                               pNext (must be null)
 *         uint32_t                            drmFormatModifierCount
 *         VkDrmFormatModifierPropertiesEXT**  pDrmFormatModifierProperties
 *     }
 */
@JvmInline
value class DrmFormatModifierPropertiesListEXT(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var drmFormatModifierCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	var pDrmFormatModifierProperties: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[3], value) }
	
	
	
	var drmFormatModifierProperties: DrmFormatModifierPropertiesEXT.Buffer
		get()      = DrmFormatModifierPropertiesEXT.Buffer(Unsafe.getNativePointer(address + LAYOUT.offsets[3]), drmFormatModifierCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[3], value.address); drmFormatModifierCount = value.capacity }
	
	
	
	class Persistent(
		val sType: StructureType,
		val drmFormatModifierCount: Int,
		val drmFormatModifierProperties: List<DrmFormatModifierPropertiesEXT.Persistent>,
	) {
		override fun toString() = "DrmFormatModifierPropertiesListEXT(" + 
			"sType=$sType, " +
			"drmFormatModifierCount=$drmFormatModifierCount, " +
			"drmFormatModifierProperties=$drmFormatModifierProperties)"
	}
	
	
	
	val asPersistent get() = Persistent(
		sType, 
		drmFormatModifierCount, 
		drmFormatModifierProperties.asPersistentList, 
	)
	
	
	
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
		
		val NULL = DrmFormatModifierPropertiesListEXT(0)
		
		fun malloc(allocator: Allocator) = DrmFormatModifierPropertiesListEXT(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.DRM_FORMAT_MODIFIER_PROPERTIES_LIST
		}
		
		fun calloc(allocator: Allocator) = DrmFormatModifierPropertiesListEXT(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.DRM_FORMAT_MODIFIER_PROPERTIES_LIST
		}
	
	}


}