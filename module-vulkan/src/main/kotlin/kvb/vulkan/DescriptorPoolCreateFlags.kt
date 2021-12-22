// This file has been automatically generated.

package kvb.vulkan

/**
 *     enum VkDescriptorPoolCreateFlagBits {
 *         VK_DESCRIPTOR_POOL_CREATE_FREE_DESCRIPTOR_SET_BIT    = 1
 *         VK_DESCRIPTOR_POOL_CREATE_UPDATE_AFTER_BIND_BIT      = 2
 *         VK_DESCRIPTOR_POOL_CREATE_UPDATE_AFTER_BIND_BIT_EXT  = 2
 *         VK_DESCRIPTOR_POOL_CREATE_HOST_ONLY_BIT_VALVE        = 4
 *     }
 */
@Suppress("unused")
@JvmInline
value class DescriptorPoolCreateFlags(val value: Int) {
	
	
	companion object {
		
		val FREE_DESCRIPTOR_SET = DescriptorPoolCreateFlags(1)
		
		val UPDATE_AFTER_BIND = DescriptorPoolCreateFlags(2)
		
		val HOST_ONLY = DescriptorPoolCreateFlags(4)
	
	}
	
	
	
	operator fun plus(mask: DescriptorPoolCreateFlags) = DescriptorPoolCreateFlags(value or mask.value)
	
	operator fun contains(mask: DescriptorPoolCreateFlags) = value and mask.value == mask.value


}