// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkSubgroupFeatureFlagBits {
 *         BASIC             = 1
 *         VOTE              = 2
 *         ARITHMETIC        = 4
 *         BALLOT            = 8
 *         SHUFFLE           = 16
 *         SHUFFLE_RELATIVE  = 32
 *         CLUSTERED         = 64
 *         QUAD              = 128
 *         PARTITIONED       = 256
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class SubgroupFeatureFlags(val bitfield: Int) {
	
	
	val is_BASIC get() = bitfield and 1 != 0
	val is_VOTE get() = bitfield and 2 != 0
	val is_ARITHMETIC get() = bitfield and 4 != 0
	val is_BALLOT get() = bitfield and 8 != 0
	val is_SHUFFLE get() = bitfield and 16 != 0
	val is_SHUFFLE_RELATIVE get() = bitfield and 32 != 0
	val is_CLUSTERED get() = bitfield and 64 != 0
	val is_QUAD get() = bitfield and 128 != 0
	val is_PARTITIONED get() = bitfield and 256 != 0
	
	
	
	infix operator fun plus(other: SubgroupFeatureFlags) = SubgroupFeatureFlags(bitfield or other.bitfield)
	
	infix operator fun plus(other: Int) = SubgroupFeatureFlags(bitfield or other)
	
	infix fun containsAll(mask: SubgroupFeatureFlags) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Int) = bitfield and mask == mask
	
	infix fun containsSome(mask: SubgroupFeatureFlags) = bitfield and mask.bitfield != 0
	
	infix fun containsSome(mask: Int) = bitfield and mask != 0
	
	
	
	override fun toString() = buildString {
		append("{ ")
		if(is_BASIC) append("BASIC, ")
		if(is_VOTE) append("VOTE, ")
		if(is_ARITHMETIC) append("ARITHMETIC, ")
		if(is_BALLOT) append("BALLOT, ")
		if(is_SHUFFLE) append("SHUFFLE, ")
		if(is_SHUFFLE_RELATIVE) append("SHUFFLE_RELATIVE, ")
		if(is_CLUSTERED) append("CLUSTERED, ")
		if(is_QUAD) append("QUAD, ")
		if(is_PARTITIONED) append("PARTITIONED, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = SubgroupFeatureFlags(0)
		val ALL get() = SubgroupFeatureFlags(511)
		val BASIC get() = SubgroupFeatureFlags(1)
		val VOTE get() = SubgroupFeatureFlags(2)
		val ARITHMETIC get() = SubgroupFeatureFlags(4)
		val BALLOT get() = SubgroupFeatureFlags(8)
		val SHUFFLE get() = SubgroupFeatureFlags(16)
		val SHUFFLE_RELATIVE get() = SubgroupFeatureFlags(32)
		val CLUSTERED get() = SubgroupFeatureFlags(64)
		val QUAD get() = SubgroupFeatureFlags(128)
		val PARTITIONED get() = SubgroupFeatureFlags(256)
		
		inline fun compose(block: Companion.() -> SubgroupFeatureFlags) = block(Companion)
	
	}


}