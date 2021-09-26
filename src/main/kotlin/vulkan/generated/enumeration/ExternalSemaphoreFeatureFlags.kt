// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkExternalSemaphoreFeatureFlagBits {
 *         EXPORTABLE      = 1
 *         IMPORTABLE      = 2
 *         EXPORTABLE_KHR  = 1
 *         IMPORTABLE_KHR  = 2
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class ExternalSemaphoreFeatureFlags(val bitfield: Int) {
	
	
	val is_EXPORTABLE get() = bitfield and 1 != 0
	val is_IMPORTABLE get() = bitfield and 2 != 0
	val is_EXPORTABLE_KHR get() = bitfield and 1 != 0
	val is_IMPORTABLE_KHR get() = bitfield and 2 != 0
	
	
	
	infix operator fun plus(other: ExternalSemaphoreFeatureFlags) = ExternalSemaphoreFeatureFlags(bitfield or other.bitfield)
	
	infix operator fun plus(other: Int) = ExternalSemaphoreFeatureFlags(bitfield or other)
	
	infix fun containsAll(mask: ExternalSemaphoreFeatureFlags) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Int) = bitfield and mask == mask
	
	infix fun containsSome(mask: ExternalSemaphoreFeatureFlags) = bitfield and mask.bitfield != 0
	
	infix fun containsSome(mask: Int) = bitfield and mask != 0
	
	
	
	override fun toString() = buildString {
		append("{ ")
		if(is_EXPORTABLE) append("EXPORTABLE, ")
		if(is_IMPORTABLE) append("IMPORTABLE, ")
		if(is_EXPORTABLE_KHR) append("EXPORTABLE_KHR, ")
		if(is_IMPORTABLE_KHR) append("IMPORTABLE_KHR, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = ExternalSemaphoreFeatureFlags(0)
		val ALL get() = ExternalSemaphoreFeatureFlags(6)
		val EXPORTABLE get() = ExternalSemaphoreFeatureFlags(1)
		val IMPORTABLE get() = ExternalSemaphoreFeatureFlags(2)
		val EXPORTABLE_KHR get() = ExternalSemaphoreFeatureFlags(1)
		val IMPORTABLE_KHR get() = ExternalSemaphoreFeatureFlags(2)
		
		inline fun compose(block: Companion.() -> ExternalSemaphoreFeatureFlags) = block(Companion)
	
	}


}