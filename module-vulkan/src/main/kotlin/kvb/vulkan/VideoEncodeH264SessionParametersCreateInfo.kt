// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_EXT_video_encode_h264

 *     struct VkVideoEncodeH264SessionParametersCreateInfoEXT {
 *         VkStructureType                                sType
 *         void*                                          pNext (must be null)
 *         uint32_t                                       maxSpsStdCount
 *         uint32_t                                       maxPpsStdCount
 *         VkVideoEncodeH264SessionParametersAddInfoEXT*  pParametersAddInfo
 *     }
 */
@JvmInline
value class VideoEncodeH264SessionParametersCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var maxSpsStdCount: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var maxPpsStdCount: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var pParametersAddInfo: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	
	
	var parametersAddInfo: VideoEncodeH264SessionParametersAddInfo
		get()      = VideoEncodeH264SessionParametersAddInfo(Unsafe.getLong(address + 24))
		set(value) { Unsafe.setLong(address + 24, value.address) }


}