// This file has been automatically generated.

package kvb.vulkan

/**
 *     // provided by VK_KHR_acceleration_structure

 *     enum VkBuildAccelerationStructureFlagBitsKHR {
 *         VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_UPDATE_BIT_KHR       = 1
 *         VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_COMPACTION_BIT_KHR   = 2
 *         VK_BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_TRACE_BIT_KHR  = 4
 *         VK_BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_BUILD_BIT_KHR  = 8
 *         VK_BUILD_ACCELERATION_STRUCTURE_LOW_MEMORY_BIT_KHR         = 16
 *         VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_UPDATE_BIT_NV        = 1
 *         VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_COMPACTION_BIT_NV    = 2
 *         VK_BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_TRACE_BIT_NV   = 4
 *         VK_BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_BUILD_BIT_NV   = 8
 *         VK_BUILD_ACCELERATION_STRUCTURE_LOW_MEMORY_BIT_NV          = 16
 *         VK_BUILD_ACCELERATION_STRUCTURE_MOTION_BIT_NV              = 32
 *     }
 */
@Suppress("unused")
@JvmInline
value class BuildAccelerationStructureFlags(val value: Int) {
	
	
	companion object {
		
		val ALLOW_UPDATE = BuildAccelerationStructureFlags(1)
		
		val ALLOW_COMPACTION = BuildAccelerationStructureFlags(2)
		
		val PREFER_FAST_TRACE = BuildAccelerationStructureFlags(4)
		
		val PREFER_FAST_BUILD = BuildAccelerationStructureFlags(8)
		
		val LOW_MEMORY = BuildAccelerationStructureFlags(16)
		
		val MOTION = BuildAccelerationStructureFlags(32)
	
	}
	
	
	
	operator fun plus(mask: BuildAccelerationStructureFlags) = BuildAccelerationStructureFlags(value or mask.value)
	
	operator fun contains(mask: BuildAccelerationStructureFlags) = value and mask.value == mask.value


}