// This file has been automatically generated.

package kvb.vulkan

/**
 *     enum VkPipelineCacheCreateFlagBits {
 *         VK_PIPELINE_CACHE_CREATE_RESERVED_1_BIT_EXT               = 2
 *         VK_PIPELINE_CACHE_CREATE_EXTERNALLY_SYNCHRONIZED_BIT_EXT  = 1
 *         VK_PIPELINE_CACHE_CREATE_RESERVED_2_BIT_EXT               = 4
 *     }
 */
@Suppress("unused")
@JvmInline
value class PipelineCacheCreateFlags(val value: Int) {
	
	
	companion object {
		
		val EXTERNALLY_SYNCHRONIZED = PipelineCacheCreateFlags(1)
	
	}
	
	
	
	operator fun plus(mask: PipelineCacheCreateFlags) = PipelineCacheCreateFlags(value or mask.value)
	
	operator fun contains(mask: PipelineCacheCreateFlags) = value and mask.value == mask.value


}