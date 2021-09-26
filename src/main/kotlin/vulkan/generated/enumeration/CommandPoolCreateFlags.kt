// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkCommandPoolCreateFlagBits {
 *         TRANSIENT             = 1
 *         RESET_COMMAND_BUFFER  = 2
 *         PROTECTED             = 4
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class CommandPoolCreateFlags(val bitfield: Int) {
	
	
	val is_TRANSIENT get() = bitfield and 1 != 0
	val is_RESET_COMMAND_BUFFER get() = bitfield and 2 != 0
	val is_PROTECTED get() = bitfield and 4 != 0
	
	
	
	infix operator fun plus(other: CommandPoolCreateFlags) = CommandPoolCreateFlags(bitfield or other.bitfield)
	
	infix operator fun plus(other: Int) = CommandPoolCreateFlags(bitfield or other)
	
	infix fun containsAll(mask: CommandPoolCreateFlags) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Int) = bitfield and mask == mask
	
	infix fun containsSome(mask: CommandPoolCreateFlags) = bitfield and mask.bitfield != 0
	
	infix fun containsSome(mask: Int) = bitfield and mask != 0
	
	
	
	override fun toString() = buildString {
		append("{ ")
		if(is_TRANSIENT) append("TRANSIENT, ")
		if(is_RESET_COMMAND_BUFFER) append("RESET_COMMAND_BUFFER, ")
		if(is_PROTECTED) append("PROTECTED, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = CommandPoolCreateFlags(0)
		val ALL get() = CommandPoolCreateFlags(7)
		val TRANSIENT get() = CommandPoolCreateFlags(1)
		val RESET_COMMAND_BUFFER get() = CommandPoolCreateFlags(2)
		val PROTECTED get() = CommandPoolCreateFlags(4)
		
		inline fun compose(block: Companion.() -> CommandPoolCreateFlags) = block(Companion)
	
	}


}