// This file has been automatically generated.

package kvb.vulkan

/**
 *     // provided by VK_EXT_pipeline_creation_feedback

 *     enum VkPipelineCreationFeedbackFlagBitsEXT {
 *         VK_PIPELINE_CREATION_FEEDBACK_VALID_BIT_EXT                           = 1
 *         VK_PIPELINE_CREATION_FEEDBACK_APPLICATION_PIPELINE_CACHE_HIT_BIT_EXT  = 2
 *         VK_PIPELINE_CREATION_FEEDBACK_BASE_PIPELINE_ACCELERATION_BIT_EXT      = 4
 *     }
 */
@Suppress("unused")
@JvmInline
value class PipelineCreationFeedbackFlags(val value: Int) {
	
	
	companion object {
		
		val VALID = PipelineCreationFeedbackFlags(1)
		
		val APPLICATION_PIPELINE_CACHE_HIT = PipelineCreationFeedbackFlags(2)
		
		val BASE_PIPELINE_ACCELERATION = PipelineCreationFeedbackFlags(4)
	
	}
	
	
	
	operator fun plus(mask: PipelineCreationFeedbackFlags) = PipelineCreationFeedbackFlags(value or mask.value)
	
	operator fun contains(mask: PipelineCreationFeedbackFlags) = value and mask.value == mask.value


}