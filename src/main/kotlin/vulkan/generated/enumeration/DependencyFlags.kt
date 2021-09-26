// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkDependencyFlagBits {
 *         BY_REGION         = 1
 *         DEVICE_GROUP      = 4
 *         VIEW_LOCAL        = 2
 *         VIEW_LOCAL_KHR    = 2
 *         DEVICE_GROUP_KHR  = 4
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class DependencyFlags(val bitfield: Int) {
	
	
	val is_BY_REGION get() = bitfield and 1 != 0
	val is_DEVICE_GROUP get() = bitfield and 4 != 0
	val is_VIEW_LOCAL get() = bitfield and 2 != 0
	val is_VIEW_LOCAL_KHR get() = bitfield and 2 != 0
	val is_DEVICE_GROUP_KHR get() = bitfield and 4 != 0
	
	
	
	infix operator fun plus(other: DependencyFlags) = DependencyFlags(bitfield or other.bitfield)
	
	infix operator fun plus(other: Int) = DependencyFlags(bitfield or other)
	
	infix fun containsAll(mask: DependencyFlags) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Int) = bitfield and mask == mask
	
	infix fun containsSome(mask: DependencyFlags) = bitfield and mask.bitfield != 0
	
	infix fun containsSome(mask: Int) = bitfield and mask != 0
	
	
	
	override fun toString() = buildString {
		append("{ ")
		if(is_BY_REGION) append("BY_REGION, ")
		if(is_DEVICE_GROUP) append("DEVICE_GROUP, ")
		if(is_VIEW_LOCAL) append("VIEW_LOCAL, ")
		if(is_VIEW_LOCAL_KHR) append("VIEW_LOCAL_KHR, ")
		if(is_DEVICE_GROUP_KHR) append("DEVICE_GROUP_KHR, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = DependencyFlags(0)
		val ALL get() = DependencyFlags(13)
		val BY_REGION get() = DependencyFlags(1)
		val DEVICE_GROUP get() = DependencyFlags(4)
		val VIEW_LOCAL get() = DependencyFlags(2)
		val VIEW_LOCAL_KHR get() = DependencyFlags(2)
		val DEVICE_GROUP_KHR get() = DependencyFlags(4)
		
		inline fun compose(block: Companion.() -> DependencyFlags) = block(Companion)
	
	}


}