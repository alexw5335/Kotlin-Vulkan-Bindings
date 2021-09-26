// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkMemoryHeapFlagBits {
 *         DEVICE_LOCAL        = 1
 *         MULTI_INSTANCE      = 2
 *         MULTI_INSTANCE_KHR  = 2
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class MemoryHeapFlags(val bitfield: Int) {
	
	
	val is_DEVICE_LOCAL get() = bitfield and 1 != 0
	val is_MULTI_INSTANCE get() = bitfield and 2 != 0
	val is_MULTI_INSTANCE_KHR get() = bitfield and 2 != 0
	
	
	
	infix operator fun plus(other: MemoryHeapFlags) = MemoryHeapFlags(bitfield or other.bitfield)
	
	infix operator fun plus(other: Int) = MemoryHeapFlags(bitfield or other)
	
	infix fun containsAll(mask: MemoryHeapFlags) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Int) = bitfield and mask == mask
	
	infix fun containsSome(mask: MemoryHeapFlags) = bitfield and mask.bitfield != 0
	
	infix fun containsSome(mask: Int) = bitfield and mask != 0
	
	
	
	override fun toString() = buildString {
		append("{ ")
		if(is_DEVICE_LOCAL) append("DEVICE_LOCAL, ")
		if(is_MULTI_INSTANCE) append("MULTI_INSTANCE, ")
		if(is_MULTI_INSTANCE_KHR) append("MULTI_INSTANCE_KHR, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = MemoryHeapFlags(0)
		val ALL get() = MemoryHeapFlags(5)
		val DEVICE_LOCAL get() = MemoryHeapFlags(1)
		val MULTI_INSTANCE get() = MemoryHeapFlags(2)
		val MULTI_INSTANCE_KHR get() = MemoryHeapFlags(2)
		
		inline fun compose(block: Companion.() -> MemoryHeapFlags) = block(Companion)
	
	}


}