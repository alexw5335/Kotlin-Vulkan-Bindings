// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkDisplayEventTypeEXT {
 *         FIRST_PIXEL_OUT  = 0
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class DisplayEventType(val id: Int) {
	
	
	val is_FIRST_PIXEL_OUT get() = id == 0
	
	
	
	override fun toString() = when(id) {
		FIRST_PIXEL_OUT.id -> "FIRST_PIXEL_OUT"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val FIRST_PIXEL_OUT get() = DisplayEventType(0)
	
	}


}