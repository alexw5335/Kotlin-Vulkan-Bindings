// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkTimeDomainEXT {
 *         DEVICE                     = 0
 *         CLOCK_MONOTONIC            = 1
 *         CLOCK_MONOTONIC_RAW        = 2
 *         QUERY_PERFORMANCE_COUNTER  = 3
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class TimeDomain(val id: Int) {
	
	
	val is_DEVICE get() = id == 0
	val is_CLOCK_MONOTONIC get() = id == 1
	val is_CLOCK_MONOTONIC_RAW get() = id == 2
	val is_QUERY_PERFORMANCE_COUNTER get() = id == 3
	
	
	
	override fun toString() = when(id) {
		DEVICE.id -> "DEVICE"
		CLOCK_MONOTONIC.id -> "CLOCK_MONOTONIC"
		CLOCK_MONOTONIC_RAW.id -> "CLOCK_MONOTONIC_RAW"
		QUERY_PERFORMANCE_COUNTER.id -> "QUERY_PERFORMANCE_COUNTER"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val DEVICE get() = TimeDomain(0)
		val CLOCK_MONOTONIC get() = TimeDomain(1)
		val CLOCK_MONOTONIC_RAW get() = TimeDomain(2)
		val QUERY_PERFORMANCE_COUNTER get() = TimeDomain(3)
	
	}


}