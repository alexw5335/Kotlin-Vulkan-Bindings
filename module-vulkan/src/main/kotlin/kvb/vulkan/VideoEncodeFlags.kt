// This file has been automatically generated.

package kvb.vulkan

/**
 *     // provided by VK_KHR_video_encode_queue

 *     enum VkVideoEncodeFlagBitsKHR {
 *         VK_VIDEO_ENCODE_DEFAULT_KHR         = 0
 *         VK_VIDEO_ENCODE_RESERVED_0_BIT_KHR  = 1
 *     }
 */
@Suppress("unused")
@JvmInline
value class VideoEncodeFlags(val value: Int) {
	
	
	companion object {
		
		val DEFAULT = VideoEncodeFlags(0)
		
		val RESERVED_0 = VideoEncodeFlags(1)
	
	}
	
	
	
	operator fun plus(mask: VideoEncodeFlags) = VideoEncodeFlags(value or mask.value)
	
	operator fun contains(mask: VideoEncodeFlags) = value and mask.value == mask.value


}