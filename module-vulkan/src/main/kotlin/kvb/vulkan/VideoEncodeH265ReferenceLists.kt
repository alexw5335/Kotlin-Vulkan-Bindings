// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_EXT_video_encode_h265

 *     struct VkVideoEncodeH265ReferenceListsEXT {
 *         VkStructureType                            sType
 *         void*                                      pNext (must be null)
 *         uint8_t                                    referenceList0EntryCount
 *         VkVideoEncodeH265DpbSlotInfoEXT*           pReferenceList0Entries
 *         uint8_t                                    referenceList1EntryCount
 *         VkVideoEncodeH265DpbSlotInfoEXT*           pReferenceList1Entries
 *         StdVideoEncodeH265ReferenceModifications*  pReferenceModifications
 *     }
 */
@JvmInline
value class VideoEncodeH265ReferenceLists(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var referenceList0EntryCount: Byte
		get()      = Unsafe.getByte(address + 16)
		set(value) = Unsafe.setByte(address + 16, value)
	
	var pReferenceList0Entries: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var referenceList1EntryCount: Byte
		get()      = Unsafe.getByte(address + 32)
		set(value) = Unsafe.setByte(address + 32, value)
	
	var pReferenceList1Entries: Long
		get()      = Unsafe.getLong(address + 40)
		set(value) = Unsafe.setLong(address + 40, value)
	
	var pReferenceModifications: Long
		get()      = Unsafe.getLong(address + 48)
		set(value) = Unsafe.setLong(address + 48, value)
	
	
	
	var referenceList0Entries: VideoEncodeH265DpbSlotInfo.Buffer
		get()      = VideoEncodeH265DpbSlotInfo.Buffer(Unsafe.getLong(address + 24), referenceList0EntryCount.toInt())
		set(value) { Unsafe.setLong(address + 24, value.address); referenceList0EntryCount = value.capacity.toByte() }
	
	var referenceList1Entries: VideoEncodeH265DpbSlotInfo.Buffer
		get()      = VideoEncodeH265DpbSlotInfo.Buffer(Unsafe.getLong(address + 40), referenceList1EntryCount.toInt())
		set(value) { Unsafe.setLong(address + 40, value.address); referenceList1EntryCount = value.capacity.toByte() }


}