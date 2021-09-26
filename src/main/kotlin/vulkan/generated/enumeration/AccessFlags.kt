// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkAccessFlagBits {
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
 *         TRANSFORM_FEEDBACK_WRITE               = 33554432
 *         TRANSFORM_FEEDBACK_COUNTER_READ        = 67108864
 *         TRANSFORM_FEEDBACK_COUNTER_WRITE       = 134217728
 *         CONDITIONAL_RENDERING_READ             = 1048576
 *         COLOR_ATTACHMENT_READ_NONCOHERENT      = 524288
 *         ACCELERATION_STRUCTURE_READ            = 2097152
 *         ACCELERATION_STRUCTURE_WRITE           = 4194304
 *         SHADING_RATE_IMAGE_READ                = 8388608
 *         ACCELERATION_STRUCTURE_READ_NV         = 2097152
 *         ACCELERATION_STRUCTURE_WRITE_NV        = 4194304
 *         FRAGMENT_DENSITY_MAP_READ              = 16777216
 *         FRAGMENT_SHADING_RATE_ATTACHMENT_READ  = 8388608
 *         COMMAND_PREPROCESS_READ                = 131072
 *         COMMAND_PREPROCESS_WRITE               = 262144
 *         NONE                                   = 0
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class AccessFlags(val bitfield: Int) {
	
	
	val is_INDIRECT_COMMAND_READ get() = bitfield and 1 != 0
	val is_INDEX_READ get() = bitfield and 2 != 0
	val is_VERTEX_ATTRIBUTE_READ get() = bitfield and 4 != 0
	val is_UNIFORM_READ get() = bitfield and 8 != 0
	val is_INPUT_ATTACHMENT_READ get() = bitfield and 16 != 0
	val is_SHADER_READ get() = bitfield and 32 != 0
	val is_SHADER_WRITE get() = bitfield and 64 != 0
	val is_COLOR_ATTACHMENT_READ get() = bitfield and 128 != 0
	val is_COLOR_ATTACHMENT_WRITE get() = bitfield and 256 != 0
	val is_DEPTH_STENCIL_ATTACHMENT_READ get() = bitfield and 512 != 0
	val is_DEPTH_STENCIL_ATTACHMENT_WRITE get() = bitfield and 1024 != 0
	val is_TRANSFER_READ get() = bitfield and 2048 != 0
	val is_TRANSFER_WRITE get() = bitfield and 4096 != 0
	val is_HOST_READ get() = bitfield and 8192 != 0
	val is_HOST_WRITE get() = bitfield and 16384 != 0
	val is_MEMORY_READ get() = bitfield and 32768 != 0
	val is_MEMORY_WRITE get() = bitfield and 65536 != 0
	val is_TRANSFORM_FEEDBACK_WRITE get() = bitfield and 33554432 != 0
	val is_TRANSFORM_FEEDBACK_COUNTER_READ get() = bitfield and 67108864 != 0
	val is_TRANSFORM_FEEDBACK_COUNTER_WRITE get() = bitfield and 134217728 != 0
	val is_CONDITIONAL_RENDERING_READ get() = bitfield and 1048576 != 0
	val is_COLOR_ATTACHMENT_READ_NONCOHERENT get() = bitfield and 524288 != 0
	val is_ACCELERATION_STRUCTURE_READ get() = bitfield and 2097152 != 0
	val is_ACCELERATION_STRUCTURE_WRITE get() = bitfield and 4194304 != 0
	val is_SHADING_RATE_IMAGE_READ get() = bitfield and 8388608 != 0
	val is_ACCELERATION_STRUCTURE_READ_NV get() = bitfield and 2097152 != 0
	val is_ACCELERATION_STRUCTURE_WRITE_NV get() = bitfield and 4194304 != 0
	val is_FRAGMENT_DENSITY_MAP_READ get() = bitfield and 16777216 != 0
	val is_FRAGMENT_SHADING_RATE_ATTACHMENT_READ get() = bitfield and 8388608 != 0
	val is_COMMAND_PREPROCESS_READ get() = bitfield and 131072 != 0
	val is_COMMAND_PREPROCESS_WRITE get() = bitfield and 262144 != 0
	
	
	
	infix operator fun plus(other: AccessFlags) = AccessFlags(bitfield or other.bitfield)
	
	infix operator fun plus(other: Int) = AccessFlags(bitfield or other)
	
	infix fun containsAll(mask: AccessFlags) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Int) = bitfield and mask == mask
	
	infix fun containsSome(mask: AccessFlags) = bitfield and mask.bitfield != 0
	
	infix fun containsSome(mask: Int) = bitfield and mask != 0
	
	
	
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
		if(is_TRANSFORM_FEEDBACK_WRITE) append("TRANSFORM_FEEDBACK_WRITE, ")
		if(is_TRANSFORM_FEEDBACK_COUNTER_READ) append("TRANSFORM_FEEDBACK_COUNTER_READ, ")
		if(is_TRANSFORM_FEEDBACK_COUNTER_WRITE) append("TRANSFORM_FEEDBACK_COUNTER_WRITE, ")
		if(is_CONDITIONAL_RENDERING_READ) append("CONDITIONAL_RENDERING_READ, ")
		if(is_COLOR_ATTACHMENT_READ_NONCOHERENT) append("COLOR_ATTACHMENT_READ_NONCOHERENT, ")
		if(is_ACCELERATION_STRUCTURE_READ) append("ACCELERATION_STRUCTURE_READ, ")
		if(is_ACCELERATION_STRUCTURE_WRITE) append("ACCELERATION_STRUCTURE_WRITE, ")
		if(is_SHADING_RATE_IMAGE_READ) append("SHADING_RATE_IMAGE_READ, ")
		if(is_ACCELERATION_STRUCTURE_READ_NV) append("ACCELERATION_STRUCTURE_READ_NV, ")
		if(is_ACCELERATION_STRUCTURE_WRITE_NV) append("ACCELERATION_STRUCTURE_WRITE_NV, ")
		if(is_FRAGMENT_DENSITY_MAP_READ) append("FRAGMENT_DENSITY_MAP_READ, ")
		if(is_FRAGMENT_SHADING_RATE_ATTACHMENT_READ) append("FRAGMENT_SHADING_RATE_ATTACHMENT_READ, ")
		if(is_COMMAND_PREPROCESS_READ) append("COMMAND_PREPROCESS_READ, ")
		if(is_COMMAND_PREPROCESS_WRITE) append("COMMAND_PREPROCESS_WRITE, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = AccessFlags(0)
		val ALL get() = AccessFlags(283115519)
		val INDIRECT_COMMAND_READ get() = AccessFlags(1)
		val INDEX_READ get() = AccessFlags(2)
		val VERTEX_ATTRIBUTE_READ get() = AccessFlags(4)
		val UNIFORM_READ get() = AccessFlags(8)
		val INPUT_ATTACHMENT_READ get() = AccessFlags(16)
		val SHADER_READ get() = AccessFlags(32)
		val SHADER_WRITE get() = AccessFlags(64)
		val COLOR_ATTACHMENT_READ get() = AccessFlags(128)
		val COLOR_ATTACHMENT_WRITE get() = AccessFlags(256)
		val DEPTH_STENCIL_ATTACHMENT_READ get() = AccessFlags(512)
		val DEPTH_STENCIL_ATTACHMENT_WRITE get() = AccessFlags(1024)
		val TRANSFER_READ get() = AccessFlags(2048)
		val TRANSFER_WRITE get() = AccessFlags(4096)
		val HOST_READ get() = AccessFlags(8192)
		val HOST_WRITE get() = AccessFlags(16384)
		val MEMORY_READ get() = AccessFlags(32768)
		val MEMORY_WRITE get() = AccessFlags(65536)
		val TRANSFORM_FEEDBACK_WRITE get() = AccessFlags(33554432)
		val TRANSFORM_FEEDBACK_COUNTER_READ get() = AccessFlags(67108864)
		val TRANSFORM_FEEDBACK_COUNTER_WRITE get() = AccessFlags(134217728)
		val CONDITIONAL_RENDERING_READ get() = AccessFlags(1048576)
		val COLOR_ATTACHMENT_READ_NONCOHERENT get() = AccessFlags(524288)
		val ACCELERATION_STRUCTURE_READ get() = AccessFlags(2097152)
		val ACCELERATION_STRUCTURE_WRITE get() = AccessFlags(4194304)
		val SHADING_RATE_IMAGE_READ get() = AccessFlags(8388608)
		val ACCELERATION_STRUCTURE_READ_NV get() = AccessFlags(2097152)
		val ACCELERATION_STRUCTURE_WRITE_NV get() = AccessFlags(4194304)
		val FRAGMENT_DENSITY_MAP_READ get() = AccessFlags(16777216)
		val FRAGMENT_SHADING_RATE_ATTACHMENT_READ get() = AccessFlags(8388608)
		val COMMAND_PREPROCESS_READ get() = AccessFlags(131072)
		val COMMAND_PREPROCESS_WRITE get() = AccessFlags(262144)
		
		inline fun compose(block: Companion.() -> AccessFlags) = block(Companion)
	
	}


}