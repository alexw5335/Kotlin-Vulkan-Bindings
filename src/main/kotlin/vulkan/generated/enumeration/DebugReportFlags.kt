// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkDebugReportFlagBitsEXT {
 *         INFORMATION          = 1
 *         WARNING              = 2
 *         PERFORMANCE_WARNING  = 4
 *         ERROR                = 8
 *         DEBUG                = 16
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class DebugReportFlags(val bitfield: Int) {
	
	
	val is_INFORMATION get() = bitfield and 1 != 0
	val is_WARNING get() = bitfield and 2 != 0
	val is_PERFORMANCE_WARNING get() = bitfield and 4 != 0
	val is_ERROR get() = bitfield and 8 != 0
	val is_DEBUG get() = bitfield and 16 != 0
	
	
	
	infix operator fun plus(other: DebugReportFlags) = DebugReportFlags(bitfield or other.bitfield)
	
	infix operator fun plus(other: Int) = DebugReportFlags(bitfield or other)
	
	infix fun containsAll(mask: DebugReportFlags) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Int) = bitfield and mask == mask
	
	infix fun containsSome(mask: DebugReportFlags) = bitfield and mask.bitfield != 0
	
	infix fun containsSome(mask: Int) = bitfield and mask != 0
	
	
	
	override fun toString() = buildString {
		append("{ ")
		if(is_INFORMATION) append("INFORMATION, ")
		if(is_WARNING) append("WARNING, ")
		if(is_PERFORMANCE_WARNING) append("PERFORMANCE_WARNING, ")
		if(is_ERROR) append("ERROR, ")
		if(is_DEBUG) append("DEBUG, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = DebugReportFlags(0)
		val ALL get() = DebugReportFlags(31)
		val INFORMATION get() = DebugReportFlags(1)
		val WARNING get() = DebugReportFlags(2)
		val PERFORMANCE_WARNING get() = DebugReportFlags(4)
		val ERROR get() = DebugReportFlags(8)
		val DEBUG get() = DebugReportFlags(16)
		
		inline fun compose(block: Companion.() -> DebugReportFlags) = block(Companion)
	
	}


}