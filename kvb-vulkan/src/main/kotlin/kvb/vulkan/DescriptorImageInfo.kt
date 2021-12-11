// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkDescriptorImageInfo {
 *         VkSampler      sampler
 *         VkImageView    imageView
 *         VkImageLayout  imageLayout
 *     }
 */
@JvmInline
value class DescriptorImageInfo(override val address: Long) : Addressable {
	
	
	var sampler: SamplerH
		get()      = SamplerH(Unsafe.getLong(address + 0))
		set(value) = Unsafe.setLong(address + 0, value.address)
	
	var imageView: ImageViewH
		get()      = ImageViewH(Unsafe.getLong(address + 8))
		set(value) = Unsafe.setLong(address + 8, value.address)
	
	var imageLayout: ImageLayout
		get()      = _ImageLayout(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 24
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = DescriptorImageInfo(offset(index))
		
		operator fun set(index: Int, value: DescriptorImageInfo) = Unsafe.copy(value.address, offset(index), 24)
		
		inline fun forEach(block: (DescriptorImageInfo) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (DescriptorImageInfo) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, DescriptorImageInfo) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}