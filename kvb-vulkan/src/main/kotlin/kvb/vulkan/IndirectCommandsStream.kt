// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe

/**
 *     struct VkIndirectCommandsStreamNV {
 *         VkBuffer      buffer
 *         VkDeviceSize  offset
 *     }
 */
@JvmInline
value class IndirectCommandsStream(override val address: Long) : Addressable {
	
	
	var buffer: BufferH
		get()      = BufferH(Unsafe.getLong(address + 0))
		set(value) = Unsafe.setLong(address + 0, value.address)
	
	var offset: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 16
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = IndirectCommandsStream(offset(index))
		
		operator fun set(index: Int, value: IndirectCommandsStream) = Unsafe.copy(value.address, offset(index), 16)
		
		inline fun forEach(block: (IndirectCommandsStream) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (IndirectCommandsStream) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, IndirectCommandsStream) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}