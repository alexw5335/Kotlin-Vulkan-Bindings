// This file has been automatically generated.

package kvb.vulkan

/**
 *     enum VkDescriptorBindingFlagBits {
 *         VK_DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT                = 1
 *         VK_DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_BIT      = 2
 *         VK_DESCRIPTOR_BINDING_PARTIALLY_BOUND_BIT                  = 4
 *         VK_DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT        = 8
 *         VK_DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT_EXT            = 1
 *         VK_DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_BIT_EXT  = 2
 *         VK_DESCRIPTOR_BINDING_PARTIALLY_BOUND_BIT_EXT              = 4
 *         VK_DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT_EXT    = 8
 *         VK_DESCRIPTOR_BINDING_RESERVED_4_BIT_QCOM                  = 16
 *     }
 */
@Suppress("unused")
@JvmInline
value class DescriptorBindingFlags(val value: Int) {
	
	
	companion object {
		
		val UPDATE_AFTER_BIND = DescriptorBindingFlags(1)
		
		val UPDATE_UNUSED_WHILE_PENDING = DescriptorBindingFlags(2)
		
		val PARTIALLY_BOUND = DescriptorBindingFlags(4)
		
		val VARIABLE_DESCRIPTOR_COUNT = DescriptorBindingFlags(8)
	
	}
	
	
	
	operator fun plus(mask: DescriptorBindingFlags) = DescriptorBindingFlags(value or mask.value)
	
	operator fun contains(mask: DescriptorBindingFlags) = value and mask.value == mask.value


}