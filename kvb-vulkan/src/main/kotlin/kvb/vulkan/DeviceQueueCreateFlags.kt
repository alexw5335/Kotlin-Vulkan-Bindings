// This file has been automatically generated.

package kvb.vulkan

/**
 *     enum VkDeviceQueueCreateFlagBits {
 *         VK_DEVICE_QUEUE_CREATE_PROTECTED_BIT  = 1
 *     }
 */
@Suppress("unused")
@JvmInline
value class DeviceQueueCreateFlags(val value: Int) {
	
	
	companion object {
		
		val PROTECTED = DeviceQueueCreateFlags(1)
	
	}
	
	
	
	operator fun plus(mask: DeviceQueueCreateFlags) = DeviceQueueCreateFlags(value or mask.value)
	
	operator fun contains(mask: DeviceQueueCreateFlags) = value and mask.value == mask.value


}