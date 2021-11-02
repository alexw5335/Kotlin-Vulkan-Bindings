// This file has been automatically generated.

package kvb.vulkan

/**
 *     enum VkPipelineShaderStageCreateFlagBits {
 *         VK_PIPELINE_SHADER_STAGE_CREATE_RESERVED_2_BIT_NV                    = 4
 *         VK_PIPELINE_SHADER_STAGE_CREATE_ALLOW_VARYING_SUBGROUP_SIZE_BIT_EXT  = 1
 *         VK_PIPELINE_SHADER_STAGE_CREATE_REQUIRE_FULL_SUBGROUPS_BIT_EXT       = 2
 *         VK_PIPELINE_SHADER_STAGE_CREATE_RESERVED_3_BIT_KHR                   = 8
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class PipelineShaderStageCreateFlags(val value: Int) {
	
	
	companion object {
		
		val ALLOW_VARYING_SUBGROUP_SIZE = PipelineShaderStageCreateFlags(1)
		
		val REQUIRE_FULL_SUBGROUPS = PipelineShaderStageCreateFlags(2)
	
	}
	
	
	
	operator fun plus(mask: PipelineShaderStageCreateFlags) = PipelineShaderStageCreateFlags(value or mask.value)
	
	operator fun contains(mask: PipelineShaderStageCreateFlags) = value and mask.value == mask.value


}