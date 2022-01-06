// This file has been automatically generated.

package kvb.vulkan

/**
 *     // provided by VK_EXT_video_encode_h264

 *     enum VkVideoEncodeH264RateControlStructureFlagBitsEXT {
 *         VK_VIDEO_ENCODE_H264_RATE_CONTROL_STRUCTURE_UNKNOWN_EXT     = 0
 *         VK_VIDEO_ENCODE_H264_RATE_CONTROL_STRUCTURE_FLAT_BIT_EXT    = 1
 *         VK_VIDEO_ENCODE_H264_RATE_CONTROL_STRUCTURE_DYADIC_BIT_EXT  = 2
 *     }
 */
@Suppress("unused")
@JvmInline
value class VideoEncodeH264RateControlStructureFlags(val value: Int) {
	
	
	companion object {
		
		val UNKNOWN = VideoEncodeH264RateControlStructureFlags(0)
		
		val FLAT = VideoEncodeH264RateControlStructureFlags(1)
		
		val DYADIC = VideoEncodeH264RateControlStructureFlags(2)
	
	}
	
	
	
	operator fun plus(mask: VideoEncodeH264RateControlStructureFlags) = VideoEncodeH264RateControlStructureFlags(value or mask.value)
	
	operator fun contains(mask: VideoEncodeH264RateControlStructureFlags) = value and mask.value == mask.value


}