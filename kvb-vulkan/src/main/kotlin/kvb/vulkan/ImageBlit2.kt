// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe

/**
 *     struct VkImageBlit2KHR {
 *         VkStructureType           sType
 *         void*                     pNext
 *         VkImageSubresourceLayers  srcSubresource
 *         VkOffset3D                srcOffsets[2]
 *         VkImageSubresourceLayers  dstSubresource
 *         VkOffset3D                dstOffsets[2]
 *     }
 * 
 *     Valid pNext types:
 *         - VkCopyCommandTransformInfoQCOM
 */
@JvmInline
value class ImageBlit2(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var srcSubresource: ImageSubresourceLayers
		get()      = ImageSubresourceLayers(address + 16)
		set(value) = Unsafe.copy(value.address, address + 16, 16)
	
	var srcOffsets: Offset3D.Buffer
		get()      = Offset3D.Buffer(address + 32, 2)
		set(value) = Unsafe.copy(value.address, address + 32, value.byteSize)
	
	var dstSubresource: ImageSubresourceLayers
		get()      = ImageSubresourceLayers(address + 56)
		set(value) = Unsafe.copy(value.address, address + 56, 16)
	
	var dstOffsets: Offset3D.Buffer
		get()      = Offset3D.Buffer(address + 72, 2)
		set(value) = Unsafe.copy(value.address, address + 72, value.byteSize)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 96
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = ImageBlit2(offset(index))
		
		operator fun set(index: Int, value: ImageBlit2) = Unsafe.copy(value.address, offset(index), 96)
		
		inline fun forEach(block: (ImageBlit2) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (ImageBlit2) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, ImageBlit2) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}