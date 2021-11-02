// This file has been automatically generated.

package kvb.vulkan

/**
 *     enum VkDebugUtilsMessageSeverityFlagBitsEXT {
 *         VK_DEBUG_UTILS_MESSAGE_SEVERITY_VERBOSE_BIT_EXT  = 1
 *         VK_DEBUG_UTILS_MESSAGE_SEVERITY_INFO_BIT_EXT     = 16
 *         VK_DEBUG_UTILS_MESSAGE_SEVERITY_WARNING_BIT_EXT  = 256
 *         VK_DEBUG_UTILS_MESSAGE_SEVERITY_ERROR_BIT_EXT    = 4096
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class DebugUtilsMessageSeverityFlags(val value: Int) {
	
	
	companion object {
		
		val VERBOSE = DebugUtilsMessageSeverityFlags(1)
		
		val INFO = DebugUtilsMessageSeverityFlags(16)
		
		val WARNING = DebugUtilsMessageSeverityFlags(256)
		
		val ERROR = DebugUtilsMessageSeverityFlags(4096)
	
	}
	
	
	
	operator fun plus(mask: DebugUtilsMessageSeverityFlags) = DebugUtilsMessageSeverityFlags(value or mask.value)
	
	operator fun contains(mask: DebugUtilsMessageSeverityFlags) = value and mask.value == mask.value


}