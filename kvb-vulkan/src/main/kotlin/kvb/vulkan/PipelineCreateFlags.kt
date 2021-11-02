// This file has been automatically generated.

package kvb.vulkan

/**
 *     enum VkPipelineCreateFlagBits {
 *         VK_PIPELINE_CREATE_DISABLE_OPTIMIZATION_BIT                                = 1
 *         VK_PIPELINE_CREATE_ALLOW_DERIVATIVES_BIT                                   = 2
 *         VK_PIPELINE_CREATE_DERIVATIVE_BIT                                          = 4
 *         VK_PIPELINE_CREATE_VIEW_INDEX_FROM_DEVICE_INDEX_BIT                        = 8
 *         VK_PIPELINE_CREATE_DISPATCH_BASE_BIT                                       = 16
 *         VK_PIPELINE_CREATE_DISPATCH_BASE                                           = 16
 *         VK_PIPELINE_CREATE_VIEW_INDEX_FROM_DEVICE_INDEX_BIT_KHR                    = 8
 *         VK_PIPELINE_CREATE_DISPATCH_BASE_KHR                                       = 16
 *         VK_PIPELINE_CREATE_RAY_TRACING_NO_NULL_ANY_HIT_SHADERS_BIT_KHR             = 16384
 *         VK_PIPELINE_CREATE_RAY_TRACING_NO_NULL_CLOSEST_HIT_SHADERS_BIT_KHR         = 32768
 *         VK_PIPELINE_CREATE_RAY_TRACING_NO_NULL_MISS_SHADERS_BIT_KHR                = 65536
 *         VK_PIPELINE_CREATE_RAY_TRACING_NO_NULL_INTERSECTION_SHADERS_BIT_KHR        = 131072
 *         VK_PIPELINE_CREATE_RAY_TRACING_SKIP_TRIANGLES_BIT_KHR                      = 4096
 *         VK_PIPELINE_CREATE_RAY_TRACING_SKIP_AABBS_BIT_KHR                          = 8192
 *         VK_PIPELINE_CREATE_RAY_TRACING_SHADER_GROUP_HANDLE_CAPTURE_REPLAY_BIT_KHR  = 524288
 *         VK_PIPELINE_CREATE_DEFER_COMPILE_BIT_NV                                    = 32
 *         VK_PIPELINE_CREATE_CAPTURE_STATISTICS_BIT_KHR                              = 64
 *         VK_PIPELINE_CREATE_CAPTURE_INTERNAL_REPRESENTATIONS_BIT_KHR                = 128
 *         VK_PIPELINE_CREATE_INDIRECT_BINDABLE_BIT_NV                                = 262144
 *         VK_PIPELINE_CREATE_LIBRARY_BIT_KHR                                         = 2048
 *         VK_PIPELINE_CREATE_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT_EXT               = 256
 *         VK_PIPELINE_CREATE_EARLY_RETURN_ON_FAILURE_BIT_EXT                         = 512
 *         VK_PIPELINE_CREATE_RESERVED_BIT_20_NV                                      = 1048576
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class PipelineCreateFlags(val value: Int) {
	
	
	companion object {
		
		val DISABLE_OPTIMIZATION = PipelineCreateFlags(1)
		
		val ALLOW_DERIVATIVES = PipelineCreateFlags(2)
		
		val DERIVATIVE = PipelineCreateFlags(4)
		
		val VIEW_INDEX_FROM_DEVICE_INDEX = PipelineCreateFlags(8)
		
		val DISPATCH_BASE = PipelineCreateFlags(16)
		
		val RAY_TRACING_NO_NULL_ANY_HIT_SHADERS = PipelineCreateFlags(16384)
		
		val RAY_TRACING_NO_NULL_CLOSEST_HIT_SHADERS = PipelineCreateFlags(32768)
		
		val RAY_TRACING_NO_NULL_MISS_SHADERS = PipelineCreateFlags(65536)
		
		val RAY_TRACING_NO_NULL_INTERSECTION_SHADERS = PipelineCreateFlags(131072)
		
		val RAY_TRACING_SKIP_TRIANGLES = PipelineCreateFlags(4096)
		
		val RAY_TRACING_SKIP_AABBS = PipelineCreateFlags(8192)
		
		val RAY_TRACING_SHADER_GROUP_HANDLE_CAPTURE_REPLAY = PipelineCreateFlags(524288)
		
		val DEFER_COMPILE = PipelineCreateFlags(32)
		
		val CAPTURE_STATISTICS = PipelineCreateFlags(64)
		
		val CAPTURE_INTERNAL_REPRESENTATIONS = PipelineCreateFlags(128)
		
		val INDIRECT_BINDABLE = PipelineCreateFlags(262144)
		
		val LIBRARY = PipelineCreateFlags(2048)
		
		val FAIL_ON_PIPELINE_COMPILE_REQUIRED = PipelineCreateFlags(256)
		
		val EARLY_RETURN_ON_FAILURE = PipelineCreateFlags(512)
	
	}
	
	
	
	operator fun plus(mask: PipelineCreateFlags) = PipelineCreateFlags(value or mask.value)
	
	operator fun contains(mask: PipelineCreateFlags) = value and mask.value == mask.value


}