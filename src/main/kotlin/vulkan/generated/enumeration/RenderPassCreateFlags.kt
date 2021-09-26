// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkRenderPassCreateFlagBits {
 *         TRANSFORM  = 2
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class RenderPassCreateFlags(val bitfield: Int) {
	
	
	val is_TRANSFORM get() = bitfield and 2 != 0
	
	
	
	infix operator fun plus(other: RenderPassCreateFlags) = RenderPassCreateFlags(bitfield or other.bitfield)
	
	infix operator fun plus(other: Int) = RenderPassCreateFlags(bitfield or other)
	
	infix fun containsAll(mask: RenderPassCreateFlags) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Int) = bitfield and mask == mask
	
	infix fun containsSome(mask: RenderPassCreateFlags) = bitfield and mask.bitfield != 0
	
	infix fun containsSome(mask: Int) = bitfield and mask != 0
	
	
	
	override fun toString() = buildString {
		append("{ ")
		if(is_TRANSFORM) append("TRANSFORM, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = RenderPassCreateFlags(0)
		val ALL get() = RenderPassCreateFlags(2)
		val TRANSFORM get() = RenderPassCreateFlags(2)
		
		inline fun compose(block: Companion.() -> RenderPassCreateFlags) = block(Companion)
	
	}


}