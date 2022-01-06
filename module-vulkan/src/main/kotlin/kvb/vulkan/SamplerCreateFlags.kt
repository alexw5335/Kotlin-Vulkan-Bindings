// This file has been automatically generated.

package kvb.vulkan

/**
 *     // provided by VK_VERSION_1_0

 *     enum VkSamplerCreateFlagBits {
 *         VK_SAMPLER_CREATE_SUBSAMPLED_BIT_EXT                        = 1
 *         VK_SAMPLER_CREATE_SUBSAMPLED_COARSE_RECONSTRUCTION_BIT_EXT  = 2
 *         VK_SAMPLER_CREATE_RESERVED_3_BIT_AMD                        = 8
 *         VK_SAMPLER_CREATE_RESERVED_2_BIT_EXT                        = 4
 *         VK_SAMPLER_CREATE_IMAGE_PROCESSING_BIT_QCOM                 = 16
 *     }
 */
@Suppress("unused")
@JvmInline
value class SamplerCreateFlags(val value: Int) {
	
	
	companion object {
		
		val SUBSAMPLED = SamplerCreateFlags(1)
		
		val SUBSAMPLED_COARSE_RECONSTRUCTION = SamplerCreateFlags(2)
	
	}
	
	
	
	operator fun plus(mask: SamplerCreateFlags) = SamplerCreateFlags(value or mask.value)
	
	operator fun contains(mask: SamplerCreateFlags) = value and mask.value == mask.value


}