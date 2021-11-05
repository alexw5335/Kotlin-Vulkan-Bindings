// This file has been automatically generated.

package kvb.vulkan

/**
 *     enum VkResolveModeFlagBits {
 *         VK_RESOLVE_MODE_NONE                 = 0
 *         VK_RESOLVE_MODE_SAMPLE_ZERO_BIT      = 1
 *         VK_RESOLVE_MODE_AVERAGE_BIT          = 2
 *         VK_RESOLVE_MODE_MIN_BIT              = 4
 *         VK_RESOLVE_MODE_MAX_BIT              = 8
 *         VK_RESOLVE_MODE_NONE_KHR             = 0
 *         VK_RESOLVE_MODE_SAMPLE_ZERO_BIT_KHR  = 1
 *         VK_RESOLVE_MODE_AVERAGE_BIT_KHR      = 2
 *         VK_RESOLVE_MODE_MIN_BIT_KHR          = 4
 *         VK_RESOLVE_MODE_MAX_BIT_KHR          = 8
 *     }
 */
@Suppress("unused")
@JvmInline
value class ResolveModeFlags(val value: Int) {
	
	
	companion object {
		
		val NONE = ResolveModeFlags(0)
		
		val SAMPLE_ZERO = ResolveModeFlags(1)
		
		val AVERAGE = ResolveModeFlags(2)
		
		val MIN = ResolveModeFlags(4)
		
		val MAX = ResolveModeFlags(8)
	
	}
	
	
	
	operator fun plus(mask: ResolveModeFlags) = ResolveModeFlags(value or mask.value)
	
	operator fun contains(mask: ResolveModeFlags) = value and mask.value == mask.value


}