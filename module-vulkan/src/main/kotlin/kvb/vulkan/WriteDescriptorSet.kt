// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkWriteDescriptorSet {
 *         VkStructureType          sType
 *         void*                    pNext
 *         VkDescriptorSet          dstSet
 *         uint32_t                 dstBinding
 *         uint32_t                 dstArrayElement
 *         uint32_t                 descriptorCount
 *         VkDescriptorType         descriptorType
 *         VkDescriptorImageInfo*   pImageInfo
 *         VkDescriptorBufferInfo*  pBufferInfo
 *         VkBufferView*            pTexelBufferView
 *     }
 * 
 *     Valid pNext types:
 *         - VkWriteDescriptorSetInlineUniformBlockEXT
 *         - VkWriteDescriptorSetAccelerationStructureKHR
 *         - VkWriteDescriptorSetAccelerationStructureNV
 */
@JvmInline
value class WriteDescriptorSet(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var dstSet: DescriptorSetH
		get()      = DescriptorSetH(Unsafe.getLong(address + 16))
		set(value) = Unsafe.setLong(address + 16, value.address)
	
	var dstBinding: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var dstArrayElement: Int
		get()      = Unsafe.getInt(address + 28)
		set(value) = Unsafe.setInt(address + 28, value)
	
	var descriptorCount: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var descriptorType: DescriptorType
		get()      = _DescriptorType(Unsafe.getInt(address + 36))
		set(value) = Unsafe.setInt(address + 36, value.value)
	
	var pImageInfo: Long
		get()      = Unsafe.getLong(address + 40)
		set(value) = Unsafe.setLong(address + 40, value)
	
	var pBufferInfo: Long
		get()      = Unsafe.getLong(address + 48)
		set(value) = Unsafe.setLong(address + 48, value)
	
	var pTexelBufferView: Long
		get()      = Unsafe.getLong(address + 56)
		set(value) = Unsafe.setLong(address + 56, value)
	
	
	
	var imageInfo: DescriptorImageInfo.Buffer
		get()      = DescriptorImageInfo.Buffer(Unsafe.getLong(address + 40), descriptorCount)
		set(value) { Unsafe.setLong(address + 40, value.address); descriptorCount = value.capacity }
	
	var bufferInfo: DescriptorBufferInfo.Buffer
		get()      = DescriptorBufferInfo.Buffer(Unsafe.getLong(address + 48), descriptorCount)
		set(value) { Unsafe.setLong(address + 48, value.address); descriptorCount = value.capacity }
	
	var texelBufferView: DirectLongBuffer
		get()      = DirectLongBuffer(Unsafe.getLong(address + 56), descriptorCount)
		set(value) { Unsafe.setLong(address + 56, value.address); descriptorCount = value.capacity }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 64
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = WriteDescriptorSet(offset(index))
		
		operator fun set(index: Int, value: WriteDescriptorSet) = Unsafe.copy(value.address, offset(index), 64)
		
		inline fun forEach(block: (WriteDescriptorSet) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (WriteDescriptorSet) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, WriteDescriptorSet) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}