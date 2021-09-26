// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkQueryControlFlagBits {
 *         PRECISE  = 1
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class QueryControlFlags(val bitfield: Int) {
	
	
	val is_PRECISE get() = bitfield and 1 != 0
	
	
	
	infix operator fun plus(other: QueryControlFlags) = QueryControlFlags(bitfield or other.bitfield)
	
	infix operator fun plus(other: Int) = QueryControlFlags(bitfield or other)
	
	infix fun containsAll(mask: QueryControlFlags) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Int) = bitfield and mask == mask
	
	infix fun containsSome(mask: QueryControlFlags) = bitfield and mask.bitfield != 0
	
	infix fun containsSome(mask: Int) = bitfield and mask != 0
	
	
	
	override fun toString() = buildString {
		append("{ ")
		if(is_PRECISE) append("PRECISE, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = QueryControlFlags(0)
		val ALL get() = QueryControlFlags(1)
		val PRECISE get() = QueryControlFlags(1)
		
		inline fun compose(block: Companion.() -> QueryControlFlags) = block(Companion)
	
	}


}