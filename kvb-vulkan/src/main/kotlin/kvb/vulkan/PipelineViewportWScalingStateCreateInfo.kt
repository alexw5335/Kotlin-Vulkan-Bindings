// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.Unsafe

/**
 *     struct VkPipelineViewportWScalingStateCreateInfoNV {
 *         VkStructureType        sType
 *         void*                  pNext (must be null)
 *         VkBool32               viewportWScalingEnable
 *         uint32_t               viewportCount
 *         VkViewportWScalingNV*  pViewportWScalings
 *     }
 */
@JvmInline
value class PipelineViewportWScalingStateCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var viewportWScalingEnable: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var viewportCount: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var pViewportWScalings: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	
	
	var viewportWScalings: ViewportWScaling.Buffer
		get()      = ViewportWScaling.Buffer(Unsafe.getLong(address + 24), viewportCount)
		set(value) { Unsafe.setLong(address + 24, value.address); viewportCount = value.capacity }


}