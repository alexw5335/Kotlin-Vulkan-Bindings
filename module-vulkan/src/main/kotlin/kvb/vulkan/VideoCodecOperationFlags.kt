// This file has been automatically generated.

package kvb.vulkan

/**
 *     // provided by VK_KHR_video_queue

 *     enum VkVideoCodecOperationFlagBitsKHR {
 *         VK_VIDEO_CODEC_OPERATION_INVALID_BIT_KHR      = 0
 *         VK_VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_EXT  = 65536
 *         VK_VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_EXT  = 131072
 *         VK_VIDEO_CODEC_OPERATION_DECODE_H264_BIT_EXT  = 1
 *         VK_VIDEO_CODEC_OPERATION_DECODE_H265_BIT_EXT  = 2
 *     }
 */
@Suppress("unused")
@JvmInline
value class VideoCodecOperationFlags(val value: Int) {
	
	
	companion object {
		
		val INVALID = VideoCodecOperationFlags(0)
		
		val ENCODE_H264 = VideoCodecOperationFlags(65536)
		
		val ENCODE_H265 = VideoCodecOperationFlags(131072)
		
		val DECODE_H264 = VideoCodecOperationFlags(1)
		
		val DECODE_H265 = VideoCodecOperationFlags(2)
	
	}
	
	
	
	operator fun plus(mask: VideoCodecOperationFlags) = VideoCodecOperationFlags(value or mask.value)
	
	operator fun contains(mask: VideoCodecOperationFlags) = value and mask.value == mask.value


}