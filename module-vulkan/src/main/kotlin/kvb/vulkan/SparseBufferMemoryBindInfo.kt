// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkSparseBufferMemoryBindInfo {
 *         VkBuffer             buffer
 *         uint32_t             bindCount
 *         VkSparseMemoryBind*  pBinds
 *     }
 */
@JvmInline
value class SparseBufferMemoryBindInfo(override val address: Long) : Addressable {
	
	
	var buffer: BufferH
		get()      = BufferH(Unsafe.getLong(address + 0))
		set(value) = Unsafe.setLong(address + 0, value.address)
	
	var bindCount: Int
		get()      = Unsafe.getInt(address + 8)
		set(value) = Unsafe.setInt(address + 8, value)
	
	var pBinds: Long
		get()      = Unsafe.getLong(address + 16)
		set(value) = Unsafe.setLong(address + 16, value)
	
	
	
	var binds: SparseMemoryBind.Buffer
		get()      = SparseMemoryBind.Buffer(Unsafe.getLong(address + 16), bindCount)
		set(value) { Unsafe.setLong(address + 16, value.address); bindCount = value.capacity }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 24
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = SparseBufferMemoryBindInfo(offset(index))
		
		operator fun set(index: Int, value: SparseBufferMemoryBindInfo) = Unsafe.copy(value.address, offset(index), 24)
		
		inline fun forEach(block: (SparseBufferMemoryBindInfo) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (SparseBufferMemoryBindInfo) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, SparseBufferMemoryBindInfo) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}