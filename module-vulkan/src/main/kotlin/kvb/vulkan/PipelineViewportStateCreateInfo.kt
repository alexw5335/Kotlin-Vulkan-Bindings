// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkPipelineViewportStateCreateInfo {
 *         VkStructureType                     sType
 *         void*                               pNext
 *         VkPipelineViewportStateCreateFlags  flags (reserved, must be zero)
 *         uint32_t                            viewportCount
 *         VkViewport*                         pViewports
 *         uint32_t                            scissorCount
 *         VkRect2D*                           pScissors
 *     }
 * 
 *     Valid pNext types:
 *         - VkPipelineViewportWScalingStateCreateInfoNV
 *         - VkPipelineViewportSwizzleStateCreateInfoNV
 *         - VkPipelineViewportExclusiveScissorStateCreateInfoNV
 *         - VkPipelineViewportShadingRateImageStateCreateInfoNV
 *         - VkPipelineViewportCoarseSampleOrderStateCreateInfoNV
 */
@JvmInline
value class PipelineViewportStateCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: Int
		get() = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var viewportCount: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var pViewports: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var scissorCount: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var pScissors: Long
		get()      = Unsafe.getLong(address + 40)
		set(value) = Unsafe.setLong(address + 40, value)
	
	
	
	var viewports: Viewport.Buffer
		get()      = Viewport.Buffer(Unsafe.getLong(address + 24), viewportCount)
		set(value) { Unsafe.setLong(address + 24, value.address); viewportCount = value.capacity }
	
	var scissors: Rect2D.Buffer
		get()      = Rect2D.Buffer(Unsafe.getLong(address + 40), scissorCount)
		set(value) { Unsafe.setLong(address + 40, value.address); scissorCount = value.capacity }


}