// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkPresentModeKHR {
 *         IMMEDIATE                  = 0
 *         MAILBOX                    = 1
 *         FIFO                       = 2
 *         FIFO_RELAXED               = 3
 *         SHARED_DEMAND_REFRESH      = 1000111000
 *         SHARED_CONTINUOUS_REFRESH  = 1000111001
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class PresentMode(val id: Int) {
	
	
	val is_IMMEDIATE get() = id == 0
	val is_MAILBOX get() = id == 1
	val is_FIFO get() = id == 2
	val is_FIFO_RELAXED get() = id == 3
	val is_SHARED_DEMAND_REFRESH get() = id == 1000111000
	val is_SHARED_CONTINUOUS_REFRESH get() = id == 1000111001
	
	
	
	override fun toString() = when(id) {
		IMMEDIATE.id -> "IMMEDIATE"
		MAILBOX.id -> "MAILBOX"
		FIFO.id -> "FIFO"
		FIFO_RELAXED.id -> "FIFO_RELAXED"
		SHARED_DEMAND_REFRESH.id -> "SHARED_DEMAND_REFRESH"
		SHARED_CONTINUOUS_REFRESH.id -> "SHARED_CONTINUOUS_REFRESH"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val IMMEDIATE get() = PresentMode(0)
		val MAILBOX get() = PresentMode(1)
		val FIFO get() = PresentMode(2)
		val FIFO_RELAXED get() = PresentMode(3)
		val SHARED_DEMAND_REFRESH get() = PresentMode(1000111000)
		val SHARED_CONTINUOUS_REFRESH get() = PresentMode(1000111001)
	
	}


}