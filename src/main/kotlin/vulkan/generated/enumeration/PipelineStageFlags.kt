// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkPipelineStageFlagBits {
 *         TOP_OF_PIPE                       = 1
 *         DRAW_INDIRECT                     = 2
 *         VERTEX_INPUT                      = 4
 *         VERTEX_SHADER                     = 8
 *         TESSELLATION_CONTROL_SHADER       = 16
 *         TESSELLATION_EVALUATION_SHADER    = 32
 *         GEOMETRY_SHADER                   = 64
 *         FRAGMENT_SHADER                   = 128
 *         EARLY_FRAGMENT_TESTS              = 256
 *         LATE_FRAGMENT_TESTS               = 512
 *         COLOR_ATTACHMENT_OUTPUT           = 1024
 *         COMPUTE_SHADER                    = 2048
 *         TRANSFER                          = 4096
 *         BOTTOM_OF_PIPE                    = 8192
 *         HOST                              = 16384
 *         ALL_GRAPHICS                      = 32768
 *         ALL_COMMANDS                      = 65536
 *         TRANSFORM_FEEDBACK                = 16777216
 *         CONDITIONAL_RENDERING             = 262144
 *         ACCELERATION_STRUCTURE_BUILD      = 33554432
 *         RAY_TRACING_SHADER                = 2097152
 *         SHADING_RATE_IMAGE                = 4194304
 *         RAY_TRACING_SHADER_NV             = 2097152
 *         ACCELERATION_STRUCTURE_BUILD_NV   = 33554432
 *         TASK_SHADER                       = 524288
 *         MESH_SHADER                       = 1048576
 *         FRAGMENT_DENSITY_PROCESS          = 8388608
 *         FRAGMENT_SHADING_RATE_ATTACHMENT  = 4194304
 *         COMMAND_PREPROCESS                = 131072
 *         NONE                              = 0
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class PipelineStageFlags(val bitfield: Int) {
	
	
	val is_TOP_OF_PIPE get() = bitfield and 1 != 0
	val is_DRAW_INDIRECT get() = bitfield and 2 != 0
	val is_VERTEX_INPUT get() = bitfield and 4 != 0
	val is_VERTEX_SHADER get() = bitfield and 8 != 0
	val is_TESSELLATION_CONTROL_SHADER get() = bitfield and 16 != 0
	val is_TESSELLATION_EVALUATION_SHADER get() = bitfield and 32 != 0
	val is_GEOMETRY_SHADER get() = bitfield and 64 != 0
	val is_FRAGMENT_SHADER get() = bitfield and 128 != 0
	val is_EARLY_FRAGMENT_TESTS get() = bitfield and 256 != 0
	val is_LATE_FRAGMENT_TESTS get() = bitfield and 512 != 0
	val is_COLOR_ATTACHMENT_OUTPUT get() = bitfield and 1024 != 0
	val is_COMPUTE_SHADER get() = bitfield and 2048 != 0
	val is_TRANSFER get() = bitfield and 4096 != 0
	val is_BOTTOM_OF_PIPE get() = bitfield and 8192 != 0
	val is_HOST get() = bitfield and 16384 != 0
	val is_ALL_GRAPHICS get() = bitfield and 32768 != 0
	val is_ALL_COMMANDS get() = bitfield and 65536 != 0
	val is_TRANSFORM_FEEDBACK get() = bitfield and 16777216 != 0
	val is_CONDITIONAL_RENDERING get() = bitfield and 262144 != 0
	val is_ACCELERATION_STRUCTURE_BUILD get() = bitfield and 33554432 != 0
	val is_RAY_TRACING_SHADER get() = bitfield and 2097152 != 0
	val is_SHADING_RATE_IMAGE get() = bitfield and 4194304 != 0
	val is_RAY_TRACING_SHADER_NV get() = bitfield and 2097152 != 0
	val is_ACCELERATION_STRUCTURE_BUILD_NV get() = bitfield and 33554432 != 0
	val is_TASK_SHADER get() = bitfield and 524288 != 0
	val is_MESH_SHADER get() = bitfield and 1048576 != 0
	val is_FRAGMENT_DENSITY_PROCESS get() = bitfield and 8388608 != 0
	val is_FRAGMENT_SHADING_RATE_ATTACHMENT get() = bitfield and 4194304 != 0
	val is_COMMAND_PREPROCESS get() = bitfield and 131072 != 0
	
	
	
	infix operator fun plus(other: PipelineStageFlags) = PipelineStageFlags(bitfield or other.bitfield)
	
	infix operator fun plus(other: Int) = PipelineStageFlags(bitfield or other)
	
	infix fun containsAll(mask: PipelineStageFlags) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Int) = bitfield and mask == mask
	
	infix fun containsSome(mask: PipelineStageFlags) = bitfield and mask.bitfield != 0
	
	infix fun containsSome(mask: Int) = bitfield and mask != 0
	
	
	
	override fun toString() = buildString {
		append("{ ")
		if(is_TOP_OF_PIPE) append("TOP_OF_PIPE, ")
		if(is_DRAW_INDIRECT) append("DRAW_INDIRECT, ")
		if(is_VERTEX_INPUT) append("VERTEX_INPUT, ")
		if(is_VERTEX_SHADER) append("VERTEX_SHADER, ")
		if(is_TESSELLATION_CONTROL_SHADER) append("TESSELLATION_CONTROL_SHADER, ")
		if(is_TESSELLATION_EVALUATION_SHADER) append("TESSELLATION_EVALUATION_SHADER, ")
		if(is_GEOMETRY_SHADER) append("GEOMETRY_SHADER, ")
		if(is_FRAGMENT_SHADER) append("FRAGMENT_SHADER, ")
		if(is_EARLY_FRAGMENT_TESTS) append("EARLY_FRAGMENT_TESTS, ")
		if(is_LATE_FRAGMENT_TESTS) append("LATE_FRAGMENT_TESTS, ")
		if(is_COLOR_ATTACHMENT_OUTPUT) append("COLOR_ATTACHMENT_OUTPUT, ")
		if(is_COMPUTE_SHADER) append("COMPUTE_SHADER, ")
		if(is_TRANSFER) append("TRANSFER, ")
		if(is_BOTTOM_OF_PIPE) append("BOTTOM_OF_PIPE, ")
		if(is_HOST) append("HOST, ")
		if(is_ALL_GRAPHICS) append("ALL_GRAPHICS, ")
		if(is_ALL_COMMANDS) append("ALL_COMMANDS, ")
		if(is_TRANSFORM_FEEDBACK) append("TRANSFORM_FEEDBACK, ")
		if(is_CONDITIONAL_RENDERING) append("CONDITIONAL_RENDERING, ")
		if(is_ACCELERATION_STRUCTURE_BUILD) append("ACCELERATION_STRUCTURE_BUILD, ")
		if(is_RAY_TRACING_SHADER) append("RAY_TRACING_SHADER, ")
		if(is_SHADING_RATE_IMAGE) append("SHADING_RATE_IMAGE, ")
		if(is_RAY_TRACING_SHADER_NV) append("RAY_TRACING_SHADER_NV, ")
		if(is_ACCELERATION_STRUCTURE_BUILD_NV) append("ACCELERATION_STRUCTURE_BUILD_NV, ")
		if(is_TASK_SHADER) append("TASK_SHADER, ")
		if(is_MESH_SHADER) append("MESH_SHADER, ")
		if(is_FRAGMENT_DENSITY_PROCESS) append("FRAGMENT_DENSITY_PROCESS, ")
		if(is_FRAGMENT_SHADING_RATE_ATTACHMENT) append("FRAGMENT_SHADING_RATE_ATTACHMENT, ")
		if(is_COMMAND_PREPROCESS) append("COMMAND_PREPROCESS, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = PipelineStageFlags(0)
		val ALL get() = PipelineStageFlags(106954751)
		val TOP_OF_PIPE get() = PipelineStageFlags(1)
		val DRAW_INDIRECT get() = PipelineStageFlags(2)
		val VERTEX_INPUT get() = PipelineStageFlags(4)
		val VERTEX_SHADER get() = PipelineStageFlags(8)
		val TESSELLATION_CONTROL_SHADER get() = PipelineStageFlags(16)
		val TESSELLATION_EVALUATION_SHADER get() = PipelineStageFlags(32)
		val GEOMETRY_SHADER get() = PipelineStageFlags(64)
		val FRAGMENT_SHADER get() = PipelineStageFlags(128)
		val EARLY_FRAGMENT_TESTS get() = PipelineStageFlags(256)
		val LATE_FRAGMENT_TESTS get() = PipelineStageFlags(512)
		val COLOR_ATTACHMENT_OUTPUT get() = PipelineStageFlags(1024)
		val COMPUTE_SHADER get() = PipelineStageFlags(2048)
		val TRANSFER get() = PipelineStageFlags(4096)
		val BOTTOM_OF_PIPE get() = PipelineStageFlags(8192)
		val HOST get() = PipelineStageFlags(16384)
		val ALL_GRAPHICS get() = PipelineStageFlags(32768)
		val ALL_COMMANDS get() = PipelineStageFlags(65536)
		val TRANSFORM_FEEDBACK get() = PipelineStageFlags(16777216)
		val CONDITIONAL_RENDERING get() = PipelineStageFlags(262144)
		val ACCELERATION_STRUCTURE_BUILD get() = PipelineStageFlags(33554432)
		val RAY_TRACING_SHADER get() = PipelineStageFlags(2097152)
		val SHADING_RATE_IMAGE get() = PipelineStageFlags(4194304)
		val RAY_TRACING_SHADER_NV get() = PipelineStageFlags(2097152)
		val ACCELERATION_STRUCTURE_BUILD_NV get() = PipelineStageFlags(33554432)
		val TASK_SHADER get() = PipelineStageFlags(524288)
		val MESH_SHADER get() = PipelineStageFlags(1048576)
		val FRAGMENT_DENSITY_PROCESS get() = PipelineStageFlags(8388608)
		val FRAGMENT_SHADING_RATE_ATTACHMENT get() = PipelineStageFlags(4194304)
		val COMMAND_PREPROCESS get() = PipelineStageFlags(131072)
		
		inline fun compose(block: Companion.() -> PipelineStageFlags) = block(Companion)
	
	}


}