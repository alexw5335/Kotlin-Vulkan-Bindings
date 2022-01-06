// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_EXT_video_encode_h265

 *     struct VkVideoEncodeH265RateControlInfoEXT {
 *         VkStructureType                                   sType
 *         void*                                             pNext (must be null)
 *         uint32_t                                          gopFrameCount
 *         uint32_t                                          idrPeriod
 *         uint32_t                                          consecutiveBFrameCount
 *         VkVideoEncodeH265RateControlStructureFlagBitsEXT  rateControlStructure
 *         uint8_t                                           subLayerCount
 *     }
 */
@JvmInline
value class VideoEncodeH265RateControlInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var gopFrameCount: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var idrPeriod: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var consecutiveBFrameCount: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var rateControlStructure: VideoEncodeH265RateControlStructureFlags
		get()      = VideoEncodeH265RateControlStructureFlags(Unsafe.getInt(address + 28))
		set(value) = Unsafe.setInt(address + 28, value.value)
	
	var subLayerCount: Byte
		get()      = Unsafe.getByte(address + 32)
		set(value) = Unsafe.setByte(address + 32, value)


}