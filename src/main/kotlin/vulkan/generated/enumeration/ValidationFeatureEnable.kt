// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkValidationFeatureEnableEXT {
 *         GPU_ASSISTED                       = 0
 *         GPU_ASSISTED_RESERVE_BINDING_SLOT  = 1
 *         BEST_PRACTICES                     = 2
 *         DEBUG_PRINTF                       = 3
 *         SYNCHRONIZATION_VALIDATION         = 4
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class ValidationFeatureEnable(val id: Int) {
	
	
	val is_GPU_ASSISTED get() = id == 0
	val is_GPU_ASSISTED_RESERVE_BINDING_SLOT get() = id == 1
	val is_BEST_PRACTICES get() = id == 2
	val is_DEBUG_PRINTF get() = id == 3
	val is_SYNCHRONIZATION_VALIDATION get() = id == 4
	
	
	
	override fun toString() = when(id) {
		GPU_ASSISTED.id -> "GPU_ASSISTED"
		GPU_ASSISTED_RESERVE_BINDING_SLOT.id -> "GPU_ASSISTED_RESERVE_BINDING_SLOT"
		BEST_PRACTICES.id -> "BEST_PRACTICES"
		DEBUG_PRINTF.id -> "DEBUG_PRINTF"
		SYNCHRONIZATION_VALIDATION.id -> "SYNCHRONIZATION_VALIDATION"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val GPU_ASSISTED get() = ValidationFeatureEnable(0)
		val GPU_ASSISTED_RESERVE_BINDING_SLOT get() = ValidationFeatureEnable(1)
		val BEST_PRACTICES get() = ValidationFeatureEnable(2)
		val DEBUG_PRINTF get() = ValidationFeatureEnable(3)
		val SYNCHRONIZATION_VALIDATION get() = ValidationFeatureEnable(4)
	
	}


}