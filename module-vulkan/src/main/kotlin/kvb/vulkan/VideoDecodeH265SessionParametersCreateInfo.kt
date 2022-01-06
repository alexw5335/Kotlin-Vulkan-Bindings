// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_EXT_video_decode_h265

 *     struct VkVideoDecodeH265SessionParametersCreateInfoEXT {
 *         VkStructureType                                sType
 *         void*                                          pNext (must be null)
 *         uint32_t                                       maxSpsStdCount
 *         uint32_t                                       maxPpsStdCount
 *         VkVideoDecodeH265SessionParametersAddInfoEXT*  pParametersAddInfo
 *     }
 */
@JvmInline
value class VideoDecodeH265SessionParametersCreateInfo(override val address: Long) : Addressable {
	
	
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
	
	
	
	var parametersAddInfo: VideoDecodeH265SessionParametersAddInfo
		get()      = VideoDecodeH265SessionParametersAddInfo(Unsafe.getLong(address + 24))
		set(value) { Unsafe.setLong(address + 24, value.address) }


}