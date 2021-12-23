// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkClearAttachment {
 *         VkImageAspectFlags  aspectMask
 *         uint32_t            colorAttachment
 *         VkClearValue        clearValue
 *     }
 */
@JvmInline
value class ClearAttachment(override val address: Long) : Addressable {
	
	
	var aspectMask: ImageAspectFlags
		get()      = ImageAspectFlags(Unsafe.getInt(address + 0))
		set(value) = Unsafe.setInt(address + 0, value.value)
	
	var colorAttachment: Int
		get()      = Unsafe.getInt(address + 4)
		set(value) = Unsafe.setInt(address + 4, value)
	
	var clearValue: ClearValue
		get()      = ClearValue(address + 8)
		set(value) = Unsafe.copy(value.address, address + 8, 16)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 24
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = ClearAttachment(offset(index))
		
		operator fun set(index: Int, value: ClearAttachment) = Unsafe.copy(value.address, offset(index), 24)
		
		inline fun forEach(block: (ClearAttachment) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (ClearAttachment) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, ClearAttachment) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}