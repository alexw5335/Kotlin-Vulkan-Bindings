// This file has been automatically generated.

package kvb.vulkan

/**
 *     enum VkEventCreateFlagBits {
 *         VK_EVENT_CREATE_DEVICE_ONLY_BIT_KHR  = 1
 *     }
 */
@Suppress("unused")
@JvmInline
value class EventCreateFlags(val value: Int) {
	
	
	companion object {
		
		val DEVICE_ONLY = EventCreateFlags(1)
	
	}
	
	
	
	operator fun plus(mask: EventCreateFlags) = EventCreateFlags(value or mask.value)
	
	operator fun contains(mask: EventCreateFlags) = value and mask.value == mask.value


}