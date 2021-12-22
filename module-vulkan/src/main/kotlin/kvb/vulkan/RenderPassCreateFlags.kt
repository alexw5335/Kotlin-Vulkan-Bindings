// This file has been automatically generated.

package kvb.vulkan

/**
 *     enum VkRenderPassCreateFlagBits {
 *         VK_RENDER_PASS_CREATE_RESERVED_0_BIT_KHR  = 1
 *         VK_RENDER_PASS_CREATE_TRANSFORM_BIT_QCOM  = 2
 *     }
 */
@Suppress("unused")
@JvmInline
value class RenderPassCreateFlags(val value: Int) {
	
	
	companion object {
		
		val TRANSFORM = RenderPassCreateFlags(2)
	
	}
	
	
	
	operator fun plus(mask: RenderPassCreateFlags) = RenderPassCreateFlags(value or mask.value)
	
	operator fun contains(mask: RenderPassCreateFlags) = value and mask.value == mask.value


}