// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.Unsafe

/**
 *     struct VkGeometryDataNV {
 *         VkGeometryTrianglesNV  triangles
 *         VkGeometryAABBNV       aabbs
 *     }
 */
@JvmInline
value class GeometryData(override val address: Long) : Addressable {
	
	
	var triangles: GeometryTriangles
		get()      = GeometryTriangles(address + 0)
		set(value) = Unsafe.copy(value.address, address + 0, 96)
	
	var aabbs: GeometryAABB
		get()      = GeometryAABB(address + 96)
		set(value) = Unsafe.copy(value.address, address + 96, 40)


}