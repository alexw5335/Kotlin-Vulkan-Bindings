// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkCommandBufferUsageFlagBits {
 *         ONE_TIME_SUBMIT       = 1
 *         RENDER_PASS_CONTINUE  = 2
 *         SIMULTANEOUS_USE      = 4
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class CommandBufferUsageFlags(val bitfield: Int) {
	
	
	val is_ONE_TIME_SUBMIT get() = bitfield and 1 != 0
	val is_RENDER_PASS_CONTINUE get() = bitfield and 2 != 0
	val is_SIMULTANEOUS_USE get() = bitfield and 4 != 0
	
	
	
	infix operator fun plus(other: CommandBufferUsageFlags) = CommandBufferUsageFlags(bitfield or other.bitfield)
	
	infix operator fun plus(other: Int) = CommandBufferUsageFlags(bitfield or other)
	
	infix fun containsAll(mask: CommandBufferUsageFlags) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Int) = bitfield and mask == mask
	
	infix fun containsSome(mask: CommandBufferUsageFlags) = bitfield and mask.bitfield != 0
	
	infix fun containsSome(mask: Int) = bitfield and mask != 0
	
	
	
	override fun toString() = buildString {
		append("{ ")
		if(is_ONE_TIME_SUBMIT) append("ONE_TIME_SUBMIT, ")
		if(is_RENDER_PASS_CONTINUE) append("RENDER_PASS_CONTINUE, ")
		if(is_SIMULTANEOUS_USE) append("SIMULTANEOUS_USE, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = CommandBufferUsageFlags(0)
		val ALL get() = CommandBufferUsageFlags(7)
		val ONE_TIME_SUBMIT get() = CommandBufferUsageFlags(1)
		val RENDER_PASS_CONTINUE get() = CommandBufferUsageFlags(2)
		val SIMULTANEOUS_USE get() = CommandBufferUsageFlags(4)
		
		inline fun compose(block: Companion.() -> CommandBufferUsageFlags) = block(Companion)
	
	}


}