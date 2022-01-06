// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_KHR_dynamic_rendering

 *     struct VkRenderingFragmentShadingRateAttachmentInfoKHR {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkImageView      imageView
 *         VkImageLayout    imageLayout
 *         VkExtent2D       shadingRateAttachmentTexelSize
 *     }
 */
@JvmInline
value class RenderingFragmentShadingRateAttachmentInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var imageView: ImageViewH
		get()      = ImageViewH(Unsafe.getLong(address + 16))
		set(value) = Unsafe.setLong(address + 16, value.address)
	
	var imageLayout: ImageLayout
		get()      = _ImageLayout(Unsafe.getInt(address + 24))
		set(value) = Unsafe.setInt(address + 24, value.value)
	
	var shadingRateAttachmentTexelSize: Extent2D
		get()      = Extent2D(address + 28)
		set(value) = Unsafe.copy(value.address, address + 28, 8)


}