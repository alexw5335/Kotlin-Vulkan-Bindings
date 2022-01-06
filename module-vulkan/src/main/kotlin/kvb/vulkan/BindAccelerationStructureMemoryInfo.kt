// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_NV_ray_tracing

 *     struct VkBindAccelerationStructureMemoryInfoNV {
 *         VkStructureType            sType
 *         void*                      pNext (must be null)
 *         VkAccelerationStructureNV  accelerationStructure
 *         VkDeviceMemory             memory
 *         VkDeviceSize               memoryOffset
 *         uint32_t                   deviceIndexCount
 *         uint32_t*                  pDeviceIndices
 *     }
 */
@JvmInline
value class BindAccelerationStructureMemoryInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var accelerationStructure: VkAccelerationStructureNVH
		get()      = VkAccelerationStructureNVH(Unsafe.getLong(address + 16))
		set(value) = Unsafe.setLong(address + 16, value.address)
	
	var memory: DeviceMemoryH
		get()      = DeviceMemoryH(Unsafe.getLong(address + 24))
		set(value) = Unsafe.setLong(address + 24, value.address)
	
	var memoryOffset: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)
	
	var deviceIndexCount: Int
		get()      = Unsafe.getInt(address + 40)
		set(value) = Unsafe.setInt(address + 40, value)
	
	var pDeviceIndices: Long
		get()      = Unsafe.getLong(address + 48)
		set(value) = Unsafe.setLong(address + 48, value)
	
	
	
	var deviceIndices: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getLong(address + 48), deviceIndexCount)
		set(value) { Unsafe.setLong(address + 48, value.address); deviceIndexCount = value.capacity }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 56
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = BindAccelerationStructureMemoryInfo(offset(index))
		
		operator fun set(index: Int, value: BindAccelerationStructureMemoryInfo) = Unsafe.copy(value.address, offset(index), 56)
		
		inline fun forEach(block: (BindAccelerationStructureMemoryInfo) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (BindAccelerationStructureMemoryInfo) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, BindAccelerationStructureMemoryInfo) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}