// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkImageCopy {
 *         VkImageSubresourceLayers  srcSubresource
 *         VkOffset3D                srcOffset
 *         VkImageSubresourceLayers  dstSubresource
 *         VkOffset3D                dstOffset
 *         VkExtent3D                extent
 *     }
 */
@JvmInline
value class ImageCopy(override val address: Long) : Addressable {
	
	
	var srcSubresource: ImageSubresourceLayers
		get()      = ImageSubresourceLayers(address + 0)
		set(value) = Unsafe.copy(value.address, address + 0, 16)
	
	var srcOffset: Offset3D
		get()      = Offset3D(address + 16)
		set(value) = Unsafe.copy(value.address, address + 16, 12)
	
	var dstSubresource: ImageSubresourceLayers
		get()      = ImageSubresourceLayers(address + 28)
		set(value) = Unsafe.copy(value.address, address + 28, 16)
	
	var dstOffset: Offset3D
		get()      = Offset3D(address + 44)
		set(value) = Unsafe.copy(value.address, address + 44, 12)
	
	var extent: Extent3D
		get()      = Extent3D(address + 56)
		set(value) = Unsafe.copy(value.address, address + 56, 12)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 68
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = ImageCopy(offset(index))
		
		operator fun set(index: Int, value: ImageCopy) = Unsafe.copy(value.address, offset(index), 68)
		
		inline fun forEach(block: (ImageCopy) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (ImageCopy) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, ImageCopy) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}