// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_KHR_video_queue

 *     struct VkVideoBeginCodingInfoKHR {
 *         VkStructureType                     sType
 *         void*                               pNext (must be null)
 *         VkVideoBeginCodingFlagsKHR          flags (reserved, must be zero)
 *         VkVideoCodingQualityPresetFlagsKHR  codecQualityPreset
 *         VkVideoSessionKHR                   videoSession
 *         VkVideoSessionParametersKHR         videoSessionParameters
 *         uint32_t                            referenceSlotCount
 *         VkVideoReferenceSlotKHR*            pReferenceSlots
 *     }
 */
@JvmInline
value class VideoBeginCodingInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: Int
		get() = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var codecQualityPreset: VideoCodingQualityPresetFlags
		get()      = VideoCodingQualityPresetFlags(Unsafe.getInt(address + 20))
		set(value) = Unsafe.setInt(address + 20, value.value)
	
	var videoSession: VideoSessionH
		get()      = VideoSessionH(Unsafe.getLong(address + 24))
		set(value) = Unsafe.setLong(address + 24, value.address)
	
	var videoSessionParameters: VideoSessionParametersH
		get()      = VideoSessionParametersH(Unsafe.getLong(address + 32))
		set(value) = Unsafe.setLong(address + 32, value.address)
	
	var referenceSlotCount: Int
		get()      = Unsafe.getInt(address + 40)
		set(value) = Unsafe.setInt(address + 40, value)
	
	var pReferenceSlots: Long
		get()      = Unsafe.getLong(address + 48)
		set(value) = Unsafe.setLong(address + 48, value)
	
	
	
	var referenceSlots: VideoReferenceSlot.Buffer
		get()      = VideoReferenceSlot.Buffer(Unsafe.getLong(address + 48), referenceSlotCount)
		set(value) { Unsafe.setLong(address + 48, value.address); referenceSlotCount = value.capacity }


}