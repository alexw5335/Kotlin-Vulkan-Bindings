// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_VERSION_1_0

 *     struct VkSparseImageFormatProperties {
 *         VkImageAspectFlags        aspectMask
 *         VkExtent3D                imageGranularity
 *         VkSparseImageFormatFlags  flags
 *     }
 */
@JvmInline
value class SparseImageFormatProperties(override val address: Long) : Addressable {
	
	
	var aspectMask: ImageAspectFlags
		get()      = ImageAspectFlags(Unsafe.getInt(address + 0))
		set(value) = Unsafe.setInt(address + 0, value.value)
	
	var imageGranularity: Extent3D
		get()      = Extent3D(address + 4)
		set(value) = Unsafe.copy(value.address, address + 4, 12)
	
	var flags: SparseImageFormatFlags
		get()      = SparseImageFormatFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 20
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = SparseImageFormatProperties(offset(index))
		
		operator fun set(index: Int, value: SparseImageFormatProperties) = Unsafe.copy(value.address, offset(index), 20)
		
		inline fun forEach(block: (SparseImageFormatProperties) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (SparseImageFormatProperties) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, SparseImageFormatProperties) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}