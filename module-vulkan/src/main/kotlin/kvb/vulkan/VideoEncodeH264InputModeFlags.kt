// This file has been automatically generated.

package kvb.vulkan

/**
 *     // provided by VK_EXT_video_encode_h264

 *     enum VkVideoEncodeH264InputModeFlagBitsEXT {
 *         VK_VIDEO_ENCODE_H264_INPUT_MODE_FRAME_BIT_EXT    = 1
 *         VK_VIDEO_ENCODE_H264_INPUT_MODE_SLICE_BIT_EXT    = 2
 *         VK_VIDEO_ENCODE_H264_INPUT_MODE_NON_VCL_BIT_EXT  = 4
 *     }
 */
@Suppress("unused")
@JvmInline
value class VideoEncodeH264InputModeFlags(val value: Int) {
	
	
	companion object {
		
		val FRAME = VideoEncodeH264InputModeFlags(1)
		
		val SLICE = VideoEncodeH264InputModeFlags(2)
		
		val NON_VCL = VideoEncodeH264InputModeFlags(4)
	
	}
	
	
	
	operator fun plus(mask: VideoEncodeH264InputModeFlags) = VideoEncodeH264InputModeFlags(value or mask.value)
	
	operator fun contains(mask: VideoEncodeH264InputModeFlags) = value and mask.value == mask.value


}