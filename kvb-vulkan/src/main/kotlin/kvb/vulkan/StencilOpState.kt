// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkStencilOpState {
 *         VkStencilOp  failOp
 *         VkStencilOp  passOp
 *         VkStencilOp  depthFailOp
 *         VkCompareOp  compareOp
 *         uint32_t     compareMask
 *         uint32_t     writeMask
 *         uint32_t     reference
 *     }
 */
@JvmInline
value class StencilOpState(override val address: Long) : Addressable {
	
	
	var failOp: StencilOp
		get()      = StencilOp.values().first { it.value == Unsafe.getInt(address + 0) }
		set(value) = Unsafe.setInt(address + 0, value.value)
	
	var passOp: StencilOp
		get()      = StencilOp.values().first { it.value == Unsafe.getInt(address + 4) }
		set(value) = Unsafe.setInt(address + 4, value.value)
	
	var depthFailOp: StencilOp
		get()      = StencilOp.values().first { it.value == Unsafe.getInt(address + 8) }
		set(value) = Unsafe.setInt(address + 8, value.value)
	
	var compareOp: CompareOp
		get()      = CompareOp.values().first { it.value == Unsafe.getInt(address + 12) }
		set(value) = Unsafe.setInt(address + 12, value.value)
	
	var compareMask: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var writeMask: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var reference: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)


}