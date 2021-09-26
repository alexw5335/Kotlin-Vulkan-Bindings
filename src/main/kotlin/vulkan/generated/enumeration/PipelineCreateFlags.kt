// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkPipelineCreateFlagBits {
 *         DISABLE_OPTIMIZATION                            = 1
 *         ALLOW_DERIVATIVES                               = 2
 *         DERIVATIVE                                      = 4
 *         VIEW_INDEX_FROM_DEVICE_INDEX                    = 8
 *         DISPATCH_BASE                                   = 16
 *         DISPATCH_BASE_                                  = 16
 *         VIEW_INDEX_FROM_DEVICE_INDEX_KHR                = 8
 *         DISPATCH_BASE_KHR                               = 16
 *         RAY_TRACING_NO_NULL_ANY_HIT_SHADERS             = 16384
 *         RAY_TRACING_NO_NULL_CLOSEST_HIT_SHADERS         = 32768
 *         RAY_TRACING_NO_NULL_MISS_SHADERS                = 65536
 *         RAY_TRACING_NO_NULL_INTERSECTION_SHADERS        = 131072
 *         RAY_TRACING_SKIP_TRIANGLES                      = 4096
 *         RAY_TRACING_SKIP_AABBS                          = 8192
 *         RAY_TRACING_SHADER_GROUP_HANDLE_CAPTURE_REPLAY  = 524288
 *         DEFER_COMPILE                                   = 32
 *         CAPTURE_STATISTICS                              = 64
 *         CAPTURE_INTERNAL_REPRESENTATIONS                = 128
 *         INDIRECT_BINDABLE                               = 262144
 *         LIBRARY                                         = 2048
 *         FAIL_ON_PIPELINE_COMPILE_REQUIRED               = 256
 *         EARLY_RETURN_ON_FAILURE                         = 512
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class PipelineCreateFlags(val bitfield: Int) {
	
	
	val is_DISABLE_OPTIMIZATION get() = bitfield and 1 != 0
	val is_ALLOW_DERIVATIVES get() = bitfield and 2 != 0
	val is_DERIVATIVE get() = bitfield and 4 != 0
	val is_VIEW_INDEX_FROM_DEVICE_INDEX get() = bitfield and 8 != 0
	val is_DISPATCH_BASE get() = bitfield and 16 != 0
	val is_DISPATCH_BASE_ get() = bitfield and 16 != 0
	val is_VIEW_INDEX_FROM_DEVICE_INDEX_KHR get() = bitfield and 8 != 0
	val is_DISPATCH_BASE_KHR get() = bitfield and 16 != 0
	val is_RAY_TRACING_NO_NULL_ANY_HIT_SHADERS get() = bitfield and 16384 != 0
	val is_RAY_TRACING_NO_NULL_CLOSEST_HIT_SHADERS get() = bitfield and 32768 != 0
	val is_RAY_TRACING_NO_NULL_MISS_SHADERS get() = bitfield and 65536 != 0
	val is_RAY_TRACING_NO_NULL_INTERSECTION_SHADERS get() = bitfield and 131072 != 0
	val is_RAY_TRACING_SKIP_TRIANGLES get() = bitfield and 4096 != 0
	val is_RAY_TRACING_SKIP_AABBS get() = bitfield and 8192 != 0
	val is_RAY_TRACING_SHADER_GROUP_HANDLE_CAPTURE_REPLAY get() = bitfield and 524288 != 0
	val is_DEFER_COMPILE get() = bitfield and 32 != 0
	val is_CAPTURE_STATISTICS get() = bitfield and 64 != 0
	val is_CAPTURE_INTERNAL_REPRESENTATIONS get() = bitfield and 128 != 0
	val is_INDIRECT_BINDABLE get() = bitfield and 262144 != 0
	val is_LIBRARY get() = bitfield and 2048 != 0
	val is_FAIL_ON_PIPELINE_COMPILE_REQUIRED get() = bitfield and 256 != 0
	val is_EARLY_RETURN_ON_FAILURE get() = bitfield and 512 != 0
	
	
	
	infix operator fun plus(other: PipelineCreateFlags) = PipelineCreateFlags(bitfield or other.bitfield)
	
	infix operator fun plus(other: Int) = PipelineCreateFlags(bitfield or other)
	
	infix fun containsAll(mask: PipelineCreateFlags) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Int) = bitfield and mask == mask
	
	infix fun containsSome(mask: PipelineCreateFlags) = bitfield and mask.bitfield != 0
	
	infix fun containsSome(mask: Int) = bitfield and mask != 0
	
	
	
	override fun toString() = buildString {
		append("{ ")
		if(is_DISABLE_OPTIMIZATION) append("DISABLE_OPTIMIZATION, ")
		if(is_ALLOW_DERIVATIVES) append("ALLOW_DERIVATIVES, ")
		if(is_DERIVATIVE) append("DERIVATIVE, ")
		if(is_VIEW_INDEX_FROM_DEVICE_INDEX) append("VIEW_INDEX_FROM_DEVICE_INDEX, ")
		if(is_DISPATCH_BASE) append("DISPATCH_BASE, ")
		if(is_DISPATCH_BASE_) append("DISPATCH_BASE_, ")
		if(is_VIEW_INDEX_FROM_DEVICE_INDEX_KHR) append("VIEW_INDEX_FROM_DEVICE_INDEX_KHR, ")
		if(is_DISPATCH_BASE_KHR) append("DISPATCH_BASE_KHR, ")
		if(is_RAY_TRACING_NO_NULL_ANY_HIT_SHADERS) append("RAY_TRACING_NO_NULL_ANY_HIT_SHADERS, ")
		if(is_RAY_TRACING_NO_NULL_CLOSEST_HIT_SHADERS) append("RAY_TRACING_NO_NULL_CLOSEST_HIT_SHADERS, ")
		if(is_RAY_TRACING_NO_NULL_MISS_SHADERS) append("RAY_TRACING_NO_NULL_MISS_SHADERS, ")
		if(is_RAY_TRACING_NO_NULL_INTERSECTION_SHADERS) append("RAY_TRACING_NO_NULL_INTERSECTION_SHADERS, ")
		if(is_RAY_TRACING_SKIP_TRIANGLES) append("RAY_TRACING_SKIP_TRIANGLES, ")
		if(is_RAY_TRACING_SKIP_AABBS) append("RAY_TRACING_SKIP_AABBS, ")
		if(is_RAY_TRACING_SHADER_GROUP_HANDLE_CAPTURE_REPLAY) append("RAY_TRACING_SHADER_GROUP_HANDLE_CAPTURE_REPLAY, ")
		if(is_DEFER_COMPILE) append("DEFER_COMPILE, ")
		if(is_CAPTURE_STATISTICS) append("CAPTURE_STATISTICS, ")
		if(is_CAPTURE_INTERNAL_REPRESENTATIONS) append("CAPTURE_INTERNAL_REPRESENTATIONS, ")
		if(is_INDIRECT_BINDABLE) append("INDIRECT_BINDABLE, ")
		if(is_LIBRARY) append("LIBRARY, ")
		if(is_FAIL_ON_PIPELINE_COMPILE_REQUIRED) append("FAIL_ON_PIPELINE_COMPILE_REQUIRED, ")
		if(is_EARLY_RETURN_ON_FAILURE) append("EARLY_RETURN_ON_FAILURE, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = PipelineCreateFlags(0)
		val ALL get() = PipelineCreateFlags(1047591)
		val DISABLE_OPTIMIZATION get() = PipelineCreateFlags(1)
		val ALLOW_DERIVATIVES get() = PipelineCreateFlags(2)
		val DERIVATIVE get() = PipelineCreateFlags(4)
		val VIEW_INDEX_FROM_DEVICE_INDEX get() = PipelineCreateFlags(8)
		val DISPATCH_BASE get() = PipelineCreateFlags(16)
		val DISPATCH_BASE_ get() = PipelineCreateFlags(16)
		val VIEW_INDEX_FROM_DEVICE_INDEX_KHR get() = PipelineCreateFlags(8)
		val DISPATCH_BASE_KHR get() = PipelineCreateFlags(16)
		val RAY_TRACING_NO_NULL_ANY_HIT_SHADERS get() = PipelineCreateFlags(16384)
		val RAY_TRACING_NO_NULL_CLOSEST_HIT_SHADERS get() = PipelineCreateFlags(32768)
		val RAY_TRACING_NO_NULL_MISS_SHADERS get() = PipelineCreateFlags(65536)
		val RAY_TRACING_NO_NULL_INTERSECTION_SHADERS get() = PipelineCreateFlags(131072)
		val RAY_TRACING_SKIP_TRIANGLES get() = PipelineCreateFlags(4096)
		val RAY_TRACING_SKIP_AABBS get() = PipelineCreateFlags(8192)
		val RAY_TRACING_SHADER_GROUP_HANDLE_CAPTURE_REPLAY get() = PipelineCreateFlags(524288)
		val DEFER_COMPILE get() = PipelineCreateFlags(32)
		val CAPTURE_STATISTICS get() = PipelineCreateFlags(64)
		val CAPTURE_INTERNAL_REPRESENTATIONS get() = PipelineCreateFlags(128)
		val INDIRECT_BINDABLE get() = PipelineCreateFlags(262144)
		val LIBRARY get() = PipelineCreateFlags(2048)
		val FAIL_ON_PIPELINE_COMPILE_REQUIRED get() = PipelineCreateFlags(256)
		val EARLY_RETURN_ON_FAILURE get() = PipelineCreateFlags(512)
		
		inline fun compose(block: Companion.() -> PipelineCreateFlags) = block(Companion)
	
	}


}