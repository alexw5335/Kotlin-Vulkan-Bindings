// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_KHR_video_queue

 *     struct VkVideoSessionParametersCreateInfoKHR {
 *         VkStructureType              sType
 *         void*                        pNext
 *         VkVideoSessionParametersKHR  videoSessionParametersTemplate
 *         VkVideoSessionKHR            videoSession
 *     }
 * 
 *     Valid pNext types:
 *         - VkVideoDecodeH264SessionParametersCreateInfoEXT
 *         - VkVideoDecodeH265SessionParametersCreateInfoEXT
 *         - VkVideoEncodeH264SessionParametersCreateInfoEXT
 *         - VkVideoEncodeH265SessionParametersCreateInfoEXT
 */
@JvmInline
value class VideoSessionParametersCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var videoSessionParametersTemplate: VideoSessionParametersH
		get()      = VideoSessionParametersH(Unsafe.getLong(address + 16))
		set(value) = Unsafe.setLong(address + 16, value.address)
	
	var videoSession: VideoSessionH
		get()      = VideoSessionH(Unsafe.getLong(address + 24))
		set(value) = Unsafe.setLong(address + 24, value.address)


}