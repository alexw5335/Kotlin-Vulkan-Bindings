// This file has been automatically generated.

package kvb.vulkan

/**
 *     enum VkDescriptorSetLayoutCreateFlagBits {
 *         VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT      = 2
 *         VK_DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT_KHR         = 1
 *         VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT_EXT  = 2
 *         VK_DESCRIPTOR_SET_LAYOUT_CREATE_HOST_ONLY_POOL_BIT_VALVE        = 4
 *     }
 */
@Suppress("unused")
@JvmInline
value class DescriptorSetLayoutCreateFlags(val value: Int) {
	
	
	companion object {
		
		val UPDATE_AFTER_BIND_POOL = DescriptorSetLayoutCreateFlags(2)
		
		val PUSH_DESCRIPTOR = DescriptorSetLayoutCreateFlags(1)
		
		val HOST_ONLY_POOL = DescriptorSetLayoutCreateFlags(4)
	
	}
	
	
	
	operator fun plus(mask: DescriptorSetLayoutCreateFlags) = DescriptorSetLayoutCreateFlags(value or mask.value)
	
	operator fun contains(mask: DescriptorSetLayoutCreateFlags) = value and mask.value == mask.value


}