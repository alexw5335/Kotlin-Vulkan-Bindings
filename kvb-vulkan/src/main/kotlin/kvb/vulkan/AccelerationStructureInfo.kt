// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkAccelerationStructureInfoNV {
 *         VkStructureType                       sType
 *         void*                                 pNext (must be null)
 *         VkAccelerationStructureTypeKHR        type
 *         VkBuildAccelerationStructureFlagsKHR  flags
 *         uint32_t                              instanceCount
 *         uint32_t                              geometryCount
 *         VkGeometryNV*                         pGeometries
 *     }
 */
@JvmInline
value class AccelerationStructureInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var type: AccelerationStructureType
		get()      = _AccelerationStructureType(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var flags: BuildAccelerationStructureFlags
		get()      = BuildAccelerationStructureFlags(Unsafe.getInt(address + 20))
		set(value) = Unsafe.setInt(address + 20, value.value)
	
	var instanceCount: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var geometryCount: Int
		get()      = Unsafe.getInt(address + 28)
		set(value) = Unsafe.setInt(address + 28, value)
	
	var pGeometries: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)
	
	
	
	var geometries: Geometry.Buffer
		get()      = Geometry.Buffer(Unsafe.getLong(address + 32), geometryCount)
		set(value) { Unsafe.setLong(address + 32, value.address); geometryCount = value.capacity }


}