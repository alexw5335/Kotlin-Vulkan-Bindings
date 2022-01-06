// This file has been automatically generated.

package kvb.vulkan

/**
 *     // provided by VK_KHR_performance_query

 *     enum VkPerformanceCounterDescriptionFlagBitsKHR {
 *         VK_PERFORMANCE_COUNTER_DESCRIPTION_PERFORMANCE_IMPACTING_BIT_KHR  = 1
 *         VK_PERFORMANCE_COUNTER_DESCRIPTION_PERFORMANCE_IMPACTING_KHR      = 1
 *         VK_PERFORMANCE_COUNTER_DESCRIPTION_CONCURRENTLY_IMPACTED_BIT_KHR  = 2
 *         VK_PERFORMANCE_COUNTER_DESCRIPTION_CONCURRENTLY_IMPACTED_KHR      = 2
 *     }
 */
@Suppress("unused")
@JvmInline
value class PerformanceCounterDescriptionFlags(val value: Int) {
	
	
	companion object {
		
		val PERFORMANCE_IMPACTING = PerformanceCounterDescriptionFlags(1)
		
		val CONCURRENTLY_IMPACTED = PerformanceCounterDescriptionFlags(2)
	
	}
	
	
	
	operator fun plus(mask: PerformanceCounterDescriptionFlags) = PerformanceCounterDescriptionFlags(value or mask.value)
	
	operator fun contains(mask: PerformanceCounterDescriptionFlags) = value and mask.value == mask.value


}