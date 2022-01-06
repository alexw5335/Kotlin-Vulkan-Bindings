// This file has been automatically generated.

package kvb.vulkan

/**
 *     // provided by VK_EXT_video_encode_h264

 *     enum VkVideoEncodeH264CapabilityFlagBitsEXT {
 *         VK_VIDEO_ENCODE_H264_CAPABILITY_CABAC_BIT_EXT                          = 1
 *         VK_VIDEO_ENCODE_H264_CAPABILITY_CAVLC_BIT_EXT                          = 2
 *         VK_VIDEO_ENCODE_H264_CAPABILITY_WEIGHTED_BI_PRED_IMPLICIT_BIT_EXT      = 4
 *         VK_VIDEO_ENCODE_H264_CAPABILITY_TRANSFORM_8X8_BIT_EXT                  = 8
 *         VK_VIDEO_ENCODE_H264_CAPABILITY_CHROMA_QP_OFFSET_BIT_EXT               = 16
 *         VK_VIDEO_ENCODE_H264_CAPABILITY_SECOND_CHROMA_QP_OFFSET_BIT_EXT        = 32
 *         VK_VIDEO_ENCODE_H264_CAPABILITY_DEBLOCKING_FILTER_DISABLED_BIT_EXT     = 64
 *         VK_VIDEO_ENCODE_H264_CAPABILITY_DEBLOCKING_FILTER_ENABLED_BIT_EXT      = 128
 *         VK_VIDEO_ENCODE_H264_CAPABILITY_DEBLOCKING_FILTER_PARTIAL_BIT_EXT      = 256
 *         VK_VIDEO_ENCODE_H264_CAPABILITY_MULTIPLE_SLICE_PER_FRAME_BIT_EXT       = 512
 *         VK_VIDEO_ENCODE_H264_CAPABILITY_EVENLY_DISTRIBUTED_SLICE_SIZE_BIT_EXT  = 1024
 *     }
 */
@Suppress("unused")
@JvmInline
value class VideoEncodeH264CapabilityFlags(val value: Int) {
	
	
	companion object {
		
		val CABAC = VideoEncodeH264CapabilityFlags(1)
		
		val CAVLC = VideoEncodeH264CapabilityFlags(2)
		
		val WEIGHTED_BI_PRED_IMPLICIT = VideoEncodeH264CapabilityFlags(4)
		
		val TRANSFORM_8X8 = VideoEncodeH264CapabilityFlags(8)
		
		val CHROMA_QP_OFFSET = VideoEncodeH264CapabilityFlags(16)
		
		val SECOND_CHROMA_QP_OFFSET = VideoEncodeH264CapabilityFlags(32)
		
		val DEBLOCKING_FILTER_DISABLED = VideoEncodeH264CapabilityFlags(64)
		
		val DEBLOCKING_FILTER_ENABLED = VideoEncodeH264CapabilityFlags(128)
		
		val DEBLOCKING_FILTER_PARTIAL = VideoEncodeH264CapabilityFlags(256)
		
		val MULTIPLE_SLICE_PER_FRAME = VideoEncodeH264CapabilityFlags(512)
		
		val EVENLY_DISTRIBUTED_SLICE_SIZE = VideoEncodeH264CapabilityFlags(1024)
	
	}
	
	
	
	operator fun plus(mask: VideoEncodeH264CapabilityFlags) = VideoEncodeH264CapabilityFlags(value or mask.value)
	
	operator fun contains(mask: VideoEncodeH264CapabilityFlags) = value and mask.value == mask.value


}