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
 *     struct VkImageFormatProperties {
 *         VkExtent3D          maxExtent
 *         uint32_t            maxMipLevels
 *         uint32_t            maxArrayLayers
 *         VkSampleCountFlags  sampleCounts
 *         VkDeviceSize        maxResourceSize
 *     }
 */
@JvmInline
value class ImageFormatProperties(override val address: Long) : Addressable {
	
	
	var maxExtent: Extent3D
		get()      = Extent3D(address + LAYOUT.offsets[0])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[0], value.structSize) }
	
	var maxMipLevels: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[1], value) }
	
	var maxArrayLayers: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	var sampleCounts: SampleCountFlags
		get()      = SampleCountFlags(Unsafe.getInt(address + LAYOUT.offsets[3]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value.bitfield) }
	
	var maxResourceSize: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[4], value) }
	
	
	
	class Persistent(
		val maxExtent: Extent3D.Persistent,
		val maxMipLevels: Int,
		val maxArrayLayers: Int,
		val sampleCounts: SampleCountFlags,
		val maxResourceSize: Long,
	) {
		override fun toString() = "ImageFormatProperties(" + 
			"maxExtent=$maxExtent, " +
			"maxMipLevels=$maxMipLevels, " +
			"maxArrayLayers=$maxArrayLayers, " +
			"sampleCounts=$sampleCounts, " +
			"maxResourceSize=$maxResourceSize)"
	}
	
	
	
	val asPersistent get() = Persistent(
		maxExtent.asPersistent, 
		maxMipLevels, 
		maxArrayLayers, 
		sampleCounts, 
		maxResourceSize, 
	)
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(Extent3D.LAYOUT)
			member(4)
			member(4)
			member(4)
			member(8)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = ImageFormatProperties(0)
		
		fun malloc(allocator: Allocator) = ImageFormatProperties(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = ImageFormatProperties(allocator.calloc(SIZE, ALIGNMENT))
	
	}


}