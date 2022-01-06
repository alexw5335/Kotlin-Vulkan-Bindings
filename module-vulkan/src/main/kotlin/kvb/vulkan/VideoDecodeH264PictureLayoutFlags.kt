// This file has been automatically generated.

package kvb.vulkan

/**
 *     // provided by VK_EXT_video_decode_h264

 *     enum VkVideoDecodeH264PictureLayoutFlagBitsEXT {
 *         VK_VIDEO_DECODE_H264_PICTURE_LAYOUT_PROGRESSIVE_EXT                       = 0
 *         VK_VIDEO_DECODE_H264_PICTURE_LAYOUT_INTERLACED_INTERLEAVED_LINES_BIT_EXT  = 1
 *         VK_VIDEO_DECODE_H264_PICTURE_LAYOUT_INTERLACED_SEPARATE_PLANES_BIT_EXT    = 2
 *     }
 */
@Suppress("unused")
@JvmInline
value class VideoDecodeH264PictureLayoutFlags(val value: Int) {
	
	
	companion object {
		
		val PROGRESSIVE = VideoDecodeH264PictureLayoutFlags(0)
		
		val INTERLACED_INTERLEAVED_LINES = VideoDecodeH264PictureLayoutFlags(1)
		
		val INTERLACED_SEPARATE_PLANES = VideoDecodeH264PictureLayoutFlags(2)
	
	}
	
	
	
	operator fun plus(mask: VideoDecodeH264PictureLayoutFlags) = VideoDecodeH264PictureLayoutFlags(value or mask.value)
	
	operator fun contains(mask: VideoDecodeH264PictureLayoutFlags) = value and mask.value == mask.value


}