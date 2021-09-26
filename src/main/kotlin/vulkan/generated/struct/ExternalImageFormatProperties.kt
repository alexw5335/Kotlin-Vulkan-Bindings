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
 *     struct VkExternalImageFormatProperties {
 *         VkStructureType             sType
 *         void*                       pNext (must be null)
 *         VkExternalMemoryProperties  externalMemoryProperties
 *     }
 */
@JvmInline
value class ExternalImageFormatProperties(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var externalMemoryProperties: ExternalMemoryProperties
		get()      = ExternalMemoryProperties(address + LAYOUT.offsets[2])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[2], value.structSize) }
	
	
	
	class Persistent(
		val sType: StructureType,
		val externalMemoryProperties: ExternalMemoryProperties.Persistent,
	) {
		override fun toString() = "ExternalImageFormatProperties(" + 
			"sType=$sType, " +
			"externalMemoryProperties=$externalMemoryProperties)"
	}
	
	
	
	val asPersistent get() = Persistent(
		sType, 
		externalMemoryProperties.asPersistent, 
	)
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(ExternalMemoryProperties.LAYOUT)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = ExternalImageFormatProperties(0)
		
		fun malloc(allocator: Allocator) = ExternalImageFormatProperties(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.EXTERNAL_IMAGE_FORMAT_PROPERTIES
		}
		
		fun calloc(allocator: Allocator) = ExternalImageFormatProperties(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.EXTERNAL_IMAGE_FORMAT_PROPERTIES
		}
	
	}


}