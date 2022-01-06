// This file has been automatically generated.

package kvb.vulkan

/**
 *     // provided by VK_EXT_video_encode_h265

 *     enum VkVideoEncodeH265InputModeFlagBitsEXT {
 *         VK_VIDEO_ENCODE_H265_INPUT_MODE_FRAME_BIT_EXT    = 1
 *         VK_VIDEO_ENCODE_H265_INPUT_MODE_SLICE_BIT_EXT    = 2
 *         VK_VIDEO_ENCODE_H265_INPUT_MODE_NON_VCL_BIT_EXT  = 4
 *     }
 */
@Suppress("unused")
@JvmInline
value class VideoEncodeH265InputModeFlags(val value: Int) {
	
	
	companion object {
		
		val FRAME = VideoEncodeH265InputModeFlags(1)
		
		val SLICE = VideoEncodeH265InputModeFlags(2)
		
		val NON_VCL = VideoEncodeH265InputModeFlags(4)
	
	}
	
	
	
	operator fun plus(mask: VideoEncodeH265InputModeFlags) = VideoEncodeH265InputModeFlags(value or mask.value)
	
	operator fun contains(mask: VideoEncodeH265InputModeFlags) = value and mask.value == mask.value


}