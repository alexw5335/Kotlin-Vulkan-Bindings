// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkPresentRegionKHR {
 *         uint32_t         rectangleCount
 *         VkRectLayerKHR*  pRectangles
 *     }
 */
@JvmInline
value class PresentRegion(override val address: Long) : Addressable {
	
	
	var rectangleCount: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pRectangles: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	
	
	var rectangles: RectLayer.Buffer
		get()      = RectLayer.Buffer(Unsafe.getLong(address + 8), rectangleCount)
		set(value) { Unsafe.setLong(address + 8, value.address); rectangleCount = value.capacity }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 16
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = PresentRegion(offset(index))
		
		operator fun set(index: Int, value: PresentRegion) = Unsafe.copy(value.address, offset(index), 16)
		
		inline fun forEach(block: (PresentRegion) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (PresentRegion) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, PresentRegion) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}