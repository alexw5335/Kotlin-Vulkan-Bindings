// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkExternalMemoryFeatureFlagBits {
 *         DEDICATED_ONLY      = 1
 *         EXPORTABLE          = 2
 *         IMPORTABLE          = 4
 *         DEDICATED_ONLY_KHR  = 1
 *         EXPORTABLE_KHR      = 2
 *         IMPORTABLE_KHR      = 4
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class ExternalMemoryFeatureFlags(val bitfield: Int) {
	
	
	val is_DEDICATED_ONLY get() = bitfield and 1 != 0
	val is_EXPORTABLE get() = bitfield and 2 != 0
	val is_IMPORTABLE get() = bitfield and 4 != 0
	val is_DEDICATED_ONLY_KHR get() = bitfield and 1 != 0
	val is_EXPORTABLE_KHR get() = bitfield and 2 != 0
	val is_IMPORTABLE_KHR get() = bitfield and 4 != 0
	
	
	
	infix operator fun plus(other: ExternalMemoryFeatureFlags) = ExternalMemoryFeatureFlags(bitfield or other.bitfield)
	
	infix operator fun plus(other: Int) = ExternalMemoryFeatureFlags(bitfield or other)
	
	infix fun containsAll(mask: ExternalMemoryFeatureFlags) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Int) = bitfield and mask == mask
	
	infix fun containsSome(mask: ExternalMemoryFeatureFlags) = bitfield and mask.bitfield != 0
	
	infix fun containsSome(mask: Int) = bitfield and mask != 0
	
	
	
	override fun toString() = buildString {
		append("{ ")
		if(is_DEDICATED_ONLY) append("DEDICATED_ONLY, ")
		if(is_EXPORTABLE) append("EXPORTABLE, ")
		if(is_IMPORTABLE) append("IMPORTABLE, ")
		if(is_DEDICATED_ONLY_KHR) append("DEDICATED_ONLY_KHR, ")
		if(is_EXPORTABLE_KHR) append("EXPORTABLE_KHR, ")
		if(is_IMPORTABLE_KHR) append("IMPORTABLE_KHR, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = ExternalMemoryFeatureFlags(0)
		val ALL get() = ExternalMemoryFeatureFlags(14)
		val DEDICATED_ONLY get() = ExternalMemoryFeatureFlags(1)
		val EXPORTABLE get() = ExternalMemoryFeatureFlags(2)
		val IMPORTABLE get() = ExternalMemoryFeatureFlags(4)
		val DEDICATED_ONLY_KHR get() = ExternalMemoryFeatureFlags(1)
		val EXPORTABLE_KHR get() = ExternalMemoryFeatureFlags(2)
		val IMPORTABLE_KHR get() = ExternalMemoryFeatureFlags(4)
		
		inline fun compose(block: Companion.() -> ExternalMemoryFeatureFlags) = block(Companion)
	
	}


}