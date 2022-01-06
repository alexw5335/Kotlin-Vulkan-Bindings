// This file has been automatically generated.

package kvb.vulkan

/**
 *     // provided by VK_VERSION_1_0

 *     enum VkQueryResultFlagBits {
 *         VK_QUERY_RESULT_64_BIT                 = 1
 *         VK_QUERY_RESULT_WAIT_BIT               = 2
 *         VK_QUERY_RESULT_WITH_AVAILABILITY_BIT  = 4
 *         VK_QUERY_RESULT_PARTIAL_BIT            = 8
 *         VK_QUERY_RESULT_WITH_STATUS_BIT_KHR    = 16
 *     }
 */
@Suppress("unused")
@JvmInline
value class QueryResultFlags(val value: Int) {
	
	
	companion object {
		
		val _64 = QueryResultFlags(1)
		
		val WAIT = QueryResultFlags(2)
		
		val WITH_AVAILABILITY = QueryResultFlags(4)
		
		val PARTIAL = QueryResultFlags(8)
		
		val WITH_STATUS = QueryResultFlags(16)
	
	}
	
	
	
	operator fun plus(mask: QueryResultFlags) = QueryResultFlags(value or mask.value)
	
	operator fun contains(mask: QueryResultFlags) = value and mask.value == mask.value


}