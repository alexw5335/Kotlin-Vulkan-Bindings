// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_KHR_video_queue

 *     struct VkVideoPictureResourceKHR {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkOffset2D       codedOffset
 *         VkExtent2D       codedExtent
 *         uint32_t         baseArrayLayer
 *         VkImageView      imageViewBinding
 *     }
 */
@JvmInline
value class VideoPictureResource(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var codedOffset: Offset2D
		get()      = Offset2D(address + 16)
		set(value) = Unsafe.copy(value.address, address + 16, 8)
	
	var codedExtent: Extent2D
		get()      = Extent2D(address + 24)
		set(value) = Unsafe.copy(value.address, address + 24, 8)
	
	var baseArrayLayer: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var imageViewBinding: ImageViewH
		get()      = ImageViewH(Unsafe.getLong(address + 40))
		set(value) = Unsafe.setLong(address + 40, value.address)


}