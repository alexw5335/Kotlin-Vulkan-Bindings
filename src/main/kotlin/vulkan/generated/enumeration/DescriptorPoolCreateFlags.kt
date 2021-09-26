// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkDescriptorPoolCreateFlagBits {
 *         FREE_DESCRIPTOR_SET    = 1
 *         UPDATE_AFTER_BIND      = 2
 *         UPDATE_AFTER_BIND_EXT  = 2
 *         HOST_ONLY              = 4
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class DescriptorPoolCreateFlags(val bitfield: Int) {
	
	
	val is_FREE_DESCRIPTOR_SET get() = bitfield and 1 != 0
	val is_UPDATE_AFTER_BIND get() = bitfield and 2 != 0
	val is_UPDATE_AFTER_BIND_EXT get() = bitfield and 2 != 0
	val is_HOST_ONLY get() = bitfield and 4 != 0
	
	
	
	infix operator fun plus(other: DescriptorPoolCreateFlags) = DescriptorPoolCreateFlags(bitfield or other.bitfield)
	
	infix operator fun plus(other: Int) = DescriptorPoolCreateFlags(bitfield or other)
	
	infix fun containsAll(mask: DescriptorPoolCreateFlags) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Int) = bitfield and mask == mask
	
	infix fun containsSome(mask: DescriptorPoolCreateFlags) = bitfield and mask.bitfield != 0
	
	infix fun containsSome(mask: Int) = bitfield and mask != 0
	
	
	
	override fun toString() = buildString {
		append("{ ")
		if(is_FREE_DESCRIPTOR_SET) append("FREE_DESCRIPTOR_SET, ")
		if(is_UPDATE_AFTER_BIND) append("UPDATE_AFTER_BIND, ")
		if(is_UPDATE_AFTER_BIND_EXT) append("UPDATE_AFTER_BIND_EXT, ")
		if(is_HOST_ONLY) append("HOST_ONLY, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = DescriptorPoolCreateFlags(0)
		val ALL get() = DescriptorPoolCreateFlags(9)
		val FREE_DESCRIPTOR_SET get() = DescriptorPoolCreateFlags(1)
		val UPDATE_AFTER_BIND get() = DescriptorPoolCreateFlags(2)
		val UPDATE_AFTER_BIND_EXT get() = DescriptorPoolCreateFlags(2)
		val HOST_ONLY get() = DescriptorPoolCreateFlags(4)
		
		inline fun compose(block: Companion.() -> DescriptorPoolCreateFlags) = block(Companion)
	
	}


}