// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.Unsafe

/**
 *     struct VkPerformanceOverrideInfoINTEL {
 *         VkStructureType                 sType
 *         void*                           pNext (must be null)
 *         VkPerformanceOverrideTypeINTEL  type
 *         VkBool32                        enable
 *         uint64_t                        parameter
 *     }
 */
@JvmInline
value class PerformanceOverrideInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var type: PerformanceOverrideType
		get()      = _PerformanceOverrideType(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var enable: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var parameter: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)


}