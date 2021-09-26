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
 *     struct VkPhysicalDeviceSparseImageFormatInfo2 {
 *         VkStructureType        sType
 *         void*                  pNext (must be null)
 *         VkFormat               format
 *         VkImageType            type
 *         VkSampleCountFlagBits  samples
 *         VkImageUsageFlags      usage
 *         VkImageTiling          tiling
 *     }
 */
@JvmInline
value class PhysicalDeviceSparseImageFormatInfo2(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var format: Format
		get()      = Format(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.id) }
	
	var type: ImageType
		get()      = ImageType(Unsafe.getInt(address + LAYOUT.offsets[3]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value.id) }
	
	var samples: SampleCountFlags
		get()      = SampleCountFlags(Unsafe.getInt(address + LAYOUT.offsets[4]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value.bitfield) }
	
	var usage: ImageUsageFlags
		get()      = ImageUsageFlags(Unsafe.getInt(address + LAYOUT.offsets[5]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[5], value.bitfield) }
	
	var tiling: ImageTiling
		get()      = ImageTiling(Unsafe.getInt(address + LAYOUT.offsets[6]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[6], value.id) }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = PhysicalDeviceSparseImageFormatInfo2(0)
		
		fun malloc(allocator: Allocator) = PhysicalDeviceSparseImageFormatInfo2(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_SPARSE_IMAGE_FORMAT_INFO_2
		}
		
		fun calloc(allocator: Allocator) = PhysicalDeviceSparseImageFormatInfo2(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_SPARSE_IMAGE_FORMAT_INFO_2
		}
	
	}


}