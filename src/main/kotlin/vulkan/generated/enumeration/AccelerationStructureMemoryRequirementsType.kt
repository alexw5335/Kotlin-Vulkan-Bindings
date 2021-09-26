// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkAccelerationStructureMemoryRequirementsTypeNV {
 *         OBJECT          = 0
 *         BUILD_SCRATCH   = 1
 *         UPDATE_SCRATCH  = 2
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class AccelerationStructureMemoryRequirementsType(val id: Int) {
	
	
	val is_OBJECT get() = id == 0
	val is_BUILD_SCRATCH get() = id == 1
	val is_UPDATE_SCRATCH get() = id == 2
	
	
	
	override fun toString() = when(id) {
		OBJECT.id -> "OBJECT"
		BUILD_SCRATCH.id -> "BUILD_SCRATCH"
		UPDATE_SCRATCH.id -> "UPDATE_SCRATCH"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val OBJECT get() = AccelerationStructureMemoryRequirementsType(0)
		val BUILD_SCRATCH get() = AccelerationStructureMemoryRequirementsType(1)
		val UPDATE_SCRATCH get() = AccelerationStructureMemoryRequirementsType(2)
	
	}


}