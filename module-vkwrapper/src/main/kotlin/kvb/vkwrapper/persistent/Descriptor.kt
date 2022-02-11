package kvb.vkwrapper.persistent

import kvb.vulkan.DescriptorType
import kvb.vulkan.ShaderStageFlags

class Descriptor(
	val binding : Int,
	val type    : DescriptorType,
	val count   : Int,
	val stages  : ShaderStageFlags
)