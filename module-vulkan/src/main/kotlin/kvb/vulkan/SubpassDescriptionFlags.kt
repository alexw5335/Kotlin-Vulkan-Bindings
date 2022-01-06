// This file has been automatically generated.

package kvb.vulkan

/**
 *     // provided by VK_VERSION_1_0

 *     enum VkSubpassDescriptionFlagBits {
 *         VK_SUBPASS_DESCRIPTION_PER_VIEW_ATTRIBUTES_BIT_NVX                            = 1
 *         VK_SUBPASS_DESCRIPTION_PER_VIEW_POSITION_X_ONLY_BIT_NVX                       = 2
 *         VK_SUBPASS_DESCRIPTION_FRAGMENT_REGION_BIT_QCOM                               = 4
 *         VK_SUBPASS_DESCRIPTION_SHADER_RESOLVE_BIT_QCOM                                = 8
 *         VK_SUBPASS_DESCRIPTION_RASTERIZATION_ORDER_ATTACHMENT_COLOR_ACCESS_BIT_ARM    = 16
 *         VK_SUBPASS_DESCRIPTION_RASTERIZATION_ORDER_ATTACHMENT_DEPTH_ACCESS_BIT_ARM    = 32
 *         VK_SUBPASS_DESCRIPTION_RASTERIZATION_ORDER_ATTACHMENT_STENCIL_ACCESS_BIT_ARM  = 64
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
		
		val RASTERIZATION_ORDER_ATTACHMENT_COLOR_ACCESS = SubpassDescriptionFlags(16)
		
		val RASTERIZATION_ORDER_ATTACHMENT_DEPTH_ACCESS = SubpassDescriptionFlags(32)
		
		val RASTERIZATION_ORDER_ATTACHMENT_STENCIL_ACCESS = SubpassDescriptionFlags(64)
	
	}
	
	
	
	operator fun plus(mask: SubpassDescriptionFlags) = SubpassDescriptionFlags(value or mask.value)
	
	operator fun contains(mask: SubpassDescriptionFlags) = value and mask.value == mask.value


}