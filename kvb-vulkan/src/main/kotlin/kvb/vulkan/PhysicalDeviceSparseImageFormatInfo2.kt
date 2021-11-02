// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

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
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var format: Format
		get()      = Format(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var type: ImageType
		get()      = ImageType.values().first { it.value == Unsafe.getInt(address + 20) }
		set(value) = Unsafe.setInt(address + 20, value.value)
	
	var samples: SampleCountFlags
		get()      = SampleCountFlags(Unsafe.getInt(address + 24))
		set(value) = Unsafe.setInt(address + 24, value.value)
	
	var usage: ImageUsageFlags
		get()      = ImageUsageFlags(Unsafe.getInt(address + 28))
		set(value) = Unsafe.setInt(address + 28, value.value)
	
	var tiling: ImageTiling
		get()      = ImageTiling.values().first { it.value == Unsafe.getInt(address + 32) }
		set(value) = Unsafe.setInt(address + 32, value.value)


}