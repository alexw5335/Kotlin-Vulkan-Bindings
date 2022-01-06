// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_NV_ray_tracing_motion_blur

 *     union VkAccelerationStructureMotionInstanceDataNV {
 *         VkAccelerationStructureInstanceKHR             staticInstance
 *         VkAccelerationStructureMatrixMotionInstanceNV  matrixMotionInstance
 *         VkAccelerationStructureSRTMotionInstanceNV     srtMotionInstance
 *     }
 */
@JvmInline
value class AccelerationStructureMotionInstanceData(override val address: Long) : Addressable {
	
	
	var staticInstance: AccelerationStructureInstance
		get()      = AccelerationStructureInstance(address + 0)
		set(value) = Unsafe.copy(value.address, address + 0, 40)
	
	var matrixMotionInstance: AccelerationStructureMatrixMotionInstance
		get()      = AccelerationStructureMatrixMotionInstance(address + 0)
		set(value) = Unsafe.copy(value.address, address + 0, 56)
	
	var srtMotionInstance: AccelerationStructureSRTMotionInstance
		get()      = AccelerationStructureSRTMotionInstance(address + 0)
		set(value) = Unsafe.copy(value.address, address + 0, 152)


}