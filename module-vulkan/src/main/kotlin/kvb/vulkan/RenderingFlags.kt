// This file has been automatically generated.

package kvb.vulkan

/**
 *     // provided by VK_KHR_dynamic_rendering

 *     enum VkRenderingFlagBitsKHR {
 *         VK_RENDERING_CONTENTS_SECONDARY_COMMAND_BUFFERS_BIT_KHR  = 1
 *         VK_RENDERING_SUSPENDING_BIT_KHR                          = 2
 *         VK_RENDERING_RESUMING_BIT_KHR                            = 4
 *     }
 */
@Suppress("unused")
@JvmInline
value class RenderingFlags(val value: Int) {
	
	
	companion object {
		
		val CONTENTS_SECONDARY_COMMAND_BUFFERS = RenderingFlags(1)
		
		val SUSPENDING = RenderingFlags(2)
		
		val RESUMING = RenderingFlags(4)
	
	}
	
	
	
	operator fun plus(mask: RenderingFlags) = RenderingFlags(value or mask.value)
	
	operator fun contains(mask: RenderingFlags) = value and mask.value == mask.value


}