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
 *     union VkAccelerationStructureGeometryDataKHR
 *         VkAccelerationStructureGeometryTrianglesDataKHR  triangles
 *         VkAccelerationStructureGeometryAabbsDataKHR      aabbs
 *         VkAccelerationStructureGeometryInstancesDataKHR  instances
 *     }
 */
@JvmInline
value class AccelerationStructureGeometryDataKHR(override val address: Long) : Addressable {
	
	
	var triangles: AccelerationStructureGeometryTrianglesDataKHR
		get()      = AccelerationStructureGeometryTrianglesDataKHR(address + LAYOUT.offsets[0])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[0], value.structSize) }
	
	var aabbs: AccelerationStructureGeometryAabbsDataKHR
		get()      = AccelerationStructureGeometryAabbsDataKHR(address + LAYOUT.offsets[1])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[1], value.structSize) }
	
	var instances: AccelerationStructureGeometryInstancesDataKHR
		get()      = AccelerationStructureGeometryInstancesDataKHR(address + LAYOUT.offsets[2])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[2], value.structSize) }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildUnion {
			member(AccelerationStructureGeometryTrianglesDataKHR.LAYOUT)
			member(AccelerationStructureGeometryAabbsDataKHR.LAYOUT)
			member(AccelerationStructureGeometryInstancesDataKHR.LAYOUT)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = AccelerationStructureGeometryDataKHR(0)
		
		fun malloc(allocator: Allocator) = AccelerationStructureGeometryDataKHR(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = AccelerationStructureGeometryDataKHR(allocator.calloc(SIZE, ALIGNMENT))
	
	}


}