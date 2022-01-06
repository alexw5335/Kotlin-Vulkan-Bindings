// This file has been automatically generated.

package kvb.vulkan

/**
 *     // provided by VK_ARM_rasterization_order_attachment_access

 *     enum VkPipelineColorBlendStateCreateFlagBits {
 *         VK_PIPELINE_COLOR_BLEND_STATE_CREATE_RASTERIZATION_ORDER_ATTACHMENT_ACCESS_BIT_ARM  = 1
 *     }
 */
@Suppress("unused")
@JvmInline
value class PipelineColorBlendStateCreateFlags(val value: Int) {
	
	
	companion object {
		
		val RASTERIZATION_ORDER_ATTACHMENT_ACCESS = PipelineColorBlendStateCreateFlags(1)
	
	}
	
	
	
	operator fun plus(mask: PipelineColorBlendStateCreateFlags) = PipelineColorBlendStateCreateFlags(value or mask.value)
	
	operator fun contains(mask: PipelineColorBlendStateCreateFlags) = value and mask.value == mask.value


}