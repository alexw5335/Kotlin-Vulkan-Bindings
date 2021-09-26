// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkAccelerationStructureCompatibilityKHR {
 *         COMPATIBLE    = 0
 *         INCOMPATIBLE  = 1
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class AccelerationStructureCompatibility(val id: Int) {
	
	
	val is_COMPATIBLE get() = id == 0
	val is_INCOMPATIBLE get() = id == 1
	
	
	
	override fun toString() = when(id) {
		COMPATIBLE.id -> "COMPATIBLE"
		INCOMPATIBLE.id -> "INCOMPATIBLE"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val COMPATIBLE get() = AccelerationStructureCompatibility(0)
		val INCOMPATIBLE get() = AccelerationStructureCompatibility(1)
	
	}


}