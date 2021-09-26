// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkPipelineShaderStageCreateFlagBits {
 *         ALLOW_VARYING_SUBGROUP_SIZE  = 1
 *         REQUIRE_FULL_SUBGROUPS       = 2
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class PipelineShaderStageCreateFlags(val bitfield: Int) {
	
	
	val is_ALLOW_VARYING_SUBGROUP_SIZE get() = bitfield and 1 != 0
	val is_REQUIRE_FULL_SUBGROUPS get() = bitfield and 2 != 0
	
	
	
	infix operator fun plus(other: PipelineShaderStageCreateFlags) = PipelineShaderStageCreateFlags(bitfield or other.bitfield)
	
	infix operator fun plus(other: Int) = PipelineShaderStageCreateFlags(bitfield or other)
	
	infix fun containsAll(mask: PipelineShaderStageCreateFlags) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Int) = bitfield and mask == mask
	
	infix fun containsSome(mask: PipelineShaderStageCreateFlags) = bitfield and mask.bitfield != 0
	
	infix fun containsSome(mask: Int) = bitfield and mask != 0
	
	
	
	override fun toString() = buildString {
		append("{ ")
		if(is_ALLOW_VARYING_SUBGROUP_SIZE) append("ALLOW_VARYING_SUBGROUP_SIZE, ")
		if(is_REQUIRE_FULL_SUBGROUPS) append("REQUIRE_FULL_SUBGROUPS, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = PipelineShaderStageCreateFlags(0)
		val ALL get() = PipelineShaderStageCreateFlags(3)
		val ALLOW_VARYING_SUBGROUP_SIZE get() = PipelineShaderStageCreateFlags(1)
		val REQUIRE_FULL_SUBGROUPS get() = PipelineShaderStageCreateFlags(2)
		
		inline fun compose(block: Companion.() -> PipelineShaderStageCreateFlags) = block(Companion)
	
	}


}