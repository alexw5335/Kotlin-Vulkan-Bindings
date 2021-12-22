// This file has been automatically generated.

package kvb.vulkan

/**
 *     enum VkImageUsageFlagBits {
 *         VK_IMAGE_USAGE_TRANSFER_SRC_BIT                          = 1
 *         VK_IMAGE_USAGE_TRANSFER_DST_BIT                          = 2
 *         VK_IMAGE_USAGE_SAMPLED_BIT                               = 4
 *         VK_IMAGE_USAGE_STORAGE_BIT                               = 8
 *         VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT                      = 16
 *         VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT              = 32
 *         VK_IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT                  = 64
 *         VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT                      = 128
 *         VK_IMAGE_USAGE_RESERVED_13_BIT_KHR                       = 8192
 *         VK_IMAGE_USAGE_RESERVED_14_BIT_KHR                       = 16384
 *         VK_IMAGE_USAGE_RESERVED_15_BIT_KHR                       = 32768
 *         VK_IMAGE_USAGE_RESERVED_10_BIT_KHR                       = 1024
 *         VK_IMAGE_USAGE_RESERVED_11_BIT_KHR                       = 2048
 *         VK_IMAGE_USAGE_RESERVED_12_BIT_KHR                       = 4096
 *         VK_IMAGE_USAGE_SHADING_RATE_IMAGE_BIT_NV                 = 256
 *         VK_IMAGE_USAGE_RESERVED_16_BIT_QCOM                      = 65536
 *         VK_IMAGE_USAGE_RESERVED_17_BIT_QCOM                      = 131072
 *         VK_IMAGE_USAGE_FRAGMENT_DENSITY_MAP_BIT_EXT              = 512
 *         VK_IMAGE_USAGE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR  = 256
 *     }
 */
@Suppress("unused")
@JvmInline
value class ImageUsageFlags(val value: Int) {
	
	
	companion object {
		
		val TRANSFER_SRC = ImageUsageFlags(1)
		
		val TRANSFER_DST = ImageUsageFlags(2)
		
		val SAMPLED = ImageUsageFlags(4)
		
		val STORAGE = ImageUsageFlags(8)
		
		val COLOR_ATTACHMENT = ImageUsageFlags(16)
		
		val DEPTH_STENCIL_ATTACHMENT = ImageUsageFlags(32)
		
		val TRANSIENT_ATTACHMENT = ImageUsageFlags(64)
		
		val INPUT_ATTACHMENT = ImageUsageFlags(128)
		
		val SHADING_RATE_IMAGE = ImageUsageFlags(256)
		
		val FRAGMENT_DENSITY_MAP = ImageUsageFlags(512)
	
	}
	
	
	
	operator fun plus(mask: ImageUsageFlags) = ImageUsageFlags(value or mask.value)
	
	operator fun contains(mask: ImageUsageFlags) = value and mask.value == mask.value


}