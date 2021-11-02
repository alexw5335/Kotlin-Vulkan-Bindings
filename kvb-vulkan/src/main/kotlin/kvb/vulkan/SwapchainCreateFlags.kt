// This file has been automatically generated.

package kvb.vulkan

/**
 *     enum VkSwapchainCreateFlagBitsKHR {
 *         VK_SWAPCHAIN_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT_KHR  = 1
 *         VK_SWAPCHAIN_CREATE_PROTECTED_BIT_KHR                    = 2
 *         VK_SWAPCHAIN_CREATE_MUTABLE_FORMAT_BIT_KHR               = 4
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class SwapchainCreateFlags(val value: Int) {
	
	
	companion object {
		
		val SPLIT_INSTANCE_BIND_REGIONS = SwapchainCreateFlags(1)
		
		val PROTECTED = SwapchainCreateFlags(2)
		
		val MUTABLE_FORMAT = SwapchainCreateFlags(4)
	
	}
	
	
	
	operator fun plus(mask: SwapchainCreateFlags) = SwapchainCreateFlags(value or mask.value)
	
	operator fun contains(mask: SwapchainCreateFlags) = value and mask.value == mask.value


}