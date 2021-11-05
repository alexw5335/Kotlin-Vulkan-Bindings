// This file has been automatically generated.

package kvb.vulkan

/**
 *     enum VkCullModeFlagBits {
 *         VK_CULL_MODE_NONE            = 0
 *         VK_CULL_MODE_FRONT_BIT       = 1
 *         VK_CULL_MODE_BACK_BIT        = 2
 *         VK_CULL_MODE_FRONT_AND_BACK  = 0x00000003
 *     }
 */
@Suppress("unused")
@JvmInline
value class CullModeFlags(val value: Int) {
	
	
	companion object {
		
		val NONE = CullModeFlags(0)
		
		val FRONT = CullModeFlags(1)
		
		val BACK = CullModeFlags(2)
		
		val FRONT_AND_BACK = CullModeFlags(0x00000003)
	
	}
	
	
	
	operator fun plus(mask: CullModeFlags) = CullModeFlags(value or mask.value)
	
	operator fun contains(mask: CullModeFlags) = value and mask.value == mask.value


}