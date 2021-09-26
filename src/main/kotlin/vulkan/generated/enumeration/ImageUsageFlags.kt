// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkImageUsageFlagBits {
 *         TRANSFER_SRC                      = 1
 *         TRANSFER_DST                      = 2
 *         SAMPLED                           = 4
 *         STORAGE                           = 8
 *         COLOR_ATTACHMENT                  = 16
 *         DEPTH_STENCIL_ATTACHMENT          = 32
 *         TRANSIENT_ATTACHMENT              = 64
 *         INPUT_ATTACHMENT                  = 128
 *         SHADING_RATE_IMAGE                = 256
 *         FRAGMENT_DENSITY_MAP              = 512
 *         FRAGMENT_SHADING_RATE_ATTACHMENT  = 256
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class ImageUsageFlags(val bitfield: Int) {
	
	
	val is_TRANSFER_SRC get() = bitfield and 1 != 0
	val is_TRANSFER_DST get() = bitfield and 2 != 0
	val is_SAMPLED get() = bitfield and 4 != 0
	val is_STORAGE get() = bitfield and 8 != 0
	val is_COLOR_ATTACHMENT get() = bitfield and 16 != 0
	val is_DEPTH_STENCIL_ATTACHMENT get() = bitfield and 32 != 0
	val is_TRANSIENT_ATTACHMENT get() = bitfield and 64 != 0
	val is_INPUT_ATTACHMENT get() = bitfield and 128 != 0
	val is_SHADING_RATE_IMAGE get() = bitfield and 256 != 0
	val is_FRAGMENT_DENSITY_MAP get() = bitfield and 512 != 0
	val is_FRAGMENT_SHADING_RATE_ATTACHMENT get() = bitfield and 256 != 0
	
	
	
	infix operator fun plus(other: ImageUsageFlags) = ImageUsageFlags(bitfield or other.bitfield)
	
	infix operator fun plus(other: Int) = ImageUsageFlags(bitfield or other)
	
	infix fun containsAll(mask: ImageUsageFlags) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Int) = bitfield and mask == mask
	
	infix fun containsSome(mask: ImageUsageFlags) = bitfield and mask.bitfield != 0
	
	infix fun containsSome(mask: Int) = bitfield and mask != 0
	
	
	
	override fun toString() = buildString {
		append("{ ")
		if(is_TRANSFER_SRC) append("TRANSFER_SRC, ")
		if(is_TRANSFER_DST) append("TRANSFER_DST, ")
		if(is_SAMPLED) append("SAMPLED, ")
		if(is_STORAGE) append("STORAGE, ")
		if(is_COLOR_ATTACHMENT) append("COLOR_ATTACHMENT, ")
		if(is_DEPTH_STENCIL_ATTACHMENT) append("DEPTH_STENCIL_ATTACHMENT, ")
		if(is_TRANSIENT_ATTACHMENT) append("TRANSIENT_ATTACHMENT, ")
		if(is_INPUT_ATTACHMENT) append("INPUT_ATTACHMENT, ")
		if(is_SHADING_RATE_IMAGE) append("SHADING_RATE_IMAGE, ")
		if(is_FRAGMENT_DENSITY_MAP) append("FRAGMENT_DENSITY_MAP, ")
		if(is_FRAGMENT_SHADING_RATE_ATTACHMENT) append("FRAGMENT_SHADING_RATE_ATTACHMENT, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = ImageUsageFlags(0)
		val ALL get() = ImageUsageFlags(1279)
		val TRANSFER_SRC get() = ImageUsageFlags(1)
		val TRANSFER_DST get() = ImageUsageFlags(2)
		val SAMPLED get() = ImageUsageFlags(4)
		val STORAGE get() = ImageUsageFlags(8)
		val COLOR_ATTACHMENT get() = ImageUsageFlags(16)
		val DEPTH_STENCIL_ATTACHMENT get() = ImageUsageFlags(32)
		val TRANSIENT_ATTACHMENT get() = ImageUsageFlags(64)
		val INPUT_ATTACHMENT get() = ImageUsageFlags(128)
		val SHADING_RATE_IMAGE get() = ImageUsageFlags(256)
		val FRAGMENT_DENSITY_MAP get() = ImageUsageFlags(512)
		val FRAGMENT_SHADING_RATE_ATTACHMENT get() = ImageUsageFlags(256)
		
		inline fun compose(block: Companion.() -> ImageUsageFlags) = block(Companion)
	
	}


}