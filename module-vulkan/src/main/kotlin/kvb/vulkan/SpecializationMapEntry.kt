// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkSpecializationMapEntry {
 *         uint32_t  constantID
 *         uint32_t  offset
 *         size_t    size
 *     }
 */
@JvmInline
value class SpecializationMapEntry(override val address: Long) : Addressable {
	
	
	var constantID: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var offset: Int
		get()      = Unsafe.getInt(address + 4)
		set(value) = Unsafe.setInt(address + 4, value)
	
	var size: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 16
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = SpecializationMapEntry(offset(index))
		
		operator fun set(index: Int, value: SpecializationMapEntry) = Unsafe.copy(value.address, offset(index), 16)
		
		inline fun forEach(block: (SpecializationMapEntry) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (SpecializationMapEntry) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, SpecializationMapEntry) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}