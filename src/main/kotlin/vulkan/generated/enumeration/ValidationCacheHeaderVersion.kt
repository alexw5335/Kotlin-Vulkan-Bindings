// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkValidationCacheHeaderVersionEXT {
 *         ONE  = 1
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class ValidationCacheHeaderVersion(val id: Int) {
	
	
	val is_ONE get() = id == 1
	
	
	
	override fun toString() = when(id) {
		ONE.id -> "ONE"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val ONE get() = ValidationCacheHeaderVersion(1)
	
	}


}