// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkMemoryAllocateFlagBits {
 *         DEVICE_MASK                        = 1
 *         DEVICE_ADDRESS                     = 2
 *         DEVICE_ADDRESS_CAPTURE_REPLAY      = 4
 *         DEVICE_MASK_KHR                    = 1
 *         DEVICE_ADDRESS_KHR                 = 2
 *         DEVICE_ADDRESS_CAPTURE_REPLAY_KHR  = 4
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class MemoryAllocateFlags(val bitfield: Int) {
	
	
	val is_DEVICE_MASK get() = bitfield and 1 != 0
	val is_DEVICE_ADDRESS get() = bitfield and 2 != 0
	val is_DEVICE_ADDRESS_CAPTURE_REPLAY get() = bitfield and 4 != 0
	val is_DEVICE_MASK_KHR get() = bitfield and 1 != 0
	val is_DEVICE_ADDRESS_KHR get() = bitfield and 2 != 0
	val is_DEVICE_ADDRESS_CAPTURE_REPLAY_KHR get() = bitfield and 4 != 0
	
	
	
	infix operator fun plus(other: MemoryAllocateFlags) = MemoryAllocateFlags(bitfield or other.bitfield)
	
	infix operator fun plus(other: Int) = MemoryAllocateFlags(bitfield or other)
	
	infix fun containsAll(mask: MemoryAllocateFlags) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Int) = bitfield and mask == mask
	
	infix fun containsSome(mask: MemoryAllocateFlags) = bitfield and mask.bitfield != 0
	
	infix fun containsSome(mask: Int) = bitfield and mask != 0
	
	
	
	override fun toString() = buildString {
		append("{ ")
		if(is_DEVICE_MASK) append("DEVICE_MASK, ")
		if(is_DEVICE_ADDRESS) append("DEVICE_ADDRESS, ")
		if(is_DEVICE_ADDRESS_CAPTURE_REPLAY) append("DEVICE_ADDRESS_CAPTURE_REPLAY, ")
		if(is_DEVICE_MASK_KHR) append("DEVICE_MASK_KHR, ")
		if(is_DEVICE_ADDRESS_KHR) append("DEVICE_ADDRESS_KHR, ")
		if(is_DEVICE_ADDRESS_CAPTURE_REPLAY_KHR) append("DEVICE_ADDRESS_CAPTURE_REPLAY_KHR, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = MemoryAllocateFlags(0)
		val ALL get() = MemoryAllocateFlags(14)
		val DEVICE_MASK get() = MemoryAllocateFlags(1)
		val DEVICE_ADDRESS get() = MemoryAllocateFlags(2)
		val DEVICE_ADDRESS_CAPTURE_REPLAY get() = MemoryAllocateFlags(4)
		val DEVICE_MASK_KHR get() = MemoryAllocateFlags(1)
		val DEVICE_ADDRESS_KHR get() = MemoryAllocateFlags(2)
		val DEVICE_ADDRESS_CAPTURE_REPLAY_KHR get() = MemoryAllocateFlags(4)
		
		inline fun compose(block: Companion.() -> MemoryAllocateFlags) = block(Companion)
	
	}


}