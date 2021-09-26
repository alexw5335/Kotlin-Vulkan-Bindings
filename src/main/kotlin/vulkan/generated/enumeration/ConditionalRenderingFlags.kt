// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkConditionalRenderingFlagBitsEXT {
 *         INVERTED  = 1
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class ConditionalRenderingFlags(val bitfield: Int) {
	
	
	val is_INVERTED get() = bitfield and 1 != 0
	
	
	
	infix operator fun plus(other: ConditionalRenderingFlags) = ConditionalRenderingFlags(bitfield or other.bitfield)
	
	infix operator fun plus(other: Int) = ConditionalRenderingFlags(bitfield or other)
	
	infix fun containsAll(mask: ConditionalRenderingFlags) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Int) = bitfield and mask == mask
	
	infix fun containsSome(mask: ConditionalRenderingFlags) = bitfield and mask.bitfield != 0
	
	infix fun containsSome(mask: Int) = bitfield and mask != 0
	
	
	
	override fun toString() = buildString {
		append("{ ")
		if(is_INVERTED) append("INVERTED, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = ConditionalRenderingFlags(0)
		val ALL get() = ConditionalRenderingFlags(1)
		val INVERTED get() = ConditionalRenderingFlags(1)
		
		inline fun compose(block: Companion.() -> ConditionalRenderingFlags) = block(Companion)
	
	}


}