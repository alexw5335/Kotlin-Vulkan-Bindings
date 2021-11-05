// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe

/**
 *     struct VkCommandBufferSubmitInfoKHR {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkCommandBuffer  commandBuffer
 *         uint32_t         deviceMask
 *     }
 */
@JvmInline
value class CommandBufferSubmitInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var commandBuffer: CommandBufferH
		get()      = CommandBufferH(Unsafe.getLong(address + 16))
		set(value) = Unsafe.setLong(address + 16, value.address)
	
	var deviceMask: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 32
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = CommandBufferSubmitInfo(offset(index))
		
		operator fun set(index: Int, value: CommandBufferSubmitInfo) = Unsafe.copy(value.address, offset(index), 32)
		
		inline fun forEach(block: (CommandBufferSubmitInfo) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (CommandBufferSubmitInfo) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, CommandBufferSubmitInfo) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}