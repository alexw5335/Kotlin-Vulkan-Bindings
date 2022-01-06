// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_KHR_video_encode_queue

 *     struct VkVideoEncodeRateControlInfoKHR {
 *         VkStructureType                          sType
 *         void*                                    pNext
 *         VkVideoEncodeRateControlFlagsKHR         flags
 *         VkVideoEncodeRateControlModeFlagBitsKHR  rateControlMode
 *         uint8_t                                  layerCount
 *         VkVideoEncodeRateControlLayerInfoKHR*    pLayerConfigs
 *     }
 * 
 *     Valid pNext types:
 *         - VkVideoEncodeH264RateControlInfoEXT
 *         - VkVideoEncodeH265RateControlInfoEXT
 */
@JvmInline
value class VideoEncodeRateControlInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: VideoEncodeRateControlFlags
		get()      = VideoEncodeRateControlFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var rateControlMode: VideoEncodeRateControlModeFlags
		get()      = VideoEncodeRateControlModeFlags(Unsafe.getInt(address + 20))
		set(value) = Unsafe.setInt(address + 20, value.value)
	
	var layerCount: Byte
		get()      = Unsafe.getByte(address + 24)
		set(value) = Unsafe.setByte(address + 24, value)
	
	var pLayerConfigs: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)
	
	
	
	var layerConfigs: VideoEncodeRateControlLayerInfo.Buffer
		get()      = VideoEncodeRateControlLayerInfo.Buffer(Unsafe.getLong(address + 32), layerCount.toInt())
		set(value) { Unsafe.setLong(address + 32, value.address); layerCount = value.capacity.toByte() }


}