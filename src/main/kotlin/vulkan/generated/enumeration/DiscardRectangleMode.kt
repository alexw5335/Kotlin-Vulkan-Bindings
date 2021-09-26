// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkDiscardRectangleModeEXT {
 *         INCLUSIVE  = 0
 *         EXCLUSIVE  = 1
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class DiscardRectangleMode(val id: Int) {
	
	
	val is_INCLUSIVE get() = id == 0
	val is_EXCLUSIVE get() = id == 1
	
	
	
	override fun toString() = when(id) {
		INCLUSIVE.id -> "INCLUSIVE"
		EXCLUSIVE.id -> "EXCLUSIVE"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val INCLUSIVE get() = DiscardRectangleMode(0)
		val EXCLUSIVE get() = DiscardRectangleMode(1)
	
	}


}