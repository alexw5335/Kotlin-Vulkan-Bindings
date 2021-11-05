// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.Unsafe

/**
 *     struct VkOffset2D {
 *         int32_t  x
 *         int32_t  y
 *     }
 */
@JvmInline
value class Offset2D(override val address: Long) : Addressable {
	
	
	var x: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var y: Int
		get()      = Unsafe.getInt(address + 4)
		set(value) = Unsafe.setInt(address + 4, value)


}