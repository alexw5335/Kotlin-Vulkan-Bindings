package kvb.vkwrapper.persistent

import kvb.vulkan.ShaderStageFlags

class PushConstant(
	val stages : ShaderStageFlags,
	val offset : Int,
	val size   : Int
)