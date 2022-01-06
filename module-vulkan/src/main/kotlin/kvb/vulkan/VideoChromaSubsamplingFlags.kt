// This file has been automatically generated.

package kvb.vulkan

/**
 *     // provided by VK_KHR_video_queue

 *     enum VkVideoChromaSubsamplingFlagBitsKHR {
 *         VK_VIDEO_CHROMA_SUBSAMPLING_INVALID_BIT_KHR     = 0
 *         VK_VIDEO_CHROMA_SUBSAMPLING_MONOCHROME_BIT_KHR  = 1
 *         VK_VIDEO_CHROMA_SUBSAMPLING_420_BIT_KHR         = 2
 *         VK_VIDEO_CHROMA_SUBSAMPLING_422_BIT_KHR         = 4
 *         VK_VIDEO_CHROMA_SUBSAMPLING_444_BIT_KHR         = 8
 *     }
 */
@Suppress("unused")
@JvmInline
value class VideoChromaSubsamplingFlags(val value: Int) {
	
	
	companion object {
		
		val INVALID = VideoChromaSubsamplingFlags(0)
		
		val MONOCHROME = VideoChromaSubsamplingFlags(1)
		
		val _420 = VideoChromaSubsamplingFlags(2)
		
		val _422 = VideoChromaSubsamplingFlags(4)
		
		val _444 = VideoChromaSubsamplingFlags(8)
	
	}
	
	
	
	operator fun plus(mask: VideoChromaSubsamplingFlags) = VideoChromaSubsamplingFlags(value or mask.value)
	
	operator fun contains(mask: VideoChromaSubsamplingFlags) = value and mask.value == mask.value


}