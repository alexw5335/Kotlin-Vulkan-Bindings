// This file has been automatically generated.

package kvb.vulkan

/**
 *     // provided by VK_EXT_video_encode_h265

 *     enum VkVideoEncodeH265CtbSizeFlagBitsEXT {
 *         VK_VIDEO_ENCODE_H265_CTB_SIZE_8_BIT_EXT   = 1
 *         VK_VIDEO_ENCODE_H265_CTB_SIZE_16_BIT_EXT  = 2
 *         VK_VIDEO_ENCODE_H265_CTB_SIZE_32_BIT_EXT  = 4
 *         VK_VIDEO_ENCODE_H265_CTB_SIZE_64_BIT_EXT  = 8
 *     }
 */
@Suppress("unused")
@JvmInline
value class VideoEncodeH265CtbSizeFlags(val value: Int) {
	
	
	companion object {
		
		val _8 = VideoEncodeH265CtbSizeFlags(1)
		
		val _16 = VideoEncodeH265CtbSizeFlags(2)
		
		val _32 = VideoEncodeH265CtbSizeFlags(4)
		
		val _64 = VideoEncodeH265CtbSizeFlags(8)
	
	}
	
	
	
	operator fun plus(mask: VideoEncodeH265CtbSizeFlags) = VideoEncodeH265CtbSizeFlags(value or mask.value)
	
	operator fun contains(mask: VideoEncodeH265CtbSizeFlags) = value and mask.value == mask.value


}