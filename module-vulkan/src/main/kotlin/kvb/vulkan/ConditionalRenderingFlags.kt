// This file has been automatically generated.

package kvb.vulkan

/**
 *     // provided by VK_EXT_conditional_rendering

 *     enum VkConditionalRenderingFlagBitsEXT {
 *         VK_CONDITIONAL_RENDERING_INVERTED_BIT_EXT  = 1
 *     }
 */
@Suppress("unused")
@JvmInline
value class ConditionalRenderingFlags(val value: Int) {
	
	
	companion object {
		
		val INVERTED = ConditionalRenderingFlags(1)
	
	}
	
	
	
	operator fun plus(mask: ConditionalRenderingFlags) = ConditionalRenderingFlags(value or mask.value)
	
	operator fun contains(mask: ConditionalRenderingFlags) = value and mask.value == mask.value


}