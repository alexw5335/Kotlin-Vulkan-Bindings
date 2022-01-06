// This file has been automatically generated.

package kvb.vulkan

/**
 *     // provided by VK_KHR_video_queue

 *     enum VkVideoComponentBitDepthFlagBitsKHR {
 *         VK_VIDEO_COMPONENT_BIT_DEPTH_INVALID_KHR  = 0
 *         VK_VIDEO_COMPONENT_BIT_DEPTH_8_BIT_KHR    = 1
 *         VK_VIDEO_COMPONENT_BIT_DEPTH_10_BIT_KHR   = 4
 *         VK_VIDEO_COMPONENT_BIT_DEPTH_12_BIT_KHR   = 16
 *     }
 */
@Suppress("unused")
@JvmInline
value class VideoComponentBitDepthFlags(val value: Int) {
	
	
	companion object {
		
		val INVALID = VideoComponentBitDepthFlags(0)
		
		val _8 = VideoComponentBitDepthFlags(1)
		
		val _10 = VideoComponentBitDepthFlags(4)
		
		val _12 = VideoComponentBitDepthFlags(16)
	
	}
	
	
	
	operator fun plus(mask: VideoComponentBitDepthFlags) = VideoComponentBitDepthFlags(value or mask.value)
	
	operator fun contains(mask: VideoComponentBitDepthFlags) = value and mask.value == mask.value


}