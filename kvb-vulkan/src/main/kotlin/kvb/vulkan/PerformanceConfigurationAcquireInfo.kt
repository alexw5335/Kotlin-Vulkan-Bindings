// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkPerformanceConfigurationAcquireInfoINTEL {
 *         VkStructureType                      sType
 *         void*                                pNext (must be null)
 *         VkPerformanceConfigurationTypeINTEL  type
 *     }
 */
@JvmInline
value class PerformanceConfigurationAcquireInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var type: PerformanceConfigurationType
		get()      = PerformanceConfigurationType.values().first { it.value == Unsafe.getInt(address + 16) }
		set(value) = Unsafe.setInt(address + 16, value.value)


}