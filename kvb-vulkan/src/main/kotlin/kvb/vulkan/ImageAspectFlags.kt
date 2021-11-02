// This file has been automatically generated.

package kvb.vulkan

/**
 *     enum VkImageAspectFlagBits {
 *         VK_IMAGE_ASPECT_COLOR_BIT               = 1
 *         VK_IMAGE_ASPECT_DEPTH_BIT               = 2
 *         VK_IMAGE_ASPECT_STENCIL_BIT             = 4
 *         VK_IMAGE_ASPECT_METADATA_BIT            = 8
 *         VK_IMAGE_ASPECT_PLANE_0_BIT             = 16
 *         VK_IMAGE_ASPECT_PLANE_1_BIT             = 32
 *         VK_IMAGE_ASPECT_PLANE_2_BIT             = 64
 *         VK_IMAGE_ASPECT_PLANE_0_BIT_KHR         = 16
 *         VK_IMAGE_ASPECT_PLANE_1_BIT_KHR         = 32
 *         VK_IMAGE_ASPECT_PLANE_2_BIT_KHR         = 64
 *         VK_IMAGE_ASPECT_MEMORY_PLANE_0_BIT_EXT  = 128
 *         VK_IMAGE_ASPECT_MEMORY_PLANE_1_BIT_EXT  = 256
 *         VK_IMAGE_ASPECT_MEMORY_PLANE_2_BIT_EXT  = 512
 *         VK_IMAGE_ASPECT_MEMORY_PLANE_3_BIT_EXT  = 1024
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class ImageAspectFlags(val value: Int) {
	
	
	companion object {
		
		val COLOR = ImageAspectFlags(1)
		
		val DEPTH = ImageAspectFlags(2)
		
		val STENCIL = ImageAspectFlags(4)
		
		val METADATA = ImageAspectFlags(8)
		
		val PLANE_0 = ImageAspectFlags(16)
		
		val PLANE_1 = ImageAspectFlags(32)
		
		val PLANE_2 = ImageAspectFlags(64)
		
		val MEMORY_PLANE_0 = ImageAspectFlags(128)
		
		val MEMORY_PLANE_1 = ImageAspectFlags(256)
		
		val MEMORY_PLANE_2 = ImageAspectFlags(512)
		
		val MEMORY_PLANE_3 = ImageAspectFlags(1024)
	
	}
	
	
	
	operator fun plus(mask: ImageAspectFlags) = ImageAspectFlags(value or mask.value)
	
	operator fun contains(mask: ImageAspectFlags) = value and mask.value == mask.value


}