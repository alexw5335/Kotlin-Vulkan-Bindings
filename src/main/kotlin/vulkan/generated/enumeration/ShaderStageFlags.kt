// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkShaderStageFlagBits {
 *         VERTEX                   = 1
 *         TESSELLATION_CONTROL     = 2
 *         TESSELLATION_EVALUATION  = 4
 *         GEOMETRY                 = 8
 *         FRAGMENT                 = 16
 *         COMPUTE                  = 32
 *         ALL_GRAPHICS             = 0x0000001F
 *         ALL                      = 0x7FFFFFFF
 *         RAYGEN                   = 256
 *         ANY_HIT                  = 512
 *         CLOSEST_HIT              = 1024
 *         MISS                     = 2048
 *         INTERSECTION             = 4096
 *         CALLABLE                 = 8192
 *         RAYGEN_NV                = 256
 *         ANY_HIT_NV               = 512
 *         CLOSEST_HIT_NV           = 1024
 *         MISS_NV                  = 2048
 *         INTERSECTION_NV          = 4096
 *         CALLABLE_NV              = 8192
 *         TASK                     = 64
 *         MESH                     = 128
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class ShaderStageFlags(val bitfield: Int) {
	
	
	val is_VERTEX get() = bitfield and 1 != 0
	val is_TESSELLATION_CONTROL get() = bitfield and 2 != 0
	val is_TESSELLATION_EVALUATION get() = bitfield and 4 != 0
	val is_GEOMETRY get() = bitfield and 8 != 0
	val is_FRAGMENT get() = bitfield and 16 != 0
	val is_COMPUTE get() = bitfield and 32 != 0
	val is_ALL_GRAPHICS get() = bitfield and 0x0000001F != 0
	val is_RAYGEN get() = bitfield and 256 != 0
	val is_ANY_HIT get() = bitfield and 512 != 0
	val is_CLOSEST_HIT get() = bitfield and 1024 != 0
	val is_MISS get() = bitfield and 2048 != 0
	val is_INTERSECTION get() = bitfield and 4096 != 0
	val is_CALLABLE get() = bitfield and 8192 != 0
	val is_RAYGEN_NV get() = bitfield and 256 != 0
	val is_ANY_HIT_NV get() = bitfield and 512 != 0
	val is_CLOSEST_HIT_NV get() = bitfield and 1024 != 0
	val is_MISS_NV get() = bitfield and 2048 != 0
	val is_INTERSECTION_NV get() = bitfield and 4096 != 0
	val is_CALLABLE_NV get() = bitfield and 8192 != 0
	val is_TASK get() = bitfield and 64 != 0
	val is_MESH get() = bitfield and 128 != 0
	
	
	
	infix operator fun plus(other: ShaderStageFlags) = ShaderStageFlags(bitfield or other.bitfield)
	
	infix operator fun plus(other: Int) = ShaderStageFlags(bitfield or other)
	
	infix fun containsAll(mask: ShaderStageFlags) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Int) = bitfield and mask == mask
	
	infix fun containsSome(mask: ShaderStageFlags) = bitfield and mask.bitfield != 0
	
	infix fun containsSome(mask: Int) = bitfield and mask != 0
	
	
	
	override fun toString() = buildString {
		append("{ ")
		if(is_VERTEX) append("VERTEX, ")
		if(is_TESSELLATION_CONTROL) append("TESSELLATION_CONTROL, ")
		if(is_TESSELLATION_EVALUATION) append("TESSELLATION_EVALUATION, ")
		if(is_GEOMETRY) append("GEOMETRY, ")
		if(is_FRAGMENT) append("FRAGMENT, ")
		if(is_COMPUTE) append("COMPUTE, ")
		if(is_ALL_GRAPHICS) append("ALL_GRAPHICS, ")
		if(is_RAYGEN) append("RAYGEN, ")
		if(is_ANY_HIT) append("ANY_HIT, ")
		if(is_CLOSEST_HIT) append("CLOSEST_HIT, ")
		if(is_MISS) append("MISS, ")
		if(is_INTERSECTION) append("INTERSECTION, ")
		if(is_CALLABLE) append("CALLABLE, ")
		if(is_RAYGEN_NV) append("RAYGEN_NV, ")
		if(is_ANY_HIT_NV) append("ANY_HIT_NV, ")
		if(is_CLOSEST_HIT_NV) append("CLOSEST_HIT_NV, ")
		if(is_MISS_NV) append("MISS_NV, ")
		if(is_INTERSECTION_NV) append("INTERSECTION_NV, ")
		if(is_CALLABLE_NV) append("CALLABLE_NV, ")
		if(is_TASK) append("TASK, ")
		if(is_MESH) append("MESH, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = ShaderStageFlags(0)
		val ALL get() = ShaderStageFlags(-2147451107)
		val VERTEX get() = ShaderStageFlags(1)
		val TESSELLATION_CONTROL get() = ShaderStageFlags(2)
		val TESSELLATION_EVALUATION get() = ShaderStageFlags(4)
		val GEOMETRY get() = ShaderStageFlags(8)
		val FRAGMENT get() = ShaderStageFlags(16)
		val COMPUTE get() = ShaderStageFlags(32)
		val ALL_GRAPHICS get() = ShaderStageFlags(0x0000001F)
		val RAYGEN get() = ShaderStageFlags(256)
		val ANY_HIT get() = ShaderStageFlags(512)
		val CLOSEST_HIT get() = ShaderStageFlags(1024)
		val MISS get() = ShaderStageFlags(2048)
		val INTERSECTION get() = ShaderStageFlags(4096)
		val CALLABLE get() = ShaderStageFlags(8192)
		val RAYGEN_NV get() = ShaderStageFlags(256)
		val ANY_HIT_NV get() = ShaderStageFlags(512)
		val CLOSEST_HIT_NV get() = ShaderStageFlags(1024)
		val MISS_NV get() = ShaderStageFlags(2048)
		val INTERSECTION_NV get() = ShaderStageFlags(4096)
		val CALLABLE_NV get() = ShaderStageFlags(8192)
		val TASK get() = ShaderStageFlags(64)
		val MESH get() = ShaderStageFlags(128)
		
		inline fun compose(block: Companion.() -> ShaderStageFlags) = block(Companion)
	
	}


}