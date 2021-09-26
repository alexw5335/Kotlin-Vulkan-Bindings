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
 *     struct VkImageViewAddressPropertiesNVX {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkDeviceAddress  deviceAddress
 *         VkDeviceSize     size
 *     }
 */
@JvmInline
value class ImageViewAddressPropertiesNVX(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var deviceAddress: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[2], value) }
	
	var size: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[3], value) }
	
	
	
	class Persistent(
		val sType: StructureType,
		val deviceAddress: Long,
		val size: Long,
	) {
		override fun toString() = "ImageViewAddressPropertiesNVX(" + 
			"sType=$sType, " +
			"deviceAddress=$deviceAddress, " +
			"size=$size)"
	}
	
	
	
	val asPersistent get() = Persistent(
		sType, 
		deviceAddress, 
		size, 
	)
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(8)
			member(8)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = ImageViewAddressPropertiesNVX(0)
		
		fun malloc(allocator: Allocator) = ImageViewAddressPropertiesNVX(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.IMAGE_VIEW_ADDRESS_PROPERTIES
		}
		
		fun calloc(allocator: Allocator) = ImageViewAddressPropertiesNVX(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.IMAGE_VIEW_ADDRESS_PROPERTIES
		}
	
	}


}