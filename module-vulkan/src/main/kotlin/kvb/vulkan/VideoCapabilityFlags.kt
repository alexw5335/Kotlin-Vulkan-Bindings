// This file has been automatically generated.

package kvb.vulkan

/**
 *     // provided by VK_KHR_video_queue

 *     enum VkVideoCapabilityFlagBitsKHR {
 *         VK_VIDEO_CAPABILITY_PROTECTED_CONTENT_BIT_KHR          = 1
 *         VK_VIDEO_CAPABILITY_SEPARATE_REFERENCE_IMAGES_BIT_KHR  = 2
 *     }
 */
@Suppress("unused")
@JvmInline
value class VideoCapabilityFlags(val value: Int) {
	
	
	companion object {
		
		val PROTECTED_CONTENT = VideoCapabilityFlags(1)
		
		val SEPARATE_REFERENCE_IMAGES = VideoCapabilityFlags(2)
	
	}
	
	
	
	operator fun plus(mask: VideoCapabilityFlags) = VideoCapabilityFlags(value or mask.value)
	
	operator fun contains(mask: VideoCapabilityFlags) = value and mask.value == mask.value


}