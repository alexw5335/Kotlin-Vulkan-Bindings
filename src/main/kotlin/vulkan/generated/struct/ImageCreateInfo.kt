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
 *     struct VkImageCreateInfo {
 *         VkStructureType        sType
 *         void*                  pNext
 *         VkImageCreateFlags     flags
 *         VkImageType            imageType
 *         VkFormat               format
 *         VkExtent3D             extent
 *         uint32_t               mipLevels
 *         uint32_t               arrayLayers
 *         VkSampleCountFlagBits  samples
 *         VkImageTiling          tiling
 *         VkImageUsageFlags      usage
 *         VkSharingMode          sharingMode
 *         uint32_t               queueFamilyIndexCount
 *         uint32_t**             pQueueFamilyIndices
 *         VkImageLayout          initialLayout
 *     }
 */
@JvmInline
value class ImageCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var flags: ImageCreateFlags
		get()      = ImageCreateFlags(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.bitfield) }
	
	var imageType: ImageType
		get()      = ImageType(Unsafe.getInt(address + LAYOUT.offsets[3]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value.id) }
	
	var format: Format
		get()      = Format(Unsafe.getInt(address + LAYOUT.offsets[4]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value.id) }
	
	var extent: Extent3D
		get()      = Extent3D(address + LAYOUT.offsets[5])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[5], value.structSize) }
	
	var mipLevels: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[6])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[6], value) }
	
	var arrayLayers: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[7])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[7], value) }
	
	var samples: SampleCountFlags
		get()      = SampleCountFlags(Unsafe.getInt(address + LAYOUT.offsets[8]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[8], value.bitfield) }
	
	var tiling: ImageTiling
		get()      = ImageTiling(Unsafe.getInt(address + LAYOUT.offsets[9]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[9], value.id) }
	
	var usage: ImageUsageFlags
		get()      = ImageUsageFlags(Unsafe.getInt(address + LAYOUT.offsets[10]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[10], value.bitfield) }
	
	var sharingMode: SharingMode
		get()      = SharingMode(Unsafe.getInt(address + LAYOUT.offsets[11]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[11], value.id) }
	
	var queueFamilyIndexCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[12])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[12], value) }
	
	var pQueueFamilyIndices: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[13])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[13], value) }
	
	var initialLayout: ImageLayout
		get()      = ImageLayout(Unsafe.getInt(address + LAYOUT.offsets[14]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[14], value.id) }
	
	
	
	var queueFamilyIndices: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getNativePointer(address + LAYOUT.offsets[13]), queueFamilyIndexCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[13], value.address); queueFamilyIndexCount = value.capacity }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(4)
			member(4)
			member(Extent3D.LAYOUT)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(NativeSizes.POINTER)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = ImageCreateInfo(0)
		
		fun malloc(allocator: Allocator) = ImageCreateInfo(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.IMAGE_CREATE_INFO
		}
		
		fun calloc(allocator: Allocator) = ImageCreateInfo(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.IMAGE_CREATE_INFO
		}
	
	}


}