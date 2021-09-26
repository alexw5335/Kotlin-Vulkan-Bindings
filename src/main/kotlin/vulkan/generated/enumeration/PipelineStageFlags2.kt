// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkPipelineStageFlagBits2KHR {
 *         NONE                              = 0
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
 *         ALL_TRANSFER                      = 4096
 *         TRANSFER                          = 4096
 *         BOTTOM_OF_PIPE                    = 8192
 *         HOST                              = 16384
 *         ALL_GRAPHICS                      = 32768
 *         ALL_COMMANDS                      = 65536
 *         COPY                              = 4294967296
 *         RESOLVE                           = 8589934592
 *         BLIT                              = 17179869184
 *         CLEAR                             = 34359738368
 *         INDEX_INPUT                       = 68719476736
 *         VERTEX_ATTRIBUTE_INPUT            = 137438953472
 *         PRE_RASTERIZATION_SHADERS         = 274877906944
 *         TRANSFORM_FEEDBACK                = 16777216
 *         CONDITIONAL_RENDERING             = 262144
 *         COMMAND_PREPROCESS                = 131072
 *         FRAGMENT_SHADING_RATE_ATTACHMENT  = 4194304
 *         SHADING_RATE_IMAGE                = 4194304
 *         ACCELERATION_STRUCTURE_BUILD      = 33554432
 *         RAY_TRACING_SHADER                = 2097152
 *         RAY_TRACING_SHADER_NV             = 2097152
 *         ACCELERATION_STRUCTURE_BUILD_NV   = 33554432
 *         FRAGMENT_DENSITY_PROCESS          = 8388608
 *         TASK_SHADER                       = 524288
 *         MESH_SHADER                       = 1048576
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class PipelineStageFlags2(val bitfield: Long) {
	
	
	val is_TOP_OF_PIPE get() = bitfield and 1 != 0L
	val is_DRAW_INDIRECT get() = bitfield and 2 != 0L
	val is_VERTEX_INPUT get() = bitfield and 4 != 0L
	val is_VERTEX_SHADER get() = bitfield and 8 != 0L
	val is_TESSELLATION_CONTROL_SHADER get() = bitfield and 16 != 0L
	val is_TESSELLATION_EVALUATION_SHADER get() = bitfield and 32 != 0L
	val is_GEOMETRY_SHADER get() = bitfield and 64 != 0L
	val is_FRAGMENT_SHADER get() = bitfield and 128 != 0L
	val is_EARLY_FRAGMENT_TESTS get() = bitfield and 256 != 0L
	val is_LATE_FRAGMENT_TESTS get() = bitfield and 512 != 0L
	val is_COLOR_ATTACHMENT_OUTPUT get() = bitfield and 1024 != 0L
	val is_COMPUTE_SHADER get() = bitfield and 2048 != 0L
	val is_ALL_TRANSFER get() = bitfield and 4096 != 0L
	val is_TRANSFER get() = bitfield and 4096 != 0L
	val is_BOTTOM_OF_PIPE get() = bitfield and 8192 != 0L
	val is_HOST get() = bitfield and 16384 != 0L
	val is_ALL_GRAPHICS get() = bitfield and 32768 != 0L
	val is_ALL_COMMANDS get() = bitfield and 65536 != 0L
	val is_COPY get() = bitfield and 4294967296 != 0L
	val is_RESOLVE get() = bitfield and 8589934592 != 0L
	val is_BLIT get() = bitfield and 17179869184 != 0L
	val is_CLEAR get() = bitfield and 34359738368 != 0L
	val is_INDEX_INPUT get() = bitfield and 68719476736 != 0L
	val is_VERTEX_ATTRIBUTE_INPUT get() = bitfield and 137438953472 != 0L
	val is_PRE_RASTERIZATION_SHADERS get() = bitfield and 274877906944 != 0L
	val is_TRANSFORM_FEEDBACK get() = bitfield and 16777216 != 0L
	val is_CONDITIONAL_RENDERING get() = bitfield and 262144 != 0L
	val is_COMMAND_PREPROCESS get() = bitfield and 131072 != 0L
	val is_FRAGMENT_SHADING_RATE_ATTACHMENT get() = bitfield and 4194304 != 0L
	val is_SHADING_RATE_IMAGE get() = bitfield and 4194304 != 0L
	val is_ACCELERATION_STRUCTURE_BUILD get() = bitfield and 33554432 != 0L
	val is_RAY_TRACING_SHADER get() = bitfield and 2097152 != 0L
	val is_RAY_TRACING_SHADER_NV get() = bitfield and 2097152 != 0L
	val is_ACCELERATION_STRUCTURE_BUILD_NV get() = bitfield and 33554432 != 0L
	val is_FRAGMENT_DENSITY_PROCESS get() = bitfield and 8388608 != 0L
	val is_TASK_SHADER get() = bitfield and 524288 != 0L
	val is_MESH_SHADER get() = bitfield and 1048576 != 0L
	
	
	
	infix operator fun plus(other: PipelineStageFlags2) = PipelineStageFlags2(bitfield or other.bitfield)
	
	infix operator fun plus(other: Long) = PipelineStageFlags2(bitfield or other)
	
	infix fun containsAll(mask: PipelineStageFlags2) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Long) = bitfield and mask == mask
	
	infix fun containsSome(mask: PipelineStageFlags2) = bitfield and mask.bitfield != 0L
	
	infix fun containsSome(mask: Long) = bitfield and mask != 0L
	
	
	
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
		if(is_ALL_TRANSFER) append("ALL_TRANSFER, ")
		if(is_TRANSFER) append("TRANSFER, ")
		if(is_BOTTOM_OF_PIPE) append("BOTTOM_OF_PIPE, ")
		if(is_HOST) append("HOST, ")
		if(is_ALL_GRAPHICS) append("ALL_GRAPHICS, ")
		if(is_ALL_COMMANDS) append("ALL_COMMANDS, ")
		if(is_COPY) append("COPY, ")
		if(is_RESOLVE) append("RESOLVE, ")
		if(is_BLIT) append("BLIT, ")
		if(is_CLEAR) append("CLEAR, ")
		if(is_INDEX_INPUT) append("INDEX_INPUT, ")
		if(is_VERTEX_ATTRIBUTE_INPUT) append("VERTEX_ATTRIBUTE_INPUT, ")
		if(is_PRE_RASTERIZATION_SHADERS) append("PRE_RASTERIZATION_SHADERS, ")
		if(is_TRANSFORM_FEEDBACK) append("TRANSFORM_FEEDBACK, ")
		if(is_CONDITIONAL_RENDERING) append("CONDITIONAL_RENDERING, ")
		if(is_COMMAND_PREPROCESS) append("COMMAND_PREPROCESS, ")
		if(is_FRAGMENT_SHADING_RATE_ATTACHMENT) append("FRAGMENT_SHADING_RATE_ATTACHMENT, ")
		if(is_SHADING_RATE_IMAGE) append("SHADING_RATE_IMAGE, ")
		if(is_ACCELERATION_STRUCTURE_BUILD) append("ACCELERATION_STRUCTURE_BUILD, ")
		if(is_RAY_TRACING_SHADER) append("RAY_TRACING_SHADER, ")
		if(is_RAY_TRACING_SHADER_NV) append("RAY_TRACING_SHADER_NV, ")
		if(is_ACCELERATION_STRUCTURE_BUILD_NV) append("ACCELERATION_STRUCTURE_BUILD_NV, ")
		if(is_FRAGMENT_DENSITY_PROCESS) append("FRAGMENT_DENSITY_PROCESS, ")
		if(is_TASK_SHADER) append("TASK_SHADER, ")
		if(is_MESH_SHADER) append("MESH_SHADER, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = PipelineStageFlags2(0L)
		val ALL get() = PipelineStageFlags2(545567805439)
		val TOP_OF_PIPE get() = PipelineStageFlags2(1)
		val DRAW_INDIRECT get() = PipelineStageFlags2(2)
		val VERTEX_INPUT get() = PipelineStageFlags2(4)
		val VERTEX_SHADER get() = PipelineStageFlags2(8)
		val TESSELLATION_CONTROL_SHADER get() = PipelineStageFlags2(16)
		val TESSELLATION_EVALUATION_SHADER get() = PipelineStageFlags2(32)
		val GEOMETRY_SHADER get() = PipelineStageFlags2(64)
		val FRAGMENT_SHADER get() = PipelineStageFlags2(128)
		val EARLY_FRAGMENT_TESTS get() = PipelineStageFlags2(256)
		val LATE_FRAGMENT_TESTS get() = PipelineStageFlags2(512)
		val COLOR_ATTACHMENT_OUTPUT get() = PipelineStageFlags2(1024)
		val COMPUTE_SHADER get() = PipelineStageFlags2(2048)
		val ALL_TRANSFER get() = PipelineStageFlags2(4096)
		val TRANSFER get() = PipelineStageFlags2(4096)
		val BOTTOM_OF_PIPE get() = PipelineStageFlags2(8192)
		val HOST get() = PipelineStageFlags2(16384)
		val ALL_GRAPHICS get() = PipelineStageFlags2(32768)
		val ALL_COMMANDS get() = PipelineStageFlags2(65536)
		val COPY get() = PipelineStageFlags2(4294967296)
		val RESOLVE get() = PipelineStageFlags2(8589934592)
		val BLIT get() = PipelineStageFlags2(17179869184)
		val CLEAR get() = PipelineStageFlags2(34359738368)
		val INDEX_INPUT get() = PipelineStageFlags2(68719476736)
		val VERTEX_ATTRIBUTE_INPUT get() = PipelineStageFlags2(137438953472)
		val PRE_RASTERIZATION_SHADERS get() = PipelineStageFlags2(274877906944)
		val TRANSFORM_FEEDBACK get() = PipelineStageFlags2(16777216)
		val CONDITIONAL_RENDERING get() = PipelineStageFlags2(262144)
		val COMMAND_PREPROCESS get() = PipelineStageFlags2(131072)
		val FRAGMENT_SHADING_RATE_ATTACHMENT get() = PipelineStageFlags2(4194304)
		val SHADING_RATE_IMAGE get() = PipelineStageFlags2(4194304)
		val ACCELERATION_STRUCTURE_BUILD get() = PipelineStageFlags2(33554432)
		val RAY_TRACING_SHADER get() = PipelineStageFlags2(2097152)
		val RAY_TRACING_SHADER_NV get() = PipelineStageFlags2(2097152)
		val ACCELERATION_STRUCTURE_BUILD_NV get() = PipelineStageFlags2(33554432)
		val FRAGMENT_DENSITY_PROCESS get() = PipelineStageFlags2(8388608)
		val TASK_SHADER get() = PipelineStageFlags2(524288)
		val MESH_SHADER get() = PipelineStageFlags2(1048576)
		
		inline fun compose(block: Companion.() -> PipelineStageFlags2) = block(Companion)
	
	}


}