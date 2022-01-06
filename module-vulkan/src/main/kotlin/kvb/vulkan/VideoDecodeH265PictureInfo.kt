// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_EXT_video_decode_h265

 *     struct VkVideoDecodeH265PictureInfoEXT {
 *         VkStructureType                 sType
 *         void*                           pNext (must be null)
 *         StdVideoDecodeH265PictureInfo*  pStdPictureInfo
 *         uint32_t                        slicesCount
 *         uint32_t*                       pSlicesDataOffsets
 *     }
 */
@JvmInline
value class VideoDecodeH265PictureInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var pStdPictureInfo: Long
		get()      = Unsafe.getLong(address + 16)
		set(value) = Unsafe.setLong(address + 16, value)
	
	var slicesCount: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var pSlicesDataOffsets: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)
	
	
	
	var slicesDataOffsets: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getLong(address + 32), slicesCount)
		set(value) { Unsafe.setLong(address + 32, value.address); slicesCount = value.capacity }


}