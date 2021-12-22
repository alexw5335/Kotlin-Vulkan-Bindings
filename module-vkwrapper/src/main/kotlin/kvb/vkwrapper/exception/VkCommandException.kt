package kvb.vkwrapper.exception

import kvb.vulkan.*

class VkCommandException(val result: Result) : VkException("Vulkan command failed with result: $result")