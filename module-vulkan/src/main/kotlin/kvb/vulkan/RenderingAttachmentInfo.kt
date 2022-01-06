// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_KHR_dynamic_rendering

 *     struct VkRenderingAttachmentInfoKHR {
 *         VkStructureType        sType
 *         void*                  pNext (must be null)
 *         VkImageView            imageView
 *         VkImageLayout          imageLayout
 *         VkResolveModeFlagBits  resolveMode
 *         VkImageView            resolveImageView
 *         VkImageLayout          resolveImageLayout
 *         VkAttachmentLoadOp     loadOp
 *         VkAttachmentStoreOp    storeOp
 *         VkClearValue           clearValue
 *     }
 */
@JvmInline
value class RenderingAttachmentInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var imageView: ImageViewH
		get()      = ImageViewH(Unsafe.getLong(address + 16))
		set(value) = Unsafe.setLong(address + 16, value.address)
	
	var imageLayout: ImageLayout
		get()      = _ImageLayout(Unsafe.getInt(address + 24))
		set(value) = Unsafe.setInt(address + 24, value.value)
	
	var resolveMode: ResolveModeFlags
		get()      = ResolveModeFlags(Unsafe.getInt(address + 28))
		set(value) = Unsafe.setInt(address + 28, value.value)
	
	var resolveImageView: ImageViewH
		get()      = ImageViewH(Unsafe.getLong(address + 32))
		set(value) = Unsafe.setLong(address + 32, value.address)
	
	var resolveImageLayout: ImageLayout
		get()      = _ImageLayout(Unsafe.getInt(address + 40))
		set(value) = Unsafe.setInt(address + 40, value.value)
	
	var loadOp: AttachmentLoadOp
		get()      = _AttachmentLoadOp(Unsafe.getInt(address + 44))
		set(value) = Unsafe.setInt(address + 44, value.value)
	
	var storeOp: AttachmentStoreOp
		get()      = _AttachmentStoreOp(Unsafe.getInt(address + 48))
		set(value) = Unsafe.setInt(address + 48, value.value)
	
	var clearValue: ClearValue
		get()      = ClearValue(address + 52)
		set(value) = Unsafe.copy(value.address, address + 52, 16)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 72
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = RenderingAttachmentInfo(offset(index))
		
		operator fun set(index: Int, value: RenderingAttachmentInfo) = Unsafe.copy(value.address, offset(index), 72)
		
		inline fun forEach(block: (RenderingAttachmentInfo) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (RenderingAttachmentInfo) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, RenderingAttachmentInfo) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}