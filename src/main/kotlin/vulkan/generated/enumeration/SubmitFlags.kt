// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkSubmitFlagBitsKHR {
 *         PROTECTED  = 1
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class SubmitFlags(val bitfield: Int) {
	
	
	val is_PROTECTED get() = bitfield and 1 != 0
	
	
	
	infix operator fun plus(other: SubmitFlags) = SubmitFlags(bitfield or other.bitfield)
	
	infix operator fun plus(other: Int) = SubmitFlags(bitfield or other)
	
	infix fun containsAll(mask: SubmitFlags) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Int) = bitfield and mask == mask
	
	infix fun containsSome(mask: SubmitFlags) = bitfield and mask.bitfield != 0
	
	infix fun containsSome(mask: Int) = bitfield and mask != 0
	
	
	
	override fun toString() = buildString {
		append("{ ")
		if(is_PROTECTED) append("PROTECTED, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = SubmitFlags(0)
		val ALL get() = SubmitFlags(1)
		val PROTECTED get() = SubmitFlags(1)
		
		inline fun compose(block: Companion.() -> SubmitFlags) = block(Companion)
	
	}


}