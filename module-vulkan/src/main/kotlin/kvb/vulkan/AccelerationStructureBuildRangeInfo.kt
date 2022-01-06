// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_KHR_acceleration_structure

 *     struct VkAccelerationStructureBuildRangeInfoKHR {
 *         uint32_t  primitiveCount
 *         uint32_t  primitiveOffset
 *         uint32_t  firstVertex
 *         uint32_t  transformOffset
 *     }
 */
@JvmInline
value class AccelerationStructureBuildRangeInfo(override val address: Long) : Addressable {
	
	
	var primitiveCount: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var primitiveOffset: Int
		get()      = Unsafe.getInt(address + 4)
		set(value) = Unsafe.setInt(address + 4, value)
	
	var firstVertex: Int
		get()      = Unsafe.getInt(address + 8)
		set(value) = Unsafe.setInt(address + 8, value)
	
	var transformOffset: Int
		get()      = Unsafe.getInt(address + 12)
		set(value) = Unsafe.setInt(address + 12, value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 16
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = AccelerationStructureBuildRangeInfo(offset(index))
		
		operator fun set(index: Int, value: AccelerationStructureBuildRangeInfo) = Unsafe.copy(value.address, offset(index), 16)
		
		inline fun forEach(block: (AccelerationStructureBuildRangeInfo) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (AccelerationStructureBuildRangeInfo) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, AccelerationStructureBuildRangeInfo) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}