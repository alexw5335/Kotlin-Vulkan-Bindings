// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe

/**
 *     struct VkBufferImageCopy2KHR {
 *         VkStructureType           sType
 *         void*                     pNext
 *         VkDeviceSize              bufferOffset
 *         uint32_t                  bufferRowLength
 *         uint32_t                  bufferImageHeight
 *         VkImageSubresourceLayers  imageSubresource
 *         VkOffset3D                imageOffset
 *         VkExtent3D                imageExtent
 *     }
 * 
 *     Valid pNext types:
 *         - VkCopyCommandTransformInfoQCOM
 */
@JvmInline
value class BufferImageCopy2(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var bufferOffset: Long
		get()      = Unsafe.getLong(address + 16)
		set(value) = Unsafe.setLong(address + 16, value)
	
	var bufferRowLength: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var bufferImageHeight: Int
		get()      = Unsafe.getInt(address + 28)
		set(value) = Unsafe.setInt(address + 28, value)
	
	var imageSubresource: ImageSubresourceLayers
		get()      = ImageSubresourceLayers(address + 32)
		set(value) = Unsafe.copy(value.address, address + 32, 16)
	
	var imageOffset: Offset3D
		get()      = Offset3D(address + 48)
		set(value) = Unsafe.copy(value.address, address + 48, 12)
	
	var imageExtent: Extent3D
		get()      = Extent3D(address + 60)
		set(value) = Unsafe.copy(value.address, address + 60, 12)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 72
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = BufferImageCopy2(offset(index))
		
		operator fun set(index: Int, value: BufferImageCopy2) = Unsafe.copy(value.address, offset(index), 72)
		
		inline fun forEach(block: (BufferImageCopy2) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (BufferImageCopy2) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, BufferImageCopy2) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}