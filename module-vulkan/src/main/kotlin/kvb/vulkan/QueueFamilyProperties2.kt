// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_VERSION_1_1

 *     struct VkQueueFamilyProperties2 {
 *         VkStructureType          sType
 *         void*                    pNext
 *         VkQueueFamilyProperties  queueFamilyProperties
 *     }
 * 
 *     Valid pNext types:
 *         - VkQueueFamilyGlobalPriorityPropertiesEXT
 *         - VkQueueFamilyCheckpointPropertiesNV
 *         - VkQueueFamilyCheckpointProperties2NV
 *         - VkVideoQueueFamilyProperties2KHR
 *         - VkQueueFamilyQueryResultStatusProperties2KHR
 */
@JvmInline
value class QueueFamilyProperties2(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var queueFamilyProperties: QueueFamilyProperties
		get()      = QueueFamilyProperties(address + 16)
		set(value) = Unsafe.copy(value.address, address + 16, 24)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 40
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = QueueFamilyProperties2(offset(index))
		
		operator fun set(index: Int, value: QueueFamilyProperties2) = Unsafe.copy(value.address, offset(index), 40)
		
		inline fun forEach(block: (QueueFamilyProperties2) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (QueueFamilyProperties2) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, QueueFamilyProperties2) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}