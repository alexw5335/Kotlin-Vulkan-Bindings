// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkPerformanceValueINTEL {
 *         VkPerformanceValueTypeINTEL  type
 *         VkPerformanceValueDataINTEL  data
 *     }
 */
@JvmInline
value class PerformanceValue(override val address: Long) : Addressable {
	
	
	var type: PerformanceValueType
		get()      = PerformanceValueType.values().first { it.value == Unsafe.getInt(address + 0) }
		set(value) = Unsafe.setInt(address + 0, value.value)
	
	var data: PerformanceValueData
		get()      = PerformanceValueData(address + 8)
		set(value) = Unsafe.copy(value.address, address + 8, 8)


}