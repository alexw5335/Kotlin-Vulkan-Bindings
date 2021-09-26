// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkQueryPipelineStatisticFlagBits {
 *         INPUT_ASSEMBLY_VERTICES                     = 1
 *         INPUT_ASSEMBLY_PRIMITIVES                   = 2
 *         VERTEX_SHADER_INVOCATIONS                   = 4
 *         GEOMETRY_SHADER_INVOCATIONS                 = 8
 *         GEOMETRY_SHADER_PRIMITIVES                  = 16
 *         CLIPPING_INVOCATIONS                        = 32
 *         CLIPPING_PRIMITIVES                         = 64
 *         FRAGMENT_SHADER_INVOCATIONS                 = 128
 *         TESSELLATION_CONTROL_SHADER_PATCHES         = 256
 *         TESSELLATION_EVALUATION_SHADER_INVOCATIONS  = 512
 *         COMPUTE_SHADER_INVOCATIONS                  = 1024
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class QueryPipelineStatisticFlags(val bitfield: Int) {
	
	
	val is_INPUT_ASSEMBLY_VERTICES get() = bitfield and 1 != 0
	val is_INPUT_ASSEMBLY_PRIMITIVES get() = bitfield and 2 != 0
	val is_VERTEX_SHADER_INVOCATIONS get() = bitfield and 4 != 0
	val is_GEOMETRY_SHADER_INVOCATIONS get() = bitfield and 8 != 0
	val is_GEOMETRY_SHADER_PRIMITIVES get() = bitfield and 16 != 0
	val is_CLIPPING_INVOCATIONS get() = bitfield and 32 != 0
	val is_CLIPPING_PRIMITIVES get() = bitfield and 64 != 0
	val is_FRAGMENT_SHADER_INVOCATIONS get() = bitfield and 128 != 0
	val is_TESSELLATION_CONTROL_SHADER_PATCHES get() = bitfield and 256 != 0
	val is_TESSELLATION_EVALUATION_SHADER_INVOCATIONS get() = bitfield and 512 != 0
	val is_COMPUTE_SHADER_INVOCATIONS get() = bitfield and 1024 != 0
	
	
	
	infix operator fun plus(other: QueryPipelineStatisticFlags) = QueryPipelineStatisticFlags(bitfield or other.bitfield)
	
	infix operator fun plus(other: Int) = QueryPipelineStatisticFlags(bitfield or other)
	
	infix fun containsAll(mask: QueryPipelineStatisticFlags) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Int) = bitfield and mask == mask
	
	infix fun containsSome(mask: QueryPipelineStatisticFlags) = bitfield and mask.bitfield != 0
	
	infix fun containsSome(mask: Int) = bitfield and mask != 0
	
	
	
	override fun toString() = buildString {
		append("{ ")
		if(is_INPUT_ASSEMBLY_VERTICES) append("INPUT_ASSEMBLY_VERTICES, ")
		if(is_INPUT_ASSEMBLY_PRIMITIVES) append("INPUT_ASSEMBLY_PRIMITIVES, ")
		if(is_VERTEX_SHADER_INVOCATIONS) append("VERTEX_SHADER_INVOCATIONS, ")
		if(is_GEOMETRY_SHADER_INVOCATIONS) append("GEOMETRY_SHADER_INVOCATIONS, ")
		if(is_GEOMETRY_SHADER_PRIMITIVES) append("GEOMETRY_SHADER_PRIMITIVES, ")
		if(is_CLIPPING_INVOCATIONS) append("CLIPPING_INVOCATIONS, ")
		if(is_CLIPPING_PRIMITIVES) append("CLIPPING_PRIMITIVES, ")
		if(is_FRAGMENT_SHADER_INVOCATIONS) append("FRAGMENT_SHADER_INVOCATIONS, ")
		if(is_TESSELLATION_CONTROL_SHADER_PATCHES) append("TESSELLATION_CONTROL_SHADER_PATCHES, ")
		if(is_TESSELLATION_EVALUATION_SHADER_INVOCATIONS) append("TESSELLATION_EVALUATION_SHADER_INVOCATIONS, ")
		if(is_COMPUTE_SHADER_INVOCATIONS) append("COMPUTE_SHADER_INVOCATIONS, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = QueryPipelineStatisticFlags(0)
		val ALL get() = QueryPipelineStatisticFlags(2047)
		val INPUT_ASSEMBLY_VERTICES get() = QueryPipelineStatisticFlags(1)
		val INPUT_ASSEMBLY_PRIMITIVES get() = QueryPipelineStatisticFlags(2)
		val VERTEX_SHADER_INVOCATIONS get() = QueryPipelineStatisticFlags(4)
		val GEOMETRY_SHADER_INVOCATIONS get() = QueryPipelineStatisticFlags(8)
		val GEOMETRY_SHADER_PRIMITIVES get() = QueryPipelineStatisticFlags(16)
		val CLIPPING_INVOCATIONS get() = QueryPipelineStatisticFlags(32)
		val CLIPPING_PRIMITIVES get() = QueryPipelineStatisticFlags(64)
		val FRAGMENT_SHADER_INVOCATIONS get() = QueryPipelineStatisticFlags(128)
		val TESSELLATION_CONTROL_SHADER_PATCHES get() = QueryPipelineStatisticFlags(256)
		val TESSELLATION_EVALUATION_SHADER_INVOCATIONS get() = QueryPipelineStatisticFlags(512)
		val COMPUTE_SHADER_INVOCATIONS get() = QueryPipelineStatisticFlags(1024)
		
		inline fun compose(block: Companion.() -> QueryPipelineStatisticFlags) = block(Companion)
	
	}


}