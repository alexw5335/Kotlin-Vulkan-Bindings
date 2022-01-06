// This file has been automatically generated.

package kvb.vulkan

/**
 *     // provided by VK_KHR_video_queue

 *     enum VkVideoSessionCreateFlagBitsKHR {
 *         VK_VIDEO_SESSION_CREATE_DEFAULT_KHR                = 0
 *         VK_VIDEO_SESSION_CREATE_PROTECTED_CONTENT_BIT_KHR  = 1
 *     }
 */
@Suppress("unused")
@JvmInline
value class VideoSessionCreateFlags(val value: Int) {
	
	
	companion object {
		
		val DEFAULT = VideoSessionCreateFlags(0)
		
		val PROTECTED_CONTENT = VideoSessionCreateFlags(1)
	
	}
	
	
	
	operator fun plus(mask: VideoSessionCreateFlags) = VideoSessionCreateFlags(value or mask.value)
	
	operator fun contains(mask: VideoSessionCreateFlags) = value and mask.value == mask.value


}