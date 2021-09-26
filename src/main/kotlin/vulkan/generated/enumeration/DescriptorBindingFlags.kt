// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkDescriptorBindingFlagBits {
 *         UPDATE_AFTER_BIND                = 1
 *         UPDATE_UNUSED_WHILE_PENDING      = 2
 *         PARTIALLY_BOUND                  = 4
 *         VARIABLE_DESCRIPTOR_COUNT        = 8
 *         UPDATE_AFTER_BIND_EXT            = 1
 *         UPDATE_UNUSED_WHILE_PENDING_EXT  = 2
 *         PARTIALLY_BOUND_EXT              = 4
 *         VARIABLE_DESCRIPTOR_COUNT_EXT    = 8
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class DescriptorBindingFlags(val bitfield: Int) {
	
	
	val is_UPDATE_AFTER_BIND get() = bitfield and 1 != 0
	val is_UPDATE_UNUSED_WHILE_PENDING get() = bitfield and 2 != 0
	val is_PARTIALLY_BOUND get() = bitfield and 4 != 0
	val is_VARIABLE_DESCRIPTOR_COUNT get() = bitfield and 8 != 0
	val is_UPDATE_AFTER_BIND_EXT get() = bitfield and 1 != 0
	val is_UPDATE_UNUSED_WHILE_PENDING_EXT get() = bitfield and 2 != 0
	val is_PARTIALLY_BOUND_EXT get() = bitfield and 4 != 0
	val is_VARIABLE_DESCRIPTOR_COUNT_EXT get() = bitfield and 8 != 0
	
	
	
	infix operator fun plus(other: DescriptorBindingFlags) = DescriptorBindingFlags(bitfield or other.bitfield)
	
	infix operator fun plus(other: Int) = DescriptorBindingFlags(bitfield or other)
	
	infix fun containsAll(mask: DescriptorBindingFlags) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Int) = bitfield and mask == mask
	
	infix fun containsSome(mask: DescriptorBindingFlags) = bitfield and mask.bitfield != 0
	
	infix fun containsSome(mask: Int) = bitfield and mask != 0
	
	
	
	override fun toString() = buildString {
		append("{ ")
		if(is_UPDATE_AFTER_BIND) append("UPDATE_AFTER_BIND, ")
		if(is_UPDATE_UNUSED_WHILE_PENDING) append("UPDATE_UNUSED_WHILE_PENDING, ")
		if(is_PARTIALLY_BOUND) append("PARTIALLY_BOUND, ")
		if(is_VARIABLE_DESCRIPTOR_COUNT) append("VARIABLE_DESCRIPTOR_COUNT, ")
		if(is_UPDATE_AFTER_BIND_EXT) append("UPDATE_AFTER_BIND_EXT, ")
		if(is_UPDATE_UNUSED_WHILE_PENDING_EXT) append("UPDATE_UNUSED_WHILE_PENDING_EXT, ")
		if(is_PARTIALLY_BOUND_EXT) append("PARTIALLY_BOUND_EXT, ")
		if(is_VARIABLE_DESCRIPTOR_COUNT_EXT) append("VARIABLE_DESCRIPTOR_COUNT_EXT, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = DescriptorBindingFlags(0)
		val ALL get() = DescriptorBindingFlags(30)
		val UPDATE_AFTER_BIND get() = DescriptorBindingFlags(1)
		val UPDATE_UNUSED_WHILE_PENDING get() = DescriptorBindingFlags(2)
		val PARTIALLY_BOUND get() = DescriptorBindingFlags(4)
		val VARIABLE_DESCRIPTOR_COUNT get() = DescriptorBindingFlags(8)
		val UPDATE_AFTER_BIND_EXT get() = DescriptorBindingFlags(1)
		val UPDATE_UNUSED_WHILE_PENDING_EXT get() = DescriptorBindingFlags(2)
		val PARTIALLY_BOUND_EXT get() = DescriptorBindingFlags(4)
		val VARIABLE_DESCRIPTOR_COUNT_EXT get() = DescriptorBindingFlags(8)
		
		inline fun compose(block: Companion.() -> DescriptorBindingFlags) = block(Companion)
	
	}


}