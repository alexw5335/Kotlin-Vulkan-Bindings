// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.Unsafe

/**
 *     union VkPipelineExecutableStatisticValueKHR {
 *         VkBool32  b32
 *         int64_t   i64
 *         uint64_t  u64
 *         double    f64
 *     }
 */
@JvmInline
value class PipelineExecutableStatisticValue(override val address: Long) : Addressable {
	
	
	var b32: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var i64: Long
		get()      = Unsafe.getLong(address + 0)
		set(value) = Unsafe.setLong(address + 0, value)
	
	var u64: Long
		get()      = Unsafe.getLong(address + 0)
		set(value) = Unsafe.setLong(address + 0, value)
	
	var f64: Double
		get()      = Unsafe.getDouble(address + 0)
		set(value) = Unsafe.setDouble(address + 0, value)


}