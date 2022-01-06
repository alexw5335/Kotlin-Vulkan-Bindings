// This file has been automatically generated.

package kvb.vulkan

/**
 *     // provided by VK_KHR_surface

 *     enum VkCompositeAlphaFlagBitsKHR {
 *         VK_COMPOSITE_ALPHA_OPAQUE_BIT_KHR           = 1
 *         VK_COMPOSITE_ALPHA_PRE_MULTIPLIED_BIT_KHR   = 2
 *         VK_COMPOSITE_ALPHA_POST_MULTIPLIED_BIT_KHR  = 4
 *         VK_COMPOSITE_ALPHA_INHERIT_BIT_KHR          = 8
 *     }
 */
@Suppress("unused")
@JvmInline
value class CompositeAlphaFlags(val value: Int) {
	
	
	companion object {
		
		val OPAQUE = CompositeAlphaFlags(1)
		
		val PRE_MULTIPLIED = CompositeAlphaFlags(2)
		
		val POST_MULTIPLIED = CompositeAlphaFlags(4)
		
		val INHERIT = CompositeAlphaFlags(8)
	
	}
	
	
	
	operator fun plus(mask: CompositeAlphaFlags) = CompositeAlphaFlags(value or mask.value)
	
	operator fun contains(mask: CompositeAlphaFlags) = value and mask.value == mask.value


}