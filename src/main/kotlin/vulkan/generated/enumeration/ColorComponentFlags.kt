// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkColorComponentFlagBits {
 *         R  = 1
 *         G  = 2
 *         B  = 4
 *         A  = 8
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class ColorComponentFlags(val bitfield: Int) {
	
	
	val is_R get() = bitfield and 1 != 0
	val is_G get() = bitfield and 2 != 0
	val is_B get() = bitfield and 4 != 0
	val is_A get() = bitfield and 8 != 0
	
	
	
	infix operator fun plus(other: ColorComponentFlags) = ColorComponentFlags(bitfield or other.bitfield)
	
	infix operator fun plus(other: Int) = ColorComponentFlags(bitfield or other)
	
	infix fun containsAll(mask: ColorComponentFlags) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Int) = bitfield and mask == mask
	
	infix fun containsSome(mask: ColorComponentFlags) = bitfield and mask.bitfield != 0
	
	infix fun containsSome(mask: Int) = bitfield and mask != 0
	
	
	
	override fun toString() = buildString {
		append("{ ")
		if(is_R) append("R, ")
		if(is_G) append("G, ")
		if(is_B) append("B, ")
		if(is_A) append("A, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = ColorComponentFlags(0)
		val ALL get() = ColorComponentFlags(15)
		val R get() = ColorComponentFlags(1)
		val G get() = ColorComponentFlags(2)
		val B get() = ColorComponentFlags(4)
		val A get() = ColorComponentFlags(8)
		
		inline fun compose(block: Companion.() -> ColorComponentFlags) = block(Companion)
	
	}


}