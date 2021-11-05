// This file has been automatically generated.

package kvb.vulkan

/**
 *     enum VkShaderModuleCreateFlagBits {
 *         VK_SHADER_MODULE_CREATE_RESERVED_0_BIT_NV  = 1
 *     }
 */
@Suppress("unused")
@JvmInline
value class ShaderModuleCreateFlags(val value: Int) {
	
	
	companion object {
	
	}
	
	
	
	operator fun plus(mask: ShaderModuleCreateFlags) = ShaderModuleCreateFlags(value or mask.value)
	
	operator fun contains(mask: ShaderModuleCreateFlags) = value and mask.value == mask.value


}