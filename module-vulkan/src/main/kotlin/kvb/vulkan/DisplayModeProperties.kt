// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkDisplayModePropertiesKHR {
 *         VkDisplayModeKHR            displayMode
 *         VkDisplayModeParametersKHR  parameters
 *     }
 */
@JvmInline
value class DisplayModeProperties(override val address: Long) : Addressable {
	
	
	var displayMode: DisplayModeH
		get()      = DisplayModeH(Unsafe.getLong(address + 0))
		set(value) = Unsafe.setLong(address + 0, value.address)
	
	var parameters: DisplayModeParameters
		get()      = DisplayModeParameters(address + 8)
		set(value) = Unsafe.copy(value.address, address + 8, 12)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 24
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = DisplayModeProperties(offset(index))
		
		operator fun set(index: Int, value: DisplayModeProperties) = Unsafe.copy(value.address, offset(index), 24)
		
		inline fun forEach(block: (DisplayModeProperties) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (DisplayModeProperties) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, DisplayModeProperties) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}