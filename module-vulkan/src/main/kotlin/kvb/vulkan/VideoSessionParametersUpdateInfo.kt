// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_KHR_video_queue

 *     struct VkVideoSessionParametersUpdateInfoKHR {
 *         VkStructureType  sType
 *         void*            pNext
 *         uint32_t         updateSequenceCount
 *     }
 * 
 *     Valid pNext types:
 *         - VkVideoDecodeH264SessionParametersAddInfoEXT
 *         - VkVideoDecodeH265SessionParametersAddInfoEXT
 *         - VkVideoEncodeH264SessionParametersAddInfoEXT
 *         - VkVideoEncodeH265SessionParametersAddInfoEXT
 */
@JvmInline
value class VideoSessionParametersUpdateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var updateSequenceCount: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)


}