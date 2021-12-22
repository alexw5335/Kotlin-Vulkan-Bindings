// This file has been automatically generated.

package kvb.vulkan

/**
 *     enum VkDependencyFlagBits {
 *         VK_DEPENDENCY_BY_REGION_BIT         = 1
 *         VK_DEPENDENCY_DEVICE_GROUP_BIT      = 4
 *         VK_DEPENDENCY_VIEW_LOCAL_BIT        = 2
 *         VK_DEPENDENCY_VIEW_LOCAL_BIT_KHR    = 2
 *         VK_DEPENDENCY_DEVICE_GROUP_BIT_KHR  = 4
 *     }
 */
@Suppress("unused")
@JvmInline
value class DependencyFlags(val value: Int) {
	
	
	companion object {
		
		val BY_REGION = DependencyFlags(1)
		
		val DEVICE_GROUP = DependencyFlags(4)
		
		val VIEW_LOCAL = DependencyFlags(2)
	
	}
	
	
	
	operator fun plus(mask: DependencyFlags) = DependencyFlags(value or mask.value)
	
	operator fun contains(mask: DependencyFlags) = value and mask.value == mask.value


}