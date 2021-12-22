// This file has been automatically generated.

package kvb.vulkan

/**
 *     enum VkExternalSemaphoreFeatureFlagBits {
 *         VK_EXTERNAL_SEMAPHORE_FEATURE_EXPORTABLE_BIT      = 1
 *         VK_EXTERNAL_SEMAPHORE_FEATURE_IMPORTABLE_BIT      = 2
 *         VK_EXTERNAL_SEMAPHORE_FEATURE_EXPORTABLE_BIT_KHR  = 1
 *         VK_EXTERNAL_SEMAPHORE_FEATURE_IMPORTABLE_BIT_KHR  = 2
 *     }
 */
@Suppress("unused")
@JvmInline
value class ExternalSemaphoreFeatureFlags(val value: Int) {
	
	
	companion object {
		
		val EXPORTABLE = ExternalSemaphoreFeatureFlags(1)
		
		val IMPORTABLE = ExternalSemaphoreFeatureFlags(2)
	
	}
	
	
	
	operator fun plus(mask: ExternalSemaphoreFeatureFlags) = ExternalSemaphoreFeatureFlags(value or mask.value)
	
	operator fun contains(mask: ExternalSemaphoreFeatureFlags) = value and mask.value == mask.value


}