// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkDeviceDiagnosticsConfigFlagBitsNV {
 *         ENABLE_SHADER_DEBUG_INFO      = 1
 *         ENABLE_RESOURCE_TRACKING      = 2
 *         ENABLE_AUTOMATIC_CHECKPOINTS  = 4
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class DeviceDiagnosticsConfigFlags(val bitfield: Int) {
	
	
	val is_ENABLE_SHADER_DEBUG_INFO get() = bitfield and 1 != 0
	val is_ENABLE_RESOURCE_TRACKING get() = bitfield and 2 != 0
	val is_ENABLE_AUTOMATIC_CHECKPOINTS get() = bitfield and 4 != 0
	
	
	
	infix operator fun plus(other: DeviceDiagnosticsConfigFlags) = DeviceDiagnosticsConfigFlags(bitfield or other.bitfield)
	
	infix operator fun plus(other: Int) = DeviceDiagnosticsConfigFlags(bitfield or other)
	
	infix fun containsAll(mask: DeviceDiagnosticsConfigFlags) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Int) = bitfield and mask == mask
	
	infix fun containsSome(mask: DeviceDiagnosticsConfigFlags) = bitfield and mask.bitfield != 0
	
	infix fun containsSome(mask: Int) = bitfield and mask != 0
	
	
	
	override fun toString() = buildString {
		append("{ ")
		if(is_ENABLE_SHADER_DEBUG_INFO) append("ENABLE_SHADER_DEBUG_INFO, ")
		if(is_ENABLE_RESOURCE_TRACKING) append("ENABLE_RESOURCE_TRACKING, ")
		if(is_ENABLE_AUTOMATIC_CHECKPOINTS) append("ENABLE_AUTOMATIC_CHECKPOINTS, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = DeviceDiagnosticsConfigFlags(0)
		val ALL get() = DeviceDiagnosticsConfigFlags(7)
		val ENABLE_SHADER_DEBUG_INFO get() = DeviceDiagnosticsConfigFlags(1)
		val ENABLE_RESOURCE_TRACKING get() = DeviceDiagnosticsConfigFlags(2)
		val ENABLE_AUTOMATIC_CHECKPOINTS get() = DeviceDiagnosticsConfigFlags(4)
		
		inline fun compose(block: Companion.() -> DeviceDiagnosticsConfigFlags) = block(Companion)
	
	}


}