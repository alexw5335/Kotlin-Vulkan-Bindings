// This file has been automatically generated.

package kvb.vulkan

/**
 *     // provided by VK_EXT_video_encode_h265

 *     enum VkVideoEncodeH265RateControlStructureFlagBitsEXT {
 *         VK_VIDEO_ENCODE_H265_RATE_CONTROL_STRUCTURE_UNKNOWN_EXT     = 0
 *         VK_VIDEO_ENCODE_H265_RATE_CONTROL_STRUCTURE_FLAT_BIT_EXT    = 1
 *         VK_VIDEO_ENCODE_H265_RATE_CONTROL_STRUCTURE_DYADIC_BIT_EXT  = 2
 *     }
 */
@Suppress("unused")
@JvmInline
value class VideoEncodeH265RateControlStructureFlags(val value: Int) {
	
	
	companion object {
		
		val UNKNOWN = VideoEncodeH265RateControlStructureFlags(0)
		
		val FLAT = VideoEncodeH265RateControlStructureFlags(1)
		
		val DYADIC = VideoEncodeH265RateControlStructureFlags(2)
	
	}
	
	
	
	operator fun plus(mask: VideoEncodeH265RateControlStructureFlags) = VideoEncodeH265RateControlStructureFlags(value or mask.value)
	
	operator fun contains(mask: VideoEncodeH265RateControlStructureFlags) = value and mask.value == mask.value


}