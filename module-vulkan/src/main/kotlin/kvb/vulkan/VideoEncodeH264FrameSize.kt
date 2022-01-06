// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_EXT_video_encode_h264

 *     struct VkVideoEncodeH264FrameSizeEXT {
 *         uint32_t  frameISize
 *         uint32_t  framePSize
 *         uint32_t  frameBSize
 *     }
 */
@JvmInline
value class VideoEncodeH264FrameSize(override val address: Long) : Addressable {
	
	
	var frameISize: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var framePSize: Int
		get()      = Unsafe.getInt(address + 4)
		set(value) = Unsafe.setInt(address + 4, value)
	
	var frameBSize: Int
		get()      = Unsafe.getInt(address + 8)
		set(value) = Unsafe.setInt(address + 8, value)


}