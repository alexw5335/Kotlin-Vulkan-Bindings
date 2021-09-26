// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkValidationFeatureDisableEXT {
 *         ALL               = 0
 *         SHADERS           = 1
 *         THREAD_SAFETY     = 2
 *         API_PARAMETERS    = 3
 *         OBJECT_LIFETIMES  = 4
 *         CORE_CHECKS       = 5
 *         UNIQUE_HANDLES    = 6
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class ValidationFeatureDisable(val id: Int) {
	
	
	val is_ALL get() = id == 0
	val is_SHADERS get() = id == 1
	val is_THREAD_SAFETY get() = id == 2
	val is_API_PARAMETERS get() = id == 3
	val is_OBJECT_LIFETIMES get() = id == 4
	val is_CORE_CHECKS get() = id == 5
	val is_UNIQUE_HANDLES get() = id == 6
	
	
	
	override fun toString() = when(id) {
		ALL.id -> "ALL"
		SHADERS.id -> "SHADERS"
		THREAD_SAFETY.id -> "THREAD_SAFETY"
		API_PARAMETERS.id -> "API_PARAMETERS"
		OBJECT_LIFETIMES.id -> "OBJECT_LIFETIMES"
		CORE_CHECKS.id -> "CORE_CHECKS"
		UNIQUE_HANDLES.id -> "UNIQUE_HANDLES"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val ALL get() = ValidationFeatureDisable(0)
		val SHADERS get() = ValidationFeatureDisable(1)
		val THREAD_SAFETY get() = ValidationFeatureDisable(2)
		val API_PARAMETERS get() = ValidationFeatureDisable(3)
		val OBJECT_LIFETIMES get() = ValidationFeatureDisable(4)
		val CORE_CHECKS get() = ValidationFeatureDisable(5)
		val UNIQUE_HANDLES get() = ValidationFeatureDisable(6)
	
	}


}