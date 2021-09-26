// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkBufferCreateFlagBits {
 *         SPARSE_BINDING                     = 1
 *         SPARSE_RESIDENCY                   = 2
 *         SPARSE_ALIASED                     = 4
 *         PROTECTED                          = 8
 *         DEVICE_ADDRESS_CAPTURE_REPLAY      = 16
 *         DEVICE_ADDRESS_CAPTURE_REPLAY_EXT  = 16
 *         DEVICE_ADDRESS_CAPTURE_REPLAY_KHR  = 16
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class BufferCreateFlags(val bitfield: Int) {
	
	
	val is_SPARSE_BINDING get() = bitfield and 1 != 0
	val is_SPARSE_RESIDENCY get() = bitfield and 2 != 0
	val is_SPARSE_ALIASED get() = bitfield and 4 != 0
	val is_PROTECTED get() = bitfield and 8 != 0
	val is_DEVICE_ADDRESS_CAPTURE_REPLAY get() = bitfield and 16 != 0
	val is_DEVICE_ADDRESS_CAPTURE_REPLAY_EXT get() = bitfield and 16 != 0
	val is_DEVICE_ADDRESS_CAPTURE_REPLAY_KHR get() = bitfield and 16 != 0
	
	
	
	infix operator fun plus(other: BufferCreateFlags) = BufferCreateFlags(bitfield or other.bitfield)
	
	infix operator fun plus(other: Int) = BufferCreateFlags(bitfield or other)
	
	infix fun containsAll(mask: BufferCreateFlags) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Int) = bitfield and mask == mask
	
	infix fun containsSome(mask: BufferCreateFlags) = bitfield and mask.bitfield != 0
	
	infix fun containsSome(mask: Int) = bitfield and mask != 0
	
	
	
	override fun toString() = buildString {
		append("{ ")
		if(is_SPARSE_BINDING) append("SPARSE_BINDING, ")
		if(is_SPARSE_RESIDENCY) append("SPARSE_RESIDENCY, ")
		if(is_SPARSE_ALIASED) append("SPARSE_ALIASED, ")
		if(is_PROTECTED) append("PROTECTED, ")
		if(is_DEVICE_ADDRESS_CAPTURE_REPLAY) append("DEVICE_ADDRESS_CAPTURE_REPLAY, ")
		if(is_DEVICE_ADDRESS_CAPTURE_REPLAY_EXT) append("DEVICE_ADDRESS_CAPTURE_REPLAY_EXT, ")
		if(is_DEVICE_ADDRESS_CAPTURE_REPLAY_KHR) append("DEVICE_ADDRESS_CAPTURE_REPLAY_KHR, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = BufferCreateFlags(0)
		val ALL get() = BufferCreateFlags(63)
		val SPARSE_BINDING get() = BufferCreateFlags(1)
		val SPARSE_RESIDENCY get() = BufferCreateFlags(2)
		val SPARSE_ALIASED get() = BufferCreateFlags(4)
		val PROTECTED get() = BufferCreateFlags(8)
		val DEVICE_ADDRESS_CAPTURE_REPLAY get() = BufferCreateFlags(16)
		val DEVICE_ADDRESS_CAPTURE_REPLAY_EXT get() = BufferCreateFlags(16)
		val DEVICE_ADDRESS_CAPTURE_REPLAY_KHR get() = BufferCreateFlags(16)
		
		inline fun compose(block: Companion.() -> BufferCreateFlags) = block(Companion)
	
	}


}