// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.Unsafe

/**
 *     union VkPerformanceValueDataINTEL {
 *         uint32_t  value32
 *         uint64_t  value64
 *         float     valueFloat
 *         VkBool32  valueBool
 *         char*     valueString
 *     }
 */
@JvmInline
value class PerformanceValueData(override val address: Long) : Addressable {
	
	
	var value32: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var value64: Long
		get()      = Unsafe.getLong(address + 0)
		set(value) = Unsafe.setLong(address + 0, value)
	
	var valueFloat: Float
		get()      = Unsafe.getFloat(address + 0)
		set(value) = Unsafe.setFloat(address + 0, value)
	
	var valueBool: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var valueString: Long
		get()      = Unsafe.getLong(address + 0)
		set(value) = Unsafe.setLong(address + 0, value)


}