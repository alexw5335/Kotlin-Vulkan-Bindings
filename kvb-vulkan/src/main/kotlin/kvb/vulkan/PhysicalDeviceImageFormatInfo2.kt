// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkPhysicalDeviceImageFormatInfo2 {
 *         VkStructureType     sType
 *         void*               pNext
 *         VkFormat            format
 *         VkImageType         type
 *         VkImageTiling       tiling
 *         VkImageUsageFlags   usage
 *         VkImageCreateFlags  flags
 *     }
 * 
 *     Valid pNext types:
 *         - VkPhysicalDeviceExternalImageFormatInfo
 *         - VkImageFormatListCreateInfo
 *         - VkPhysicalDeviceImageDrmFormatModifierInfoEXT
 *         - VkImageStencilUsageCreateInfo
 *         - VkPhysicalDeviceImageViewImageFormatInfoEXT
 */
@JvmInline
value class PhysicalDeviceImageFormatInfo2(override val address: Long) : Addressable {
	
	
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
	
	var tiling: ImageTiling
		get()      = ImageTiling.values().first { it.value == Unsafe.getInt(address + 24) }
		set(value) = Unsafe.setInt(address + 24, value.value)
	
	var usage: ImageUsageFlags
		get()      = ImageUsageFlags(Unsafe.getInt(address + 28))
		set(value) = Unsafe.setInt(address + 28, value.value)
	
	var flags: ImageCreateFlags
		get()      = ImageCreateFlags(Unsafe.getInt(address + 32))
		set(value) = Unsafe.setInt(address + 32, value.value)


}