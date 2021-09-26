// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkFrontFace {
 *         COUNTER_CLOCKWISE  = 0
 *         CLOCKWISE          = 1
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class FrontFace(val id: Int) {
	
	
	val is_COUNTER_CLOCKWISE get() = id == 0
	val is_CLOCKWISE get() = id == 1
	
	
	
	override fun toString() = when(id) {
		COUNTER_CLOCKWISE.id -> "COUNTER_CLOCKWISE"
		CLOCKWISE.id -> "CLOCKWISE"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val COUNTER_CLOCKWISE get() = FrontFace(0)
		val CLOCKWISE get() = FrontFace(1)
	
	}


}