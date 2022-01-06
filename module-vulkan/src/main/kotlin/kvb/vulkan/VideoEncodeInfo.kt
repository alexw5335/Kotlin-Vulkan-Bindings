// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_KHR_video_encode_queue

 *     struct VkVideoEncodeInfoKHR {
 *         VkStructureType            sType
 *         void*                      pNext
 *         VkVideoEncodeFlagsKHR      flags
 *         uint32_t                   qualityLevel
 *         VkExtent2D                 codedExtent
 *         VkBuffer                   dstBitstreamBuffer
 *         VkDeviceSize               dstBitstreamBufferOffset
 *         VkDeviceSize               dstBitstreamBufferMaxRange
 *         VkVideoPictureResourceKHR  srcPictureResource
 *         VkVideoReferenceSlotKHR*   pSetupReferenceSlot
 *         uint32_t                   referenceSlotCount
 *         VkVideoReferenceSlotKHR*   pReferenceSlots
 *         uint32_t                   precedingExternallyEncodedBytes
 *     }
 * 
 *     Valid pNext types:
 *         - VkVideoEncodeH264VclFrameInfoEXT
 *         - VkVideoEncodeH264EmitPictureParametersEXT
 *         - VkVideoEncodeH265VclFrameInfoEXT
 *         - VkVideoEncodeH265EmitPictureParametersEXT
 */
@JvmInline
value class VideoEncodeInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: VideoEncodeFlags
		get()      = VideoEncodeFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var qualityLevel: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var codedExtent: Extent2D
		get()      = Extent2D(address + 24)
		set(value) = Unsafe.copy(value.address, address + 24, 8)
	
	var dstBitstreamBuffer: BufferH
		get()      = BufferH(Unsafe.getLong(address + 32))
		set(value) = Unsafe.setLong(address + 32, value.address)
	
	var dstBitstreamBufferOffset: Long
		get()      = Unsafe.getLong(address + 40)
		set(value) = Unsafe.setLong(address + 40, value)
	
	var dstBitstreamBufferMaxRange: Long
		get()      = Unsafe.getLong(address + 48)
		set(value) = Unsafe.setLong(address + 48, value)
	
	var srcPictureResource: VideoPictureResource
		get()      = VideoPictureResource(address + 56)
		set(value) = Unsafe.copy(value.address, address + 56, 48)
	
	var pSetupReferenceSlot: Long
		get()      = Unsafe.getLong(address + 104)
		set(value) = Unsafe.setLong(address + 104, value)
	
	var referenceSlotCount: Int
		get()      = Unsafe.getInt(address + 112)
		set(value) = Unsafe.setInt(address + 112, value)
	
	var pReferenceSlots: Long
		get()      = Unsafe.getLong(address + 120)
		set(value) = Unsafe.setLong(address + 120, value)
	
	var precedingExternallyEncodedBytes: Int
		get()      = Unsafe.getInt(address + 128)
		set(value) = Unsafe.setInt(address + 128, value)
	
	
	
	var setupReferenceSlot: VideoReferenceSlot
		get()      = VideoReferenceSlot(Unsafe.getLong(address + 104))
		set(value) { Unsafe.setLong(address + 104, value.address) }
	
	var referenceSlots: VideoReferenceSlot.Buffer
		get()      = VideoReferenceSlot.Buffer(Unsafe.getLong(address + 120), referenceSlotCount)
		set(value) { Unsafe.setLong(address + 120, value.address); referenceSlotCount = value.capacity }


}