// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_KHR_get_display_properties2

 *     struct VkDisplayProperties2KHR {
 *         VkStructureType         sType
 *         void*                   pNext (must be null)
 *         VkDisplayPropertiesKHR  displayProperties
 *     }
 */
@JvmInline
value class DisplayProperties2(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var displayProperties: DisplayProperties
		get()      = DisplayProperties(address + 16)
		set(value) = Unsafe.copy(value.address, address + 16, 48)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 64
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = DisplayProperties2(offset(index))
		
		operator fun set(index: Int, value: DisplayProperties2) = Unsafe.copy(value.address, offset(index), 64)
		
		inline fun forEach(block: (DisplayProperties2) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (DisplayProperties2) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, DisplayProperties2) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}