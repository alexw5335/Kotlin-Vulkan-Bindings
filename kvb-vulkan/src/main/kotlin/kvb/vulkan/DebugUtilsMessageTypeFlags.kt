// This file has been automatically generated.

package kvb.vulkan

/**
 *     enum VkDebugUtilsMessageTypeFlagBitsEXT {
 *         VK_DEBUG_UTILS_MESSAGE_TYPE_GENERAL_BIT_EXT      = 1
 *         VK_DEBUG_UTILS_MESSAGE_TYPE_VALIDATION_BIT_EXT   = 2
 *         VK_DEBUG_UTILS_MESSAGE_TYPE_PERFORMANCE_BIT_EXT  = 4
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class DebugUtilsMessageTypeFlags(val value: Int) {
	
	
	companion object {
		
		val GENERAL = DebugUtilsMessageTypeFlags(1)
		
		val VALIDATION = DebugUtilsMessageTypeFlags(2)
		
		val PERFORMANCE = DebugUtilsMessageTypeFlags(4)
	
	}
	
	
	
	operator fun plus(mask: DebugUtilsMessageTypeFlags) = DebugUtilsMessageTypeFlags(value or mask.value)
	
	operator fun contains(mask: DebugUtilsMessageTypeFlags) = value and mask.value == mask.value


}