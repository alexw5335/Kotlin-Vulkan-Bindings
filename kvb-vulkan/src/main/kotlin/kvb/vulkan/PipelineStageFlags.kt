// This file has been automatically generated.

package kvb.vulkan

/**
 *     enum VkPipelineStageFlagBits {
 *         VK_PIPELINE_STAGE_TOP_OF_PIPE_BIT                           = 1
 *         VK_PIPELINE_STAGE_DRAW_INDIRECT_BIT                         = 2
 *         VK_PIPELINE_STAGE_VERTEX_INPUT_BIT                          = 4
 *         VK_PIPELINE_STAGE_VERTEX_SHADER_BIT                         = 8
 *         VK_PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT           = 16
 *         VK_PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT        = 32
 *         VK_PIPELINE_STAGE_GEOMETRY_SHADER_BIT                       = 64
 *         VK_PIPELINE_STAGE_FRAGMENT_SHADER_BIT                       = 128
 *         VK_PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT                  = 256
 *         VK_PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT                   = 512
 *         VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT               = 1024
 *         VK_PIPELINE_STAGE_COMPUTE_SHADER_BIT                        = 2048
 *         VK_PIPELINE_STAGE_TRANSFER_BIT                              = 4096
 *         VK_PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT                        = 8192
 *         VK_PIPELINE_STAGE_HOST_BIT                                  = 16384
 *         VK_PIPELINE_STAGE_ALL_GRAPHICS_BIT                          = 32768
 *         VK_PIPELINE_STAGE_ALL_COMMANDS_BIT                          = 65536
 *         VK_PIPELINE_STAGE_TRANSFORM_FEEDBACK_BIT_EXT                = 16777216
 *         VK_PIPELINE_STAGE_CONDITIONAL_RENDERING_BIT_EXT             = 262144
 *         VK_PIPELINE_STAGE_ACCELERATION_STRUCTURE_BUILD_BIT_KHR      = 33554432
 *         VK_PIPELINE_STAGE_RAY_TRACING_SHADER_BIT_KHR                = 2097152
 *         VK_PIPELINE_STAGE_SHADING_RATE_IMAGE_BIT_NV                 = 4194304
 *         VK_PIPELINE_STAGE_RAY_TRACING_SHADER_BIT_NV                 = 2097152
 *         VK_PIPELINE_STAGE_ACCELERATION_STRUCTURE_BUILD_BIT_NV       = 33554432
 *         VK_PIPELINE_STAGE_TASK_SHADER_BIT_NV                        = 524288
 *         VK_PIPELINE_STAGE_MESH_SHADER_BIT_NV                        = 1048576
 *         VK_PIPELINE_STAGE_FRAGMENT_DENSITY_PROCESS_BIT_EXT          = 8388608
 *         VK_PIPELINE_STAGE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR  = 4194304
 *         VK_PIPELINE_STAGE_COMMAND_PREPROCESS_BIT_NV                 = 131072
 *         VK_PIPELINE_STAGE_NONE_KHR                                  = 0
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class PipelineStageFlags(val value: Int) {
	
	
	companion object {
		
		val TOP_OF_PIPE = PipelineStageFlags(1)
		
		val DRAW_INDIRECT = PipelineStageFlags(2)
		
		val VERTEX_INPUT = PipelineStageFlags(4)
		
		val VERTEX_SHADER = PipelineStageFlags(8)
		
		val TESSELLATION_CONTROL_SHADER = PipelineStageFlags(16)
		
		val TESSELLATION_EVALUATION_SHADER = PipelineStageFlags(32)
		
		val GEOMETRY_SHADER = PipelineStageFlags(64)
		
		val FRAGMENT_SHADER = PipelineStageFlags(128)
		
		val EARLY_FRAGMENT_TESTS = PipelineStageFlags(256)
		
		val LATE_FRAGMENT_TESTS = PipelineStageFlags(512)
		
		val COLOR_ATTACHMENT_OUTPUT = PipelineStageFlags(1024)
		
		val COMPUTE_SHADER = PipelineStageFlags(2048)
		
		val TRANSFER = PipelineStageFlags(4096)
		
		val BOTTOM_OF_PIPE = PipelineStageFlags(8192)
		
		val HOST = PipelineStageFlags(16384)
		
		val ALL_GRAPHICS = PipelineStageFlags(32768)
		
		val ALL_COMMANDS = PipelineStageFlags(65536)
		
		val TRANSFORM_FEEDBACK = PipelineStageFlags(16777216)
		
		val CONDITIONAL_RENDERING = PipelineStageFlags(262144)
		
		val ACCELERATION_STRUCTURE_BUILD = PipelineStageFlags(33554432)
		
		val RAY_TRACING_SHADER = PipelineStageFlags(2097152)
		
		val SHADING_RATE_IMAGE = PipelineStageFlags(4194304)
		
		val TASK_SHADER = PipelineStageFlags(524288)
		
		val MESH_SHADER = PipelineStageFlags(1048576)
		
		val FRAGMENT_DENSITY_PROCESS = PipelineStageFlags(8388608)
		
		val COMMAND_PREPROCESS = PipelineStageFlags(131072)
		
		val NONE = PipelineStageFlags(0)
	
	}
	
	
	
	operator fun plus(mask: PipelineStageFlags) = PipelineStageFlags(value or mask.value)
	
	operator fun contains(mask: PipelineStageFlags) = value and mask.value == mask.value


}