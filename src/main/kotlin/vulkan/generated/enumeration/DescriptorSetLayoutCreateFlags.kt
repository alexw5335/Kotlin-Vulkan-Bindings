// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkDescriptorSetLayoutCreateFlagBits {
 *         UPDATE_AFTER_BIND_POOL      = 2
 *         PUSH_DESCRIPTOR             = 1
 *         UPDATE_AFTER_BIND_POOL_EXT  = 2
 *         HOST_ONLY_POOL              = 4
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class DescriptorSetLayoutCreateFlags(val bitfield: Int) {
	
	
	val is_UPDATE_AFTER_BIND_POOL get() = bitfield and 2 != 0
	val is_PUSH_DESCRIPTOR get() = bitfield and 1 != 0
	val is_UPDATE_AFTER_BIND_POOL_EXT get() = bitfield and 2 != 0
	val is_HOST_ONLY_POOL get() = bitfield and 4 != 0
	
	
	
	infix operator fun plus(other: DescriptorSetLayoutCreateFlags) = DescriptorSetLayoutCreateFlags(bitfield or other.bitfield)
	
	infix operator fun plus(other: Int) = DescriptorSetLayoutCreateFlags(bitfield or other)
	
	infix fun containsAll(mask: DescriptorSetLayoutCreateFlags) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Int) = bitfield and mask == mask
	
	infix fun containsSome(mask: DescriptorSetLayoutCreateFlags) = bitfield and mask.bitfield != 0
	
	infix fun containsSome(mask: Int) = bitfield and mask != 0
	
	
	
	override fun toString() = buildString {
		append("{ ")
		if(is_UPDATE_AFTER_BIND_POOL) append("UPDATE_AFTER_BIND_POOL, ")
		if(is_PUSH_DESCRIPTOR) append("PUSH_DESCRIPTOR, ")
		if(is_UPDATE_AFTER_BIND_POOL_EXT) append("UPDATE_AFTER_BIND_POOL_EXT, ")
		if(is_HOST_ONLY_POOL) append("HOST_ONLY_POOL, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = DescriptorSetLayoutCreateFlags(0)
		val ALL get() = DescriptorSetLayoutCreateFlags(9)
		val UPDATE_AFTER_BIND_POOL get() = DescriptorSetLayoutCreateFlags(2)
		val PUSH_DESCRIPTOR get() = DescriptorSetLayoutCreateFlags(1)
		val UPDATE_AFTER_BIND_POOL_EXT get() = DescriptorSetLayoutCreateFlags(2)
		val HOST_ONLY_POOL get() = DescriptorSetLayoutCreateFlags(4)
		
		inline fun compose(block: Companion.() -> DescriptorSetLayoutCreateFlags) = block(Companion)
	
	}


}