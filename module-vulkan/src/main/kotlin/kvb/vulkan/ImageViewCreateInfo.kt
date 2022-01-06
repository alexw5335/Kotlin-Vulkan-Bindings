// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_VERSION_1_0

 *     struct VkImageViewCreateInfo {
 *         VkStructureType          sType
 *         void*                    pNext
 *         VkImageViewCreateFlags   flags
 *         VkImage                  image
 *         VkImageViewType          viewType
 *         VkFormat                 format
 *         VkComponentMapping       components
 *         VkImageSubresourceRange  subresourceRange
 *     }
 * 
 *     Valid pNext types:
 *         - VkImageViewUsageCreateInfo
 *         - VkSamplerYcbcrConversionInfo
 *         - VkImageViewASTCDecodeModeEXT
 *         - VkVideoProfilesKHR
 *         - VkVideoProfileKHR
 *         - VkVideoDecodeH264ProfileEXT
 *         - VkVideoDecodeH265ProfileEXT
 *         - VkVideoEncodeH264ProfileEXT
 *         - VkVideoEncodeH265ProfileEXT
 *         - VkImageViewMinLodCreateInfoEXT
 */
@JvmInline
value class ImageViewCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: ImageViewCreateFlags
		get()      = ImageViewCreateFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var image: ImageH
		get()      = ImageH(Unsafe.getLong(address + 24))
		set(value) = Unsafe.setLong(address + 24, value.address)
	
	var viewType: ImageViewType
		get()      = _ImageViewType(Unsafe.getInt(address + 32))
		set(value) = Unsafe.setInt(address + 32, value.value)
	
	var format: Format
		get()      = Format(Unsafe.getInt(address + 36))
		set(value) = Unsafe.setInt(address + 36, value.value)
	
	var components: ComponentMapping
		get()      = ComponentMapping(address + 40)
		set(value) = Unsafe.copy(value.address, address + 40, 16)
	
	var subresourceRange: ImageSubresourceRange
		get()      = ImageSubresourceRange(address + 56)
		set(value) = Unsafe.copy(value.address, address + 56, 20)


}