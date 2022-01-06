// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_EXT_video_encode_h265

 *     struct VkVideoEncodeH265DpbSlotInfoEXT {
 *         VkStructureType                   sType
 *         void*                             pNext (must be null)
 *         int8_t                            slotIndex
 *         StdVideoEncodeH265ReferenceInfo*  pStdReferenceInfo
 *     }
 */
@JvmInline
value class VideoEncodeH265DpbSlotInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var slotIndex: Byte
		get()      = Unsafe.getByte(address + 16)
		set(value) = Unsafe.setByte(address + 16, value)
	
	var pStdReferenceInfo: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 32
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = VideoEncodeH265DpbSlotInfo(offset(index))
		
		operator fun set(index: Int, value: VideoEncodeH265DpbSlotInfo) = Unsafe.copy(value.address, offset(index), 32)
		
		inline fun forEach(block: (VideoEncodeH265DpbSlotInfo) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (VideoEncodeH265DpbSlotInfo) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, VideoEncodeH265DpbSlotInfo) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}