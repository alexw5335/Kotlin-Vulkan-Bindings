// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkCommandPoolResetFlagBits {
 *         RELEASE_RESOURCES  = 1
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class CommandPoolResetFlags(val bitfield: Int) {
	
	
	val is_RELEASE_RESOURCES get() = bitfield and 1 != 0
	
	
	
	infix operator fun plus(other: CommandPoolResetFlags) = CommandPoolResetFlags(bitfield or other.bitfield)
	
	infix operator fun plus(other: Int) = CommandPoolResetFlags(bitfield or other)
	
	infix fun containsAll(mask: CommandPoolResetFlags) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Int) = bitfield and mask == mask
	
	infix fun containsSome(mask: CommandPoolResetFlags) = bitfield and mask.bitfield != 0
	
	infix fun containsSome(mask: Int) = bitfield and mask != 0
	
	
	
	override fun toString() = buildString {
		append("{ ")
		if(is_RELEASE_RESOURCES) append("RELEASE_RESOURCES, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = CommandPoolResetFlags(0)
		val ALL get() = CommandPoolResetFlags(1)
		val RELEASE_RESOURCES get() = CommandPoolResetFlags(1)
		
		inline fun compose(block: Companion.() -> CommandPoolResetFlags) = block(Companion)
	
	}


}