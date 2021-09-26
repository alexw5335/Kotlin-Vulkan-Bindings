// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkCommandBufferResetFlagBits {
 *         RELEASE_RESOURCES  = 1
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class CommandBufferResetFlags(val bitfield: Int) {
	
	
	val is_RELEASE_RESOURCES get() = bitfield and 1 != 0
	
	
	
	infix operator fun plus(other: CommandBufferResetFlags) = CommandBufferResetFlags(bitfield or other.bitfield)
	
	infix operator fun plus(other: Int) = CommandBufferResetFlags(bitfield or other)
	
	infix fun containsAll(mask: CommandBufferResetFlags) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Int) = bitfield and mask == mask
	
	infix fun containsSome(mask: CommandBufferResetFlags) = bitfield and mask.bitfield != 0
	
	infix fun containsSome(mask: Int) = bitfield and mask != 0
	
	
	
	override fun toString() = buildString {
		append("{ ")
		if(is_RELEASE_RESOURCES) append("RELEASE_RESOURCES, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = CommandBufferResetFlags(0)
		val ALL get() = CommandBufferResetFlags(1)
		val RELEASE_RESOURCES get() = CommandBufferResetFlags(1)
		
		inline fun compose(block: Companion.() -> CommandBufferResetFlags) = block(Companion)
	
	}


}