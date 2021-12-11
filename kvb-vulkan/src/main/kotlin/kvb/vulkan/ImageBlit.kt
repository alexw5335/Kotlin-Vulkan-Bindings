// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkImageBlit {
 *         VkImageSubresourceLayers  srcSubresource
 *         VkOffset3D                srcOffsets[2]
 *         VkImageSubresourceLayers  dstSubresource
 *         VkOffset3D                dstOffsets[2]
 *     }
 */
@JvmInline
value class ImageBlit(override val address: Long) : Addressable {
	
	
	var srcSubresource: ImageSubresourceLayers
		get()      = ImageSubresourceLayers(address + 0)
		set(value) = Unsafe.copy(value.address, address + 0, 16)
	
	var srcOffsets: Offset3D.Buffer
		get()      = Offset3D.Buffer(address + 16, 2)
		set(value) = Unsafe.copy(value.address, address + 16, value.byteSize)
	
	var dstSubresource: ImageSubresourceLayers
		get()      = ImageSubresourceLayers(address + 40)
		set(value) = Unsafe.copy(value.address, address + 40, 16)
	
	var dstOffsets: Offset3D.Buffer
		get()      = Offset3D.Buffer(address + 56, 2)
		set(value) = Unsafe.copy(value.address, address + 56, value.byteSize)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 80
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = ImageBlit(offset(index))
		
		operator fun set(index: Int, value: ImageBlit) = Unsafe.copy(value.address, offset(index), 80)
		
		inline fun forEach(block: (ImageBlit) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (ImageBlit) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, ImageBlit) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}