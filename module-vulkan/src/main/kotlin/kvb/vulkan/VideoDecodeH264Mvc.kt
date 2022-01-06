// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_EXT_video_decode_h264

 *     struct VkVideoDecodeH264MvcEXT {
 *         VkStructureType         sType
 *         void*                   pNext (must be null)
 *         StdVideoDecodeH264Mvc*  pStdMvc
 *     }
 */
@JvmInline
value class VideoDecodeH264Mvc(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var pStdMvc: Long
		get()      = Unsafe.getLong(address + 16)
		set(value) = Unsafe.setLong(address + 16, value)


}