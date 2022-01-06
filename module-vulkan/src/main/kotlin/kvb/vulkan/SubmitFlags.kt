// This file has been automatically generated.

package kvb.vulkan

/**
 *     // provided by VK_KHR_synchronization2

 *     enum VkSubmitFlagBitsKHR {
 *         VK_SUBMIT_PROTECTED_BIT_KHR  = 1
 *     }
 */
@Suppress("unused")
@JvmInline
value class SubmitFlags(val value: Int) {
	
	
	companion object {
		
		val PROTECTED = SubmitFlags(1)
	
	}
	
	
	
	operator fun plus(mask: SubmitFlags) = SubmitFlags(value or mask.value)
	
	operator fun contains(mask: SubmitFlags) = value and mask.value == mask.value


}