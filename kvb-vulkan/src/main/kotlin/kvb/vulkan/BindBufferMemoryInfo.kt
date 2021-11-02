// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkBindBufferMemoryInfo {
 *         VkStructureType  sType
 *         void*            pNext
 *         VkBuffer         buffer
 *         VkDeviceMemory   memory
 *         VkDeviceSize     memoryOffset
 *     }
 * 
 *     Valid pNext types:
 *         - VkBindBufferMemoryDeviceGroupInfo
 */
@JvmInline
value class BindBufferMemoryInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var buffer: BufferH
		get()      = BufferH(Unsafe.getLong(address + 16))
		set(value) = Unsafe.setLong(address + 16, value.address)
	
	var memory: DeviceMemoryH
		get()      = DeviceMemoryH(Unsafe.getLong(address + 24))
		set(value) = Unsafe.setLong(address + 24, value.address)
	
	var memoryOffset: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 40
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = BindBufferMemoryInfo(offset(index))
		
		operator fun set(index: Int, value: BindBufferMemoryInfo) = Unsafe.copy(value.address, offset(index), 40)
		
		inline fun forEach(block: (BindBufferMemoryInfo) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (BindBufferMemoryInfo) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, BindBufferMemoryInfo) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}