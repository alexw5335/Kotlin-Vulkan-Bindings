// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_NV_device_generated_commands

 *     struct VkBindShaderGroupIndirectCommandNV {
 *         uint32_t  groupIndex
 *     }
 */
@JvmInline
value class BindShaderGroupIndirectCommand(override val address: Long) : Addressable {
	
	
	var groupIndex: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)


}