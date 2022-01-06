// This file has been automatically generated.

package kvb.vulkan

/**
 *     // provided by VK_KHR_video_encode_queue

 *     enum VkVideoEncodeRateControlModeFlagBitsKHR {
 *         VK_VIDEO_ENCODE_RATE_CONTROL_MODE_NONE_BIT_KHR  = 0
 *         VK_VIDEO_ENCODE_RATE_CONTROL_MODE_CBR_BIT_KHR   = 1
 *         VK_VIDEO_ENCODE_RATE_CONTROL_MODE_VBR_BIT_KHR   = 2
 *     }
 */
@Suppress("unused")
@JvmInline
value class VideoEncodeRateControlModeFlags(val value: Int) {
	
	
	companion object {
		
		val NONE = VideoEncodeRateControlModeFlags(0)
		
		val CBR = VideoEncodeRateControlModeFlags(1)
		
		val VBR = VideoEncodeRateControlModeFlags(2)
	
	}
	
	
	
	operator fun plus(mask: VideoEncodeRateControlModeFlags) = VideoEncodeRateControlModeFlags(value or mask.value)
	
	operator fun contains(mask: VideoEncodeRateControlModeFlags) = value and mask.value == mask.value


}