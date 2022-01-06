// This file has been automatically generated.

package kvb.vulkan

/**
 *     // provided by VK_ARM_rasterization_order_attachment_access

 *     enum VkPipelineDepthStencilStateCreateFlagBits {
 *         VK_PIPELINE_DEPTH_STENCIL_STATE_CREATE_RASTERIZATION_ORDER_ATTACHMENT_DEPTH_ACCESS_BIT_ARM    = 1
 *         VK_PIPELINE_DEPTH_STENCIL_STATE_CREATE_RASTERIZATION_ORDER_ATTACHMENT_STENCIL_ACCESS_BIT_ARM  = 2
 *     }
 */
@Suppress("unused")
@JvmInline
value class PipelineDepthStencilStateCreateFlags(val value: Int) {
	
	
	companion object {
		
		val RASTERIZATION_ORDER_ATTACHMENT_DEPTH_ACCESS = PipelineDepthStencilStateCreateFlags(1)
		
		val RASTERIZATION_ORDER_ATTACHMENT_STENCIL_ACCESS = PipelineDepthStencilStateCreateFlags(2)
	
	}
	
	
	
	operator fun plus(mask: PipelineDepthStencilStateCreateFlags) = PipelineDepthStencilStateCreateFlags(value or mask.value)
	
	operator fun contains(mask: PipelineDepthStencilStateCreateFlags) = value and mask.value == mask.value


}