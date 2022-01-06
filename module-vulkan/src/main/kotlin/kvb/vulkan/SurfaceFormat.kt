// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_KHR_surface

 *     struct VkSurfaceFormatKHR {
 *         VkFormat         format
 *         VkColorSpaceKHR  colorSpace
 *     }
 */
@JvmInline
value class SurfaceFormat(override val address: Long) : Addressable {
	
	
	var format: Format
		get()      = Format(Unsafe.getInt(address + 0))
		set(value) = Unsafe.setInt(address + 0, value.value)
	
	var colorSpace: ColorSpace
		get()      = _ColorSpace(Unsafe.getInt(address + 4))
		set(value) = Unsafe.setInt(address + 4, value.value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 8
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = SurfaceFormat(offset(index))
		
		operator fun set(index: Int, value: SurfaceFormat) = Unsafe.copy(value.address, offset(index), 8)
		
		inline fun forEach(block: (SurfaceFormat) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (SurfaceFormat) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, SurfaceFormat) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}