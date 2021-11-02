// This file has been automatically generated.

package kvb.vulkan

/**
 *     enum VkQueryControlFlagBits {
 *         VK_QUERY_CONTROL_PRECISE_BIT  = 1
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class QueryControlFlags(val value: Int) {
	
	
	companion object {
		
		val PRECISE = QueryControlFlags(1)
	
	}
	
	
	
	operator fun plus(mask: QueryControlFlags) = QueryControlFlags(value or mask.value)
	
	operator fun contains(mask: QueryControlFlags) = value and mask.value == mask.value


}