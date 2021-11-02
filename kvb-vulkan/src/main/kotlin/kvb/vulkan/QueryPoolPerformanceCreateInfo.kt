// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkQueryPoolPerformanceCreateInfoKHR {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint32_t         queueFamilyIndex
 *         uint32_t         counterIndexCount
 *         uint32_t*        pCounterIndices
 *     }
 */
@JvmInline
value class QueryPoolPerformanceCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var queueFamilyIndex: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var counterIndexCount: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var pCounterIndices: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	
	
	var counterIndices: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getLong(address + 24), counterIndexCount)
		set(value) { Unsafe.setLong(address + 24, value.address); counterIndexCount = value.capacity }


}