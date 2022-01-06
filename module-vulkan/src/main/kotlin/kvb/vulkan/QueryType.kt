// This file has been automatically generated.

package kvb.vulkan

/**
 *     // provided by VK_VERSION_1_0

 *     enum VkQueryType {
 *         VK_QUERY_TYPE_OCCLUSION                                      = 0
 *         VK_QUERY_TYPE_PIPELINE_STATISTICS                            = 1
 *         VK_QUERY_TYPE_TIMESTAMP                                      = 2
 *         VK_QUERY_TYPE_RESULT_STATUS_ONLY_KHR                         = 1000023000
 *         VK_QUERY_TYPE_TRANSFORM_FEEDBACK_STREAM_EXT                  = 1000028004
 *         VK_QUERY_TYPE_PERFORMANCE_QUERY_KHR                          = 1000116000
 *         VK_QUERY_TYPE_ACCELERATION_STRUCTURE_COMPACTED_SIZE_KHR      = 1000150000
 *         VK_QUERY_TYPE_ACCELERATION_STRUCTURE_SERIALIZATION_SIZE_KHR  = 1000150001
 *         VK_QUERY_TYPE_ACCELERATION_STRUCTURE_COMPACTED_SIZE_NV       = 1000165000
 *         VK_QUERY_TYPE_PERFORMANCE_QUERY_INTEL                        = 1000210000
 *         VK_QUERY_TYPE_VIDEO_ENCODE_BITSTREAM_BUFFER_RANGE_KHR        = 1000299000
 *     }
 */
@Suppress("unused")
enum class QueryType(val value: Int) {
	
	
	OCCLUSION(0),
	
	PIPELINE_STATISTICS(1),
	
	TIMESTAMP(2),
	
	RESULT_STATUS_ONLY(1000023000),
	
	TRANSFORM_FEEDBACK_STREAM(1000028004),
	
	PERFORMANCE_QUERY_KHR(1000116000),
	
	ACCELERATION_STRUCTURE_COMPACTED_SIZE_KHR(1000150000),
	
	ACCELERATION_STRUCTURE_SERIALIZATION_SIZE(1000150001),
	
	ACCELERATION_STRUCTURE_COMPACTED_SIZE_NV(1000165000),
	
	PERFORMANCE_QUERY_INTEL(1000210000),
	
	VIDEO_ENCODE_BITSTREAM_BUFFER_RANGE(1000299000);


}