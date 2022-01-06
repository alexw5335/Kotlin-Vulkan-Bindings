// This file has been automatically generated.

package kvb.vulkan

/**
 *     // provided by VK_KHR_video_queue

 *     enum VkVideoCodingQualityPresetFlagBitsKHR {
 *         VK_VIDEO_CODING_QUALITY_PRESET_NORMAL_BIT_KHR   = 1
 *         VK_VIDEO_CODING_QUALITY_PRESET_POWER_BIT_KHR    = 2
 *         VK_VIDEO_CODING_QUALITY_PRESET_QUALITY_BIT_KHR  = 4
 *     }
 */
@Suppress("unused")
@JvmInline
value class VideoCodingQualityPresetFlags(val value: Int) {
	
	
	companion object {
		
		val NORMAL = VideoCodingQualityPresetFlags(1)
		
		val POWER = VideoCodingQualityPresetFlags(2)
		
		val QUALITY = VideoCodingQualityPresetFlags(4)
	
	}
	
	
	
	operator fun plus(mask: VideoCodingQualityPresetFlags) = VideoCodingQualityPresetFlags(value or mask.value)
	
	operator fun contains(mask: VideoCodingQualityPresetFlags) = value and mask.value == mask.value


}