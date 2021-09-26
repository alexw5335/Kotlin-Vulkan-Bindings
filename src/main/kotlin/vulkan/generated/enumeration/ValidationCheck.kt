// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkValidationCheckEXT {
 *         ALL      = 0
 *         SHADERS  = 1
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class ValidationCheck(val id: Int) {
	
	
	val is_ALL get() = id == 0
	val is_SHADERS get() = id == 1
	
	
	
	override fun toString() = when(id) {
		ALL.id -> "ALL"
		SHADERS.id -> "SHADERS"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val ALL get() = ValidationCheck(0)
		val SHADERS get() = ValidationCheck(1)
	
	}


}