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
 *     struct VkExternalFenceProperties {
 *         VkStructureType                 sType
 *         void*                           pNext (must be null)
 *         VkExternalFenceHandleTypeFlags  exportFromImportedHandleTypes
 *         VkExternalFenceHandleTypeFlags  compatibleHandleTypes
 *         VkExternalFenceFeatureFlags     externalFenceFeatures
 *     }
 */
@JvmInline
value class ExternalFenceProperties(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var exportFromImportedHandleTypes: ExternalFenceHandleTypeFlags
		get()      = ExternalFenceHandleTypeFlags(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.bitfield) }
	
	var compatibleHandleTypes: ExternalFenceHandleTypeFlags
		get()      = ExternalFenceHandleTypeFlags(Unsafe.getInt(address + LAYOUT.offsets[3]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value.bitfield) }
	
	var externalFenceFeatures: ExternalFenceFeatureFlags
		get()      = ExternalFenceFeatureFlags(Unsafe.getInt(address + LAYOUT.offsets[4]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value.bitfield) }
	
	
	
	class Persistent(
		val sType: StructureType,
		val exportFromImportedHandleTypes: ExternalFenceHandleTypeFlags,
		val compatibleHandleTypes: ExternalFenceHandleTypeFlags,
		val externalFenceFeatures: ExternalFenceFeatureFlags,
	) {
		override fun toString() = "ExternalFenceProperties(" + 
			"sType=$sType, " +
			"exportFromImportedHandleTypes=$exportFromImportedHandleTypes, " +
			"compatibleHandleTypes=$compatibleHandleTypes, " +
			"externalFenceFeatures=$externalFenceFeatures)"
	}
	
	
	
	val asPersistent get() = Persistent(
		sType, 
		exportFromImportedHandleTypes, 
		compatibleHandleTypes, 
		externalFenceFeatures, 
	)
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(4)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = ExternalFenceProperties(0)
		
		fun malloc(allocator: Allocator) = ExternalFenceProperties(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.EXTERNAL_FENCE_PROPERTIES
		}
		
		fun calloc(allocator: Allocator) = ExternalFenceProperties(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.EXTERNAL_FENCE_PROPERTIES
		}
	
	}


}