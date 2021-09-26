// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkDebugUtilsMessageSeverityFlagBitsEXT {
 *         VERBOSE  = 1
 *         INFO     = 16
 *         WARNING  = 256
 *         ERROR    = 4096
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class DebugUtilsMessageSeverityFlags(val bitfield: Int) {
	
	
	val is_VERBOSE get() = bitfield and 1 != 0
	val is_INFO get() = bitfield and 16 != 0
	val is_WARNING get() = bitfield and 256 != 0
	val is_ERROR get() = bitfield and 4096 != 0
	
	
	
	infix operator fun plus(other: DebugUtilsMessageSeverityFlags) = DebugUtilsMessageSeverityFlags(bitfield or other.bitfield)
	
	infix operator fun plus(other: Int) = DebugUtilsMessageSeverityFlags(bitfield or other)
	
	infix fun containsAll(mask: DebugUtilsMessageSeverityFlags) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Int) = bitfield and mask == mask
	
	infix fun containsSome(mask: DebugUtilsMessageSeverityFlags) = bitfield and mask.bitfield != 0
	
	infix fun containsSome(mask: Int) = bitfield and mask != 0
	
	
	
	override fun toString() = buildString {
		append("{ ")
		if(is_VERBOSE) append("VERBOSE, ")
		if(is_INFO) append("INFO, ")
		if(is_WARNING) append("WARNING, ")
		if(is_ERROR) append("ERROR, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = DebugUtilsMessageSeverityFlags(0)
		val ALL get() = DebugUtilsMessageSeverityFlags(4369)
		val VERBOSE get() = DebugUtilsMessageSeverityFlags(1)
		val INFO get() = DebugUtilsMessageSeverityFlags(16)
		val WARNING get() = DebugUtilsMessageSeverityFlags(256)
		val ERROR get() = DebugUtilsMessageSeverityFlags(4096)
		
		inline fun compose(block: Companion.() -> DebugUtilsMessageSeverityFlags) = block(Companion)
	
	}


}