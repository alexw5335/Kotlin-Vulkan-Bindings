// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkPolygonMode {
 *         FILL            = 0
 *         LINE            = 1
 *         POINT           = 2
 *         FILL_RECTANGLE  = 1000153000
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class PolygonMode(val id: Int) {
	
	
	val is_FILL get() = id == 0
	val is_LINE get() = id == 1
	val is_POINT get() = id == 2
	val is_FILL_RECTANGLE get() = id == 1000153000
	
	
	
	override fun toString() = when(id) {
		FILL.id -> "FILL"
		LINE.id -> "LINE"
		POINT.id -> "POINT"
		FILL_RECTANGLE.id -> "FILL_RECTANGLE"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val FILL get() = PolygonMode(0)
		val LINE get() = PolygonMode(1)
		val POINT get() = PolygonMode(2)
		val FILL_RECTANGLE get() = PolygonMode(1000153000)
	
	}


}