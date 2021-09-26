// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkQueueFlagBits {
 *         GRAPHICS        = 1
 *         COMPUTE         = 2
 *         TRANSFER        = 4
 *         SPARSE_BINDING  = 8
 *         PROTECTED       = 16
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class QueueFlags(val bitfield: Int) {
	
	
	val is_GRAPHICS get() = bitfield and 1 != 0
	val is_COMPUTE get() = bitfield and 2 != 0
	val is_TRANSFER get() = bitfield and 4 != 0
	val is_SPARSE_BINDING get() = bitfield and 8 != 0
	val is_PROTECTED get() = bitfield and 16 != 0
	
	
	
	infix operator fun plus(other: QueueFlags) = QueueFlags(bitfield or other.bitfield)
	
	infix operator fun plus(other: Int) = QueueFlags(bitfield or other)
	
	infix fun containsAll(mask: QueueFlags) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Int) = bitfield and mask == mask
	
	infix fun containsSome(mask: QueueFlags) = bitfield and mask.bitfield != 0
	
	infix fun containsSome(mask: Int) = bitfield and mask != 0
	
	
	
	override fun toString() = buildString {
		append("{ ")
		if(is_GRAPHICS) append("GRAPHICS, ")
		if(is_COMPUTE) append("COMPUTE, ")
		if(is_TRANSFER) append("TRANSFER, ")
		if(is_SPARSE_BINDING) append("SPARSE_BINDING, ")
		if(is_PROTECTED) append("PROTECTED, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = QueueFlags(0)
		val ALL get() = QueueFlags(31)
		val GRAPHICS get() = QueueFlags(1)
		val COMPUTE get() = QueueFlags(2)
		val TRANSFER get() = QueueFlags(4)
		val SPARSE_BINDING get() = QueueFlags(8)
		val PROTECTED get() = QueueFlags(16)
		
		inline fun compose(block: Companion.() -> QueueFlags) = block(Companion)
	
	}


}