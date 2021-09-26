// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkBufferUsageFlagBits {
 *         TRANSFER_SRC                                  = 1
 *         TRANSFER_DST                                  = 2
 *         UNIFORM_TEXEL_BUFFER                          = 4
 *         STORAGE_TEXEL_BUFFER                          = 8
 *         UNIFORM_BUFFER                                = 16
 *         STORAGE_BUFFER                                = 32
 *         INDEX_BUFFER                                  = 64
 *         VERTEX_BUFFER                                 = 128
 *         INDIRECT_BUFFER                               = 256
 *         SHADER_DEVICE_ADDRESS                         = 131072
 *         TRANSFORM_FEEDBACK_BUFFER                     = 2048
 *         TRANSFORM_FEEDBACK_COUNTER_BUFFER             = 4096
 *         CONDITIONAL_RENDERING                         = 512
 *         ACCELERATION_STRUCTURE_BUILD_INPUT_READ_ONLY  = 524288
 *         ACCELERATION_STRUCTURE_STORAGE                = 1048576
 *         SHADER_BINDING_TABLE                          = 1024
 *         RAY_TRACING                                   = 1024
 *         SHADER_DEVICE_ADDRESS_EXT                     = 131072
 *         SHADER_DEVICE_ADDRESS_KHR                     = 131072
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class BufferUsageFlags(val bitfield: Int) {
	
	
	val is_TRANSFER_SRC get() = bitfield and 1 != 0
	val is_TRANSFER_DST get() = bitfield and 2 != 0
	val is_UNIFORM_TEXEL_BUFFER get() = bitfield and 4 != 0
	val is_STORAGE_TEXEL_BUFFER get() = bitfield and 8 != 0
	val is_UNIFORM_BUFFER get() = bitfield and 16 != 0
	val is_STORAGE_BUFFER get() = bitfield and 32 != 0
	val is_INDEX_BUFFER get() = bitfield and 64 != 0
	val is_VERTEX_BUFFER get() = bitfield and 128 != 0
	val is_INDIRECT_BUFFER get() = bitfield and 256 != 0
	val is_SHADER_DEVICE_ADDRESS get() = bitfield and 131072 != 0
	val is_TRANSFORM_FEEDBACK_BUFFER get() = bitfield and 2048 != 0
	val is_TRANSFORM_FEEDBACK_COUNTER_BUFFER get() = bitfield and 4096 != 0
	val is_CONDITIONAL_RENDERING get() = bitfield and 512 != 0
	val is_ACCELERATION_STRUCTURE_BUILD_INPUT_READ_ONLY get() = bitfield and 524288 != 0
	val is_ACCELERATION_STRUCTURE_STORAGE get() = bitfield and 1048576 != 0
	val is_SHADER_BINDING_TABLE get() = bitfield and 1024 != 0
	val is_RAY_TRACING get() = bitfield and 1024 != 0
	val is_SHADER_DEVICE_ADDRESS_EXT get() = bitfield and 131072 != 0
	val is_SHADER_DEVICE_ADDRESS_KHR get() = bitfield and 131072 != 0
	
	
	
	infix operator fun plus(other: BufferUsageFlags) = BufferUsageFlags(bitfield or other.bitfield)
	
	infix operator fun plus(other: Int) = BufferUsageFlags(bitfield or other)
	
	infix fun containsAll(mask: BufferUsageFlags) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Int) = bitfield and mask == mask
	
	infix fun containsSome(mask: BufferUsageFlags) = bitfield and mask.bitfield != 0
	
	infix fun containsSome(mask: Int) = bitfield and mask != 0
	
	
	
	override fun toString() = buildString {
		append("{ ")
		if(is_TRANSFER_SRC) append("TRANSFER_SRC, ")
		if(is_TRANSFER_DST) append("TRANSFER_DST, ")
		if(is_UNIFORM_TEXEL_BUFFER) append("UNIFORM_TEXEL_BUFFER, ")
		if(is_STORAGE_TEXEL_BUFFER) append("STORAGE_TEXEL_BUFFER, ")
		if(is_UNIFORM_BUFFER) append("UNIFORM_BUFFER, ")
		if(is_STORAGE_BUFFER) append("STORAGE_BUFFER, ")
		if(is_INDEX_BUFFER) append("INDEX_BUFFER, ")
		if(is_VERTEX_BUFFER) append("VERTEX_BUFFER, ")
		if(is_INDIRECT_BUFFER) append("INDIRECT_BUFFER, ")
		if(is_SHADER_DEVICE_ADDRESS) append("SHADER_DEVICE_ADDRESS, ")
		if(is_TRANSFORM_FEEDBACK_BUFFER) append("TRANSFORM_FEEDBACK_BUFFER, ")
		if(is_TRANSFORM_FEEDBACK_COUNTER_BUFFER) append("TRANSFORM_FEEDBACK_COUNTER_BUFFER, ")
		if(is_CONDITIONAL_RENDERING) append("CONDITIONAL_RENDERING, ")
		if(is_ACCELERATION_STRUCTURE_BUILD_INPUT_READ_ONLY) append("ACCELERATION_STRUCTURE_BUILD_INPUT_READ_ONLY, ")
		if(is_ACCELERATION_STRUCTURE_STORAGE) append("ACCELERATION_STRUCTURE_STORAGE, ")
		if(is_SHADER_BINDING_TABLE) append("SHADER_BINDING_TABLE, ")
		if(is_RAY_TRACING) append("RAY_TRACING, ")
		if(is_SHADER_DEVICE_ADDRESS_EXT) append("SHADER_DEVICE_ADDRESS_EXT, ")
		if(is_SHADER_DEVICE_ADDRESS_KHR) append("SHADER_DEVICE_ADDRESS_KHR, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = BufferUsageFlags(0)
		val ALL get() = BufferUsageFlags(1975295)
		val TRANSFER_SRC get() = BufferUsageFlags(1)
		val TRANSFER_DST get() = BufferUsageFlags(2)
		val UNIFORM_TEXEL_BUFFER get() = BufferUsageFlags(4)
		val STORAGE_TEXEL_BUFFER get() = BufferUsageFlags(8)
		val UNIFORM_BUFFER get() = BufferUsageFlags(16)
		val STORAGE_BUFFER get() = BufferUsageFlags(32)
		val INDEX_BUFFER get() = BufferUsageFlags(64)
		val VERTEX_BUFFER get() = BufferUsageFlags(128)
		val INDIRECT_BUFFER get() = BufferUsageFlags(256)
		val SHADER_DEVICE_ADDRESS get() = BufferUsageFlags(131072)
		val TRANSFORM_FEEDBACK_BUFFER get() = BufferUsageFlags(2048)
		val TRANSFORM_FEEDBACK_COUNTER_BUFFER get() = BufferUsageFlags(4096)
		val CONDITIONAL_RENDERING get() = BufferUsageFlags(512)
		val ACCELERATION_STRUCTURE_BUILD_INPUT_READ_ONLY get() = BufferUsageFlags(524288)
		val ACCELERATION_STRUCTURE_STORAGE get() = BufferUsageFlags(1048576)
		val SHADER_BINDING_TABLE get() = BufferUsageFlags(1024)
		val RAY_TRACING get() = BufferUsageFlags(1024)
		val SHADER_DEVICE_ADDRESS_EXT get() = BufferUsageFlags(131072)
		val SHADER_DEVICE_ADDRESS_KHR get() = BufferUsageFlags(131072)
		
		inline fun compose(block: Companion.() -> BufferUsageFlags) = block(Companion)
	
	}


}