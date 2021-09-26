// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkDisplayPlaneAlphaFlagBitsKHR {
 *         OPAQUE                   = 1
 *         GLOBAL                   = 2
 *         PER_PIXEL                = 4
 *         PER_PIXEL_PREMULTIPLIED  = 8
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class DisplayPlaneAlphaFlags(val bitfield: Int) {
	
	
	val is_OPAQUE get() = bitfield and 1 != 0
	val is_GLOBAL get() = bitfield and 2 != 0
	val is_PER_PIXEL get() = bitfield and 4 != 0
	val is_PER_PIXEL_PREMULTIPLIED get() = bitfield and 8 != 0
	
	
	
	infix operator fun plus(other: DisplayPlaneAlphaFlags) = DisplayPlaneAlphaFlags(bitfield or other.bitfield)
	
	infix operator fun plus(other: Int) = DisplayPlaneAlphaFlags(bitfield or other)
	
	infix fun containsAll(mask: DisplayPlaneAlphaFlags) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Int) = bitfield and mask == mask
	
	infix fun containsSome(mask: DisplayPlaneAlphaFlags) = bitfield and mask.bitfield != 0
	
	infix fun containsSome(mask: Int) = bitfield and mask != 0
	
	
	
	override fun toString() = buildString {
		append("{ ")
		if(is_OPAQUE) append("OPAQUE, ")
		if(is_GLOBAL) append("GLOBAL, ")
		if(is_PER_PIXEL) append("PER_PIXEL, ")
		if(is_PER_PIXEL_PREMULTIPLIED) append("PER_PIXEL_PREMULTIPLIED, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = DisplayPlaneAlphaFlags(0)
		val ALL get() = DisplayPlaneAlphaFlags(15)
		val OPAQUE get() = DisplayPlaneAlphaFlags(1)
		val GLOBAL get() = DisplayPlaneAlphaFlags(2)
		val PER_PIXEL get() = DisplayPlaneAlphaFlags(4)
		val PER_PIXEL_PREMULTIPLIED get() = DisplayPlaneAlphaFlags(8)
		
		inline fun compose(block: Companion.() -> DisplayPlaneAlphaFlags) = block(Companion)
	
	}


}