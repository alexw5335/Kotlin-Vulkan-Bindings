// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe

/**
 *     struct VkSparseImageMemoryRequirements2 {
 *         VkStructureType                  sType
 *         void*                            pNext (must be null)
 *         VkSparseImageMemoryRequirements  memoryRequirements
 *     }
 */
@JvmInline
value class SparseImageMemoryRequirements2(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var memoryRequirements: SparseImageMemoryRequirements
		get()      = SparseImageMemoryRequirements(address + 16)
		set(value) = Unsafe.copy(value.address, address + 16, 48)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 64
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = SparseImageMemoryRequirements2(offset(index))
		
		operator fun set(index: Int, value: SparseImageMemoryRequirements2) = Unsafe.copy(value.address, offset(index), 64)
		
		inline fun forEach(block: (SparseImageMemoryRequirements2) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (SparseImageMemoryRequirements2) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, SparseImageMemoryRequirements2) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}