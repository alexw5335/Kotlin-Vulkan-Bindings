// This file has been automatically generated.

package kvb.vulkan

/**
 *     enum VkQueryType {
 *         VK_QUERY_TYPE_OCCLUSION                                      = 0
 *         VK_QUERY_TYPE_PIPELINE_STATISTICS                            = 1
 *         VK_QUERY_TYPE_TIMESTAMP                                      = 2
 *         VK_QUERY_TYPE_RESERVED_8                                     = 1000023008
 *         VK_QUERY_TYPE_RESERVED_4                                     = 1000024004
 *         VK_QUERY_TYPE_TRANSFORM_FEEDBACK_STREAM_EXT                  = 1000028004
 *         VK_QUERY_TYPE_PERFORMANCE_QUERY_KHR                          = 1000116000
 *         VK_QUERY_TYPE_ACCELERATION_STRUCTURE_COMPACTED_SIZE_KHR      = 1000150000
 *         VK_QUERY_TYPE_ACCELERATION_STRUCTURE_SERIALIZATION_SIZE_KHR  = 1000150001
 *         VK_QUERY_TYPE_ACCELERATION_STRUCTURE_COMPACTED_SIZE_NV       = 1000165000
 *         VK_QUERY_TYPE_PERFORMANCE_QUERY_INTEL                        = 1000210000
 *     }
 */
@Suppress("unused")
enum class QueryType(val value: Int) {
	
	
	OCCLUSION(0),
	
	PIPELINE_STATISTICS(1),
	
	TIMESTAMP(2),
	
	TRANSFORM_FEEDBACK_STREAM(1000028004),
	
	PERFORMANCE_QUERY_KHR(1000116000),
	
	ACCELERATION_STRUCTURE_COMPACTED_SIZE_KHR(1000150000),
	
	ACCELERATION_STRUCTURE_SERIALIZATION_SIZE(1000150001),
	
	ACCELERATION_STRUCTURE_COMPACTED_SIZE_NV(1000165000),
	
	PERFORMANCE_QUERY_INTEL(1000210000);


}