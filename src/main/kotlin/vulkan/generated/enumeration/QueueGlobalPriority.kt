// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkQueueGlobalPriorityEXT {
 *         LOW       = 128
 *         MEDIUM    = 256
 *         HIGH      = 512
 *         REALTIME  = 1024
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class QueueGlobalPriority(val id: Int) {
	
	
	val is_LOW get() = id == 128
	val is_MEDIUM get() = id == 256
	val is_HIGH get() = id == 512
	val is_REALTIME get() = id == 1024
	
	
	
	override fun toString() = when(id) {
		LOW.id -> "LOW"
		MEDIUM.id -> "MEDIUM"
		HIGH.id -> "HIGH"
		REALTIME.id -> "REALTIME"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val LOW get() = QueueGlobalPriority(128)
		val MEDIUM get() = QueueGlobalPriority(256)
		val HIGH get() = QueueGlobalPriority(512)
		val REALTIME get() = QueueGlobalPriority(1024)
	
	}


}