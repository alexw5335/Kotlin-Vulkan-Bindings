// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkSwapchainCreateFlagBitsKHR {
 *         SPLIT_INSTANCE_BIND_REGIONS  = 1
 *         PROTECTED                    = 2
 *         MUTABLE_FORMAT               = 4
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class SwapchainCreateFlags(val bitfield: Int) {
	
	
	val is_SPLIT_INSTANCE_BIND_REGIONS get() = bitfield and 1 != 0
	val is_PROTECTED get() = bitfield and 2 != 0
	val is_MUTABLE_FORMAT get() = bitfield and 4 != 0
	
	
	
	infix operator fun plus(other: SwapchainCreateFlags) = SwapchainCreateFlags(bitfield or other.bitfield)
	
	infix operator fun plus(other: Int) = SwapchainCreateFlags(bitfield or other)
	
	infix fun containsAll(mask: SwapchainCreateFlags) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Int) = bitfield and mask == mask
	
	infix fun containsSome(mask: SwapchainCreateFlags) = bitfield and mask.bitfield != 0
	
	infix fun containsSome(mask: Int) = bitfield and mask != 0
	
	
	
	override fun toString() = buildString {
		append("{ ")
		if(is_SPLIT_INSTANCE_BIND_REGIONS) append("SPLIT_INSTANCE_BIND_REGIONS, ")
		if(is_PROTECTED) append("PROTECTED, ")
		if(is_MUTABLE_FORMAT) append("MUTABLE_FORMAT, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = SwapchainCreateFlags(0)
		val ALL get() = SwapchainCreateFlags(7)
		val SPLIT_INSTANCE_BIND_REGIONS get() = SwapchainCreateFlags(1)
		val PROTECTED get() = SwapchainCreateFlags(2)
		val MUTABLE_FORMAT get() = SwapchainCreateFlags(4)
		
		inline fun compose(block: Companion.() -> SwapchainCreateFlags) = block(Companion)
	
	}


}