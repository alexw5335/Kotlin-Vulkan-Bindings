// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_EXT_hdr_metadata

 *     struct VkXYColorEXT {
 *         float  x
 *         float  y
 *     }
 */
@JvmInline
value class XYColor(override val address: Long) : Addressable {
	
	
	var x: Float
		get()      = Unsafe.getFloat(address + 0)
		set(value) = Unsafe.setFloat(address + 0, value)
	
	var y: Float
		get()      = Unsafe.getFloat(address + 4)
		set(value) = Unsafe.setFloat(address + 4, value)


}