// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkEventCreateFlagBits {
 *         DEVICE_ONLY  = 1
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class EventCreateFlags(val bitfield: Int) {
	
	
	val is_DEVICE_ONLY get() = bitfield and 1 != 0
	
	
	
	infix operator fun plus(other: EventCreateFlags) = EventCreateFlags(bitfield or other.bitfield)
	
	infix operator fun plus(other: Int) = EventCreateFlags(bitfield or other)
	
	infix fun containsAll(mask: EventCreateFlags) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Int) = bitfield and mask == mask
	
	infix fun containsSome(mask: EventCreateFlags) = bitfield and mask.bitfield != 0
	
	infix fun containsSome(mask: Int) = bitfield and mask != 0
	
	
	
	override fun toString() = buildString {
		append("{ ")
		if(is_DEVICE_ONLY) append("DEVICE_ONLY, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = EventCreateFlags(0)
		val ALL get() = EventCreateFlags(1)
		val DEVICE_ONLY get() = EventCreateFlags(1)
		
		inline fun compose(block: Companion.() -> EventCreateFlags) = block(Companion)
	
	}


}