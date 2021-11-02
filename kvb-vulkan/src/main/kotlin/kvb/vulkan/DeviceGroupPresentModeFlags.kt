// This file has been automatically generated.

package kvb.vulkan

/**
 *     enum VkDeviceGroupPresentModeFlagBitsKHR {
 *         VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHR               = 1
 *         VK_DEVICE_GROUP_PRESENT_MODE_REMOTE_BIT_KHR              = 2
 *         VK_DEVICE_GROUP_PRESENT_MODE_SUM_BIT_KHR                 = 4
 *         VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_MULTI_DEVICE_BIT_KHR  = 8
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class DeviceGroupPresentModeFlags(val value: Int) {
	
	
	companion object {
		
		val LOCAL = DeviceGroupPresentModeFlags(1)
		
		val REMOTE = DeviceGroupPresentModeFlags(2)
		
		val SUM = DeviceGroupPresentModeFlags(4)
		
		val LOCAL_MULTI_DEVICE = DeviceGroupPresentModeFlags(8)
	
	}
	
	
	
	operator fun plus(mask: DeviceGroupPresentModeFlags) = DeviceGroupPresentModeFlags(value or mask.value)
	
	operator fun contains(mask: DeviceGroupPresentModeFlags) = value and mask.value == mask.value


}