// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkAccessFlagBits2KHR {
 *         NONE                                   = 0
 *         INDIRECT_COMMAND_READ                  = 1
 *         INDEX_READ                             = 2
 *         VERTEX_ATTRIBUTE_READ                  = 4
 *         UNIFORM_READ                           = 8
 *         INPUT_ATTACHMENT_READ                  = 16
 *         SHADER_READ                            = 32
 *         SHADER_WRITE                           = 64
 *         COLOR_ATTACHMENT_READ                  = 128
 *         COLOR_ATTACHMENT_WRITE                 = 256
 *         DEPTH_STENCIL_ATTACHMENT_READ          = 512
 *         DEPTH_STENCIL_ATTACHMENT_WRITE         = 1024
 *         TRANSFER_READ                          = 2048
 *         TRANSFER_WRITE                         = 4096
 *         HOST_READ                              = 8192
 *         HOST_WRITE                             = 16384
 *         MEMORY_READ                            = 32768
 *         MEMORY_WRITE                           = 65536
 *         SHADER_SAMPLED_READ                    = 4294967296
 *         SHADER_STORAGE_READ                    = 8589934592
 *         SHADER_STORAGE_WRITE                   = 17179869184
 *         TRANSFORM_FEEDBACK_WRITE               = 33554432
 *         TRANSFORM_FEEDBACK_COUNTER_READ        = 67108864
 *         TRANSFORM_FEEDBACK_COUNTER_WRITE       = 134217728
 *         CONDITIONAL_RENDERING_READ             = 1048576
 *         COMMAND_PREPROCESS_READ                = 131072
 *         COMMAND_PREPROCESS_WRITE               = 262144
 *         FRAGMENT_SHADING_RATE_ATTACHMENT_READ  = 8388608
 *         SHADING_RATE_IMAGE_READ                = 8388608
 *         ACCELERATION_STRUCTURE_READ            = 2097152
 *         ACCELERATION_STRUCTURE_WRITE           = 4194304
 *         ACCELERATION_STRUCTURE_READ_NV         = 2097152
 *         ACCELERATION_STRUCTURE_WRITE_NV        = 4194304
 *         FRAGMENT_DENSITY_MAP_READ              = 16777216
 *         COLOR_ATTACHMENT_READ_NONCOHERENT      = 524288
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class AccessFlags2(val bitfield: Long) {
	
	
	val is_INDIRECT_COMMAND_READ get() = bitfield and 1 != 0L
	val is_INDEX_READ get() = bitfield and 2 != 0L
	val is_VERTEX_ATTRIBUTE_READ get() = bitfield and 4 != 0L
	val is_UNIFORM_READ get() = bitfield and 8 != 0L
	val is_INPUT_ATTACHMENT_READ get() = bitfield and 16 != 0L
	val is_SHADER_READ get() = bitfield and 32 != 0L
	val is_SHADER_WRITE get() = bitfield and 64 != 0L
	val is_COLOR_ATTACHMENT_READ get() = bitfield and 128 != 0L
	val is_COLOR_ATTACHMENT_WRITE get() = bitfield and 256 != 0L
	val is_DEPTH_STENCIL_ATTACHMENT_READ get() = bitfield and 512 != 0L
	val is_DEPTH_STENCIL_ATTACHMENT_WRITE get() = bitfield and 1024 != 0L
	val is_TRANSFER_READ get() = bitfield and 2048 != 0L
	val is_TRANSFER_WRITE get() = bitfield and 4096 != 0L
	val is_HOST_READ get() = bitfield and 8192 != 0L
	val is_HOST_WRITE get() = bitfield and 16384 != 0L
	val is_MEMORY_READ get() = bitfield and 32768 != 0L
	val is_MEMORY_WRITE get() = bitfield and 65536 != 0L
	val is_SHADER_SAMPLED_READ get() = bitfield and 4294967296 != 0L
	val is_SHADER_STORAGE_READ get() = bitfield and 8589934592 != 0L
	val is_SHADER_STORAGE_WRITE get() = bitfield and 17179869184 != 0L
	val is_TRANSFORM_FEEDBACK_WRITE get() = bitfield and 33554432 != 0L
	val is_TRANSFORM_FEEDBACK_COUNTER_READ get() = bitfield and 67108864 != 0L
	val is_TRANSFORM_FEEDBACK_COUNTER_WRITE get() = bitfield and 134217728 != 0L
	val is_CONDITIONAL_RENDERING_READ get() = bitfield and 1048576 != 0L
	val is_COMMAND_PREPROCESS_READ get() = bitfield and 131072 != 0L
	val is_COMMAND_PREPROCESS_WRITE get() = bitfield and 262144 != 0L
	val is_FRAGMENT_SHADING_RATE_ATTACHMENT_READ get() = bitfield and 8388608 != 0L
	val is_SHADING_RATE_IMAGE_READ get() = bitfield and 8388608 != 0L
	val is_ACCELERATION_STRUCTURE_READ get() = bitfield and 2097152 != 0L
	val is_ACCELERATION_STRUCTURE_WRITE get() = bitfield and 4194304 != 0L
	val is_ACCELERATION_STRUCTURE_READ_NV get() = bitfield and 2097152 != 0L
	val is_ACCELERATION_STRUCTURE_WRITE_NV get() = bitfield and 4194304 != 0L
	val is_FRAGMENT_DENSITY_MAP_READ get() = bitfield and 16777216 != 0L
	val is_COLOR_ATTACHMENT_READ_NONCOHERENT get() = bitfield and 524288 != 0L
	
	
	
	infix operator fun plus(other: AccessFlags2) = AccessFlags2(bitfield or other.bitfield)
	
	infix operator fun plus(other: Long) = AccessFlags2(bitfield or other)
	
	infix fun containsAll(mask: AccessFlags2) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Long) = bitfield and mask == mask
	
	infix fun containsSome(mask: AccessFlags2) = bitfield and mask.bitfield != 0L
	
	infix fun containsSome(mask: Long) = bitfield and mask != 0L
	
	
	
	override fun toString() = buildString {
		append("{ ")
		if(is_INDIRECT_COMMAND_READ) append("INDIRECT_COMMAND_READ, ")
		if(is_INDEX_READ) append("INDEX_READ, ")
		if(is_VERTEX_ATTRIBUTE_READ) append("VERTEX_ATTRIBUTE_READ, ")
		if(is_UNIFORM_READ) append("UNIFORM_READ, ")
		if(is_INPUT_ATTACHMENT_READ) append("INPUT_ATTACHMENT_READ, ")
		if(is_SHADER_READ) append("SHADER_READ, ")
		if(is_SHADER_WRITE) append("SHADER_WRITE, ")
		if(is_COLOR_ATTACHMENT_READ) append("COLOR_ATTACHMENT_READ, ")
		if(is_COLOR_ATTACHMENT_WRITE) append("COLOR_ATTACHMENT_WRITE, ")
		if(is_DEPTH_STENCIL_ATTACHMENT_READ) append("DEPTH_STENCIL_ATTACHMENT_READ, ")
		if(is_DEPTH_STENCIL_ATTACHMENT_WRITE) append("DEPTH_STENCIL_ATTACHMENT_WRITE, ")
		if(is_TRANSFER_READ) append("TRANSFER_READ, ")
		if(is_TRANSFER_WRITE) append("TRANSFER_WRITE, ")
		if(is_HOST_READ) append("HOST_READ, ")
		if(is_HOST_WRITE) append("HOST_WRITE, ")
		if(is_MEMORY_READ) append("MEMORY_READ, ")
		if(is_MEMORY_WRITE) append("MEMORY_WRITE, ")
		if(is_SHADER_SAMPLED_READ) append("SHADER_SAMPLED_READ, ")
		if(is_SHADER_STORAGE_READ) append("SHADER_STORAGE_READ, ")
		if(is_SHADER_STORAGE_WRITE) append("SHADER_STORAGE_WRITE, ")
		if(is_TRANSFORM_FEEDBACK_WRITE) append("TRANSFORM_FEEDBACK_WRITE, ")
		if(is_TRANSFORM_FEEDBACK_COUNTER_READ) append("TRANSFORM_FEEDBACK_COUNTER_READ, ")
		if(is_TRANSFORM_FEEDBACK_COUNTER_WRITE) append("TRANSFORM_FEEDBACK_COUNTER_WRITE, ")
		if(is_CONDITIONAL_RENDERING_READ) append("CONDITIONAL_RENDERING_READ, ")
		if(is_COMMAND_PREPROCESS_READ) append("COMMAND_PREPROCESS_READ, ")
		if(is_COMMAND_PREPROCESS_WRITE) append("COMMAND_PREPROCESS_WRITE, ")
		if(is_FRAGMENT_SHADING_RATE_ATTACHMENT_READ) append("FRAGMENT_SHADING_RATE_ATTACHMENT_READ, ")
		if(is_SHADING_RATE_IMAGE_READ) append("SHADING_RATE_IMAGE_READ, ")
		if(is_ACCELERATION_STRUCTURE_READ) append("ACCELERATION_STRUCTURE_READ, ")
		if(is_ACCELERATION_STRUCTURE_WRITE) append("ACCELERATION_STRUCTURE_WRITE, ")
		if(is_ACCELERATION_STRUCTURE_READ_NV) append("ACCELERATION_STRUCTURE_READ_NV, ")
		if(is_ACCELERATION_STRUCTURE_WRITE_NV) append("ACCELERATION_STRUCTURE_WRITE_NV, ")
		if(is_FRAGMENT_DENSITY_MAP_READ) append("FRAGMENT_DENSITY_MAP_READ, ")
		if(is_COLOR_ATTACHMENT_READ_NONCOHERENT) append("COLOR_ATTACHMENT_READ_NONCOHERENT, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = AccessFlags2(0L)
		val ALL get() = AccessFlags2(30347886591)
		val INDIRECT_COMMAND_READ get() = AccessFlags2(1)
		val INDEX_READ get() = AccessFlags2(2)
		val VERTEX_ATTRIBUTE_READ get() = AccessFlags2(4)
		val UNIFORM_READ get() = AccessFlags2(8)
		val INPUT_ATTACHMENT_READ get() = AccessFlags2(16)
		val SHADER_READ get() = AccessFlags2(32)
		val SHADER_WRITE get() = AccessFlags2(64)
		val COLOR_ATTACHMENT_READ get() = AccessFlags2(128)
		val COLOR_ATTACHMENT_WRITE get() = AccessFlags2(256)
		val DEPTH_STENCIL_ATTACHMENT_READ get() = AccessFlags2(512)
		val DEPTH_STENCIL_ATTACHMENT_WRITE get() = AccessFlags2(1024)
		val TRANSFER_READ get() = AccessFlags2(2048)
		val TRANSFER_WRITE get() = AccessFlags2(4096)
		val HOST_READ get() = AccessFlags2(8192)
		val HOST_WRITE get() = AccessFlags2(16384)
		val MEMORY_READ get() = AccessFlags2(32768)
		val MEMORY_WRITE get() = AccessFlags2(65536)
		val SHADER_SAMPLED_READ get() = AccessFlags2(4294967296)
		val SHADER_STORAGE_READ get() = AccessFlags2(8589934592)
		val SHADER_STORAGE_WRITE get() = AccessFlags2(17179869184)
		val TRANSFORM_FEEDBACK_WRITE get() = AccessFlags2(33554432)
		val TRANSFORM_FEEDBACK_COUNTER_READ get() = AccessFlags2(67108864)
		val TRANSFORM_FEEDBACK_COUNTER_WRITE get() = AccessFlags2(134217728)
		val CONDITIONAL_RENDERING_READ get() = AccessFlags2(1048576)
		val COMMAND_PREPROCESS_READ get() = AccessFlags2(131072)
		val COMMAND_PREPROCESS_WRITE get() = AccessFlags2(262144)
		val FRAGMENT_SHADING_RATE_ATTACHMENT_READ get() = AccessFlags2(8388608)
		val SHADING_RATE_IMAGE_READ get() = AccessFlags2(8388608)
		val ACCELERATION_STRUCTURE_READ get() = AccessFlags2(2097152)
		val ACCELERATION_STRUCTURE_WRITE get() = AccessFlags2(4194304)
		val ACCELERATION_STRUCTURE_READ_NV get() = AccessFlags2(2097152)
		val ACCELERATION_STRUCTURE_WRITE_NV get() = AccessFlags2(4194304)
		val FRAGMENT_DENSITY_MAP_READ get() = AccessFlags2(16777216)
		val COLOR_ATTACHMENT_READ_NONCOHERENT get() = AccessFlags2(524288)
		
		inline fun compose(block: Companion.() -> AccessFlags2) = block(Companion)
	
	}


}