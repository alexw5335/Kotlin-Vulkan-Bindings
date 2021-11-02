// This file has been automatically generated.

package kvb.vulkan

/**
 *     enum VkDisplayPlaneAlphaFlagBitsKHR {
 *         VK_DISPLAY_PLANE_ALPHA_OPAQUE_BIT_KHR                   = 1
 *         VK_DISPLAY_PLANE_ALPHA_GLOBAL_BIT_KHR                   = 2
 *         VK_DISPLAY_PLANE_ALPHA_PER_PIXEL_BIT_KHR                = 4
 *         VK_DISPLAY_PLANE_ALPHA_PER_PIXEL_PREMULTIPLIED_BIT_KHR  = 8
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class DisplayPlaneAlphaFlags(val value: Int) {
	
	
	companion object {
		
		val OPAQUE = DisplayPlaneAlphaFlags(1)
		
		val GLOBAL = DisplayPlaneAlphaFlags(2)
		
		val PER_PIXEL = DisplayPlaneAlphaFlags(4)
		
		val PER_PIXEL_PREMULTIPLIED = DisplayPlaneAlphaFlags(8)
	
	}
	
	
	
	operator fun plus(mask: DisplayPlaneAlphaFlags) = DisplayPlaneAlphaFlags(value or mask.value)
	
	operator fun contains(mask: DisplayPlaneAlphaFlags) = value and mask.value == mask.value


}