// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkSurfaceTransformFlagBitsKHR {
 *         IDENTITY                      = 1
 *         ROTATE_90                     = 2
 *         ROTATE_180                    = 4
 *         ROTATE_270                    = 8
 *         HORIZONTAL_MIRROR             = 16
 *         HORIZONTAL_MIRROR_ROTATE_90   = 32
 *         HORIZONTAL_MIRROR_ROTATE_180  = 64
 *         HORIZONTAL_MIRROR_ROTATE_270  = 128
 *         INHERIT                       = 256
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class SurfaceTransformFlags(val bitfield: Int) {
	
	
	val is_IDENTITY get() = bitfield and 1 != 0
	val is_ROTATE_90 get() = bitfield and 2 != 0
	val is_ROTATE_180 get() = bitfield and 4 != 0
	val is_ROTATE_270 get() = bitfield and 8 != 0
	val is_HORIZONTAL_MIRROR get() = bitfield and 16 != 0
	val is_HORIZONTAL_MIRROR_ROTATE_90 get() = bitfield and 32 != 0
	val is_HORIZONTAL_MIRROR_ROTATE_180 get() = bitfield and 64 != 0
	val is_HORIZONTAL_MIRROR_ROTATE_270 get() = bitfield and 128 != 0
	val is_INHERIT get() = bitfield and 256 != 0
	
	
	
	infix operator fun plus(other: SurfaceTransformFlags) = SurfaceTransformFlags(bitfield or other.bitfield)
	
	infix operator fun plus(other: Int) = SurfaceTransformFlags(bitfield or other)
	
	infix fun containsAll(mask: SurfaceTransformFlags) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Int) = bitfield and mask == mask
	
	infix fun containsSome(mask: SurfaceTransformFlags) = bitfield and mask.bitfield != 0
	
	infix fun containsSome(mask: Int) = bitfield and mask != 0
	
	
	
	override fun toString() = buildString {
		append("{ ")
		if(is_IDENTITY) append("IDENTITY, ")
		if(is_ROTATE_90) append("ROTATE_90, ")
		if(is_ROTATE_180) append("ROTATE_180, ")
		if(is_ROTATE_270) append("ROTATE_270, ")
		if(is_HORIZONTAL_MIRROR) append("HORIZONTAL_MIRROR, ")
		if(is_HORIZONTAL_MIRROR_ROTATE_90) append("HORIZONTAL_MIRROR_ROTATE_90, ")
		if(is_HORIZONTAL_MIRROR_ROTATE_180) append("HORIZONTAL_MIRROR_ROTATE_180, ")
		if(is_HORIZONTAL_MIRROR_ROTATE_270) append("HORIZONTAL_MIRROR_ROTATE_270, ")
		if(is_INHERIT) append("INHERIT, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = SurfaceTransformFlags(0)
		val ALL get() = SurfaceTransformFlags(511)
		val IDENTITY get() = SurfaceTransformFlags(1)
		val ROTATE_90 get() = SurfaceTransformFlags(2)
		val ROTATE_180 get() = SurfaceTransformFlags(4)
		val ROTATE_270 get() = SurfaceTransformFlags(8)
		val HORIZONTAL_MIRROR get() = SurfaceTransformFlags(16)
		val HORIZONTAL_MIRROR_ROTATE_90 get() = SurfaceTransformFlags(32)
		val HORIZONTAL_MIRROR_ROTATE_180 get() = SurfaceTransformFlags(64)
		val HORIZONTAL_MIRROR_ROTATE_270 get() = SurfaceTransformFlags(128)
		val INHERIT get() = SurfaceTransformFlags(256)
		
		inline fun compose(block: Companion.() -> SurfaceTransformFlags) = block(Companion)
	
	}


}