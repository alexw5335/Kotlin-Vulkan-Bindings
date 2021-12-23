// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkImageSubresourceRange {
 *         VkImageAspectFlags  aspectMask
 *         uint32_t            baseMipLevel
 *         uint32_t            levelCount
 *         uint32_t            baseArrayLayer
 *         uint32_t            layerCount
 *     }
 */
@JvmInline
value class ImageSubresourceRange(override val address: Long) : Addressable {
	
	
	var aspectMask: ImageAspectFlags
		get()      = ImageAspectFlags(Unsafe.getInt(address + 0))
		set(value) = Unsafe.setInt(address + 0, value.value)
	
	var baseMipLevel: Int
		get()      = Unsafe.getInt(address + 4)
		set(value) = Unsafe.setInt(address + 4, value)
	
	var levelCount: Int
		get()      = Unsafe.getInt(address + 8)
		set(value) = Unsafe.setInt(address + 8, value)
	
	var baseArrayLayer: Int
		get()      = Unsafe.getInt(address + 12)
		set(value) = Unsafe.setInt(address + 12, value)
	
	var layerCount: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 20
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = ImageSubresourceRange(offset(index))
		
		operator fun set(index: Int, value: ImageSubresourceRange) = Unsafe.copy(value.address, offset(index), 20)
		
		inline fun forEach(block: (ImageSubresourceRange) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (ImageSubresourceRange) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, ImageSubresourceRange) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}