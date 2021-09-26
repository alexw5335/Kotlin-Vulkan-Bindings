// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkImageAspectFlagBits {
 *         COLOR           = 1
 *         DEPTH           = 2
 *         STENCIL         = 4
 *         METADATA        = 8
 *         PLANE_0         = 16
 *         PLANE_1         = 32
 *         PLANE_2         = 64
 *         PLANE_0_KHR     = 16
 *         PLANE_1_KHR     = 32
 *         PLANE_2_KHR     = 64
 *         MEMORY_PLANE_0  = 128
 *         MEMORY_PLANE_1  = 256
 *         MEMORY_PLANE_2  = 512
 *         MEMORY_PLANE_3  = 1024
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class ImageAspectFlags(val bitfield: Int) {
	
	
	val is_COLOR get() = bitfield and 1 != 0
	val is_DEPTH get() = bitfield and 2 != 0
	val is_STENCIL get() = bitfield and 4 != 0
	val is_METADATA get() = bitfield and 8 != 0
	val is_PLANE_0 get() = bitfield and 16 != 0
	val is_PLANE_1 get() = bitfield and 32 != 0
	val is_PLANE_2 get() = bitfield and 64 != 0
	val is_PLANE_0_KHR get() = bitfield and 16 != 0
	val is_PLANE_1_KHR get() = bitfield and 32 != 0
	val is_PLANE_2_KHR get() = bitfield and 64 != 0
	val is_MEMORY_PLANE_0 get() = bitfield and 128 != 0
	val is_MEMORY_PLANE_1 get() = bitfield and 256 != 0
	val is_MEMORY_PLANE_2 get() = bitfield and 512 != 0
	val is_MEMORY_PLANE_3 get() = bitfield and 1024 != 0
	
	
	
	infix operator fun plus(other: ImageAspectFlags) = ImageAspectFlags(bitfield or other.bitfield)
	
	infix operator fun plus(other: Int) = ImageAspectFlags(bitfield or other)
	
	infix fun containsAll(mask: ImageAspectFlags) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Int) = bitfield and mask == mask
	
	infix fun containsSome(mask: ImageAspectFlags) = bitfield and mask.bitfield != 0
	
	infix fun containsSome(mask: Int) = bitfield and mask != 0
	
	
	
	override fun toString() = buildString {
		append("{ ")
		if(is_COLOR) append("COLOR, ")
		if(is_DEPTH) append("DEPTH, ")
		if(is_STENCIL) append("STENCIL, ")
		if(is_METADATA) append("METADATA, ")
		if(is_PLANE_0) append("PLANE_0, ")
		if(is_PLANE_1) append("PLANE_1, ")
		if(is_PLANE_2) append("PLANE_2, ")
		if(is_PLANE_0_KHR) append("PLANE_0_KHR, ")
		if(is_PLANE_1_KHR) append("PLANE_1_KHR, ")
		if(is_PLANE_2_KHR) append("PLANE_2_KHR, ")
		if(is_MEMORY_PLANE_0) append("MEMORY_PLANE_0, ")
		if(is_MEMORY_PLANE_1) append("MEMORY_PLANE_1, ")
		if(is_MEMORY_PLANE_2) append("MEMORY_PLANE_2, ")
		if(is_MEMORY_PLANE_3) append("MEMORY_PLANE_3, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = ImageAspectFlags(0)
		val ALL get() = ImageAspectFlags(2159)
		val COLOR get() = ImageAspectFlags(1)
		val DEPTH get() = ImageAspectFlags(2)
		val STENCIL get() = ImageAspectFlags(4)
		val METADATA get() = ImageAspectFlags(8)
		val PLANE_0 get() = ImageAspectFlags(16)
		val PLANE_1 get() = ImageAspectFlags(32)
		val PLANE_2 get() = ImageAspectFlags(64)
		val PLANE_0_KHR get() = ImageAspectFlags(16)
		val PLANE_1_KHR get() = ImageAspectFlags(32)
		val PLANE_2_KHR get() = ImageAspectFlags(64)
		val MEMORY_PLANE_0 get() = ImageAspectFlags(128)
		val MEMORY_PLANE_1 get() = ImageAspectFlags(256)
		val MEMORY_PLANE_2 get() = ImageAspectFlags(512)
		val MEMORY_PLANE_3 get() = ImageAspectFlags(1024)
		
		inline fun compose(block: Companion.() -> ImageAspectFlags) = block(Companion)
	
	}


}