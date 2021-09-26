// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkSurfaceCounterFlagBitsEXT {
 *         VBLANK      = 1
 *         VBLANK_EXT  = 1
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class SurfaceCounterFlags(val bitfield: Int) {
	
	
	val is_VBLANK get() = bitfield and 1 != 0
	val is_VBLANK_EXT get() = bitfield and 1 != 0
	
	
	
	infix operator fun plus(other: SurfaceCounterFlags) = SurfaceCounterFlags(bitfield or other.bitfield)
	
	infix operator fun plus(other: Int) = SurfaceCounterFlags(bitfield or other)
	
	infix fun containsAll(mask: SurfaceCounterFlags) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Int) = bitfield and mask == mask
	
	infix fun containsSome(mask: SurfaceCounterFlags) = bitfield and mask.bitfield != 0
	
	infix fun containsSome(mask: Int) = bitfield and mask != 0
	
	
	
	override fun toString() = buildString {
		append("{ ")
		if(is_VBLANK) append("VBLANK, ")
		if(is_VBLANK_EXT) append("VBLANK_EXT, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = SurfaceCounterFlags(0)
		val ALL get() = SurfaceCounterFlags(2)
		val VBLANK get() = SurfaceCounterFlags(1)
		val VBLANK_EXT get() = SurfaceCounterFlags(1)
		
		inline fun compose(block: Companion.() -> SurfaceCounterFlags) = block(Companion)
	
	}


}