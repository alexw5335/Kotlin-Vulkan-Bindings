// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_KHR_video_encode_queue

 *     struct VkVideoEncodeRateControlLayerInfoKHR {
 *         VkStructureType  sType
 *         void*            pNext
 *         uint32_t         averageBitrate
 *         uint32_t         maxBitrate
 *         uint32_t         frameRateNumerator
 *         uint32_t         frameRateDenominator
 *         uint32_t         virtualBufferSizeInMs
 *         uint32_t         initialVirtualBufferSizeInMs
 *     }
 * 
 *     Valid pNext types:
 *         - VkVideoEncodeH264RateControlLayerInfoEXT
 *         - VkVideoEncodeH265RateControlLayerInfoEXT
 */
@JvmInline
value class VideoEncodeRateControlLayerInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var averageBitrate: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var maxBitrate: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var frameRateNumerator: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var frameRateDenominator: Int
		get()      = Unsafe.getInt(address + 28)
		set(value) = Unsafe.setInt(address + 28, value)
	
	var virtualBufferSizeInMs: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var initialVirtualBufferSizeInMs: Int
		get()      = Unsafe.getInt(address + 36)
		set(value) = Unsafe.setInt(address + 36, value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 40
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = VideoEncodeRateControlLayerInfo(offset(index))
		
		operator fun set(index: Int, value: VideoEncodeRateControlLayerInfo) = Unsafe.copy(value.address, offset(index), 40)
		
		inline fun forEach(block: (VideoEncodeRateControlLayerInfo) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (VideoEncodeRateControlLayerInfo) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, VideoEncodeRateControlLayerInfo) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}