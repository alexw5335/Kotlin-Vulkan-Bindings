// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_EXT_video_encode_h265

 *     struct VkVideoEncodeH265NaluSliceEXT {
 *         VkStructureType                      sType
 *         void*                                pNext (must be null)
 *         uint32_t                             ctbCount
 *         VkVideoEncodeH265ReferenceListsEXT*  pReferenceFinalLists
 *         StdVideoEncodeH265SliceHeader*       pSliceHeaderStd
 *     }
 */
@JvmInline
value class VideoEncodeH265NaluSlice(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var ctbCount: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var pReferenceFinalLists: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var pSliceHeaderStd: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)
	
	
	
	var referenceFinalLists: VideoEncodeH265ReferenceLists
		get()      = VideoEncodeH265ReferenceLists(Unsafe.getLong(address + 24))
		set(value) { Unsafe.setLong(address + 24, value.address) }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 40
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = VideoEncodeH265NaluSlice(offset(index))
		
		operator fun set(index: Int, value: VideoEncodeH265NaluSlice) = Unsafe.copy(value.address, offset(index), 40)
		
		inline fun forEach(block: (VideoEncodeH265NaluSlice) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (VideoEncodeH265NaluSlice) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, VideoEncodeH265NaluSlice) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}