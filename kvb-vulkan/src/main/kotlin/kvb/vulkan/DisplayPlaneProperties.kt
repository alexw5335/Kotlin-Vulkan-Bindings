// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe

/**
 *     struct VkDisplayPlanePropertiesKHR {
 *         VkDisplayKHR  currentDisplay
 *         uint32_t      currentStackIndex
 *     }
 */
@JvmInline
value class DisplayPlaneProperties(override val address: Long) : Addressable {
	
	
	var currentDisplay: DisplayH
		get()      = DisplayH(Unsafe.getLong(address + 0))
		set(value) = Unsafe.setLong(address + 0, value.address)
	
	var currentStackIndex: Int
		get()      = Unsafe.getInt(address + 8)
		set(value) = Unsafe.setInt(address + 8, value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 16
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = DisplayPlaneProperties(offset(index))
		
		operator fun set(index: Int, value: DisplayPlaneProperties) = Unsafe.copy(value.address, offset(index), 16)
		
		inline fun forEach(block: (DisplayPlaneProperties) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (DisplayPlaneProperties) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, DisplayPlaneProperties) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}