// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkDescriptorPoolSize {
 *         VkDescriptorType  type
 *         uint32_t          descriptorCount
 *     }
 */
@JvmInline
value class DescriptorPoolSize(override val address: Long) : Addressable {
	
	
	var type: DescriptorType
		get()      = _DescriptorType(Unsafe.getInt(address + 0))
		set(value) = Unsafe.setInt(address + 0, value.value)
	
	var descriptorCount: Int
		get()      = Unsafe.getInt(address + 4)
		set(value) = Unsafe.setInt(address + 4, value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 8
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = DescriptorPoolSize(offset(index))
		
		operator fun set(index: Int, value: DescriptorPoolSize) = Unsafe.copy(value.address, offset(index), 8)
		
		inline fun forEach(block: (DescriptorPoolSize) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (DescriptorPoolSize) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, DescriptorPoolSize) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}