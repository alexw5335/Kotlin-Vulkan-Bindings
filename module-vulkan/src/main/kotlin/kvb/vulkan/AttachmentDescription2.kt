// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkAttachmentDescription2 {
 *         VkStructureType               sType
 *         void*                         pNext
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
 * 
 *     Valid pNext types:
 *         - VkAttachmentDescriptionStencilLayout
 */
@JvmInline
value class AttachmentDescription2(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: AttachmentDescriptionFlags
		get()      = AttachmentDescriptionFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var format: Format
		get()      = Format(Unsafe.getInt(address + 20))
		set(value) = Unsafe.setInt(address + 20, value.value)
	
	var samples: SampleCountFlags
		get()      = SampleCountFlags(Unsafe.getInt(address + 24))
		set(value) = Unsafe.setInt(address + 24, value.value)
	
	var loadOp: AttachmentLoadOp
		get()      = _AttachmentLoadOp(Unsafe.getInt(address + 28))
		set(value) = Unsafe.setInt(address + 28, value.value)
	
	var storeOp: AttachmentStoreOp
		get()      = _AttachmentStoreOp(Unsafe.getInt(address + 32))
		set(value) = Unsafe.setInt(address + 32, value.value)
	
	var stencilLoadOp: AttachmentLoadOp
		get()      = _AttachmentLoadOp(Unsafe.getInt(address + 36))
		set(value) = Unsafe.setInt(address + 36, value.value)
	
	var stencilStoreOp: AttachmentStoreOp
		get()      = _AttachmentStoreOp(Unsafe.getInt(address + 40))
		set(value) = Unsafe.setInt(address + 40, value.value)
	
	var initialLayout: ImageLayout
		get()      = _ImageLayout(Unsafe.getInt(address + 44))
		set(value) = Unsafe.setInt(address + 44, value.value)
	
	var finalLayout: ImageLayout
		get()      = _ImageLayout(Unsafe.getInt(address + 48))
		set(value) = Unsafe.setInt(address + 48, value.value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 56
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = AttachmentDescription2(offset(index))
		
		operator fun set(index: Int, value: AttachmentDescription2) = Unsafe.copy(value.address, offset(index), 56)
		
		inline fun forEach(block: (AttachmentDescription2) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (AttachmentDescription2) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, AttachmentDescription2) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}