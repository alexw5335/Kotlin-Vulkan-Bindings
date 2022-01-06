// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_NV_ray_tracing_motion_blur

 *     struct VkAccelerationStructureMotionInfoNV {
 *         VkStructureType                           sType
 *         void*                                     pNext (must be null)
 *         uint32_t                                  maxInstances
 *         VkAccelerationStructureMotionInfoFlagsNV  flags (reserved, must be zero)
 *     }
 */
@JvmInline
value class AccelerationStructureMotionInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var maxInstances: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var flags: Int
		get() = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)


}