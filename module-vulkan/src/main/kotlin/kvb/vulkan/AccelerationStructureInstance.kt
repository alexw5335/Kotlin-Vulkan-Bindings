// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_KHR_acceleration_structure

 *     struct VkAccelerationStructureInstanceKHR {
 *         VkTransformMatrixKHR        transform
 *         uint32_t                    instanceCustomIndex
 *         uint32_t                    mask
 *         uint32_t                    instanceShaderBindingTableRecordOffset
 *         VkGeometryInstanceFlagsKHR  flags
 *         uint64_t                    accelerationStructureReference
 *     }
 */
@JvmInline
value class AccelerationStructureInstance(override val address: Long) : Addressable {
	
	
	var transform: TransformMatrix
		get()      = TransformMatrix(address + 0)
		set(value) = Unsafe.copy(value.address, address + 0, 16)
	
	var instanceCustomIndex: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var mask: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var instanceShaderBindingTableRecordOffset: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var flags: GeometryInstanceFlags
		get()      = GeometryInstanceFlags(Unsafe.getInt(address + 28))
		set(value) = Unsafe.setInt(address + 28, value.value)
	
	var accelerationStructureReference: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)


}