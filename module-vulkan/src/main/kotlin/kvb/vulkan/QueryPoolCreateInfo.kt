// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_VERSION_1_0

 *     struct VkQueryPoolCreateInfo {
 *         VkStructureType                sType
 *         void*                          pNext
 *         VkQueryPoolCreateFlags         flags (reserved, must be zero)
 *         VkQueryType                    queryType
 *         uint32_t                       queryCount
 *         VkQueryPipelineStatisticFlags  pipelineStatistics
 *     }
 * 
 *     Valid pNext types:
 *         - VkQueryPoolPerformanceCreateInfoKHR
 *         - VkQueryPoolPerformanceQueryCreateInfoINTEL
 *         - VkVideoProfileKHR
 *         - VkVideoDecodeH264ProfileEXT
 *         - VkVideoDecodeH265ProfileEXT
 *         - VkVideoEncodeH264ProfileEXT
 *         - VkVideoEncodeH265ProfileEXT
 */
@JvmInline
value class QueryPoolCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: Int
		get() = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var queryType: QueryType
		get()      = _QueryType(Unsafe.getInt(address + 20))
		set(value) = Unsafe.setInt(address + 20, value.value)
	
	var queryCount: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var pipelineStatistics: QueryPipelineStatisticFlags
		get()      = QueryPipelineStatisticFlags(Unsafe.getInt(address + 28))
		set(value) = Unsafe.setInt(address + 28, value.value)


}