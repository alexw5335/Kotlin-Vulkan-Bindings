// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkGeometryFlagBitsKHR {
 *         OPAQUE                              = 1
 *         NO_DUPLICATE_ANY_HIT_INVOCATION     = 2
 *         OPAQUE_NV                           = 1
 *         NO_DUPLICATE_ANY_HIT_INVOCATION_NV  = 2
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class GeometryFlags(val bitfield: Int) {
	
	
	val is_OPAQUE get() = bitfield and 1 != 0
	val is_NO_DUPLICATE_ANY_HIT_INVOCATION get() = bitfield and 2 != 0
	val is_OPAQUE_NV get() = bitfield and 1 != 0
	val is_NO_DUPLICATE_ANY_HIT_INVOCATION_NV get() = bitfield and 2 != 0
	
	
	
	infix operator fun plus(other: GeometryFlags) = GeometryFlags(bitfield or other.bitfield)
	
	infix operator fun plus(other: Int) = GeometryFlags(bitfield or other)
	
	infix fun containsAll(mask: GeometryFlags) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Int) = bitfield and mask == mask
	
	infix fun containsSome(mask: GeometryFlags) = bitfield and mask.bitfield != 0
	
	infix fun containsSome(mask: Int) = bitfield and mask != 0
	
	
	
	override fun toString() = buildString {
		append("{ ")
		if(is_OPAQUE) append("OPAQUE, ")
		if(is_NO_DUPLICATE_ANY_HIT_INVOCATION) append("NO_DUPLICATE_ANY_HIT_INVOCATION, ")
		if(is_OPAQUE_NV) append("OPAQUE_NV, ")
		if(is_NO_DUPLICATE_ANY_HIT_INVOCATION_NV) append("NO_DUPLICATE_ANY_HIT_INVOCATION_NV, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = GeometryFlags(0)
		val ALL get() = GeometryFlags(6)
		val OPAQUE get() = GeometryFlags(1)
		val NO_DUPLICATE_ANY_HIT_INVOCATION get() = GeometryFlags(2)
		val OPAQUE_NV get() = GeometryFlags(1)
		val NO_DUPLICATE_ANY_HIT_INVOCATION_NV get() = GeometryFlags(2)
		
		inline fun compose(block: Companion.() -> GeometryFlags) = block(Companion)
	
	}


}