// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_NV_ray_tracing_motion_blur

 *     struct VkAccelerationStructureMatrixMotionInstanceNV {
 *         VkTransformMatrixKHR        transformT0
 *         VkTransformMatrixKHR        transformT1
 *         uint32_t                    instanceCustomIndex
 *         uint32_t                    mask
 *         uint32_t                    instanceShaderBindingTableRecordOffset
 *         VkGeometryInstanceFlagsKHR  flags
 *         uint64_t                    accelerationStructureReference
 *     }
 */
@JvmInline
value class AccelerationStructureMatrixMotionInstance(override val address: Long) : Addressable {
	
	
	var transformT0: TransformMatrix
		get()      = TransformMatrix(address + 0)
		set(value) = Unsafe.copy(value.address, address + 0, 16)
	
	var transformT1: TransformMatrix
		get()      = TransformMatrix(address + 16)
		set(value) = Unsafe.copy(value.address, address + 16, 16)
	
	var instanceCustomIndex: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var mask: Int
		get()      = Unsafe.getInt(address + 36)
		set(value) = Unsafe.setInt(address + 36, value)
	
	var instanceShaderBindingTableRecordOffset: Int
		get()      = Unsafe.getInt(address + 40)
		set(value) = Unsafe.setInt(address + 40, value)
	
	var flags: GeometryInstanceFlags
		get()      = GeometryInstanceFlags(Unsafe.getInt(address + 44))
		set(value) = Unsafe.setInt(address + 44, value.value)
	
	var accelerationStructureReference: Long
		get()      = Unsafe.getLong(address + 48)
		set(value) = Unsafe.setLong(address + 48, value)


}