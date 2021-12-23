// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     union VkClearValue {
 *         VkClearColorValue         color
 *         VkClearDepthStencilValue  depthStencil
 *     }
 */
@JvmInline
value class ClearValue(override val address: Long) : Addressable {
	
	
	var color: ClearColorValue
		get()      = ClearColorValue(address + 0)
		set(value) = Unsafe.copy(value.address, address + 0, 16)
	
	var depthStencil: ClearDepthStencilValue
		get()      = ClearDepthStencilValue(address + 0)
		set(value) = Unsafe.copy(value.address, address + 0, 8)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 16
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = ClearValue(offset(index))
		
		operator fun set(index: Int, value: ClearValue) = Unsafe.copy(value.address, offset(index), 16)
		
		inline fun forEach(block: (ClearValue) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (ClearValue) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, ClearValue) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}