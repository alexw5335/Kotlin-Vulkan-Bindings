// This file has been automatically generated.

package kvb.vulkan

/**
 *     enum VkAccelerationStructureCreateFlagBitsKHR {
 *         VK_ACCELERATION_STRUCTURE_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_KHR  = 1
 *         VK_ACCELERATION_STRUCTURE_CREATE_RESERVED_BIT_2_NV                      = 4
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class AccelerationStructureCreateFlags(val value: Int) {
	
	
	companion object {
		
		val DEVICE_ADDRESS_CAPTURE_REPLAY = AccelerationStructureCreateFlags(1)
	
	}
	
	
	
	operator fun plus(mask: AccelerationStructureCreateFlags) = AccelerationStructureCreateFlags(value or mask.value)
	
	operator fun contains(mask: AccelerationStructureCreateFlags) = value and mask.value == mask.value


}