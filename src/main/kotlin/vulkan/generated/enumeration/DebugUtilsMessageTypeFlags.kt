// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkDebugUtilsMessageTypeFlagBitsEXT {
 *         GENERAL      = 1
 *         VALIDATION   = 2
 *         PERFORMANCE  = 4
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class DebugUtilsMessageTypeFlags(val bitfield: Int) {
	
	
	val is_GENERAL get() = bitfield and 1 != 0
	val is_VALIDATION get() = bitfield and 2 != 0
	val is_PERFORMANCE get() = bitfield and 4 != 0
	
	
	
	infix operator fun plus(other: DebugUtilsMessageTypeFlags) = DebugUtilsMessageTypeFlags(bitfield or other.bitfield)
	
	infix operator fun plus(other: Int) = DebugUtilsMessageTypeFlags(bitfield or other)
	
	infix fun containsAll(mask: DebugUtilsMessageTypeFlags) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Int) = bitfield and mask == mask
	
	infix fun containsSome(mask: DebugUtilsMessageTypeFlags) = bitfield and mask.bitfield != 0
	
	infix fun containsSome(mask: Int) = bitfield and mask != 0
	
	
	
	override fun toString() = buildString {
		append("{ ")
		if(is_GENERAL) append("GENERAL, ")
		if(is_VALIDATION) append("VALIDATION, ")
		if(is_PERFORMANCE) append("PERFORMANCE, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = DebugUtilsMessageTypeFlags(0)
		val ALL get() = DebugUtilsMessageTypeFlags(7)
		val GENERAL get() = DebugUtilsMessageTypeFlags(1)
		val VALIDATION get() = DebugUtilsMessageTypeFlags(2)
		val PERFORMANCE get() = DebugUtilsMessageTypeFlags(4)
		
		inline fun compose(block: Companion.() -> DebugUtilsMessageTypeFlags) = block(Companion)
	
	}


}