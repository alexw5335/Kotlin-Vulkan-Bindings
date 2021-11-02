// This file has been automatically generated.

package kvb.vulkan

/**
 *     enum VkSemaphoreWaitFlagBits {
 *         VK_SEMAPHORE_WAIT_ANY_BIT      = 1
 *         VK_SEMAPHORE_WAIT_ANY_BIT_KHR  = 1
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class SemaphoreWaitFlags(val value: Int) {
	
	
	companion object {
		
		val ANY = SemaphoreWaitFlags(1)
	
	}
	
	
	
	operator fun plus(mask: SemaphoreWaitFlags) = SemaphoreWaitFlags(value or mask.value)
	
	operator fun contains(mask: SemaphoreWaitFlags) = value and mask.value == mask.value


}