// This file has been automatically generated.

package kvb.vulkan

/**
 *     // provided by VK_VERSION_1_0

 *     enum VkFramebufferCreateFlagBits {
 *         VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT      = 1
 *         VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT_KHR  = 1
 *     }
 */
@Suppress("unused")
@JvmInline
value class FramebufferCreateFlags(val value: Int) {
	
	
	companion object {
		
		val IMAGELESS = FramebufferCreateFlags(1)
	
	}
	
	
	
	operator fun plus(mask: FramebufferCreateFlags) = FramebufferCreateFlags(value or mask.value)
	
	operator fun contains(mask: FramebufferCreateFlags) = value and mask.value == mask.value


}