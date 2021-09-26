// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkPerformanceCounterDescriptionFlagBitsKHR {
 *         PERFORMANCE_IMPACTING      = 1
 *         PERFORMANCE_IMPACTING_KHR  = 1
 *         CONCURRENTLY_IMPACTED      = 2
 *         CONCURRENTLY_IMPACTED_KHR  = 2
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class PerformanceCounterDescriptionFlags(val bitfield: Int) {
	
	
	val is_PERFORMANCE_IMPACTING get() = bitfield and 1 != 0
	val is_PERFORMANCE_IMPACTING_KHR get() = bitfield and 1 != 0
	val is_CONCURRENTLY_IMPACTED get() = bitfield and 2 != 0
	val is_CONCURRENTLY_IMPACTED_KHR get() = bitfield and 2 != 0
	
	
	
	infix operator fun plus(other: PerformanceCounterDescriptionFlags) = PerformanceCounterDescriptionFlags(bitfield or other.bitfield)
	
	infix operator fun plus(other: Int) = PerformanceCounterDescriptionFlags(bitfield or other)
	
	infix fun containsAll(mask: PerformanceCounterDescriptionFlags) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Int) = bitfield and mask == mask
	
	infix fun containsSome(mask: PerformanceCounterDescriptionFlags) = bitfield and mask.bitfield != 0
	
	infix fun containsSome(mask: Int) = bitfield and mask != 0
	
	
	
	override fun toString() = buildString {
		append("{ ")
		if(is_PERFORMANCE_IMPACTING) append("PERFORMANCE_IMPACTING, ")
		if(is_PERFORMANCE_IMPACTING_KHR) append("PERFORMANCE_IMPACTING_KHR, ")
		if(is_CONCURRENTLY_IMPACTED) append("CONCURRENTLY_IMPACTED, ")
		if(is_CONCURRENTLY_IMPACTED_KHR) append("CONCURRENTLY_IMPACTED_KHR, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = PerformanceCounterDescriptionFlags(0)
		val ALL get() = PerformanceCounterDescriptionFlags(6)
		val PERFORMANCE_IMPACTING get() = PerformanceCounterDescriptionFlags(1)
		val PERFORMANCE_IMPACTING_KHR get() = PerformanceCounterDescriptionFlags(1)
		val CONCURRENTLY_IMPACTED get() = PerformanceCounterDescriptionFlags(2)
		val CONCURRENTLY_IMPACTED_KHR get() = PerformanceCounterDescriptionFlags(2)
		
		inline fun compose(block: Companion.() -> PerformanceCounterDescriptionFlags) = block(Companion)
	
	}


}