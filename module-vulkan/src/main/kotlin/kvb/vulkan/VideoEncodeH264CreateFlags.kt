// This file has been automatically generated.

package kvb.vulkan

/**
 *     // provided by VK_EXT_video_encode_h264

 *     enum VkVideoEncodeH264CreateFlagBitsEXT {
 *         VK_VIDEO_ENCODE_H264_CREATE_DEFAULT_EXT         = 0
 *         VK_VIDEO_ENCODE_H264_CREATE_RESERVED_0_BIT_EXT  = 1
 *     }
 */
@Suppress("unused")
@JvmInline
value class VideoEncodeH264CreateFlags(val value: Int) {
	
	
	companion object {
		
		val DEFAULT = VideoEncodeH264CreateFlags(0)
		
		val RESERVED_0 = VideoEncodeH264CreateFlags(1)
	
	}
	
	
	
	operator fun plus(mask: VideoEncodeH264CreateFlags) = VideoEncodeH264CreateFlags(value or mask.value)
	
	operator fun contains(mask: VideoEncodeH264CreateFlags) = value and mask.value == mask.value


}