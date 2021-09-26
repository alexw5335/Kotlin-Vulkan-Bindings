// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkAttachmentDescriptionFlagBits {
 *         MAY_ALIAS  = 1
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class AttachmentDescriptionFlags(val bitfield: Int) {
	
	
	val is_MAY_ALIAS get() = bitfield and 1 != 0
	
	
	
	infix operator fun plus(other: AttachmentDescriptionFlags) = AttachmentDescriptionFlags(bitfield or other.bitfield)
	
	infix operator fun plus(other: Int) = AttachmentDescriptionFlags(bitfield or other)
	
	infix fun containsAll(mask: AttachmentDescriptionFlags) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Int) = bitfield and mask == mask
	
	infix fun containsSome(mask: AttachmentDescriptionFlags) = bitfield and mask.bitfield != 0
	
	infix fun containsSome(mask: Int) = bitfield and mask != 0
	
	
	
	override fun toString() = buildString {
		append("{ ")
		if(is_MAY_ALIAS) append("MAY_ALIAS, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = AttachmentDescriptionFlags(0)
		val ALL get() = AttachmentDescriptionFlags(1)
		val MAY_ALIAS get() = AttachmentDescriptionFlags(1)
		
		inline fun compose(block: Companion.() -> AttachmentDescriptionFlags) = block(Companion)
	
	}


}