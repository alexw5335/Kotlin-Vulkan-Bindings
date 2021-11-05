// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe

/**
 *     struct VkBufferMemoryBarrier2KHR {
 *         VkStructureType           sType
 *         void*                     pNext (must be null)
 *         VkPipelineStageFlags2KHR  srcStageMask
 *         VkAccessFlags2KHR         srcAccessMask
 *         VkPipelineStageFlags2KHR  dstStageMask
 *         VkAccessFlags2KHR         dstAccessMask
 *         uint32_t                  srcQueueFamilyIndex
 *         uint32_t                  dstQueueFamilyIndex
 *         VkBuffer                  buffer
 *         VkDeviceSize              offset
 *         VkDeviceSize              size
 *     }
 */
@JvmInline
value class BufferMemoryBarrier2(override val address: Long) : Addressable {
	
	
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
	
	var srcQueueFamilyIndex: Int
		get()      = Unsafe.getInt(address + 48)
		set(value) = Unsafe.setInt(address + 48, value)
	
	var dstQueueFamilyIndex: Int
		get()      = Unsafe.getInt(address + 52)
		set(value) = Unsafe.setInt(address + 52, value)
	
	var buffer: BufferH
		get()      = BufferH(Unsafe.getLong(address + 56))
		set(value) = Unsafe.setLong(address + 56, value.address)
	
	var offset: Long
		get()      = Unsafe.getLong(address + 64)
		set(value) = Unsafe.setLong(address + 64, value)
	
	var size: Long
		get()      = Unsafe.getLong(address + 72)
		set(value) = Unsafe.setLong(address + 72, value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 80
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = BufferMemoryBarrier2(offset(index))
		
		operator fun set(index: Int, value: BufferMemoryBarrier2) = Unsafe.copy(value.address, offset(index), 80)
		
		inline fun forEach(block: (BufferMemoryBarrier2) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (BufferMemoryBarrier2) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, BufferMemoryBarrier2) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}