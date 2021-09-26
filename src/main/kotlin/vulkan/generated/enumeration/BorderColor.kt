// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkBorderColor {
 *         FLOAT_TRANSPARENT_BLACK  = 0
 *         INT_TRANSPARENT_BLACK    = 1
 *         FLOAT_OPAQUE_BLACK       = 2
 *         INT_OPAQUE_BLACK         = 3
 *         FLOAT_OPAQUE_WHITE       = 4
 *         INT_OPAQUE_WHITE         = 5
 *         FLOAT_CUSTOM             = 1000287003
 *         INT_CUSTOM               = 1000287004
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class BorderColor(val id: Int) {
	
	
	val is_FLOAT_TRANSPARENT_BLACK get() = id == 0
	val is_INT_TRANSPARENT_BLACK get() = id == 1
	val is_FLOAT_OPAQUE_BLACK get() = id == 2
	val is_INT_OPAQUE_BLACK get() = id == 3
	val is_FLOAT_OPAQUE_WHITE get() = id == 4
	val is_INT_OPAQUE_WHITE get() = id == 5
	val is_FLOAT_CUSTOM get() = id == 1000287003
	val is_INT_CUSTOM get() = id == 1000287004
	
	
	
	override fun toString() = when(id) {
		FLOAT_TRANSPARENT_BLACK.id -> "FLOAT_TRANSPARENT_BLACK"
		INT_TRANSPARENT_BLACK.id -> "INT_TRANSPARENT_BLACK"
		FLOAT_OPAQUE_BLACK.id -> "FLOAT_OPAQUE_BLACK"
		INT_OPAQUE_BLACK.id -> "INT_OPAQUE_BLACK"
		FLOAT_OPAQUE_WHITE.id -> "FLOAT_OPAQUE_WHITE"
		INT_OPAQUE_WHITE.id -> "INT_OPAQUE_WHITE"
		FLOAT_CUSTOM.id -> "FLOAT_CUSTOM"
		INT_CUSTOM.id -> "INT_CUSTOM"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val FLOAT_TRANSPARENT_BLACK get() = BorderColor(0)
		val INT_TRANSPARENT_BLACK get() = BorderColor(1)
		val FLOAT_OPAQUE_BLACK get() = BorderColor(2)
		val INT_OPAQUE_BLACK get() = BorderColor(3)
		val FLOAT_OPAQUE_WHITE get() = BorderColor(4)
		val INT_OPAQUE_WHITE get() = BorderColor(5)
		val FLOAT_CUSTOM get() = BorderColor(1000287003)
		val INT_CUSTOM get() = BorderColor(1000287004)
	
	}


}