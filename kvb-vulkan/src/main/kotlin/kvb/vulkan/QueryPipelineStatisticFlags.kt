// This file has been automatically generated.

package kvb.vulkan

/**
 *     enum VkQueryPipelineStatisticFlagBits {
 *         VK_QUERY_PIPELINE_STATISTIC_INPUT_ASSEMBLY_VERTICES_BIT                     = 1
 *         VK_QUERY_PIPELINE_STATISTIC_INPUT_ASSEMBLY_PRIMITIVES_BIT                   = 2
 *         VK_QUERY_PIPELINE_STATISTIC_VERTEX_SHADER_INVOCATIONS_BIT                   = 4
 *         VK_QUERY_PIPELINE_STATISTIC_GEOMETRY_SHADER_INVOCATIONS_BIT                 = 8
 *         VK_QUERY_PIPELINE_STATISTIC_GEOMETRY_SHADER_PRIMITIVES_BIT                  = 16
 *         VK_QUERY_PIPELINE_STATISTIC_CLIPPING_INVOCATIONS_BIT                        = 32
 *         VK_QUERY_PIPELINE_STATISTIC_CLIPPING_PRIMITIVES_BIT                         = 64
 *         VK_QUERY_PIPELINE_STATISTIC_FRAGMENT_SHADER_INVOCATIONS_BIT                 = 128
 *         VK_QUERY_PIPELINE_STATISTIC_TESSELLATION_CONTROL_SHADER_PATCHES_BIT         = 256
 *         VK_QUERY_PIPELINE_STATISTIC_TESSELLATION_EVALUATION_SHADER_INVOCATIONS_BIT  = 512
 *         VK_QUERY_PIPELINE_STATISTIC_COMPUTE_SHADER_INVOCATIONS_BIT                  = 1024
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class QueryPipelineStatisticFlags(val value: Int) {
	
	
	companion object {
		
		val INPUT_ASSEMBLY_VERTICES = QueryPipelineStatisticFlags(1)
		
		val INPUT_ASSEMBLY_PRIMITIVES = QueryPipelineStatisticFlags(2)
		
		val VERTEX_SHADER_INVOCATIONS = QueryPipelineStatisticFlags(4)
		
		val GEOMETRY_SHADER_INVOCATIONS = QueryPipelineStatisticFlags(8)
		
		val GEOMETRY_SHADER_PRIMITIVES = QueryPipelineStatisticFlags(16)
		
		val CLIPPING_INVOCATIONS = QueryPipelineStatisticFlags(32)
		
		val CLIPPING_PRIMITIVES = QueryPipelineStatisticFlags(64)
		
		val FRAGMENT_SHADER_INVOCATIONS = QueryPipelineStatisticFlags(128)
		
		val TESSELLATION_CONTROL_SHADER_PATCHES = QueryPipelineStatisticFlags(256)
		
		val TESSELLATION_EVALUATION_SHADER_INVOCATIONS = QueryPipelineStatisticFlags(512)
		
		val COMPUTE_SHADER_INVOCATIONS = QueryPipelineStatisticFlags(1024)
	
	}
	
	
	
	operator fun plus(mask: QueryPipelineStatisticFlags) = QueryPipelineStatisticFlags(value or mask.value)
	
	operator fun contains(mask: QueryPipelineStatisticFlags) = value and mask.value == mask.value


}