// This file has been automatically generated.

package kvb.vulkan

/**
 *     enum VkDeviceDiagnosticsConfigFlagBitsNV {
 *         VK_DEVICE_DIAGNOSTICS_CONFIG_ENABLE_SHADER_DEBUG_INFO_BIT_NV      = 1
 *         VK_DEVICE_DIAGNOSTICS_CONFIG_ENABLE_RESOURCE_TRACKING_BIT_NV      = 2
 *         VK_DEVICE_DIAGNOSTICS_CONFIG_ENABLE_AUTOMATIC_CHECKPOINTS_BIT_NV  = 4
 *     }
 */
@Suppress("unused")
@JvmInline
value class DeviceDiagnosticsConfigFlags(val value: Int) {
	
	
	companion object {
		
		val ENABLE_SHADER_DEBUG_INFO = DeviceDiagnosticsConfigFlags(1)
		
		val ENABLE_RESOURCE_TRACKING = DeviceDiagnosticsConfigFlags(2)
		
		val ENABLE_AUTOMATIC_CHECKPOINTS = DeviceDiagnosticsConfigFlags(4)
	
	}
	
	
	
	operator fun plus(mask: DeviceDiagnosticsConfigFlags) = DeviceDiagnosticsConfigFlags(value or mask.value)
	
	operator fun contains(mask: DeviceDiagnosticsConfigFlags) = value and mask.value == mask.value


}