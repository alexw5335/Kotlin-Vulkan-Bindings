// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkDependencyInfoKHR {
 *         VkStructureType             sType
 *         void*                       pNext (must be null)
 *         VkDependencyFlags           dependencyFlags
 *         uint32_t                    memoryBarrierCount
 *         VkMemoryBarrier2KHR*        pMemoryBarriers
 *         uint32_t                    bufferMemoryBarrierCount
 *         VkBufferMemoryBarrier2KHR*  pBufferMemoryBarriers
 *         uint32_t                    imageMemoryBarrierCount
 *         VkImageMemoryBarrier2KHR*   pImageMemoryBarriers
 *     }
 */
@JvmInline
value class DependencyInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var dependencyFlags: DependencyFlags
		get()      = DependencyFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var memoryBarrierCount: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var pMemoryBarriers: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var bufferMemoryBarrierCount: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var pBufferMemoryBarriers: Long
		get()      = Unsafe.getLong(address + 40)
		set(value) = Unsafe.setLong(address + 40, value)
	
	var imageMemoryBarrierCount: Int
		get()      = Unsafe.getInt(address + 48)
		set(value) = Unsafe.setInt(address + 48, value)
	
	var pImageMemoryBarriers: Long
		get()      = Unsafe.getLong(address + 56)
		set(value) = Unsafe.setLong(address + 56, value)
	
	
	
	var memoryBarriers: MemoryBarrier2.Buffer
		get()      = MemoryBarrier2.Buffer(Unsafe.getLong(address + 24), memoryBarrierCount)
		set(value) { Unsafe.setLong(address + 24, value.address); memoryBarrierCount = value.capacity }
	
	var bufferMemoryBarriers: BufferMemoryBarrier2.Buffer
		get()      = BufferMemoryBarrier2.Buffer(Unsafe.getLong(address + 40), bufferMemoryBarrierCount)
		set(value) { Unsafe.setLong(address + 40, value.address); bufferMemoryBarrierCount = value.capacity }
	
	var imageMemoryBarriers: ImageMemoryBarrier2.Buffer
		get()      = ImageMemoryBarrier2.Buffer(Unsafe.getLong(address + 56), imageMemoryBarrierCount)
		set(value) { Unsafe.setLong(address + 56, value.address); imageMemoryBarrierCount = value.capacity }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 64
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = DependencyInfo(offset(index))
		
		operator fun set(index: Int, value: DependencyInfo) = Unsafe.copy(value.address, offset(index), 64)
		
		inline fun forEach(block: (DependencyInfo) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (DependencyInfo) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, DependencyInfo) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}