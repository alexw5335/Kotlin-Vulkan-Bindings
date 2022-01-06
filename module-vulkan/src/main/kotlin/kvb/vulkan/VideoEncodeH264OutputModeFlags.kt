// This file has been automatically generated.

package kvb.vulkan

/**
 *     // provided by VK_EXT_video_encode_h264

 *     enum VkVideoEncodeH264OutputModeFlagBitsEXT {
 *         VK_VIDEO_ENCODE_H264_OUTPUT_MODE_FRAME_BIT_EXT    = 1
 *         VK_VIDEO_ENCODE_H264_OUTPUT_MODE_SLICE_BIT_EXT    = 2
 *         VK_VIDEO_ENCODE_H264_OUTPUT_MODE_NON_VCL_BIT_EXT  = 4
 *     }
 */
@Suppress("unused")
@JvmInline
value class VideoEncodeH264OutputModeFlags(val value: Int) {
	
	
	companion object {
		
		val FRAME = VideoEncodeH264OutputModeFlags(1)
		
		val SLICE = VideoEncodeH264OutputModeFlags(2)
		
		val NON_VCL = VideoEncodeH264OutputModeFlags(4)
	
	}
	
	
	
	operator fun plus(mask: VideoEncodeH264OutputModeFlags) = VideoEncodeH264OutputModeFlags(value or mask.value)
	
	operator fun contains(mask: VideoEncodeH264OutputModeFlags) = value and mask.value == mask.value


}