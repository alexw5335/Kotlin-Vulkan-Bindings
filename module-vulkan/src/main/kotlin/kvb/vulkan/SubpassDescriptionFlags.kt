// This file has been automatically generated.

package kvb.vulkan

/**
 *     enum VkSubpassDescriptionFlagBits {
 *         VK_SUBPASS_DESCRIPTION_PER_VIEW_ATTRIBUTES_BIT_NVX       = 1
 *         VK_SUBPASS_DESCRIPTION_PER_VIEW_POSITION_X_ONLY_BIT_NVX  = 2
 *         VK_SUBPASS_DESCRIPTION_FRAGMENT_REGION_BIT_QCOM          = 4
 *         VK_SUBPASS_DESCRIPTION_SHADER_RESOLVE_BIT_QCOM           = 8
 *     }
 */
@Suppress("unused")
@JvmInline
value class SubpassDescriptionFlags(val value: Int) {
	
	
	companion object {
		
		val PER_VIEW_ATTRIBUTES = SubpassDescriptionFlags(1)
		
		val PER_VIEW_POSITION_X_ONLY = SubpassDescriptionFlags(2)
		
		val FRAGMENT_REGION = SubpassDescriptionFlags(4)
		
		val SHADER_RESOLVE = SubpassDescriptionFlags(8)
	
	}
	
	
	
	operator fun plus(mask: SubpassDescriptionFlags) = SubpassDescriptionFlags(value or mask.value)
	
	operator fun contains(mask: SubpassDescriptionFlags) = value and mask.value == mask.value


}