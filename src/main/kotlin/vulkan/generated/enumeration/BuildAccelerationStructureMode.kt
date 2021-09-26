// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkBuildAccelerationStructureModeKHR {
 *         BUILD   = 0
 *         UPDATE  = 1
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class BuildAccelerationStructureMode(val id: Int) {
	
	
	val is_BUILD get() = id == 0
	val is_UPDATE get() = id == 1
	
	
	
	override fun toString() = when(id) {
		BUILD.id -> "BUILD"
		UPDATE.id -> "UPDATE"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val BUILD get() = BuildAccelerationStructureMode(0)
		val UPDATE get() = BuildAccelerationStructureMode(1)
	
	}


}