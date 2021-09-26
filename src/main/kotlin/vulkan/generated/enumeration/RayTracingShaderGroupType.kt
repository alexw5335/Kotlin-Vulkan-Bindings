// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkRayTracingShaderGroupTypeNV {
 *         GENERAL                  = 0
 *         TRIANGLES_HIT_GROUP      = 1
 *         PROCEDURAL_HIT_GROUP     = 2
 *         GENERAL_NV               = 0
 *         TRIANGLES_HIT_GROUP_NV   = 1
 *         PROCEDURAL_HIT_GROUP_NV  = 2
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class RayTracingShaderGroupType(val id: Int) {
	
	
	val is_GENERAL get() = id == 0
	val is_TRIANGLES_HIT_GROUP get() = id == 1
	val is_PROCEDURAL_HIT_GROUP get() = id == 2
	val is_GENERAL_NV get() = id == 0
	val is_TRIANGLES_HIT_GROUP_NV get() = id == 1
	val is_PROCEDURAL_HIT_GROUP_NV get() = id == 2
	
	
	
	override fun toString() = when(id) {
		GENERAL.id -> "GENERAL"
		TRIANGLES_HIT_GROUP.id -> "TRIANGLES_HIT_GROUP"
		PROCEDURAL_HIT_GROUP.id -> "PROCEDURAL_HIT_GROUP"
		GENERAL_NV.id -> "GENERAL_NV"
		TRIANGLES_HIT_GROUP_NV.id -> "TRIANGLES_HIT_GROUP_NV"
		PROCEDURAL_HIT_GROUP_NV.id -> "PROCEDURAL_HIT_GROUP_NV"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val GENERAL get() = RayTracingShaderGroupType(0)
		val TRIANGLES_HIT_GROUP get() = RayTracingShaderGroupType(1)
		val PROCEDURAL_HIT_GROUP get() = RayTracingShaderGroupType(2)
		val GENERAL_NV get() = RayTracingShaderGroupType(0)
		val TRIANGLES_HIT_GROUP_NV get() = RayTracingShaderGroupType(1)
		val PROCEDURAL_HIT_GROUP_NV get() = RayTracingShaderGroupType(2)
	
	}


}