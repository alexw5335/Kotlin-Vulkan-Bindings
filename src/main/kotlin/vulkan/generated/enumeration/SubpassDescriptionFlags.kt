// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkSubpassDescriptionFlagBits {
 *         PER_VIEW_ATTRIBUTES       = 1
 *         PER_VIEW_POSITION_X_ONLY  = 2
 *         FRAGMENT_REGION           = 4
 *         SHADER_RESOLVE            = 8
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class SubpassDescriptionFlags(val bitfield: Int) {
	
	
	val is_PER_VIEW_ATTRIBUTES get() = bitfield and 1 != 0
	val is_PER_VIEW_POSITION_X_ONLY get() = bitfield and 2 != 0
	val is_FRAGMENT_REGION get() = bitfield and 4 != 0
	val is_SHADER_RESOLVE get() = bitfield and 8 != 0
	
	
	
	infix operator fun plus(other: SubpassDescriptionFlags) = SubpassDescriptionFlags(bitfield or other.bitfield)
	
	infix operator fun plus(other: Int) = SubpassDescriptionFlags(bitfield or other)
	
	infix fun containsAll(mask: SubpassDescriptionFlags) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Int) = bitfield and mask == mask
	
	infix fun containsSome(mask: SubpassDescriptionFlags) = bitfield and mask.bitfield != 0
	
	infix fun containsSome(mask: Int) = bitfield and mask != 0
	
	
	
	override fun toString() = buildString {
		append("{ ")
		if(is_PER_VIEW_ATTRIBUTES) append("PER_VIEW_ATTRIBUTES, ")
		if(is_PER_VIEW_POSITION_X_ONLY) append("PER_VIEW_POSITION_X_ONLY, ")
		if(is_FRAGMENT_REGION) append("FRAGMENT_REGION, ")
		if(is_SHADER_RESOLVE) append("SHADER_RESOLVE, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = SubpassDescriptionFlags(0)
		val ALL get() = SubpassDescriptionFlags(15)
		val PER_VIEW_ATTRIBUTES get() = SubpassDescriptionFlags(1)
		val PER_VIEW_POSITION_X_ONLY get() = SubpassDescriptionFlags(2)
		val FRAGMENT_REGION get() = SubpassDescriptionFlags(4)
		val SHADER_RESOLVE get() = SubpassDescriptionFlags(8)
		
		inline fun compose(block: Companion.() -> SubpassDescriptionFlags) = block(Companion)
	
	}


}