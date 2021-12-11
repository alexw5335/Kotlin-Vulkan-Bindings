// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkSetStateFlagsIndirectCommandNV {
 *         uint32_t  data
 *     }
 */
@JvmInline
value class SetStateFlagsIndirectCommand(override val address: Long) : Addressable {
	
	
	var data: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)


}