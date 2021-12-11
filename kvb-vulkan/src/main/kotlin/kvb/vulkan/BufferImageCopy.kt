// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkBufferImageCopy {
 *         VkDeviceSize              bufferOffset
 *         uint32_t                  bufferRowLength
 *         uint32_t                  bufferImageHeight
 *         VkImageSubresourceLayers  imageSubresource
 *         VkOffset3D                imageOffset
 *         VkExtent3D                imageExtent
 *     }
 */
@JvmInline
value class BufferImageCopy(override val address: Long) : Addressable {
	
	
	var bufferOffset: Long
		get()      = Unsafe.getLong(address + 0)
		set(value) = Unsafe.setLong(address + 0, value)
	
	var bufferRowLength: Int
		get()      = Unsafe.getInt(address + 8)
		set(value) = Unsafe.setInt(address + 8, value)
	
	var bufferImageHeight: Int
		get()      = Unsafe.getInt(address + 12)
		set(value) = Unsafe.setInt(address + 12, value)
	
	var imageSubresource: ImageSubresourceLayers
		get()      = ImageSubresourceLayers(address + 16)
		set(value) = Unsafe.copy(value.address, address + 16, 16)
	
	var imageOffset: Offset3D
		get()      = Offset3D(address + 32)
		set(value) = Unsafe.copy(value.address, address + 32, 12)
	
	var imageExtent: Extent3D
		get()      = Extent3D(address + 44)
		set(value) = Unsafe.copy(value.address, address + 44, 12)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 56
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = BufferImageCopy(offset(index))
		
		operator fun set(index: Int, value: BufferImageCopy) = Unsafe.copy(value.address, offset(index), 56)
		
		inline fun forEach(block: (BufferImageCopy) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (BufferImageCopy) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, BufferImageCopy) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}