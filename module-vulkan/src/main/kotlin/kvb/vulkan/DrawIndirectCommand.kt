// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_VERSION_1_0

 *     struct VkDrawIndirectCommand {
 *         uint32_t  vertexCount
 *         uint32_t  instanceCount
 *         uint32_t  firstVertex
 *         uint32_t  firstInstance
 *     }
 */
@JvmInline
value class DrawIndirectCommand(override val address: Long) : Addressable {
	
	
	var vertexCount: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var instanceCount: Int
		get()      = Unsafe.getInt(address + 4)
		set(value) = Unsafe.setInt(address + 4, value)
	
	var firstVertex: Int
		get()      = Unsafe.getInt(address + 8)
		set(value) = Unsafe.setInt(address + 8, value)
	
	var firstInstance: Int
		get()      = Unsafe.getInt(address + 12)
		set(value) = Unsafe.setInt(address + 12, value)


}