// This file has been automatically generated.

package kvb.vulkan

/**
 *     enum VkFenceCreateFlagBits {
 *         VK_FENCE_CREATE_SIGNALED_BIT  = 1
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class FenceCreateFlags(val value: Int) {
	
	
	companion object {
		
		val SIGNALED = FenceCreateFlags(1)
	
	}
	
	
	
	operator fun plus(mask: FenceCreateFlags) = FenceCreateFlags(value or mask.value)
	
	operator fun contains(mask: FenceCreateFlags) = value and mask.value == mask.value


}