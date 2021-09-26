// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkMemoryPropertyFlagBits {
 *         DEVICE_LOCAL      = 1
 *         HOST_VISIBLE      = 2
 *         HOST_COHERENT     = 4
 *         HOST_CACHED       = 8
 *         LAZILY_ALLOCATED  = 16
 *         PROTECTED         = 32
 *         DEVICE_COHERENT   = 64
 *         DEVICE_UNCACHED   = 128
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class MemoryPropertyFlags(val bitfield: Int) {
	
	
	val is_DEVICE_LOCAL get() = bitfield and 1 != 0
	val is_HOST_VISIBLE get() = bitfield and 2 != 0
	val is_HOST_COHERENT get() = bitfield and 4 != 0
	val is_HOST_CACHED get() = bitfield and 8 != 0
	val is_LAZILY_ALLOCATED get() = bitfield and 16 != 0
	val is_PROTECTED get() = bitfield and 32 != 0
	val is_DEVICE_COHERENT get() = bitfield and 64 != 0
	val is_DEVICE_UNCACHED get() = bitfield and 128 != 0
	
	
	
	infix operator fun plus(other: MemoryPropertyFlags) = MemoryPropertyFlags(bitfield or other.bitfield)
	
	infix operator fun plus(other: Int) = MemoryPropertyFlags(bitfield or other)
	
	infix fun containsAll(mask: MemoryPropertyFlags) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Int) = bitfield and mask == mask
	
	infix fun containsSome(mask: MemoryPropertyFlags) = bitfield and mask.bitfield != 0
	
	infix fun containsSome(mask: Int) = bitfield and mask != 0
	
	
	
	override fun toString() = buildString {
		append("{ ")
		if(is_DEVICE_LOCAL) append("DEVICE_LOCAL, ")
		if(is_HOST_VISIBLE) append("HOST_VISIBLE, ")
		if(is_HOST_COHERENT) append("HOST_COHERENT, ")
		if(is_HOST_CACHED) append("HOST_CACHED, ")
		if(is_LAZILY_ALLOCATED) append("LAZILY_ALLOCATED, ")
		if(is_PROTECTED) append("PROTECTED, ")
		if(is_DEVICE_COHERENT) append("DEVICE_COHERENT, ")
		if(is_DEVICE_UNCACHED) append("DEVICE_UNCACHED, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = MemoryPropertyFlags(0)
		val ALL get() = MemoryPropertyFlags(255)
		val DEVICE_LOCAL get() = MemoryPropertyFlags(1)
		val HOST_VISIBLE get() = MemoryPropertyFlags(2)
		val HOST_COHERENT get() = MemoryPropertyFlags(4)
		val HOST_CACHED get() = MemoryPropertyFlags(8)
		val LAZILY_ALLOCATED get() = MemoryPropertyFlags(16)
		val PROTECTED get() = MemoryPropertyFlags(32)
		val DEVICE_COHERENT get() = MemoryPropertyFlags(64)
		val DEVICE_UNCACHED get() = MemoryPropertyFlags(128)
		
		inline fun compose(block: Companion.() -> MemoryPropertyFlags) = block(Companion)
	
	}


}