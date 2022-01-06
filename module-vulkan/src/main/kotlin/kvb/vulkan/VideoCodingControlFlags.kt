// This file has been automatically generated.

package kvb.vulkan

/**
 *     // provided by VK_KHR_video_queue

 *     enum VkVideoCodingControlFlagBitsKHR {
 *         VK_VIDEO_CODING_CONTROL_DEFAULT_KHR    = 0
 *         VK_VIDEO_CODING_CONTROL_RESET_BIT_KHR  = 1
 *     }
 */
@Suppress("unused")
@JvmInline
value class VideoCodingControlFlags(val value: Int) {
	
	
	companion object {
		
		val DEFAULT = VideoCodingControlFlags(0)
		
		val RESET = VideoCodingControlFlags(1)
	
	}
	
	
	
	operator fun plus(mask: VideoCodingControlFlags) = VideoCodingControlFlags(value or mask.value)
	
	operator fun contains(mask: VideoCodingControlFlags) = value and mask.value == mask.value


}