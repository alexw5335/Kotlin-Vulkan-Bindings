package vulkan.wrapper.exception

import vulkan.generated.enumeration.Result

class VkCommandException(val result: Result) : VkException("Vulkan command failed with result: $result")