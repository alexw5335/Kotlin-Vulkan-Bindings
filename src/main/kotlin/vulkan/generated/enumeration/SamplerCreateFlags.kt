// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkSamplerCreateFlagBits {
 *         SUBSAMPLED                        = 1
 *         SUBSAMPLED_COARSE_RECONSTRUCTION  = 2
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class SamplerCreateFlags(val bitfield: Int) {
	
	
	val is_SUBSAMPLED get() = bitfield and 1 != 0
	val is_SUBSAMPLED_COARSE_RECONSTRUCTION get() = bitfield and 2 != 0
	
	
	
	infix operator fun plus(other: SamplerCreateFlags) = SamplerCreateFlags(bitfield or other.bitfield)
	
	infix operator fun plus(other: Int) = SamplerCreateFlags(bitfield or other)
	
	infix fun containsAll(mask: SamplerCreateFlags) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Int) = bitfield and mask == mask
	
	infix fun containsSome(mask: SamplerCreateFlags) = bitfield and mask.bitfield != 0
	
	infix fun containsSome(mask: Int) = bitfield and mask != 0
	
	
	
	override fun toString() = buildString {
		append("{ ")
		if(is_SUBSAMPLED) append("SUBSAMPLED, ")
		if(is_SUBSAMPLED_COARSE_RECONSTRUCTION) append("SUBSAMPLED_COARSE_RECONSTRUCTION, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = SamplerCreateFlags(0)
		val ALL get() = SamplerCreateFlags(3)
		val SUBSAMPLED get() = SamplerCreateFlags(1)
		val SUBSAMPLED_COARSE_RECONSTRUCTION get() = SamplerCreateFlags(2)
		
		inline fun compose(block: Companion.() -> SamplerCreateFlags) = block(Companion)
	
	}


}