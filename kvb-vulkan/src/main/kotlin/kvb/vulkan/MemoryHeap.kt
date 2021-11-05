// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe

/**
 *     struct VkMemoryHeap {
 *         VkDeviceSize       size
 *         VkMemoryHeapFlags  flags
 *     }
 */
@JvmInline
value class MemoryHeap(override val address: Long) : Addressable {
	
	
	var size: Long
		get()      = Unsafe.getLong(address + 0)
		set(value) = Unsafe.setLong(address + 0, value)
	
	var flags: MemoryHeapFlags
		get()      = MemoryHeapFlags(Unsafe.getInt(address + 8))
		set(value) = Unsafe.setInt(address + 8, value.value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 16
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = MemoryHeap(offset(index))
		
		operator fun set(index: Int, value: MemoryHeap) = Unsafe.copy(value.address, offset(index), 16)
		
		inline fun forEach(block: (MemoryHeap) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (MemoryHeap) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, MemoryHeap) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}