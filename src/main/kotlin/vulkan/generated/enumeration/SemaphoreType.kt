// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkSemaphoreTypeKHR {
 *         BINARY        = 0
 *         TIMELINE      = 1
 *         BINARY_KHR    = 0
 *         TIMELINE_KHR  = 1
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class SemaphoreType(val id: Int) {
	
	
	val is_BINARY get() = id == 0
	val is_TIMELINE get() = id == 1
	val is_BINARY_KHR get() = id == 0
	val is_TIMELINE_KHR get() = id == 1
	
	
	
	override fun toString() = when(id) {
		BINARY.id -> "BINARY"
		TIMELINE.id -> "TIMELINE"
		BINARY_KHR.id -> "BINARY_KHR"
		TIMELINE_KHR.id -> "TIMELINE_KHR"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val BINARY get() = SemaphoreType(0)
		val TIMELINE get() = SemaphoreType(1)
		val BINARY_KHR get() = SemaphoreType(0)
		val TIMELINE_KHR get() = SemaphoreType(1)
	
	}


}