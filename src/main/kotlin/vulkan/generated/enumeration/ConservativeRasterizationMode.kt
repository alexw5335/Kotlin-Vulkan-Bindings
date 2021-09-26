// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkConservativeRasterizationModeEXT {
 *         DISABLED       = 0
 *         OVERESTIMATE   = 1
 *         UNDERESTIMATE  = 2
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class ConservativeRasterizationMode(val id: Int) {
	
	
	val is_DISABLED get() = id == 0
	val is_OVERESTIMATE get() = id == 1
	val is_UNDERESTIMATE get() = id == 2
	
	
	
	override fun toString() = when(id) {
		DISABLED.id -> "DISABLED"
		OVERESTIMATE.id -> "OVERESTIMATE"
		UNDERESTIMATE.id -> "UNDERESTIMATE"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val DISABLED get() = ConservativeRasterizationMode(0)
		val OVERESTIMATE get() = ConservativeRasterizationMode(1)
		val UNDERESTIMATE get() = ConservativeRasterizationMode(2)
	
	}


}