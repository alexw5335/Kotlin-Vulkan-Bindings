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
 *     struct VkSamplerYcbcrConversionImageFormatProperties {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint32_t         combinedImageSamplerDescriptorCount
 *     }
 */
@JvmInline
value class SamplerYcbcrConversionImageFormatProperties(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var combinedImageSamplerDescriptorCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	
	
	class Persistent(
		val sType: StructureType,
		val combinedImageSamplerDescriptorCount: Int,
	) {
		override fun toString() = "SamplerYcbcrConversionImageFormatProperties(" + 
			"sType=$sType, " +
			"combinedImageSamplerDescriptorCount=$combinedImageSamplerDescriptorCount)"
	}
	
	
	
	val asPersistent get() = Persistent(
		sType, 
		combinedImageSamplerDescriptorCount, 
	)
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = SamplerYcbcrConversionImageFormatProperties(0)
		
		fun malloc(allocator: Allocator) = SamplerYcbcrConversionImageFormatProperties(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.SAMPLER_YCBCR_CONVERSION_IMAGE_FORMAT_PROPERTIES
		}
		
		fun calloc(allocator: Allocator) = SamplerYcbcrConversionImageFormatProperties(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.SAMPLER_YCBCR_CONVERSION_IMAGE_FORMAT_PROPERTIES
		}
	
	}


}