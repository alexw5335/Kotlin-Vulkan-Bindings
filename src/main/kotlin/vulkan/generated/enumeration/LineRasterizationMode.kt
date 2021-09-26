// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkLineRasterizationModeEXT {
 *         DEFAULT             = 0
 *         RECTANGULAR         = 1
 *         BRESENHAM           = 2
 *         RECTANGULAR_SMOOTH  = 3
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class LineRasterizationMode(val id: Int) {
	
	
	val is_DEFAULT get() = id == 0
	val is_RECTANGULAR get() = id == 1
	val is_BRESENHAM get() = id == 2
	val is_RECTANGULAR_SMOOTH get() = id == 3
	
	
	
	override fun toString() = when(id) {
		DEFAULT.id -> "DEFAULT"
		RECTANGULAR.id -> "RECTANGULAR"
		BRESENHAM.id -> "BRESENHAM"
		RECTANGULAR_SMOOTH.id -> "RECTANGULAR_SMOOTH"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val DEFAULT get() = LineRasterizationMode(0)
		val RECTANGULAR get() = LineRasterizationMode(1)
		val BRESENHAM get() = LineRasterizationMode(2)
		val RECTANGULAR_SMOOTH get() = LineRasterizationMode(3)
	
	}


}