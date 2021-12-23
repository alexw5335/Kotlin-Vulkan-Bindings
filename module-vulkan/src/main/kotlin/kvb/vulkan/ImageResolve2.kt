// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkImageResolve2KHR {
 *         VkStructureType           sType
 *         void*                     pNext (must be null)
 *         VkImageSubresourceLayers  srcSubresource
 *         VkOffset3D                srcOffset
 *         VkImageSubresourceLayers  dstSubresource
 *         VkOffset3D                dstOffset
 *         VkExtent3D                extent
 *     }
 */
@JvmInline
value class ImageResolve2(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var srcSubresource: ImageSubresourceLayers
		get()      = ImageSubresourceLayers(address + 16)
		set(value) = Unsafe.copy(value.address, address + 16, 16)
	
	var srcOffset: Offset3D
		get()      = Offset3D(address + 32)
		set(value) = Unsafe.copy(value.address, address + 32, 12)
	
	var dstSubresource: ImageSubresourceLayers
		get()      = ImageSubresourceLayers(address + 44)
		set(value) = Unsafe.copy(value.address, address + 44, 16)
	
	var dstOffset: Offset3D
		get()      = Offset3D(address + 60)
		set(value) = Unsafe.copy(value.address, address + 60, 12)
	
	var extent: Extent3D
		get()      = Extent3D(address + 72)
		set(value) = Unsafe.copy(value.address, address + 72, 12)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 88
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = ImageResolve2(offset(index))
		
		operator fun set(index: Int, value: ImageResolve2) = Unsafe.copy(value.address, offset(index), 88)
		
		inline fun forEach(block: (ImageResolve2) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (ImageResolve2) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, ImageResolve2) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}