// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_EXT_video_decode_h264

 *     struct VkVideoDecodeH264ProfileEXT {
 *         VkStructureType                         sType
 *         void*                                   pNext (must be null)
 *         StdVideoH264ProfileIdc                  stdProfileIdc
 *         VkVideoDecodeH264PictureLayoutFlagsEXT  pictureLayout
 *     }
 */
@JvmInline
value class VideoDecodeH264Profile(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var stdProfileIdc: Long
		get()      = Unsafe.getLong(address + 16)
		set(value) = Unsafe.setLong(address + 16, value)
	
	var pictureLayout: VideoDecodeH264PictureLayoutFlags
		get()      = VideoDecodeH264PictureLayoutFlags(Unsafe.getInt(address + 24))
		set(value) = Unsafe.setInt(address + 24, value.value)


}