// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkCopyDescriptorSet {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkDescriptorSet  srcSet
 *         uint32_t         srcBinding
 *         uint32_t         srcArrayElement
 *         VkDescriptorSet  dstSet
 *         uint32_t         dstBinding
 *         uint32_t         dstArrayElement
 *         uint32_t         descriptorCount
 *     }
 */
@JvmInline
value class CopyDescriptorSet(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var srcSet: DescriptorSetH
		get()      = DescriptorSetH(Unsafe.getLong(address + 16))
		set(value) = Unsafe.setLong(address + 16, value.address)
	
	var srcBinding: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var srcArrayElement: Int
		get()      = Unsafe.getInt(address + 28)
		set(value) = Unsafe.setInt(address + 28, value)
	
	var dstSet: DescriptorSetH
		get()      = DescriptorSetH(Unsafe.getLong(address + 32))
		set(value) = Unsafe.setLong(address + 32, value.address)
	
	var dstBinding: Int
		get()      = Unsafe.getInt(address + 40)
		set(value) = Unsafe.setInt(address + 40, value)
	
	var dstArrayElement: Int
		get()      = Unsafe.getInt(address + 44)
		set(value) = Unsafe.setInt(address + 44, value)
	
	var descriptorCount: Int
		get()      = Unsafe.getInt(address + 48)
		set(value) = Unsafe.setInt(address + 48, value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 56
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = CopyDescriptorSet(offset(index))
		
		operator fun set(index: Int, value: CopyDescriptorSet) = Unsafe.copy(value.address, offset(index), 56)
		
		inline fun forEach(block: (CopyDescriptorSet) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (CopyDescriptorSet) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, CopyDescriptorSet) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}