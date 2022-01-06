// This file has been automatically generated.

package kvb.vulkan

/**
 *     // provided by VK_VERSION_1_1

 *     enum VkDeviceQueueCreateFlagBits {
 *         VK_DEVICE_QUEUE_CREATE_PROTECTED_BIT        = 1
 *         VK_DEVICE_QUEUE_CREATE_RESERVED_1_BIT_QCOM  = 2
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