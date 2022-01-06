// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_VERSION_1_0

 *     struct VkAttachmentDescription {
 *         VkAttachmentDescriptionFlags  flags
 *         VkFormat                      format
 *         VkSampleCountFlagBits         samples
 *         VkAttachmentLoadOp            loadOp
 *         VkAttachmentStoreOp           storeOp
 *         VkAttachmentLoadOp            stencilLoadOp
 *         VkAttachmentStoreOp           stencilStoreOp
 *         VkImageLayout                 initialLayout
 *         VkImageLayout                 finalLayout
 *     }
 */
@JvmInline
value class AttachmentDescription(override val address: Long) : Addressable {
	
	
	var flags: AttachmentDescriptionFlags
		get()      = AttachmentDescriptionFlags(Unsafe.getInt(address + 0))
		set(value) = Unsafe.setInt(address + 0, value.value)
	
	var format: Format
		get()      = Format(Unsafe.getInt(address + 4))
		set(value) = Unsafe.setInt(address + 4, value.value)
	
	var samples: SampleCountFlags
		get()      = SampleCountFlags(Unsafe.getInt(address + 8))
		set(value) = Unsafe.setInt(address + 8, value.value)
	
	var loadOp: AttachmentLoadOp
		get()      = _AttachmentLoadOp(Unsafe.getInt(address + 12))
		set(value) = Unsafe.setInt(address + 12, value.value)
	
	var storeOp: AttachmentStoreOp
		get()      = _AttachmentStoreOp(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var stencilLoadOp: AttachmentLoadOp
		get()      = _AttachmentLoadOp(Unsafe.getInt(address + 20))
		set(value) = Unsafe.setInt(address + 20, value.value)
	
	var stencilStoreOp: AttachmentStoreOp
		get()      = _AttachmentStoreOp(Unsafe.getInt(address + 24))
		set(value) = Unsafe.setInt(address + 24, value.value)
	
	var initialLayout: ImageLayout
		get()      = _ImageLayout(Unsafe.getInt(address + 28))
		set(value) = Unsafe.setInt(address + 28, value.value)
	
	var finalLayout: ImageLayout
		get()      = _ImageLayout(Unsafe.getInt(address + 32))
		set(value) = Unsafe.setInt(address + 32, value.value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 36
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = AttachmentDescription(offset(index))
		
		operator fun set(index: Int, value: AttachmentDescription) = Unsafe.copy(value.address, offset(index), 36)
		
		inline fun forEach(block: (AttachmentDescription) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (AttachmentDescription) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, AttachmentDescription) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}