// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_EXT_video_encode_h264

 *     struct VkVideoEncodeH264NaluSliceEXT {
 *         VkStructureType                   sType
 *         void*                             pNext (must be null)
 *         StdVideoEncodeH264SliceHeader*    pSliceHeaderStd
 *         uint32_t                          mbCount
 *         uint8_t                           refFinalList0EntryCount
 *         VkVideoEncodeH264DpbSlotInfoEXT*  pRefFinalList0Entries
 *         uint8_t                           refFinalList1EntryCount
 *         VkVideoEncodeH264DpbSlotInfoEXT*  pRefFinalList1Entries
 *     }
 */
@JvmInline
value class VideoEncodeH264NaluSlice(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var pSliceHeaderStd: Long
		get()      = Unsafe.getLong(address + 16)
		set(value) = Unsafe.setLong(address + 16, value)
	
	var mbCount: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var refFinalList0EntryCount: Byte
		get()      = Unsafe.getByte(address + 28)
		set(value) = Unsafe.setByte(address + 28, value)
	
	var pRefFinalList0Entries: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)
	
	var refFinalList1EntryCount: Byte
		get()      = Unsafe.getByte(address + 40)
		set(value) = Unsafe.setByte(address + 40, value)
	
	var pRefFinalList1Entries: Long
		get()      = Unsafe.getLong(address + 48)
		set(value) = Unsafe.setLong(address + 48, value)
	
	
	
	var refFinalList0Entries: VideoEncodeH264DpbSlotInfo.Buffer
		get()      = VideoEncodeH264DpbSlotInfo.Buffer(Unsafe.getLong(address + 32), refFinalList0EntryCount.toInt())
		set(value) { Unsafe.setLong(address + 32, value.address); refFinalList0EntryCount = value.capacity.toByte() }
	
	var refFinalList1Entries: VideoEncodeH264DpbSlotInfo.Buffer
		get()      = VideoEncodeH264DpbSlotInfo.Buffer(Unsafe.getLong(address + 48), refFinalList1EntryCount.toInt())
		set(value) { Unsafe.setLong(address + 48, value.address); refFinalList1EntryCount = value.capacity.toByte() }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 56
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = VideoEncodeH264NaluSlice(offset(index))
		
		operator fun set(index: Int, value: VideoEncodeH264NaluSlice) = Unsafe.copy(value.address, offset(index), 56)
		
		inline fun forEach(block: (VideoEncodeH264NaluSlice) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (VideoEncodeH264NaluSlice) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, VideoEncodeH264NaluSlice) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}