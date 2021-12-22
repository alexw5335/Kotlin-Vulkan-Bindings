// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkSparseMemoryBind {
 *         VkDeviceSize             resourceOffset
 *         VkDeviceSize             size
 *         VkDeviceMemory           memory
 *         VkDeviceSize             memoryOffset
 *         VkSparseMemoryBindFlags  flags
 *     }
 */
@JvmInline
value class SparseMemoryBind(override val address: Long) : Addressable {
	
	
	var resourceOffset: Long
		get()      = Unsafe.getLong(address + 0)
		set(value) = Unsafe.setLong(address + 0, value)
	
	var size: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var memory: DeviceMemoryH
		get()      = DeviceMemoryH(Unsafe.getLong(address + 16))
		set(value) = Unsafe.setLong(address + 16, value.address)
	
	var memoryOffset: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var flags: SparseMemoryBindFlags
		get()      = SparseMemoryBindFlags(Unsafe.getInt(address + 32))
		set(value) = Unsafe.setInt(address + 32, value.value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 40
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = SparseMemoryBind(offset(index))
		
		operator fun set(index: Int, value: SparseMemoryBind) = Unsafe.copy(value.address, offset(index), 40)
		
		inline fun forEach(block: (SparseMemoryBind) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (SparseMemoryBind) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, SparseMemoryBind) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}