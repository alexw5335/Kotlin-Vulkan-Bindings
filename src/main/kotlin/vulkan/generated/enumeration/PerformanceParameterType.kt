// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkPerformanceParameterTypeINTEL {
 *         HW_COUNTERS_SUPPORTED     = 0
 *         STREAM_MARKER_VALID_BITS  = 1
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class PerformanceParameterType(val id: Int) {
	
	
	val is_HW_COUNTERS_SUPPORTED get() = id == 0
	val is_STREAM_MARKER_VALID_BITS get() = id == 1
	
	
	
	override fun toString() = when(id) {
		HW_COUNTERS_SUPPORTED.id -> "HW_COUNTERS_SUPPORTED"
		STREAM_MARKER_VALID_BITS.id -> "STREAM_MARKER_VALID_BITS"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val HW_COUNTERS_SUPPORTED get() = PerformanceParameterType(0)
		val STREAM_MARKER_VALID_BITS get() = PerformanceParameterType(1)
	
	}


}