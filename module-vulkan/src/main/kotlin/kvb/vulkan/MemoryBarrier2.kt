// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_KHR_synchronization2

 *     struct VkMemoryBarrier2KHR {
 *         VkStructureType           sType
 *         void*                     pNext (must be null)
 *         VkPipelineStageFlags2KHR  srcStageMask
 *         VkAccessFlags2KHR         srcAccessMask
 *         VkPipelineStageFlags2KHR  dstStageMask
 *         VkAccessFlags2KHR         dstAccessMask
 *     }
 */
@JvmInline
value class MemoryBarrier2(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var srcStageMask: PipelineStageFlags2
		get()      = PipelineStageFlags2(Unsafe.getLong(address + 16))
		set(value) = Unsafe.setLong(address + 16, value.value)
	
	var srcAccessMask: AccessFlags2
		get()      = AccessFlags2(Unsafe.getLong(address + 24))
		set(value) = Unsafe.setLong(address + 24, value.value)
	
	var dstStageMask: PipelineStageFlags2
		get()      = PipelineStageFlags2(Unsafe.getLong(address + 32))
		set(value) = Unsafe.setLong(address + 32, value.value)
	
	var dstAccessMask: AccessFlags2
		get()      = AccessFlags2(Unsafe.getLong(address + 40))
		set(value) = Unsafe.setLong(address + 40, value.value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 48
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = MemoryBarrier2(offset(index))
		
		operator fun set(index: Int, value: MemoryBarrier2) = Unsafe.copy(value.address, offset(index), 48)
		
		inline fun forEach(block: (MemoryBarrier2) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (MemoryBarrier2) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, MemoryBarrier2) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}