// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_NV_ray_tracing_motion_blur

 *     struct VkAccelerationStructureSRTMotionInstanceNV {
 *         VkSRTDataNV                 transformT0
 *         VkSRTDataNV                 transformT1
 *         uint32_t                    instanceCustomIndex
 *         uint32_t                    mask
 *         uint32_t                    instanceShaderBindingTableRecordOffset
 *         VkGeometryInstanceFlagsKHR  flags
 *         uint64_t                    accelerationStructureReference
 *     }
 */
@JvmInline
value class AccelerationStructureSRTMotionInstance(override val address: Long) : Addressable {
	
	
	var transformT0: SRTData
		get()      = SRTData(address + 0)
		set(value) = Unsafe.copy(value.address, address + 0, 64)
	
	var transformT1: SRTData
		get()      = SRTData(address + 64)
		set(value) = Unsafe.copy(value.address, address + 64, 64)
	
	var instanceCustomIndex: Int
		get()      = Unsafe.getInt(address + 128)
		set(value) = Unsafe.setInt(address + 128, value)
	
	var mask: Int
		get()      = Unsafe.getInt(address + 132)
		set(value) = Unsafe.setInt(address + 132, value)
	
	var instanceShaderBindingTableRecordOffset: Int
		get()      = Unsafe.getInt(address + 136)
		set(value) = Unsafe.setInt(address + 136, value)
	
	var flags: GeometryInstanceFlags
		get()      = GeometryInstanceFlags(Unsafe.getInt(address + 140))
		set(value) = Unsafe.setInt(address + 140, value.value)
	
	var accelerationStructureReference: Long
		get()      = Unsafe.getLong(address + 144)
		set(value) = Unsafe.setLong(address + 144, value)


}