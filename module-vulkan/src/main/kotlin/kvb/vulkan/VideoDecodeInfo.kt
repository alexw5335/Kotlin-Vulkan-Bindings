// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_KHR_video_decode_queue

 *     struct VkVideoDecodeInfoKHR {
 *         VkStructureType            sType
 *         void*                      pNext
 *         VkVideoDecodeFlagsKHR      flags
 *         VkOffset2D                 codedOffset
 *         VkExtent2D                 codedExtent
 *         VkBuffer                   srcBuffer
 *         VkDeviceSize               srcBufferOffset
 *         VkDeviceSize               srcBufferRange
 *         VkVideoPictureResourceKHR  dstPictureResource
 *         VkVideoReferenceSlotKHR*   pSetupReferenceSlot
 *         uint32_t                   referenceSlotCount
 *         VkVideoReferenceSlotKHR*   pReferenceSlots
 *     }
 * 
 *     Valid pNext types:
 *         - VkVideoDecodeH264PictureInfoEXT
 *         - VkVideoDecodeH265PictureInfoEXT
 */
@JvmInline
value class VideoDecodeInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: VideoDecodeFlags
		get()      = VideoDecodeFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var codedOffset: Offset2D
		get()      = Offset2D(address + 20)
		set(value) = Unsafe.copy(value.address, address + 20, 8)
	
	var codedExtent: Extent2D
		get()      = Extent2D(address + 28)
		set(value) = Unsafe.copy(value.address, address + 28, 8)
	
	var srcBuffer: BufferH
		get()      = BufferH(Unsafe.getLong(address + 40))
		set(value) = Unsafe.setLong(address + 40, value.address)
	
	var srcBufferOffset: Long
		get()      = Unsafe.getLong(address + 48)
		set(value) = Unsafe.setLong(address + 48, value)
	
	var srcBufferRange: Long
		get()      = Unsafe.getLong(address + 56)
		set(value) = Unsafe.setLong(address + 56, value)
	
	var dstPictureResource: VideoPictureResource
		get()      = VideoPictureResource(address + 64)
		set(value) = Unsafe.copy(value.address, address + 64, 48)
	
	var pSetupReferenceSlot: Long
		get()      = Unsafe.getLong(address + 112)
		set(value) = Unsafe.setLong(address + 112, value)
	
	var referenceSlotCount: Int
		get()      = Unsafe.getInt(address + 120)
		set(value) = Unsafe.setInt(address + 120, value)
	
	var pReferenceSlots: Long
		get()      = Unsafe.getLong(address + 128)
		set(value) = Unsafe.setLong(address + 128, value)
	
	
	
	var setupReferenceSlot: VideoReferenceSlot
		get()      = VideoReferenceSlot(Unsafe.getLong(address + 112))
		set(value) { Unsafe.setLong(address + 112, value.address) }
	
	var referenceSlots: VideoReferenceSlot.Buffer
		get()      = VideoReferenceSlot.Buffer(Unsafe.getLong(address + 128), referenceSlotCount)
		set(value) { Unsafe.setLong(address + 128, value.address); referenceSlotCount = value.capacity }


}