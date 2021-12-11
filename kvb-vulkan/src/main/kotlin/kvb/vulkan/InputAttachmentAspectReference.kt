// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkInputAttachmentAspectReference {
 *         uint32_t            subpass
 *         uint32_t            inputAttachmentIndex
 *         VkImageAspectFlags  aspectMask
 *     }
 */
@JvmInline
value class InputAttachmentAspectReference(override val address: Long) : Addressable {
	
	
	var subpass: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var inputAttachmentIndex: Int
		get()      = Unsafe.getInt(address + 4)
		set(value) = Unsafe.setInt(address + 4, value)
	
	var aspectMask: ImageAspectFlags
		get()      = ImageAspectFlags(Unsafe.getInt(address + 8))
		set(value) = Unsafe.setInt(address + 8, value.value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 12
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = InputAttachmentAspectReference(offset(index))
		
		operator fun set(index: Int, value: InputAttachmentAspectReference) = Unsafe.copy(value.address, offset(index), 12)
		
		inline fun forEach(block: (InputAttachmentAspectReference) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (InputAttachmentAspectReference) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, InputAttachmentAspectReference) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}