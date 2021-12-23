// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkFramebufferAttachmentImageInfo {
 *         VkStructureType     sType
 *         void*               pNext (must be null)
 *         VkImageCreateFlags  flags
 *         VkImageUsageFlags   usage
 *         uint32_t            width
 *         uint32_t            height
 *         uint32_t            layerCount
 *         uint32_t            viewFormatCount
 *         VkFormat*           pViewFormats
 *     }
 */
@JvmInline
value class FramebufferAttachmentImageInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: ImageCreateFlags
		get()      = ImageCreateFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var usage: ImageUsageFlags
		get()      = ImageUsageFlags(Unsafe.getInt(address + 20))
		set(value) = Unsafe.setInt(address + 20, value.value)
	
	var width: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var height: Int
		get()      = Unsafe.getInt(address + 28)
		set(value) = Unsafe.setInt(address + 28, value)
	
	var layerCount: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var viewFormatCount: Int
		get()      = Unsafe.getInt(address + 36)
		set(value) = Unsafe.setInt(address + 36, value)
	
	var pViewFormats: Long
		get()      = Unsafe.getLong(address + 40)
		set(value) = Unsafe.setLong(address + 40, value)
	
	
	
	var viewFormats: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getLong(address + 40), viewFormatCount)
		set(value) { Unsafe.setLong(address + 40, value.address); viewFormatCount = value.capacity }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 48
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = FramebufferAttachmentImageInfo(offset(index))
		
		operator fun set(index: Int, value: FramebufferAttachmentImageInfo) = Unsafe.copy(value.address, offset(index), 48)
		
		inline fun forEach(block: (FramebufferAttachmentImageInfo) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (FramebufferAttachmentImageInfo) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, FramebufferAttachmentImageInfo) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}