// This file has been automatically generated.

package vulkan.generated.struct

import memory.NativeSizes
import memory.type.DirectBuffer
import memory.struct.LayoutBuilder
import memory.allocation.Allocator
import memory.Unsafe
import memory.type.Addressable

import vulkan.generated.enumeration.*
import memory.primitive.*
import vulkan.generated.handle.*

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
value class AccelerationStructureGeometryTrianglesDataKHR(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var vertexFormat: Format
		get()      = Format(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.id) }
	
	var vertexData: DeviceOrHostAddressConstKHR
		get()      = DeviceOrHostAddressConstKHR(address + LAYOUT.offsets[3])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[3], value.structSize) }
	
	var vertexStride: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[4], value) }
	
	var maxVertex: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[5], value) }
	
	var indexType: IndexType
		get()      = IndexType(Unsafe.getInt(address + LAYOUT.offsets[6]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[6], value.id) }
	
	var indexData: DeviceOrHostAddressConstKHR
		get()      = DeviceOrHostAddressConstKHR(address + LAYOUT.offsets[7])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[7], value.structSize) }
	
	var transformData: DeviceOrHostAddressConstKHR
		get()      = DeviceOrHostAddressConstKHR(address + LAYOUT.offsets[8])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[8], value.structSize) }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(DeviceOrHostAddressConstKHR.LAYOUT)
			member(8)
			member(4)
			member(4)
			member(DeviceOrHostAddressConstKHR.LAYOUT)
			member(DeviceOrHostAddressConstKHR.LAYOUT)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = AccelerationStructureGeometryTrianglesDataKHR(0)
		
		fun malloc(allocator: Allocator) = AccelerationStructureGeometryTrianglesDataKHR(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.ACCELERATION_STRUCTURE_GEOMETRY_TRIANGLES_DATA
		}
		
		fun calloc(allocator: Allocator) = AccelerationStructureGeometryTrianglesDataKHR(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.ACCELERATION_STRUCTURE_GEOMETRY_TRIANGLES_DATA
		}
	
	}


}