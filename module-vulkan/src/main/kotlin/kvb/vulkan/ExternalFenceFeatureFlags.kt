// This file has been automatically generated.

package kvb.vulkan

/**
 *     // provided by VK_VERSION_1_1

 *     enum VkExternalFenceFeatureFlagBits {
 *         VK_EXTERNAL_FENCE_FEATURE_EXPORTABLE_BIT      = 1
 *         VK_EXTERNAL_FENCE_FEATURE_IMPORTABLE_BIT      = 2
 *         VK_EXTERNAL_FENCE_FEATURE_EXPORTABLE_BIT_KHR  = 1
 *         VK_EXTERNAL_FENCE_FEATURE_IMPORTABLE_BIT_KHR  = 2
 *     }
 */
@Suppress("unused")
@JvmInline
value class ExternalFenceFeatureFlags(val value: Int) {
	
	
	companion object {
		
		val EXPORTABLE = ExternalFenceFeatureFlags(1)
		
		val IMPORTABLE = ExternalFenceFeatureFlags(2)
	
	}
	
	
	
	operator fun plus(mask: ExternalFenceFeatureFlags) = ExternalFenceFeatureFlags(value or mask.value)
	
	operator fun contains(mask: ExternalFenceFeatureFlags) = value and mask.value == mask.value


}