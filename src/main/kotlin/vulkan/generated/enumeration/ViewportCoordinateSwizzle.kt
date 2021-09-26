// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkViewportCoordinateSwizzleNV {
 *         POSITIVE_X  = 0
 *         NEGATIVE_X  = 1
 *         POSITIVE_Y  = 2
 *         NEGATIVE_Y  = 3
 *         POSITIVE_Z  = 4
 *         NEGATIVE_Z  = 5
 *         POSITIVE_W  = 6
 *         NEGATIVE_W  = 7
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class ViewportCoordinateSwizzle(val id: Int) {
	
	
	val is_POSITIVE_X get() = id == 0
	val is_NEGATIVE_X get() = id == 1
	val is_POSITIVE_Y get() = id == 2
	val is_NEGATIVE_Y get() = id == 3
	val is_POSITIVE_Z get() = id == 4
	val is_NEGATIVE_Z get() = id == 5
	val is_POSITIVE_W get() = id == 6
	val is_NEGATIVE_W get() = id == 7
	
	
	
	override fun toString() = when(id) {
		POSITIVE_X.id -> "POSITIVE_X"
		NEGATIVE_X.id -> "NEGATIVE_X"
		POSITIVE_Y.id -> "POSITIVE_Y"
		NEGATIVE_Y.id -> "NEGATIVE_Y"
		POSITIVE_Z.id -> "POSITIVE_Z"
		NEGATIVE_Z.id -> "NEGATIVE_Z"
		POSITIVE_W.id -> "POSITIVE_W"
		NEGATIVE_W.id -> "NEGATIVE_W"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val POSITIVE_X get() = ViewportCoordinateSwizzle(0)
		val NEGATIVE_X get() = ViewportCoordinateSwizzle(1)
		val POSITIVE_Y get() = ViewportCoordinateSwizzle(2)
		val NEGATIVE_Y get() = ViewportCoordinateSwizzle(3)
		val POSITIVE_Z get() = ViewportCoordinateSwizzle(4)
		val NEGATIVE_Z get() = ViewportCoordinateSwizzle(5)
		val POSITIVE_W get() = ViewportCoordinateSwizzle(6)
		val NEGATIVE_W get() = ViewportCoordinateSwizzle(7)
	
	}


}