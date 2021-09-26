// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkResolveModeFlagBits {
 *         NONE             = 0
 *         SAMPLE_ZERO      = 1
 *         AVERAGE          = 2
 *         MIN              = 4
 *         MAX              = 8
 *         NONE_KHR         = 0
 *         SAMPLE_ZERO_KHR  = 1
 *         AVERAGE_KHR      = 2
 *         MIN_KHR          = 4
 *         MAX_KHR          = 8
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class ResolveModeFlags(val bitfield: Int) {
	
	
	val is_SAMPLE_ZERO get() = bitfield and 1 != 0
	val is_AVERAGE get() = bitfield and 2 != 0
	val is_MIN get() = bitfield and 4 != 0
	val is_MAX get() = bitfield and 8 != 0
	val is_NONE_KHR get() = bitfield and 0 != 0
	val is_SAMPLE_ZERO_KHR get() = bitfield and 1 != 0
	val is_AVERAGE_KHR get() = bitfield and 2 != 0
	val is_MIN_KHR get() = bitfield and 4 != 0
	val is_MAX_KHR get() = bitfield and 8 != 0
	
	
	
	infix operator fun plus(other: ResolveModeFlags) = ResolveModeFlags(bitfield or other.bitfield)
	
	infix operator fun plus(other: Int) = ResolveModeFlags(bitfield or other)
	
	infix fun containsAll(mask: ResolveModeFlags) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Int) = bitfield and mask == mask
	
	infix fun containsSome(mask: ResolveModeFlags) = bitfield and mask.bitfield != 0
	
	infix fun containsSome(mask: Int) = bitfield and mask != 0
	
	
	
	override fun toString() = buildString {
		append("{ ")
		if(is_SAMPLE_ZERO) append("SAMPLE_ZERO, ")
		if(is_AVERAGE) append("AVERAGE, ")
		if(is_MIN) append("MIN, ")
		if(is_MAX) append("MAX, ")
		if(is_NONE_KHR) append("NONE_KHR, ")
		if(is_SAMPLE_ZERO_KHR) append("SAMPLE_ZERO_KHR, ")
		if(is_AVERAGE_KHR) append("AVERAGE_KHR, ")
		if(is_MIN_KHR) append("MIN_KHR, ")
		if(is_MAX_KHR) append("MAX_KHR, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = ResolveModeFlags(0)
		val ALL get() = ResolveModeFlags(30)
		val SAMPLE_ZERO get() = ResolveModeFlags(1)
		val AVERAGE get() = ResolveModeFlags(2)
		val MIN get() = ResolveModeFlags(4)
		val MAX get() = ResolveModeFlags(8)
		val NONE_KHR get() = ResolveModeFlags(0)
		val SAMPLE_ZERO_KHR get() = ResolveModeFlags(1)
		val AVERAGE_KHR get() = ResolveModeFlags(2)
		val MIN_KHR get() = ResolveModeFlags(4)
		val MAX_KHR get() = ResolveModeFlags(8)
		
		inline fun compose(block: Companion.() -> ResolveModeFlags) = block(Companion)
	
	}


}