// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkPerformanceCounterUnitKHR {
 *         GENERIC           = 0
 *         PERCENTAGE        = 1
 *         NANOSECONDS       = 2
 *         BYTES             = 3
 *         BYTES_PER_SECOND  = 4
 *         KELVIN            = 5
 *         WATTS             = 6
 *         VOLTS             = 7
 *         AMPS              = 8
 *         HERTZ             = 9
 *         CYCLES            = 10
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class PerformanceCounterUnit(val id: Int) {
	
	
	val is_GENERIC get() = id == 0
	val is_PERCENTAGE get() = id == 1
	val is_NANOSECONDS get() = id == 2
	val is_BYTES get() = id == 3
	val is_BYTES_PER_SECOND get() = id == 4
	val is_KELVIN get() = id == 5
	val is_WATTS get() = id == 6
	val is_VOLTS get() = id == 7
	val is_AMPS get() = id == 8
	val is_HERTZ get() = id == 9
	val is_CYCLES get() = id == 10
	
	
	
	override fun toString() = when(id) {
		GENERIC.id -> "GENERIC"
		PERCENTAGE.id -> "PERCENTAGE"
		NANOSECONDS.id -> "NANOSECONDS"
		BYTES.id -> "BYTES"
		BYTES_PER_SECOND.id -> "BYTES_PER_SECOND"
		KELVIN.id -> "KELVIN"
		WATTS.id -> "WATTS"
		VOLTS.id -> "VOLTS"
		AMPS.id -> "AMPS"
		HERTZ.id -> "HERTZ"
		CYCLES.id -> "CYCLES"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val GENERIC get() = PerformanceCounterUnit(0)
		val PERCENTAGE get() = PerformanceCounterUnit(1)
		val NANOSECONDS get() = PerformanceCounterUnit(2)
		val BYTES get() = PerformanceCounterUnit(3)
		val BYTES_PER_SECOND get() = PerformanceCounterUnit(4)
		val KELVIN get() = PerformanceCounterUnit(5)
		val WATTS get() = PerformanceCounterUnit(6)
		val VOLTS get() = PerformanceCounterUnit(7)
		val AMPS get() = PerformanceCounterUnit(8)
		val HERTZ get() = PerformanceCounterUnit(9)
		val CYCLES get() = PerformanceCounterUnit(10)
	
	}


}