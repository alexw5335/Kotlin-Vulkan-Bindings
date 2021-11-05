// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe

/**
 *     struct VkRectLayerKHR {
 *         VkOffset2D  offset
 *         VkExtent2D  extent
 *         uint32_t    layer
 *     }
 */
@JvmInline
value class RectLayer(override val address: Long) : Addressable {
	
	
	var offset: Offset2D
		get()      = Offset2D(address + 0)
		set(value) = Unsafe.copy(value.address, address + 0, 8)
	
	var extent: Extent2D
		get()      = Extent2D(address + 8)
		set(value) = Unsafe.copy(value.address, address + 8, 8)
	
	var layer: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 20
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = RectLayer(offset(index))
		
		operator fun set(index: Int, value: RectLayer) = Unsafe.copy(value.address, offset(index), 20)
		
		inline fun forEach(block: (RectLayer) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (RectLayer) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, RectLayer) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}