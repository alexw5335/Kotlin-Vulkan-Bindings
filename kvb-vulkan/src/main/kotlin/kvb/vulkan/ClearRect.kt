// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe

/**
 *     struct VkClearRect {
 *         VkRect2D  rect
 *         uint32_t  baseArrayLayer
 *         uint32_t  layerCount
 *     }
 */
@JvmInline
value class ClearRect(override val address: Long) : Addressable {
	
	
	var rect: Rect2D
		get()      = Rect2D(address + 0)
		set(value) = Unsafe.copy(value.address, address + 0, 16)
	
	var baseArrayLayer: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var layerCount: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 24
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = ClearRect(offset(index))
		
		operator fun set(index: Int, value: ClearRect) = Unsafe.copy(value.address, offset(index), 24)
		
		inline fun forEach(block: (ClearRect) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (ClearRect) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, ClearRect) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}