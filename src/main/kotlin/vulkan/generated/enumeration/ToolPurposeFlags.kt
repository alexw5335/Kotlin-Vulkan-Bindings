// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkToolPurposeFlagBitsEXT {
 *         VALIDATION           = 1
 *         PROFILING            = 2
 *         TRACING              = 4
 *         ADDITIONAL_FEATURES  = 8
 *         MODIFYING_FEATURES   = 16
 *         DEBUG_REPORTING      = 32
 *         DEBUG_MARKERS        = 64
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class ToolPurposeFlags(val bitfield: Int) {
	
	
	val is_VALIDATION get() = bitfield and 1 != 0
	val is_PROFILING get() = bitfield and 2 != 0
	val is_TRACING get() = bitfield and 4 != 0
	val is_ADDITIONAL_FEATURES get() = bitfield and 8 != 0
	val is_MODIFYING_FEATURES get() = bitfield and 16 != 0
	val is_DEBUG_REPORTING get() = bitfield and 32 != 0
	val is_DEBUG_MARKERS get() = bitfield and 64 != 0
	
	
	
	infix operator fun plus(other: ToolPurposeFlags) = ToolPurposeFlags(bitfield or other.bitfield)
	
	infix operator fun plus(other: Int) = ToolPurposeFlags(bitfield or other)
	
	infix fun containsAll(mask: ToolPurposeFlags) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Int) = bitfield and mask == mask
	
	infix fun containsSome(mask: ToolPurposeFlags) = bitfield and mask.bitfield != 0
	
	infix fun containsSome(mask: Int) = bitfield and mask != 0
	
	
	
	override fun toString() = buildString {
		append("{ ")
		if(is_VALIDATION) append("VALIDATION, ")
		if(is_PROFILING) append("PROFILING, ")
		if(is_TRACING) append("TRACING, ")
		if(is_ADDITIONAL_FEATURES) append("ADDITIONAL_FEATURES, ")
		if(is_MODIFYING_FEATURES) append("MODIFYING_FEATURES, ")
		if(is_DEBUG_REPORTING) append("DEBUG_REPORTING, ")
		if(is_DEBUG_MARKERS) append("DEBUG_MARKERS, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = ToolPurposeFlags(0)
		val ALL get() = ToolPurposeFlags(127)
		val VALIDATION get() = ToolPurposeFlags(1)
		val PROFILING get() = ToolPurposeFlags(2)
		val TRACING get() = ToolPurposeFlags(4)
		val ADDITIONAL_FEATURES get() = ToolPurposeFlags(8)
		val MODIFYING_FEATURES get() = ToolPurposeFlags(16)
		val DEBUG_REPORTING get() = ToolPurposeFlags(32)
		val DEBUG_MARKERS get() = ToolPurposeFlags(64)
		
		inline fun compose(block: Companion.() -> ToolPurposeFlags) = block(Companion)
	
	}


}