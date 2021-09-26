// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkStencilFaceFlagBits {
 *         FRONT                   = 1
 *         BACK                    = 2
 *         FRONT_AND_BACK          = 0x00000003
 *         STENCIL_FRONT_AND_BACK  = 0x00000003
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class StencilFaceFlags(val bitfield: Int) {
	
	
	val is_FRONT get() = bitfield and 1 != 0
	val is_BACK get() = bitfield and 2 != 0
	val is_FRONT_AND_BACK get() = bitfield and 0x00000003 != 0
	val is_STENCIL_FRONT_AND_BACK get() = bitfield and 0x00000003 != 0
	
	
	
	infix operator fun plus(other: StencilFaceFlags) = StencilFaceFlags(bitfield or other.bitfield)
	
	infix operator fun plus(other: Int) = StencilFaceFlags(bitfield or other)
	
	infix fun containsAll(mask: StencilFaceFlags) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Int) = bitfield and mask == mask
	
	infix fun containsSome(mask: StencilFaceFlags) = bitfield and mask.bitfield != 0
	
	infix fun containsSome(mask: Int) = bitfield and mask != 0
	
	
	
	override fun toString() = buildString {
		append("{ ")
		if(is_FRONT) append("FRONT, ")
		if(is_BACK) append("BACK, ")
		if(is_FRONT_AND_BACK) append("FRONT_AND_BACK, ")
		if(is_STENCIL_FRONT_AND_BACK) append("STENCIL_FRONT_AND_BACK, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = StencilFaceFlags(0)
		val ALL get() = StencilFaceFlags(9)
		val FRONT get() = StencilFaceFlags(1)
		val BACK get() = StencilFaceFlags(2)
		val FRONT_AND_BACK get() = StencilFaceFlags(0x00000003)
		val STENCIL_FRONT_AND_BACK get() = StencilFaceFlags(0x00000003)
		
		inline fun compose(block: Companion.() -> StencilFaceFlags) = block(Companion)
	
	}


}