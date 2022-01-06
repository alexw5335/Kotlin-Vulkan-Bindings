// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_VERSION_1_0

 *     struct VkBufferMemoryBarrier {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkAccessFlags    srcAccessMask
 *         VkAccessFlags    dstAccessMask
 *         uint32_t         srcQueueFamilyIndex
 *         uint32_t         dstQueueFamilyIndex
 *         VkBuffer         buffer
 *         VkDeviceSize     offset
 *         VkDeviceSize     size
 *     }
 */
@JvmInline
value class BufferMemoryBarrier(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var srcAccessMask: AccessFlags
		get()      = AccessFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var dstAccessMask: AccessFlags
		get()      = AccessFlags(Unsafe.getInt(address + 20))
		set(value) = Unsafe.setInt(address + 20, value.value)
	
	var srcQueueFamilyIndex: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var dstQueueFamilyIndex: Int
		get()      = Unsafe.getInt(address + 28)
		set(value) = Unsafe.setInt(address + 28, value)
	
	var buffer: BufferH
		get()      = BufferH(Unsafe.getLong(address + 32))
		set(value) = Unsafe.setLong(address + 32, value.address)
	
	var offset: Long
		get()      = Unsafe.getLong(address + 40)
		set(value) = Unsafe.setLong(address + 40, value)
	
	var size: Long
		get()      = Unsafe.getLong(address + 48)
		set(value) = Unsafe.setLong(address + 48, value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 56
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = BufferMemoryBarrier(offset(index))
		
		operator fun set(index: Int, value: BufferMemoryBarrier) = Unsafe.copy(value.address, offset(index), 56)
		
		inline fun forEach(block: (BufferMemoryBarrier) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (BufferMemoryBarrier) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, BufferMemoryBarrier) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}