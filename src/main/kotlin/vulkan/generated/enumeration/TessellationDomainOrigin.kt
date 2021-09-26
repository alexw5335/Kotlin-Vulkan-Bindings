// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkTessellationDomainOriginKHR {
 *         UPPER_LEFT      = 0
 *         LOWER_LEFT      = 1
 *         UPPER_LEFT_KHR  = 0
 *         LOWER_LEFT_KHR  = 1
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class TessellationDomainOrigin(val id: Int) {
	
	
	val is_UPPER_LEFT get() = id == 0
	val is_LOWER_LEFT get() = id == 1
	val is_UPPER_LEFT_KHR get() = id == 0
	val is_LOWER_LEFT_KHR get() = id == 1
	
	
	
	override fun toString() = when(id) {
		UPPER_LEFT.id -> "UPPER_LEFT"
		LOWER_LEFT.id -> "LOWER_LEFT"
		UPPER_LEFT_KHR.id -> "UPPER_LEFT_KHR"
		LOWER_LEFT_KHR.id -> "LOWER_LEFT_KHR"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val UPPER_LEFT get() = TessellationDomainOrigin(0)
		val LOWER_LEFT get() = TessellationDomainOrigin(1)
		val UPPER_LEFT_KHR get() = TessellationDomainOrigin(0)
		val LOWER_LEFT_KHR get() = TessellationDomainOrigin(1)
	
	}


}