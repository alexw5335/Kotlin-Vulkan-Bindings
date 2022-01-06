// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_VERSION_1_0

 *     struct VkQueueFamilyProperties {
 *         VkQueueFlags  queueFlags
 *         uint32_t      queueCount
 *         uint32_t      timestampValidBits
 *         VkExtent3D    minImageTransferGranularity
 *     }
 */
@JvmInline
value class QueueFamilyProperties(override val address: Long) : Addressable {
	
	
	var queueFlags: QueueFlags
		get()      = QueueFlags(Unsafe.getInt(address + 0))
		set(value) = Unsafe.setInt(address + 0, value.value)
	
	var queueCount: Int
		get()      = Unsafe.getInt(address + 4)
		set(value) = Unsafe.setInt(address + 4, value)
	
	var timestampValidBits: Int
		get()      = Unsafe.getInt(address + 8)
		set(value) = Unsafe.setInt(address + 8, value)
	
	var minImageTransferGranularity: Extent3D
		get()      = Extent3D(address + 12)
		set(value) = Unsafe.copy(value.address, address + 12, 12)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 24
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = QueueFamilyProperties(offset(index))
		
		operator fun set(index: Int, value: QueueFamilyProperties) = Unsafe.copy(value.address, offset(index), 24)
		
		inline fun forEach(block: (QueueFamilyProperties) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (QueueFamilyProperties) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, QueueFamilyProperties) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}