// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_VERSION_1_0

 *     struct VkPipelineDynamicStateCreateInfo {
 *         VkStructureType                    sType
 *         void*                              pNext (must be null)
 *         VkPipelineDynamicStateCreateFlags  flags (reserved, must be zero)
 *         uint32_t                           dynamicStateCount
 *         VkDynamicState*                    pDynamicStates
 *     }
 */
@JvmInline
value class PipelineDynamicStateCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: Int
		get() = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var dynamicStateCount: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var pDynamicStates: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	
	
	var dynamicStates: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getLong(address + 24), dynamicStateCount)
		set(value) { Unsafe.setLong(address + 24, value.address); dynamicStateCount = value.capacity }


}