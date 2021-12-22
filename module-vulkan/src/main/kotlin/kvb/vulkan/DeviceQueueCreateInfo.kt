// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkDeviceQueueCreateInfo {
 *         VkStructureType           sType
 *         void*                     pNext
 *         VkDeviceQueueCreateFlags  flags
 *         uint32_t                  queueFamilyIndex
 *         uint32_t                  queueCount
 *         float*                    pQueuePriorities
 *     }
 * 
 *     Valid pNext types:
 *         - VkDeviceQueueGlobalPriorityCreateInfoEXT
 */
@JvmInline
value class DeviceQueueCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: DeviceQueueCreateFlags
		get()      = DeviceQueueCreateFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var queueFamilyIndex: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var queueCount: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var pQueuePriorities: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)
	
	
	
	var queuePriorities: DirectFloatBuffer
		get()      = DirectFloatBuffer(Unsafe.getLong(address + 32), queueCount)
		set(value) { Unsafe.setLong(address + 32, value.address); queueCount = value.capacity }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 40
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = DeviceQueueCreateInfo(offset(index))
		
		operator fun set(index: Int, value: DeviceQueueCreateInfo) = Unsafe.copy(value.address, offset(index), 40)
		
		inline fun forEach(block: (DeviceQueueCreateInfo) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (DeviceQueueCreateInfo) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, DeviceQueueCreateInfo) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}