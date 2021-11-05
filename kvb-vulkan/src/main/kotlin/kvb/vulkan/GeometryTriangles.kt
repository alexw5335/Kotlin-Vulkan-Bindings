// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.Unsafe

/**
 *     struct VkGeometryTrianglesNV {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkBuffer         vertexData
 *         VkDeviceSize     vertexOffset
 *         uint32_t         vertexCount
 *         VkDeviceSize     vertexStride
 *         VkFormat         vertexFormat
 *         VkBuffer         indexData
 *         VkDeviceSize     indexOffset
 *         uint32_t         indexCount
 *         VkIndexType      indexType
 *         VkBuffer         transformData
 *         VkDeviceSize     transformOffset
 *     }
 */
@JvmInline
value class GeometryTriangles(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var vertexData: BufferH
		get()      = BufferH(Unsafe.getLong(address + 16))
		set(value) = Unsafe.setLong(address + 16, value.address)
	
	var vertexOffset: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var vertexCount: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var vertexStride: Long
		get()      = Unsafe.getLong(address + 40)
		set(value) = Unsafe.setLong(address + 40, value)
	
	var vertexFormat: Format
		get()      = Format(Unsafe.getInt(address + 48))
		set(value) = Unsafe.setInt(address + 48, value.value)
	
	var indexData: BufferH
		get()      = BufferH(Unsafe.getLong(address + 56))
		set(value) = Unsafe.setLong(address + 56, value.address)
	
	var indexOffset: Long
		get()      = Unsafe.getLong(address + 64)
		set(value) = Unsafe.setLong(address + 64, value)
	
	var indexCount: Int
		get()      = Unsafe.getInt(address + 72)
		set(value) = Unsafe.setInt(address + 72, value)
	
	var indexType: IndexType
		get()      = _IndexType(Unsafe.getInt(address + 76))
		set(value) = Unsafe.setInt(address + 76, value.value)
	
	var transformData: BufferH
		get()      = BufferH(Unsafe.getLong(address + 80))
		set(value) = Unsafe.setLong(address + 80, value.address)
	
	var transformOffset: Long
		get()      = Unsafe.getLong(address + 88)
		set(value) = Unsafe.setLong(address + 88, value)


}