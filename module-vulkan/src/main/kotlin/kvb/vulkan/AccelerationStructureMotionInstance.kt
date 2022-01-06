// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_NV_ray_tracing_motion_blur

 *     struct VkAccelerationStructureMotionInstanceNV {
 *         VkAccelerationStructureMotionInstanceTypeNV   type
 *         VkAccelerationStructureMotionInstanceFlagsNV  flags (reserved, must be zero)
 *         VkAccelerationStructureMotionInstanceDataNV   data
 *     }
 */
@JvmInline
value class AccelerationStructureMotionInstance(override val address: Long) : Addressable {
	
	
	var type: AccelerationStructureMotionInstanceType
		get()      = _AccelerationStructureMotionInstanceType(Unsafe.getInt(address + 0))
		set(value) = Unsafe.setInt(address + 0, value.value)
	
	var flags: Int
		get() = Unsafe.getInt(address + 4)
		set(value) = Unsafe.setInt(address + 4, value)
	
	var data: AccelerationStructureMotionInstanceData
		get()      = AccelerationStructureMotionInstanceData(address + 8)
		set(value) = Unsafe.copy(value.address, address + 8, 152)


}