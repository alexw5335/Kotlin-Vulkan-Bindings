// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_NV_viewport_swizzle

 *     struct VkViewportSwizzleNV {
 *         VkViewportCoordinateSwizzleNV  x
 *         VkViewportCoordinateSwizzleNV  y
 *         VkViewportCoordinateSwizzleNV  z
 *         VkViewportCoordinateSwizzleNV  w
 *     }
 */
@JvmInline
value class ViewportSwizzle(override val address: Long) : Addressable {
	
	
	var x: ViewportCoordinateSwizzle
		get()      = _ViewportCoordinateSwizzle(Unsafe.getInt(address + 0))
		set(value) = Unsafe.setInt(address + 0, value.value)
	
	var y: ViewportCoordinateSwizzle
		get()      = _ViewportCoordinateSwizzle(Unsafe.getInt(address + 4))
		set(value) = Unsafe.setInt(address + 4, value.value)
	
	var z: ViewportCoordinateSwizzle
		get()      = _ViewportCoordinateSwizzle(Unsafe.getInt(address + 8))
		set(value) = Unsafe.setInt(address + 8, value.value)
	
	var w: ViewportCoordinateSwizzle
		get()      = _ViewportCoordinateSwizzle(Unsafe.getInt(address + 12))
		set(value) = Unsafe.setInt(address + 12, value.value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 16
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = ViewportSwizzle(offset(index))
		
		operator fun set(index: Int, value: ViewportSwizzle) = Unsafe.copy(value.address, offset(index), 16)
		
		inline fun forEach(block: (ViewportSwizzle) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (ViewportSwizzle) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, ViewportSwizzle) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}