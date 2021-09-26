// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkIndirectStateFlagBitsNV {
 *         FLAG_FRONTFACE  = 1
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class IndirectStateFlags(val bitfield: Int) {
	
	
	val is_FLAG_FRONTFACE get() = bitfield and 1 != 0
	
	
	
	infix operator fun plus(other: IndirectStateFlags) = IndirectStateFlags(bitfield or other.bitfield)
	
	infix operator fun plus(other: Int) = IndirectStateFlags(bitfield or other)
	
	infix fun containsAll(mask: IndirectStateFlags) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Int) = bitfield and mask == mask
	
	infix fun containsSome(mask: IndirectStateFlags) = bitfield and mask.bitfield != 0
	
	infix fun containsSome(mask: Int) = bitfield and mask != 0
	
	
	
	override fun toString() = buildString {
		append("{ ")
		if(is_FLAG_FRONTFACE) append("FLAG_FRONTFACE, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = IndirectStateFlags(0)
		val ALL get() = IndirectStateFlags(1)
		val FLAG_FRONTFACE get() = IndirectStateFlags(1)
		
		inline fun compose(block: Companion.() -> IndirectStateFlags) = block(Companion)
	
	}


}