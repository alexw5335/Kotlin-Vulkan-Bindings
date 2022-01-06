// This file has been automatically generated.

package kvb.vulkan

/**
 *     // provided by VK_KHR_video_decode_queue

 *     enum VkVideoDecodeFlagBitsKHR {
 *         VK_VIDEO_DECODE_DEFAULT_KHR         = 0
 *         VK_VIDEO_DECODE_RESERVED_0_BIT_KHR  = 1
 *     }
 */
@Suppress("unused")
@JvmInline
value class VideoDecodeFlags(val value: Int) {
	
	
	companion object {
		
		val DEFAULT = VideoDecodeFlags(0)
		
		val RESERVED_0 = VideoDecodeFlags(1)
	
	}
	
	
	
	operator fun plus(mask: VideoDecodeFlags) = VideoDecodeFlags(value or mask.value)
	
	operator fun contains(mask: VideoDecodeFlags) = value and mask.value == mask.value


}