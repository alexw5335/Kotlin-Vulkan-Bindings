// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.Unsafe

/**
 *     struct VkClearDepthStencilValue {
 *         float     depth
 *         uint32_t  stencil
 *     }
 */
@JvmInline
value class ClearDepthStencilValue(override val address: Long) : Addressable {
	
	
	var depth: Float
		get()      = Unsafe.getFloat(address + 0)
		set(value) = Unsafe.setFloat(address + 0, value)
	
	var stencil: Int
		get()      = Unsafe.getInt(address + 4)
		set(value) = Unsafe.setInt(address + 4, value)


}