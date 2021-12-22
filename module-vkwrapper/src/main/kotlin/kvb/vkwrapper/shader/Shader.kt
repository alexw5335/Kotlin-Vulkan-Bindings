package kvb.vkwrapper.shader

import kvb.vkwrapper.handle.ShaderModule
import kvb.vulkan.ShaderStageFlags

class Shader(
	val module: ShaderModule,
	val stage: ShaderStageFlags,
	val defaultEntryPoint: String = "main"
)