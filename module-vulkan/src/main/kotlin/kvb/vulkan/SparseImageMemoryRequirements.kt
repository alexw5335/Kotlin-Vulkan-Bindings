// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_VERSION_1_0

 *     struct VkSparseImageMemoryRequirements {
 *         VkSparseImageFormatProperties  formatProperties
 *         uint32_t                       imageMipTailFirstLod
 *         VkDeviceSize                   imageMipTailSize
 *         VkDeviceSize                   imageMipTailOffset
 *         VkDeviceSize                   imageMipTailStride
 *     }
 */
@JvmInline
value class SparseImageMemoryRequirements(override val address: Long) : Addressable {
	
	
	var formatProperties: SparseImageFormatProperties
		get()      = SparseImageFormatProperties(address + 0)
		set(value) = Unsafe.copy(value.address, address + 0, 20)
	
	var imageMipTailFirstLod: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var imageMipTailSize: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var imageMipTailOffset: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)
	
	var imageMipTailStride: Long
		get()      = Unsafe.getLong(address + 40)
		set(value) = Unsafe.setLong(address + 40, value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 48
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = SparseImageMemoryRequirements(offset(index))
		
		operator fun set(index: Int, value: SparseImageMemoryRequirements) = Unsafe.copy(value.address, offset(index), 48)
		
		inline fun forEach(block: (SparseImageMemoryRequirements) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (SparseImageMemoryRequirements) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, SparseImageMemoryRequirements) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}