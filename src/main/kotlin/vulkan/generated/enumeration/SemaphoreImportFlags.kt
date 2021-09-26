// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkSemaphoreImportFlagBits {
 *         TEMPORARY      = 1
 *         TEMPORARY_KHR  = 1
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class SemaphoreImportFlags(val bitfield: Int) {
	
	
	val is_TEMPORARY get() = bitfield and 1 != 0
	val is_TEMPORARY_KHR get() = bitfield and 1 != 0
	
	
	
	infix operator fun plus(other: SemaphoreImportFlags) = SemaphoreImportFlags(bitfield or other.bitfield)
	
	infix operator fun plus(other: Int) = SemaphoreImportFlags(bitfield or other)
	
	infix fun containsAll(mask: SemaphoreImportFlags) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Int) = bitfield and mask == mask
	
	infix fun containsSome(mask: SemaphoreImportFlags) = bitfield and mask.bitfield != 0
	
	infix fun containsSome(mask: Int) = bitfield and mask != 0
	
	
	
	override fun toString() = buildString {
		append("{ ")
		if(is_TEMPORARY) append("TEMPORARY, ")
		if(is_TEMPORARY_KHR) append("TEMPORARY_KHR, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = SemaphoreImportFlags(0)
		val ALL get() = SemaphoreImportFlags(2)
		val TEMPORARY get() = SemaphoreImportFlags(1)
		val TEMPORARY_KHR get() = SemaphoreImportFlags(1)
		
		inline fun compose(block: Companion.() -> SemaphoreImportFlags) = block(Companion)
	
	}


}