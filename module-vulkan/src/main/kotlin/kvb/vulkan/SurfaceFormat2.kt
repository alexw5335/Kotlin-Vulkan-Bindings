// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_KHR_get_surface_capabilities2

 *     struct VkSurfaceFormat2KHR {
 *         VkStructureType     sType
 *         void*               pNext (must be null)
 *         VkSurfaceFormatKHR  surfaceFormat
 *     }
 */
@JvmInline
value class SurfaceFormat2(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var surfaceFormat: SurfaceFormat
		get()      = SurfaceFormat(address + 16)
		set(value) = Unsafe.copy(value.address, address + 16, 8)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 24
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = SurfaceFormat2(offset(index))
		
		operator fun set(index: Int, value: SurfaceFormat2) = Unsafe.copy(value.address, offset(index), 24)
		
		inline fun forEach(block: (SurfaceFormat2) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (SurfaceFormat2) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, SurfaceFormat2) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}