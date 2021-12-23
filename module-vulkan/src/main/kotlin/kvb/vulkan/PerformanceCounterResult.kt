// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     union VkPerformanceCounterResultKHR {
 *         int32_t   int32
 *         int64_t   int64
 *         uint32_t  uint32
 *         uint64_t  uint64
 *         float     float32
 *         double    float64
 *     }
 */
@JvmInline
value class PerformanceCounterResult(override val address: Long) : Addressable {
	
	
	var int32: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var int64: Long
		get()      = Unsafe.getLong(address + 0)
		set(value) = Unsafe.setLong(address + 0, value)
	
	var uint32: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var uint64: Long
		get()      = Unsafe.getLong(address + 0)
		set(value) = Unsafe.setLong(address + 0, value)
	
	var float32: Float
		get()      = Unsafe.getFloat(address + 0)
		set(value) = Unsafe.setFloat(address + 0, value)
	
	var float64: Double
		get()      = Unsafe.getDouble(address + 0)
		set(value) = Unsafe.setDouble(address + 0, value)


}