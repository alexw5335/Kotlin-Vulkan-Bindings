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
 *     struct VkExternalImageFormatPropertiesNV {
 *         VkImageFormatProperties            imageFormatProperties
 *         VkExternalMemoryFeatureFlagsNV     externalMemoryFeatures
 *         VkExternalMemoryHandleTypeFlagsNV  exportFromImportedHandleTypes
 *         VkExternalMemoryHandleTypeFlagsNV  compatibleHandleTypes
 *     }
 */
@JvmInline
value class ExternalImageFormatPropertiesNV(override val address: Long) : Addressable {
	
	
	var imageFormatProperties: ImageFormatProperties
		get()      = ImageFormatProperties(address + LAYOUT.offsets[0])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[0], value.structSize) }
	
	var externalMemoryFeatures: ExternalMemoryFeatureFlags
		get()      = ExternalMemoryFeatureFlags(Unsafe.getInt(address + LAYOUT.offsets[1]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[1], value.bitfield) }
	
	var exportFromImportedHandleTypes: ExternalMemoryHandleTypeFlags
		get()      = ExternalMemoryHandleTypeFlags(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.bitfield) }
	
	var compatibleHandleTypes: ExternalMemoryHandleTypeFlags
		get()      = ExternalMemoryHandleTypeFlags(Unsafe.getInt(address + LAYOUT.offsets[3]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value.bitfield) }
	
	
	
	class Persistent(
		val imageFormatProperties: ImageFormatProperties.Persistent,
		val externalMemoryFeatures: ExternalMemoryFeatureFlags,
		val exportFromImportedHandleTypes: ExternalMemoryHandleTypeFlags,
		val compatibleHandleTypes: ExternalMemoryHandleTypeFlags,
	) {
		override fun toString() = "ExternalImageFormatPropertiesNV(" + 
			"imageFormatProperties=$imageFormatProperties, " +
			"externalMemoryFeatures=$externalMemoryFeatures, " +
			"exportFromImportedHandleTypes=$exportFromImportedHandleTypes, " +
			"compatibleHandleTypes=$compatibleHandleTypes)"
	}
	
	
	
	val asPersistent get() = Persistent(
		imageFormatProperties.asPersistent, 
		externalMemoryFeatures, 
		exportFromImportedHandleTypes, 
		compatibleHandleTypes, 
	)
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(ImageFormatProperties.LAYOUT)
			member(4)
			member(4)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = ExternalImageFormatPropertiesNV(0)
		
		fun malloc(allocator: Allocator) = ExternalImageFormatPropertiesNV(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = ExternalImageFormatPropertiesNV(allocator.calloc(SIZE, ALIGNMENT))
	
	}


}