// This file has been automatically generated.

package kvb.vulkan

/**
 *     // provided by VK_KHR_acceleration_structure

 *     enum VkAccelerationStructureCreateFlagBitsKHR {
 *         VK_ACCELERATION_STRUCTURE_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_KHR  = 1
 *         VK_ACCELERATION_STRUCTURE_CREATE_MOTION_BIT_NV                          = 4
 *     }
 */
@Suppress("unused")
@JvmInline
value class AccelerationStructureCreateFlags(val value: Int) {
	
	
	companion object {
		
		val DEVICE_ADDRESS_CAPTURE_REPLAY = AccelerationStructureCreateFlags(1)
		
		val MOTION = AccelerationStructureCreateFlags(4)
	
	}
	
	
	
	operator fun plus(mask: AccelerationStructureCreateFlags) = AccelerationStructureCreateFlags(value or mask.value)
	
	operator fun contains(mask: AccelerationStructureCreateFlags) = value and mask.value == mask.value


}