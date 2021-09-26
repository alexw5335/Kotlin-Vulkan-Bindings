// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkCullModeFlagBits {
 *         NONE            = 0
 *         FRONT           = 1
 *         BACK            = 2
 *         FRONT_AND_BACK  = 0x00000003
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class CullModeFlags(val bitfield: Int) {
	
	
	val is_FRONT get() = bitfield and 1 != 0
	val is_BACK get() = bitfield and 2 != 0
	val is_FRONT_AND_BACK get() = bitfield and 0x00000003 != 0
	
	
	
	infix operator fun plus(other: CullModeFlags) = CullModeFlags(bitfield or other.bitfield)
	
	infix operator fun plus(other: Int) = CullModeFlags(bitfield or other)
	
	infix fun containsAll(mask: CullModeFlags) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Int) = bitfield and mask == mask
	
	infix fun containsSome(mask: CullModeFlags) = bitfield and mask.bitfield != 0
	
	infix fun containsSome(mask: Int) = bitfield and mask != 0
	
	
	
	override fun toString() = buildString {
		append("{ ")
		if(is_FRONT) append("FRONT, ")
		if(is_BACK) append("BACK, ")
		if(is_FRONT_AND_BACK) append("FRONT_AND_BACK, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = CullModeFlags(0)
		val ALL get() = CullModeFlags(6)
		val FRONT get() = CullModeFlags(1)
		val BACK get() = CullModeFlags(2)
		val FRONT_AND_BACK get() = CullModeFlags(0x00000003)
		
		inline fun compose(block: Companion.() -> CullModeFlags) = block(Companion)
	
	}


}