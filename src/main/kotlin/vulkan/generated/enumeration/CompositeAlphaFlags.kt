// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkCompositeAlphaFlagBitsKHR {
 *         OPAQUE           = 1
 *         PRE_MULTIPLIED   = 2
 *         POST_MULTIPLIED  = 4
 *         INHERIT          = 8
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class CompositeAlphaFlags(val bitfield: Int) {
	
	
	val is_OPAQUE get() = bitfield and 1 != 0
	val is_PRE_MULTIPLIED get() = bitfield and 2 != 0
	val is_POST_MULTIPLIED get() = bitfield and 4 != 0
	val is_INHERIT get() = bitfield and 8 != 0
	
	
	
	infix operator fun plus(other: CompositeAlphaFlags) = CompositeAlphaFlags(bitfield or other.bitfield)
	
	infix operator fun plus(other: Int) = CompositeAlphaFlags(bitfield or other)
	
	infix fun containsAll(mask: CompositeAlphaFlags) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Int) = bitfield and mask == mask
	
	infix fun containsSome(mask: CompositeAlphaFlags) = bitfield and mask.bitfield != 0
	
	infix fun containsSome(mask: Int) = bitfield and mask != 0
	
	
	
	override fun toString() = buildString {
		append("{ ")
		if(is_OPAQUE) append("OPAQUE, ")
		if(is_PRE_MULTIPLIED) append("PRE_MULTIPLIED, ")
		if(is_POST_MULTIPLIED) append("POST_MULTIPLIED, ")
		if(is_INHERIT) append("INHERIT, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = CompositeAlphaFlags(0)
		val ALL get() = CompositeAlphaFlags(15)
		val OPAQUE get() = CompositeAlphaFlags(1)
		val PRE_MULTIPLIED get() = CompositeAlphaFlags(2)
		val POST_MULTIPLIED get() = CompositeAlphaFlags(4)
		val INHERIT get() = CompositeAlphaFlags(8)
		
		inline fun compose(block: Companion.() -> CompositeAlphaFlags) = block(Companion)
	
	}


}