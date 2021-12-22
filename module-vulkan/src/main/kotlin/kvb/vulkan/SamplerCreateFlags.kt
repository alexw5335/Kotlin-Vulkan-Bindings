// This file has been automatically generated.

package kvb.vulkan

/**
 *     enum VkSamplerCreateFlagBits {
 *         VK_SAMPLER_CREATE_SUBSAMPLED_BIT_EXT                        = 1
 *         VK_SAMPLER_CREATE_SUBSAMPLED_COARSE_RECONSTRUCTION_BIT_EXT  = 2
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