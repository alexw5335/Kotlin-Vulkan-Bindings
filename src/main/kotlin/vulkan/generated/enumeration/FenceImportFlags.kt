// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkFenceImportFlagBits {
 *         TEMPORARY      = 1
 *         TEMPORARY_KHR  = 1
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class FenceImportFlags(val bitfield: Int) {
	
	
	val is_TEMPORARY get() = bitfield and 1 != 0
	val is_TEMPORARY_KHR get() = bitfield and 1 != 0
	
	
	
	infix operator fun plus(other: FenceImportFlags) = FenceImportFlags(bitfield or other.bitfield)
	
	infix operator fun plus(other: Int) = FenceImportFlags(bitfield or other)
	
	infix fun containsAll(mask: FenceImportFlags) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Int) = bitfield and mask == mask
	
	infix fun containsSome(mask: FenceImportFlags) = bitfield and mask.bitfield != 0
	
	infix fun containsSome(mask: Int) = bitfield and mask != 0
	
	
	
	override fun toString() = buildString {
		append("{ ")
		if(is_TEMPORARY) append("TEMPORARY, ")
		if(is_TEMPORARY_KHR) append("TEMPORARY_KHR, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = FenceImportFlags(0)
		val ALL get() = FenceImportFlags(2)
		val TEMPORARY get() = FenceImportFlags(1)
		val TEMPORARY_KHR get() = FenceImportFlags(1)
		
		inline fun compose(block: Companion.() -> FenceImportFlags) = block(Companion)
	
	}


}