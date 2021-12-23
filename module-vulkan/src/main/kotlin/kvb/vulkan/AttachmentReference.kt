// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkAttachmentReference {
 *         uint32_t       attachment
 *         VkImageLayout  layout
 *     }
 */
@JvmInline
value class AttachmentReference(override val address: Long) : Addressable {
	
	
	var attachment: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var layout: ImageLayout
		get()      = _ImageLayout(Unsafe.getInt(address + 4))
		set(value) = Unsafe.setInt(address + 4, value.value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 8
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = AttachmentReference(offset(index))
		
		operator fun set(index: Int, value: AttachmentReference) = Unsafe.copy(value.address, offset(index), 8)
		
		inline fun forEach(block: (AttachmentReference) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (AttachmentReference) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, AttachmentReference) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}