// This file has been automatically generated.

package kvb.vulkan

/**
 *     enum VkShaderStageFlagBits {
 *         VK_SHADER_STAGE_VERTEX_BIT                   = 1
 *         VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT     = 2
 *         VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT  = 4
 *         VK_SHADER_STAGE_GEOMETRY_BIT                 = 8
 *         VK_SHADER_STAGE_FRAGMENT_BIT                 = 16
 *         VK_SHADER_STAGE_COMPUTE_BIT                  = 32
 *         VK_SHADER_STAGE_ALL_GRAPHICS                 = 0x0000001F
 *         VK_SHADER_STAGE_ALL                          = 0x7FFFFFFF
 *         VK_SHADER_STAGE_RAYGEN_BIT_KHR               = 256
 *         VK_SHADER_STAGE_ANY_HIT_BIT_KHR              = 512
 *         VK_SHADER_STAGE_CLOSEST_HIT_BIT_KHR          = 1024
 *         VK_SHADER_STAGE_MISS_BIT_KHR                 = 2048
 *         VK_SHADER_STAGE_INTERSECTION_BIT_KHR         = 4096
 *         VK_SHADER_STAGE_CALLABLE_BIT_KHR             = 8192
 *         VK_SHADER_STAGE_RAYGEN_BIT_NV                = 256
 *         VK_SHADER_STAGE_ANY_HIT_BIT_NV               = 512
 *         VK_SHADER_STAGE_CLOSEST_HIT_BIT_NV           = 1024
 *         VK_SHADER_STAGE_MISS_BIT_NV                  = 2048
 *         VK_SHADER_STAGE_INTERSECTION_BIT_NV          = 4096
 *         VK_SHADER_STAGE_CALLABLE_BIT_NV              = 8192
 *         VK_SHADER_STAGE_TASK_BIT_NV                  = 64
 *         VK_SHADER_STAGE_MESH_BIT_NV                  = 128
 *     }
 */
@Suppress("unused")
@JvmInline
value class ShaderStageFlags(val value: Int) {
	
	
	companion object {
		
		val VERTEX = ShaderStageFlags(1)
		
		val TESSELLATION_CONTROL = ShaderStageFlags(2)
		
		val TESSELLATION_EVALUATION = ShaderStageFlags(4)
		
		val GEOMETRY = ShaderStageFlags(8)
		
		val FRAGMENT = ShaderStageFlags(16)
		
		val COMPUTE = ShaderStageFlags(32)
		
		val ALL_GRAPHICS = ShaderStageFlags(0x0000001F)
		
		val ALL = ShaderStageFlags(0x7FFFFFFF)
		
		val RAYGEN = ShaderStageFlags(256)
		
		val ANY_HIT = ShaderStageFlags(512)
		
		val CLOSEST_HIT = ShaderStageFlags(1024)
		
		val MISS = ShaderStageFlags(2048)
		
		val INTERSECTION = ShaderStageFlags(4096)
		
		val CALLABLE = ShaderStageFlags(8192)
		
		val TASK = ShaderStageFlags(64)
		
		val MESH = ShaderStageFlags(128)
	
	}
	
	
	
	operator fun plus(mask: ShaderStageFlags) = ShaderStageFlags(value or mask.value)
	
	operator fun contains(mask: ShaderStageFlags) = value and mask.value == mask.value


}