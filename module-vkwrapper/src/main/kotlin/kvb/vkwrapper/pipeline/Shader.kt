package kvb.vkwrapper.pipeline

import kvb.vkwrapper.handle.ShaderModule
import kvb.vulkan.ShaderStageFlags

/**
 * A single shader stage.
 */
class Shader(
	val module     : ShaderModule,
	val stage      : ShaderStageFlags,
	val entryPoint : String
)