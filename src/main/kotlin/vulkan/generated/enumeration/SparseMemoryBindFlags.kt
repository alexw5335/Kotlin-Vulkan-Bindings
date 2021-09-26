// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkSparseMemoryBindFlagBits {
 *         METADATA  = 1
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class SparseMemoryBindFlags(val bitfield: Int) {
	
	
	val is_METADATA get() = bitfield and 1 != 0
	
	
	
	infix operator fun plus(other: SparseMemoryBindFlags) = SparseMemoryBindFlags(bitfield or other.bitfield)
	
	infix operator fun plus(other: Int) = SparseMemoryBindFlags(bitfield or other)
	
	infix fun containsAll(mask: SparseMemoryBindFlags) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Int) = bitfield and mask == mask
	
	infix fun containsSome(mask: SparseMemoryBindFlags) = bitfield and mask.bitfield != 0
	
	infix fun containsSome(mask: Int) = bitfield and mask != 0
	
	
	
	override fun toString() = buildString {
		append("{ ")
		if(is_METADATA) append("METADATA, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = SparseMemoryBindFlags(0)
		val ALL get() = SparseMemoryBindFlags(1)
		val METADATA get() = SparseMemoryBindFlags(1)
		
		inline fun compose(block: Companion.() -> SparseMemoryBindFlags) = block(Companion)
	
	}


}