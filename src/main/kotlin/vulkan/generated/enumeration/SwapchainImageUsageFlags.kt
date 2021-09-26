// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkSwapchainImageUsageFlagBitsANDROID {
 *         SHARED  = 1
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class SwapchainImageUsageFlags(val bitfield: Int) {
	
	
	val is_SHARED get() = bitfield and 1 != 0
	
	
	
	infix operator fun plus(other: SwapchainImageUsageFlags) = SwapchainImageUsageFlags(bitfield or other.bitfield)
	
	infix operator fun plus(other: Int) = SwapchainImageUsageFlags(bitfield or other)
	
	infix fun containsAll(mask: SwapchainImageUsageFlags) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Int) = bitfield and mask == mask
	
	infix fun containsSome(mask: SwapchainImageUsageFlags) = bitfield and mask.bitfield != 0
	
	infix fun containsSome(mask: Int) = bitfield and mask != 0
	
	
	
	override fun toString() = buildString {
		append("{ ")
		if(is_SHARED) append("SHARED, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = SwapchainImageUsageFlags(0)
		val ALL get() = SwapchainImageUsageFlags(1)
		val SHARED get() = SwapchainImageUsageFlags(1)
		
		inline fun compose(block: Companion.() -> SwapchainImageUsageFlags) = block(Companion)
	
	}


}