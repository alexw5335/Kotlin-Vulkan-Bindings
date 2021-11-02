// This file has been automatically generated.

package kvb.vulkan

/**
 *     enum VkExternalMemoryFeatureFlagBits {
 *         VK_EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT      = 1
 *         VK_EXTERNAL_MEMORY_FEATURE_EXPORTABLE_BIT          = 2
 *         VK_EXTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT          = 4
 *         VK_EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT_KHR  = 1
 *         VK_EXTERNAL_MEMORY_FEATURE_EXPORTABLE_BIT_KHR      = 2
 *         VK_EXTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT_KHR      = 4
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class ExternalMemoryFeatureFlags(val value: Int) {
	
	
	companion object {
		
		val DEDICATED_ONLY = ExternalMemoryFeatureFlags(1)
		
		val EXPORTABLE = ExternalMemoryFeatureFlags(2)
		
		val IMPORTABLE = ExternalMemoryFeatureFlags(4)
	
	}
	
	
	
	operator fun plus(mask: ExternalMemoryFeatureFlags) = ExternalMemoryFeatureFlags(value or mask.value)
	
	operator fun contains(mask: ExternalMemoryFeatureFlags) = value and mask.value == mask.value


}