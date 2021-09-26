// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkFenceCreateFlagBits {
 *         SIGNALED  = 1
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class FenceCreateFlags(val bitfield: Int) {
	
	
	val is_SIGNALED get() = bitfield and 1 != 0
	
	
	
	infix operator fun plus(other: FenceCreateFlags) = FenceCreateFlags(bitfield or other.bitfield)
	
	infix operator fun plus(other: Int) = FenceCreateFlags(bitfield or other)
	
	infix fun containsAll(mask: FenceCreateFlags) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Int) = bitfield and mask == mask
	
	infix fun containsSome(mask: FenceCreateFlags) = bitfield and mask.bitfield != 0
	
	infix fun containsSome(mask: Int) = bitfield and mask != 0
	
	
	
	override fun toString() = buildString {
		append("{ ")
		if(is_SIGNALED) append("SIGNALED, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = FenceCreateFlags(0)
		val ALL get() = FenceCreateFlags(1)
		val SIGNALED get() = FenceCreateFlags(1)
		
		inline fun compose(block: Companion.() -> FenceCreateFlags) = block(Companion)
	
	}


}