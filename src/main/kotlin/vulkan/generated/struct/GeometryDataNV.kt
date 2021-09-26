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
 *     struct VkGeometryDataNV {
 *         VkGeometryTrianglesNV  triangles
 *         VkGeometryAABBNV       aabbs
 *     }
 */
@JvmInline
value class GeometryDataNV(override val address: Long) : Addressable {
	
	
	var triangles: GeometryTrianglesNV
		get()      = GeometryTrianglesNV(address + LAYOUT.offsets[0])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[0], value.structSize) }
	
	var aabbs: GeometryAABBNV
		get()      = GeometryAABBNV(address + LAYOUT.offsets[1])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[1], value.structSize) }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(GeometryTrianglesNV.LAYOUT)
			member(GeometryAABBNV.LAYOUT)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = GeometryDataNV(0)
		
		fun malloc(allocator: Allocator) = GeometryDataNV(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = GeometryDataNV(allocator.calloc(SIZE, ALIGNMENT))
	
	}


}