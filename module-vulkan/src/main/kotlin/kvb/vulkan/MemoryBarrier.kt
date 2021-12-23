// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkMemoryBarrier {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkAccessFlags    srcAccessMask
 *         VkAccessFlags    dstAccessMask
 *     }
 */
@JvmInline
value class MemoryBarrier(override val address: Long) : Addressable {
	
	
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
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 24
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = MemoryBarrier(offset(index))
		
		operator fun set(index: Int, value: MemoryBarrier) = Unsafe.copy(value.address, offset(index), 24)
		
		inline fun forEach(block: (MemoryBarrier) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (MemoryBarrier) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, MemoryBarrier) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}