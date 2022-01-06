// This file has been automatically generated.

package kvb.vulkan

/**
 *     // provided by VK_KHR_synchronization2

 *     enum VkPipelineStageFlagBits2KHR {
 *         VK_PIPELINE_STAGE_2_NONE_KHR                                  = 0
 *         VK_PIPELINE_STAGE_2_TOP_OF_PIPE_BIT_KHR                       = 1
 *         VK_PIPELINE_STAGE_2_DRAW_INDIRECT_BIT_KHR                     = 2
 *         VK_PIPELINE_STAGE_2_VERTEX_INPUT_BIT_KHR                      = 4
 *         VK_PIPELINE_STAGE_2_VERTEX_SHADER_BIT_KHR                     = 8
 *         VK_PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT_KHR       = 16
 *         VK_PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT_KHR    = 32
 *         VK_PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT_KHR                   = 64
 *         VK_PIPELINE_STAGE_2_FRAGMENT_SHADER_BIT_KHR                   = 128
 *         VK_PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT_KHR              = 256
 *         VK_PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT_KHR               = 512
 *         VK_PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT_KHR           = 1024
 *         VK_PIPELINE_STAGE_2_COMPUTE_SHADER_BIT_KHR                    = 2048
 *         VK_PIPELINE_STAGE_2_ALL_TRANSFER_BIT_KHR                      = 4096
 *         VK_PIPELINE_STAGE_2_TRANSFER_BIT_KHR                          = 4096
 *         VK_PIPELINE_STAGE_2_BOTTOM_OF_PIPE_BIT_KHR                    = 8192
 *         VK_PIPELINE_STAGE_2_HOST_BIT_KHR                              = 16384
 *         VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR                      = 32768
 *         VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR                      = 65536
 *         VK_PIPELINE_STAGE_2_COPY_BIT_KHR                              = 4294967296
 *         VK_PIPELINE_STAGE_2_RESOLVE_BIT_KHR                           = 8589934592
 *         VK_PIPELINE_STAGE_2_BLIT_BIT_KHR                              = 17179869184
 *         VK_PIPELINE_STAGE_2_CLEAR_BIT_KHR                             = 34359738368
 *         VK_PIPELINE_STAGE_2_INDEX_INPUT_BIT_KHR                       = 68719476736
 *         VK_PIPELINE_STAGE_2_VERTEX_ATTRIBUTE_INPUT_BIT_KHR            = 137438953472
 *         VK_PIPELINE_STAGE_2_PRE_RASTERIZATION_SHADERS_BIT_KHR         = 274877906944
 *         VK_PIPELINE_STAGE_2_VIDEO_DECODE_BIT_KHR                      = 67108864
 *         VK_PIPELINE_STAGE_2_VIDEO_ENCODE_BIT_KHR                      = 134217728
 *         VK_PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT                = 16777216
 *         VK_PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT             = 262144
 *         VK_PIPELINE_STAGE_2_COMMAND_PREPROCESS_BIT_NV                 = 131072
 *         VK_PIPELINE_STAGE_2_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR  = 4194304
 *         VK_PIPELINE_STAGE_2_SHADING_RATE_IMAGE_BIT_NV                 = 4194304
 *         VK_PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR      = 33554432
 *         VK_PIPELINE_STAGE_2_RAY_TRACING_SHADER_BIT_KHR                = 2097152
 *         VK_PIPELINE_STAGE_2_RAY_TRACING_SHADER_BIT_NV                 = 2097152
 *         VK_PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_NV       = 33554432
 *         VK_PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT          = 8388608
 *         VK_PIPELINE_STAGE_2_TASK_SHADER_BIT_NV                        = 524288
 *         VK_PIPELINE_STAGE_2_MESH_SHADER_BIT_NV                        = 1048576
 *         VK_PIPELINE_STAGE_2_SUBPASS_SHADING_BIT_HUAWEI                = 549755813888
 *         VK_PIPELINE_STAGE_2_INVOCATION_MASK_BIT_HUAWEI                = 1099511627776
 *         VK_PIPELINE_STAGE_2_RESERVED_387_BIT_KHR                      = 268435456
 *     }
 */
@Suppress("unused")
@JvmInline
value class PipelineStageFlags2(val value: Long) {
	
	
	companion object {
		
		val NONE = PipelineStageFlags2(0)
		
		val TOP_OF_PIPE = PipelineStageFlags2(1)
		
		val DRAW_INDIRECT = PipelineStageFlags2(2)
		
		val VERTEX_INPUT = PipelineStageFlags2(4)
		
		val VERTEX_SHADER = PipelineStageFlags2(8)
		
		val TESSELLATION_CONTROL_SHADER = PipelineStageFlags2(16)
		
		val TESSELLATION_EVALUATION_SHADER = PipelineStageFlags2(32)
		
		val GEOMETRY_SHADER = PipelineStageFlags2(64)
		
		val FRAGMENT_SHADER = PipelineStageFlags2(128)
		
		val EARLY_FRAGMENT_TESTS = PipelineStageFlags2(256)
		
		val LATE_FRAGMENT_TESTS = PipelineStageFlags2(512)
		
		val COLOR_ATTACHMENT_OUTPUT = PipelineStageFlags2(1024)
		
		val COMPUTE_SHADER = PipelineStageFlags2(2048)
		
		val ALL_TRANSFER = PipelineStageFlags2(4096)
		
		val BOTTOM_OF_PIPE = PipelineStageFlags2(8192)
		
		val HOST = PipelineStageFlags2(16384)
		
		val ALL_GRAPHICS = PipelineStageFlags2(32768)
		
		val ALL_COMMANDS = PipelineStageFlags2(65536)
		
		val COPY = PipelineStageFlags2(4294967296)
		
		val RESOLVE = PipelineStageFlags2(8589934592)
		
		val BLIT = PipelineStageFlags2(17179869184)
		
		val CLEAR = PipelineStageFlags2(34359738368)
		
		val INDEX_INPUT = PipelineStageFlags2(68719476736)
		
		val VERTEX_ATTRIBUTE_INPUT = PipelineStageFlags2(137438953472)
		
		val PRE_RASTERIZATION_SHADERS = PipelineStageFlags2(274877906944)
		
		val VIDEO_DECODE = PipelineStageFlags2(67108864)
		
		val VIDEO_ENCODE = PipelineStageFlags2(134217728)
		
		val TRANSFORM_FEEDBACK = PipelineStageFlags2(16777216)
		
		val CONDITIONAL_RENDERING = PipelineStageFlags2(262144)
		
		val COMMAND_PREPROCESS = PipelineStageFlags2(131072)
		
		val FRAGMENT_SHADING_RATE_ATTACHMENT = PipelineStageFlags2(4194304)
		
		val ACCELERATION_STRUCTURE_BUILD = PipelineStageFlags2(33554432)
		
		val RAY_TRACING_SHADER = PipelineStageFlags2(2097152)
		
		val FRAGMENT_DENSITY_PROCESS = PipelineStageFlags2(8388608)
		
		val TASK_SHADER = PipelineStageFlags2(524288)
		
		val MESH_SHADER = PipelineStageFlags2(1048576)
		
		val SUBPASS_SHADING = PipelineStageFlags2(549755813888)
		
		val INVOCATION_MASK = PipelineStageFlags2(1099511627776)
	
	}
	
	
	
	operator fun plus(mask: PipelineStageFlags2) = PipelineStageFlags2(value or mask.value)
	
	operator fun contains(mask: PipelineStageFlags2) = value and mask.value == mask.value


}