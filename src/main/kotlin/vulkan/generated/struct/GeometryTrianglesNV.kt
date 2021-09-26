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
value class GeometryTrianglesNV(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var vertexData: BufferH
		get()      = BufferH(Unsafe.getNativePointer(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[2], value.address) }
	
	var vertexOffset: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[3], value) }
	
	var vertexCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value) }
	
	var vertexStride: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[5], value) }
	
	var vertexFormat: Format
		get()      = Format(Unsafe.getInt(address + LAYOUT.offsets[6]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[6], value.id) }
	
	var indexData: BufferH
		get()      = BufferH(Unsafe.getNativePointer(address + LAYOUT.offsets[7]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[7], value.address) }
	
	var indexOffset: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[8])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[8], value) }
	
	var indexCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[9])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[9], value) }
	
	var indexType: IndexType
		get()      = IndexType(Unsafe.getInt(address + LAYOUT.offsets[10]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[10], value.id) }
	
	var transformData: BufferH
		get()      = BufferH(Unsafe.getNativePointer(address + LAYOUT.offsets[11]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[11], value.address) }
	
	var transformOffset: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[12])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[12], value) }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(NativeSizes.POINTER)
			member(8)
			member(4)
			member(8)
			member(4)
			member(NativeSizes.POINTER)
			member(8)
			member(4)
			member(4)
			member(NativeSizes.POINTER)
			member(8)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = GeometryTrianglesNV(0)
		
		fun malloc(allocator: Allocator) = GeometryTrianglesNV(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.GEOMETRY_TRIANGLES
		}
		
		fun calloc(allocator: Allocator) = GeometryTrianglesNV(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.GEOMETRY_TRIANGLES
		}
	
	}


}