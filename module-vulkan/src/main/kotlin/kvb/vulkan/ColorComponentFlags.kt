// This file has been automatically generated.

package kvb.vulkan

/**
 *     enum VkColorComponentFlagBits {
 *         VK_COLOR_COMPONENT_R_BIT  = 1
 *         VK_COLOR_COMPONENT_G_BIT  = 2
 *         VK_COLOR_COMPONENT_B_BIT  = 4
 *         VK_COLOR_COMPONENT_A_BIT  = 8
 *     }
 */
@Suppress("unused")
@JvmInline
value class ColorComponentFlags(val value: Int) {
	
	
	companion object {
		
		val R = ColorComponentFlags(1)
		
		val G = ColorComponentFlags(2)
		
		val B = ColorComponentFlags(4)
		
		val A = ColorComponentFlags(8)
	
	}
	
	
	
	operator fun plus(mask: ColorComponentFlags) = ColorComponentFlags(value or mask.value)
	
	operator fun contains(mask: ColorComponentFlags) = value and mask.value == mask.value


}