// This file has been automatically generated.

package kvb.vulkan

/**
 *     // provided by VK_VERSION_1_0

 *     enum VkImageViewCreateFlagBits {
 *         VK_IMAGE_VIEW_CREATE_FRAGMENT_DENSITY_MAP_DYNAMIC_BIT_EXT   = 1
 *         VK_IMAGE_VIEW_CREATE_FRAGMENT_DENSITY_MAP_DEFERRED_BIT_EXT  = 2
 *     }
 */
@Suppress("unused")
@JvmInline
value class ImageViewCreateFlags(val value: Int) {
	
	
	companion object {
		
		val FRAGMENT_DENSITY_MAP_DYNAMIC = ImageViewCreateFlags(1)
		
		val FRAGMENT_DENSITY_MAP_DEFERRED = ImageViewCreateFlags(2)
	
	}
	
	
	
	operator fun plus(mask: ImageViewCreateFlags) = ImageViewCreateFlags(value or mask.value)
	
	operator fun contains(mask: ImageViewCreateFlags) = value and mask.value == mask.value


}