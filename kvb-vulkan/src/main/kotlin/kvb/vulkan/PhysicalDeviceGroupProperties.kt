// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkPhysicalDeviceGroupProperties {
 *         VkStructureType   sType
 *         void*             pNext (must be null)
 *         uint32_t          physicalDeviceCount
 *         VkPhysicalDevice  physicalDevices[32]
 *         VkBool32          subsetAllocation
 *     }
 */
@JvmInline
value class PhysicalDeviceGroupProperties(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var physicalDeviceCount: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var physicalDevices: DirectLongBuffer
		get()      = DirectLongBuffer(address + 24, 32)
		set(value) = Unsafe.copy(value.address, address + 24, value.byteSize)
	
	var subsetAllocation: Int
		get()      = Unsafe.getInt(address + 280)
		set(value) = Unsafe.setInt(address + 280, value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 288
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = PhysicalDeviceGroupProperties(offset(index))
		
		operator fun set(index: Int, value: PhysicalDeviceGroupProperties) = Unsafe.copy(value.address, offset(index), 288)
		
		inline fun forEach(block: (PhysicalDeviceGroupProperties) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (PhysicalDeviceGroupProperties) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, PhysicalDeviceGroupProperties) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}