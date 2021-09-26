// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkQueryResultFlagBits {
 *         _64                = 1
 *         WAIT               = 2
 *         WITH_AVAILABILITY  = 4
 *         PARTIAL            = 8
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class QueryResultFlags(val bitfield: Int) {
	
	
	val is_64 get() = bitfield and 1 != 0
	val is_WAIT get() = bitfield and 2 != 0
	val is_WITH_AVAILABILITY get() = bitfield and 4 != 0
	val is_PARTIAL get() = bitfield and 8 != 0
	
	
	
	infix operator fun plus(other: QueryResultFlags) = QueryResultFlags(bitfield or other.bitfield)
	
	infix operator fun plus(other: Int) = QueryResultFlags(bitfield or other)
	
	infix fun containsAll(mask: QueryResultFlags) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Int) = bitfield and mask == mask
	
	infix fun containsSome(mask: QueryResultFlags) = bitfield and mask.bitfield != 0
	
	infix fun containsSome(mask: Int) = bitfield and mask != 0
	
	
	
	override fun toString() = buildString {
		append("{ ")
		if(is_64) append("_64, ")
		if(is_WAIT) append("WAIT, ")
		if(is_WITH_AVAILABILITY) append("WITH_AVAILABILITY, ")
		if(is_PARTIAL) append("PARTIAL, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = QueryResultFlags(0)
		val ALL get() = QueryResultFlags(15)
		val _64 get() = QueryResultFlags(1)
		val WAIT get() = QueryResultFlags(2)
		val WITH_AVAILABILITY get() = QueryResultFlags(4)
		val PARTIAL get() = QueryResultFlags(8)
		
		inline fun compose(block: Companion.() -> QueryResultFlags) = block(Companion)
	
	}


}