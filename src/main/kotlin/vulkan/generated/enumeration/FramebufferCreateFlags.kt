// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkFramebufferCreateFlagBits {
 *         IMAGELESS      = 1
 *         IMAGELESS_KHR  = 1
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class FramebufferCreateFlags(val bitfield: Int) {
	
	
	val is_IMAGELESS get() = bitfield and 1 != 0
	val is_IMAGELESS_KHR get() = bitfield and 1 != 0
	
	
	
	infix operator fun plus(other: FramebufferCreateFlags) = FramebufferCreateFlags(bitfield or other.bitfield)
	
	infix operator fun plus(other: Int) = FramebufferCreateFlags(bitfield or other)
	
	infix fun containsAll(mask: FramebufferCreateFlags) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Int) = bitfield and mask == mask
	
	infix fun containsSome(mask: FramebufferCreateFlags) = bitfield and mask.bitfield != 0
	
	infix fun containsSome(mask: Int) = bitfield and mask != 0
	
	
	
	override fun toString() = buildString {
		append("{ ")
		if(is_IMAGELESS) append("IMAGELESS, ")
		if(is_IMAGELESS_KHR) append("IMAGELESS_KHR, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = FramebufferCreateFlags(0)
		val ALL get() = FramebufferCreateFlags(2)
		val IMAGELESS get() = FramebufferCreateFlags(1)
		val IMAGELESS_KHR get() = FramebufferCreateFlags(1)
		
		inline fun compose(block: Companion.() -> FramebufferCreateFlags) = block(Companion)
	
	}


}