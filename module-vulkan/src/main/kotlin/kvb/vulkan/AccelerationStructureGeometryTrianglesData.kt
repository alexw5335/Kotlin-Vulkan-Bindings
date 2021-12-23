// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkAccelerationStructureGeometryTrianglesDataKHR {
 *         VkStructureType                sType
 *         void*                          pNext (must be null)
 *         VkFormat                       vertexFormat
 *         VkDeviceOrHostAddressConstKHR  vertexData
 *         VkDeviceSize                   vertexStride
 *         uint32_t                       maxVertex
 *         VkIndexType                    indexType
 *         VkDeviceOrHostAddressConstKHR  indexData
 *         VkDeviceOrHostAddressConstKHR  transformData
 *     }
 */
@JvmInline
value class AccelerationStructureGeometryTrianglesData(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var vertexFormat: Format
		get()      = Format(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var vertexData: DeviceOrHostAddressConst
		get()      = DeviceOrHostAddressConst(address + 24)
		set(value) = Unsafe.copy(value.address, address + 24, 8)
	
	var vertexStride: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)
	
	var maxVertex: Int
		get()      = Unsafe.getInt(address + 40)
		set(value) = Unsafe.setInt(address + 40, value)
	
	var indexType: IndexType
		get()      = _IndexType(Unsafe.getInt(address + 44))
		set(value) = Unsafe.setInt(address + 44, value.value)
	
	var indexData: DeviceOrHostAddressConst
		get()      = DeviceOrHostAddressConst(address + 48)
		set(value) = Unsafe.copy(value.address, address + 48, 8)
	
	var transformData: DeviceOrHostAddressConst
		get()      = DeviceOrHostAddressConst(address + 56)
		set(value) = Unsafe.copy(value.address, address + 56, 8)


}