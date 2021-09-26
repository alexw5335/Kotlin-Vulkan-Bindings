// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkAccelerationStructureTypeNV {
 *         TOP_LEVEL        = 0
 *         BOTTOM_LEVEL     = 1
 *         GENERIC          = 2
 *         TOP_LEVEL_NV     = 0
 *         BOTTOM_LEVEL_NV  = 1
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class AccelerationStructureType(val id: Int) {
	
	
	val is_TOP_LEVEL get() = id == 0
	val is_BOTTOM_LEVEL get() = id == 1
	val is_GENERIC get() = id == 2
	val is_TOP_LEVEL_NV get() = id == 0
	val is_BOTTOM_LEVEL_NV get() = id == 1
	
	
	
	override fun toString() = when(id) {
		TOP_LEVEL.id -> "TOP_LEVEL"
		BOTTOM_LEVEL.id -> "BOTTOM_LEVEL"
		GENERIC.id -> "GENERIC"
		TOP_LEVEL_NV.id -> "TOP_LEVEL_NV"
		BOTTOM_LEVEL_NV.id -> "BOTTOM_LEVEL_NV"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val TOP_LEVEL get() = AccelerationStructureType(0)
		val BOTTOM_LEVEL get() = AccelerationStructureType(1)
		val GENERIC get() = AccelerationStructureType(2)
		val TOP_LEVEL_NV get() = AccelerationStructureType(0)
		val BOTTOM_LEVEL_NV get() = AccelerationStructureType(1)
	
	}


}