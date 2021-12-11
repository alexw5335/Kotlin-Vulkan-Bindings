// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkDescriptorSetLayoutBinding {
 *         uint32_t            binding
 *         VkDescriptorType    descriptorType
 *         uint32_t            descriptorCount
 *         VkShaderStageFlags  stageFlags
 *         VkSampler*          pImmutableSamplers
 *     }
 */
@JvmInline
value class DescriptorSetLayoutBinding(override val address: Long) : Addressable {
	
	
	var binding: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var descriptorType: DescriptorType
		get()      = _DescriptorType(Unsafe.getInt(address + 4))
		set(value) = Unsafe.setInt(address + 4, value.value)
	
	var descriptorCount: Int
		get()      = Unsafe.getInt(address + 8)
		set(value) = Unsafe.setInt(address + 8, value)
	
	var stageFlags: ShaderStageFlags
		get()      = ShaderStageFlags(Unsafe.getInt(address + 12))
		set(value) = Unsafe.setInt(address + 12, value.value)
	
	var pImmutableSamplers: Long
		get()      = Unsafe.getLong(address + 16)
		set(value) = Unsafe.setLong(address + 16, value)
	
	
	
	var immutableSamplers: DirectLongBuffer
		get()      = DirectLongBuffer(Unsafe.getLong(address + 16), descriptorCount)
		set(value) { Unsafe.setLong(address + 16, value.address); descriptorCount = value.capacity }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 24
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = DescriptorSetLayoutBinding(offset(index))
		
		operator fun set(index: Int, value: DescriptorSetLayoutBinding) = Unsafe.copy(value.address, offset(index), 24)
		
		inline fun forEach(block: (DescriptorSetLayoutBinding) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (DescriptorSetLayoutBinding) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, DescriptorSetLayoutBinding) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}