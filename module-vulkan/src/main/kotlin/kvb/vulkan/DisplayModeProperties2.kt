// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_KHR_get_display_properties2

 *     struct VkDisplayModeProperties2KHR {
 *         VkStructureType             sType
 *         void*                       pNext (must be null)
 *         VkDisplayModePropertiesKHR  displayModeProperties
 *     }
 */
@JvmInline
value class DisplayModeProperties2(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var displayModeProperties: DisplayModeProperties
		get()      = DisplayModeProperties(address + 16)
		set(value) = Unsafe.copy(value.address, address + 16, 24)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 40
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = DisplayModeProperties2(offset(index))
		
		operator fun set(index: Int, value: DisplayModeProperties2) = Unsafe.copy(value.address, offset(index), 40)
		
		inline fun forEach(block: (DisplayModeProperties2) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (DisplayModeProperties2) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, DisplayModeProperties2) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}