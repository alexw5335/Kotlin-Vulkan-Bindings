// This file has been automatically generated.

package kvb.vulkan

/**
 *     // provided by VK_EXT_video_encode_h265

 *     enum VkVideoEncodeH265OutputModeFlagBitsEXT {
 *         VK_VIDEO_ENCODE_H265_OUTPUT_MODE_FRAME_BIT_EXT    = 1
 *         VK_VIDEO_ENCODE_H265_OUTPUT_MODE_SLICE_BIT_EXT    = 2
 *         VK_VIDEO_ENCODE_H265_OUTPUT_MODE_NON_VCL_BIT_EXT  = 4
 *     }
 */
@Suppress("unused")
@JvmInline
value class VideoEncodeH265OutputModeFlags(val value: Int) {
	
	
	companion object {
		
		val FRAME = VideoEncodeH265OutputModeFlags(1)
		
		val SLICE = VideoEncodeH265OutputModeFlags(2)
		
		val NON_VCL = VideoEncodeH265OutputModeFlags(4)
	
	}
	
	
	
	operator fun plus(mask: VideoEncodeH265OutputModeFlags) = VideoEncodeH265OutputModeFlags(value or mask.value)
	
	operator fun contains(mask: VideoEncodeH265OutputModeFlags) = value and mask.value == mask.value


}