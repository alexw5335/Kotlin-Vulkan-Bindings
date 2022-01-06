// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_EXT_video_encode_h264

 *     struct VkVideoEncodeH264VclFrameInfoEXT {
 *         VkStructureType                   sType
 *         void*                             pNext (must be null)
 *         uint8_t                           refDefaultFinalList0EntryCount
 *         VkVideoEncodeH264DpbSlotInfoEXT*  pRefDefaultFinalList0Entries
 *         uint8_t                           refDefaultFinalList1EntryCount
 *         VkVideoEncodeH264DpbSlotInfoEXT*  pRefDefaultFinalList1Entries
 *         uint32_t                          naluSliceEntryCount
 *         VkVideoEncodeH264NaluSliceEXT*    pNaluSliceEntries
 *         VkVideoEncodeH264DpbSlotInfoEXT*  pCurrentPictureInfo
 *     }
 */
@JvmInline
value class VideoEncodeH264VclFrameInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var refDefaultFinalList0EntryCount: Byte
		get()      = Unsafe.getByte(address + 16)
		set(value) = Unsafe.setByte(address + 16, value)
	
	var pRefDefaultFinalList0Entries: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var refDefaultFinalList1EntryCount: Byte
		get()      = Unsafe.getByte(address + 32)
		set(value) = Unsafe.setByte(address + 32, value)
	
	var pRefDefaultFinalList1Entries: Long
		get()      = Unsafe.getLong(address + 40)
		set(value) = Unsafe.setLong(address + 40, value)
	
	var naluSliceEntryCount: Int
		get()      = Unsafe.getInt(address + 48)
		set(value) = Unsafe.setInt(address + 48, value)
	
	var pNaluSliceEntries: Long
		get()      = Unsafe.getLong(address + 56)
		set(value) = Unsafe.setLong(address + 56, value)
	
	var pCurrentPictureInfo: Long
		get()      = Unsafe.getLong(address + 64)
		set(value) = Unsafe.setLong(address + 64, value)
	
	
	
	var refDefaultFinalList0Entries: VideoEncodeH264DpbSlotInfo.Buffer
		get()      = VideoEncodeH264DpbSlotInfo.Buffer(Unsafe.getLong(address + 24), refDefaultFinalList0EntryCount.toInt())
		set(value) { Unsafe.setLong(address + 24, value.address); refDefaultFinalList0EntryCount = value.capacity.toByte() }
	
	var refDefaultFinalList1Entries: VideoEncodeH264DpbSlotInfo.Buffer
		get()      = VideoEncodeH264DpbSlotInfo.Buffer(Unsafe.getLong(address + 40), refDefaultFinalList1EntryCount.toInt())
		set(value) { Unsafe.setLong(address + 40, value.address); refDefaultFinalList1EntryCount = value.capacity.toByte() }
	
	var naluSliceEntries: VideoEncodeH264NaluSlice.Buffer
		get()      = VideoEncodeH264NaluSlice.Buffer(Unsafe.getLong(address + 56), naluSliceEntryCount)
		set(value) { Unsafe.setLong(address + 56, value.address); naluSliceEntryCount = value.capacity }
	
	var currentPictureInfo: VideoEncodeH264DpbSlotInfo
		get()      = VideoEncodeH264DpbSlotInfo(Unsafe.getLong(address + 64))
		set(value) { Unsafe.setLong(address + 64, value.address) }


}