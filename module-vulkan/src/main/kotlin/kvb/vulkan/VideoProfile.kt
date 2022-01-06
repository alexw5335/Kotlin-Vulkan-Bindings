// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_KHR_video_queue

 *     struct VkVideoProfileKHR {
 *         VkStructureType                   sType
 *         void*                             pNext
 *         VkVideoCodecOperationFlagBitsKHR  videoCodecOperation
 *         VkVideoChromaSubsamplingFlagsKHR  chromaSubsampling
 *         VkVideoComponentBitDepthFlagsKHR  lumaBitDepth
 *         VkVideoComponentBitDepthFlagsKHR  chromaBitDepth
 *     }
 * 
 *     Valid pNext types:
 *         - VkVideoDecodeH264ProfileEXT
 *         - VkVideoDecodeH265ProfileEXT
 *         - VkVideoEncodeH264ProfileEXT
 *         - VkVideoEncodeH265ProfileEXT
 */
@JvmInline
value class VideoProfile(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var videoCodecOperation: VideoCodecOperationFlags
		get()      = VideoCodecOperationFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var chromaSubsampling: VideoChromaSubsamplingFlags
		get()      = VideoChromaSubsamplingFlags(Unsafe.getInt(address + 20))
		set(value) = Unsafe.setInt(address + 20, value.value)
	
	var lumaBitDepth: VideoComponentBitDepthFlags
		get()      = VideoComponentBitDepthFlags(Unsafe.getInt(address + 24))
		set(value) = Unsafe.setInt(address + 24, value.value)
	
	var chromaBitDepth: VideoComponentBitDepthFlags
		get()      = VideoComponentBitDepthFlags(Unsafe.getInt(address + 28))
		set(value) = Unsafe.setInt(address + 28, value.value)


}