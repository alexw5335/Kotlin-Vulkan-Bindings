// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkSemaphoreWaitFlagBits {
 *         ANY      = 1
 *         ANY_KHR  = 1
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class SemaphoreWaitFlags(val bitfield: Int) {
	
	
	val is_ANY get() = bitfield and 1 != 0
	val is_ANY_KHR get() = bitfield and 1 != 0
	
	
	
	infix operator fun plus(other: SemaphoreWaitFlags) = SemaphoreWaitFlags(bitfield or other.bitfield)
	
	infix operator fun plus(other: Int) = SemaphoreWaitFlags(bitfield or other)
	
	infix fun containsAll(mask: SemaphoreWaitFlags) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Int) = bitfield and mask == mask
	
	infix fun containsSome(mask: SemaphoreWaitFlags) = bitfield and mask.bitfield != 0
	
	infix fun containsSome(mask: Int) = bitfield and mask != 0
	
	
	
	override fun toString() = buildString {
		append("{ ")
		if(is_ANY) append("ANY, ")
		if(is_ANY_KHR) append("ANY_KHR, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = SemaphoreWaitFlags(0)
		val ALL get() = SemaphoreWaitFlags(2)
		val ANY get() = SemaphoreWaitFlags(1)
		val ANY_KHR get() = SemaphoreWaitFlags(1)
		
		inline fun compose(block: Companion.() -> SemaphoreWaitFlags) = block(Companion)
	
	}


}