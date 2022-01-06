// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_EXT_video_encode_h265

 *     struct VkVideoEncodeH265RateControlLayerInfoEXT {
 *         VkStructureType                sType
 *         void*                          pNext (must be null)
 *         uint8_t                        temporalId
 *         VkBool32                       useInitialRcQp
 *         VkVideoEncodeH265QpEXT         initialRcQp
 *         VkBool32                       useMinQp
 *         VkVideoEncodeH265QpEXT         minQp
 *         VkBool32                       useMaxQp
 *         VkVideoEncodeH265QpEXT         maxQp
 *         VkBool32                       useMaxFrameSize
 *         VkVideoEncodeH265FrameSizeEXT  maxFrameSize
 *     }
 */
@JvmInline
value class VideoEncodeH265RateControlLayerInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var temporalId: Byte
		get()      = Unsafe.getByte(address + 16)
		set(value) = Unsafe.setByte(address + 16, value)
	
	var useInitialRcQp: Int
		get()      = Unsafe.getInt(address + 17)
		set(value) = Unsafe.setInt(address + 17, value)
	
	var initialRcQp: VideoEncodeH265Qp
		get()      = VideoEncodeH265Qp(address + 24)
		set(value) = Unsafe.copy(value.address, address + 24, 12)
	
	var useMinQp: Int
		get()      = Unsafe.getInt(address + 36)
		set(value) = Unsafe.setInt(address + 36, value)
	
	var minQp: VideoEncodeH265Qp
		get()      = VideoEncodeH265Qp(address + 40)
		set(value) = Unsafe.copy(value.address, address + 40, 12)
	
	var useMaxQp: Int
		get()      = Unsafe.getInt(address + 52)
		set(value) = Unsafe.setInt(address + 52, value)
	
	var maxQp: VideoEncodeH265Qp
		get()      = VideoEncodeH265Qp(address + 56)
		set(value) = Unsafe.copy(value.address, address + 56, 12)
	
	var useMaxFrameSize: Int
		get()      = Unsafe.getInt(address + 68)
		set(value) = Unsafe.setInt(address + 68, value)
	
	var maxFrameSize: VideoEncodeH265FrameSize
		get()      = VideoEncodeH265FrameSize(address + 72)
		set(value) = Unsafe.copy(value.address, address + 72, 12)


}