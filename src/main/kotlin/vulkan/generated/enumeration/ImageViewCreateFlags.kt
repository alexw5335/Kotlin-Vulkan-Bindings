// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkImageViewCreateFlagBits {
 *         FRAGMENT_DENSITY_MAP_DYNAMIC   = 1
 *         FRAGMENT_DENSITY_MAP_DEFERRED  = 2
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class ImageViewCreateFlags(val bitfield: Int) {
	
	
	val is_FRAGMENT_DENSITY_MAP_DYNAMIC get() = bitfield and 1 != 0
	val is_FRAGMENT_DENSITY_MAP_DEFERRED get() = bitfield and 2 != 0
	
	
	
	infix operator fun plus(other: ImageViewCreateFlags) = ImageViewCreateFlags(bitfield or other.bitfield)
	
	infix operator fun plus(other: Int) = ImageViewCreateFlags(bitfield or other)
	
	infix fun containsAll(mask: ImageViewCreateFlags) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Int) = bitfield and mask == mask
	
	infix fun containsSome(mask: ImageViewCreateFlags) = bitfield and mask.bitfield != 0
	
	infix fun containsSome(mask: Int) = bitfield and mask != 0
	
	
	
	override fun toString() = buildString {
		append("{ ")
		if(is_FRAGMENT_DENSITY_MAP_DYNAMIC) append("FRAGMENT_DENSITY_MAP_DYNAMIC, ")
		if(is_FRAGMENT_DENSITY_MAP_DEFERRED) append("FRAGMENT_DENSITY_MAP_DEFERRED, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = ImageViewCreateFlags(0)
		val ALL get() = ImageViewCreateFlags(3)
		val FRAGMENT_DENSITY_MAP_DYNAMIC get() = ImageViewCreateFlags(1)
		val FRAGMENT_DENSITY_MAP_DEFERRED get() = ImageViewCreateFlags(2)
		
		inline fun compose(block: Companion.() -> ImageViewCreateFlags) = block(Companion)
	
	}


}