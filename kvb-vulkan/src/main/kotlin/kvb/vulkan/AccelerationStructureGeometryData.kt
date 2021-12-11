// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     union VkAccelerationStructureGeometryDataKHR {
 *         VkAccelerationStructureGeometryTrianglesDataKHR  triangles
 *         VkAccelerationStructureGeometryAabbsDataKHR      aabbs
 *         VkAccelerationStructureGeometryInstancesDataKHR  instances
 *     }
 */
@JvmInline
value class AccelerationStructureGeometryData(override val address: Long) : Addressable {
	
	
	var triangles: AccelerationStructureGeometryTrianglesData
		get()      = AccelerationStructureGeometryTrianglesData(address + 0)
		set(value) = Unsafe.copy(value.address, address + 0, 64)
	
	var aabbs: AccelerationStructureGeometryAabbsData
		get()      = AccelerationStructureGeometryAabbsData(address + 0)
		set(value) = Unsafe.copy(value.address, address + 0, 32)
	
	var instances: AccelerationStructureGeometryInstancesData
		get()      = AccelerationStructureGeometryInstancesData(address + 0)
		set(value) = Unsafe.copy(value.address, address + 0, 32)


}