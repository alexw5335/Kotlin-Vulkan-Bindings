// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkGeometryTypeNV {
 *         TRIANGLES     = 0
 *         AABBS         = 1
 *         INSTANCES     = 2
 *         TRIANGLES_NV  = 0
 *         AABBS_NV      = 1
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class GeometryType(val id: Int) {
	
	
	val is_TRIANGLES get() = id == 0
	val is_AABBS get() = id == 1
	val is_INSTANCES get() = id == 2
	val is_TRIANGLES_NV get() = id == 0
	val is_AABBS_NV get() = id == 1
	
	
	
	override fun toString() = when(id) {
		TRIANGLES.id -> "TRIANGLES"
		AABBS.id -> "AABBS"
		INSTANCES.id -> "INSTANCES"
		TRIANGLES_NV.id -> "TRIANGLES_NV"
		AABBS_NV.id -> "AABBS_NV"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val TRIANGLES get() = GeometryType(0)
		val AABBS get() = GeometryType(1)
		val INSTANCES get() = GeometryType(2)
		val TRIANGLES_NV get() = GeometryType(0)
		val AABBS_NV get() = GeometryType(1)
	
	}


}