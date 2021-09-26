// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkSparseImageFormatFlagBits {
 *         SINGLE_MIPTAIL          = 1
 *         ALIGNED_MIP_SIZE        = 2
 *         NONSTANDARD_BLOCK_SIZE  = 4
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class SparseImageFormatFlags(val bitfield: Int) {
	
	
	val is_SINGLE_MIPTAIL get() = bitfield and 1 != 0
	val is_ALIGNED_MIP_SIZE get() = bitfield and 2 != 0
	val is_NONSTANDARD_BLOCK_SIZE get() = bitfield and 4 != 0
	
	
	
	infix operator fun plus(other: SparseImageFormatFlags) = SparseImageFormatFlags(bitfield or other.bitfield)
	
	infix operator fun plus(other: Int) = SparseImageFormatFlags(bitfield or other)
	
	infix fun containsAll(mask: SparseImageFormatFlags) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Int) = bitfield and mask == mask
	
	infix fun containsSome(mask: SparseImageFormatFlags) = bitfield and mask.bitfield != 0
	
	infix fun containsSome(mask: Int) = bitfield and mask != 0
	
	
	
	override fun toString() = buildString {
		append("{ ")
		if(is_SINGLE_MIPTAIL) append("SINGLE_MIPTAIL, ")
		if(is_ALIGNED_MIP_SIZE) append("ALIGNED_MIP_SIZE, ")
		if(is_NONSTANDARD_BLOCK_SIZE) append("NONSTANDARD_BLOCK_SIZE, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = SparseImageFormatFlags(0)
		val ALL get() = SparseImageFormatFlags(7)
		val SINGLE_MIPTAIL get() = SparseImageFormatFlags(1)
		val ALIGNED_MIP_SIZE get() = SparseImageFormatFlags(2)
		val NONSTANDARD_BLOCK_SIZE get() = SparseImageFormatFlags(4)
		
		inline fun compose(block: Companion.() -> SparseImageFormatFlags) = block(Companion)
	
	}


}