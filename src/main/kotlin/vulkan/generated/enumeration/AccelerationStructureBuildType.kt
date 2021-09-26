// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkAccelerationStructureBuildTypeKHR {
 *         HOST            = 0
 *         DEVICE          = 1
 *         HOST_OR_DEVICE  = 2
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class AccelerationStructureBuildType(val id: Int) {
	
	
	val is_HOST get() = id == 0
	val is_DEVICE get() = id == 1
	val is_HOST_OR_DEVICE get() = id == 2
	
	
	
	override fun toString() = when(id) {
		HOST.id -> "HOST"
		DEVICE.id -> "DEVICE"
		HOST_OR_DEVICE.id -> "HOST_OR_DEVICE"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val HOST get() = AccelerationStructureBuildType(0)
		val DEVICE get() = AccelerationStructureBuildType(1)
		val HOST_OR_DEVICE get() = AccelerationStructureBuildType(2)
	
	}


}