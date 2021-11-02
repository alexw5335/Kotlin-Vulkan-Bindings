// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkViewport {
 *         float  x
 *         float  y
 *         float  width
 *         float  height
 *         float  minDepth
 *         float  maxDepth
 *     }
 */
@JvmInline
value class Viewport(override val address: Long) : Addressable {
	
	
	var x: Float
		get()      = Unsafe.getFloat(address + 0)
		set(value) = Unsafe.setFloat(address + 0, value)
	
	var y: Float
		get()      = Unsafe.getFloat(address + 4)
		set(value) = Unsafe.setFloat(address + 4, value)
	
	var width: Float
		get()      = Unsafe.getFloat(address + 8)
		set(value) = Unsafe.setFloat(address + 8, value)
	
	var height: Float
		get()      = Unsafe.getFloat(address + 12)
		set(value) = Unsafe.setFloat(address + 12, value)
	
	var minDepth: Float
		get()      = Unsafe.getFloat(address + 16)
		set(value) = Unsafe.setFloat(address + 16, value)
	
	var maxDepth: Float
		get()      = Unsafe.getFloat(address + 20)
		set(value) = Unsafe.setFloat(address + 20, value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 24
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = Viewport(offset(index))
		
		operator fun set(index: Int, value: Viewport) = Unsafe.copy(value.address, offset(index), 24)
		
		inline fun forEach(block: (Viewport) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (Viewport) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, Viewport) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}