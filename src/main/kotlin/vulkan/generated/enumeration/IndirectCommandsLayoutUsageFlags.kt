// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkIndirectCommandsLayoutUsageFlagBitsNV {
 *         EXPLICIT_PREPROCESS  = 1
 *         INDEXED_SEQUENCES    = 2
 *         UNORDERED_SEQUENCES  = 4
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class IndirectCommandsLayoutUsageFlags(val bitfield: Int) {
	
	
	val is_EXPLICIT_PREPROCESS get() = bitfield and 1 != 0
	val is_INDEXED_SEQUENCES get() = bitfield and 2 != 0
	val is_UNORDERED_SEQUENCES get() = bitfield and 4 != 0
	
	
	
	infix operator fun plus(other: IndirectCommandsLayoutUsageFlags) = IndirectCommandsLayoutUsageFlags(bitfield or other.bitfield)
	
	infix operator fun plus(other: Int) = IndirectCommandsLayoutUsageFlags(bitfield or other)
	
	infix fun containsAll(mask: IndirectCommandsLayoutUsageFlags) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Int) = bitfield and mask == mask
	
	infix fun containsSome(mask: IndirectCommandsLayoutUsageFlags) = bitfield and mask.bitfield != 0
	
	infix fun containsSome(mask: Int) = bitfield and mask != 0
	
	
	
	override fun toString() = buildString {
		append("{ ")
		if(is_EXPLICIT_PREPROCESS) append("EXPLICIT_PREPROCESS, ")
		if(is_INDEXED_SEQUENCES) append("INDEXED_SEQUENCES, ")
		if(is_UNORDERED_SEQUENCES) append("UNORDERED_SEQUENCES, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = IndirectCommandsLayoutUsageFlags(0)
		val ALL get() = IndirectCommandsLayoutUsageFlags(7)
		val EXPLICIT_PREPROCESS get() = IndirectCommandsLayoutUsageFlags(1)
		val INDEXED_SEQUENCES get() = IndirectCommandsLayoutUsageFlags(2)
		val UNORDERED_SEQUENCES get() = IndirectCommandsLayoutUsageFlags(4)
		
		inline fun compose(block: Companion.() -> IndirectCommandsLayoutUsageFlags) = block(Companion)
	
	}


}