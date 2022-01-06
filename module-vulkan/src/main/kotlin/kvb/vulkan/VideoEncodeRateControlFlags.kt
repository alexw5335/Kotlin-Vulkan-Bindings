// This file has been automatically generated.

package kvb.vulkan

/**
 *     // provided by VK_KHR_video_encode_queue

 *     enum VkVideoEncodeRateControlFlagBitsKHR {
 *         VK_VIDEO_ENCODE_RATE_CONTROL_DEFAULT_KHR         = 0
 *         VK_VIDEO_ENCODE_RATE_CONTROL_RESERVED_0_BIT_KHR  = 1
 *     }
 */
@Suppress("unused")
@JvmInline
value class VideoEncodeRateControlFlags(val value: Int) {
	
	
	companion object {
		
		val DEFAULT = VideoEncodeRateControlFlags(0)
		
		val RESERVED_0 = VideoEncodeRateControlFlags(1)
	
	}
	
	
	
	operator fun plus(mask: VideoEncodeRateControlFlags) = VideoEncodeRateControlFlags(value or mask.value)
	
	operator fun contains(mask: VideoEncodeRateControlFlags) = value and mask.value == mask.value


}