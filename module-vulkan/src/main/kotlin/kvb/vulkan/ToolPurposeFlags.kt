// This file has been automatically generated.

package kvb.vulkan

/**
 *     enum VkToolPurposeFlagBitsEXT {
 *         VK_TOOL_PURPOSE_VALIDATION_BIT_EXT           = 1
 *         VK_TOOL_PURPOSE_PROFILING_BIT_EXT            = 2
 *         VK_TOOL_PURPOSE_TRACING_BIT_EXT              = 4
 *         VK_TOOL_PURPOSE_ADDITIONAL_FEATURES_BIT_EXT  = 8
 *         VK_TOOL_PURPOSE_MODIFYING_FEATURES_BIT_EXT   = 16
 *         VK_TOOL_PURPOSE_DEBUG_REPORTING_BIT_EXT      = 32
 *         VK_TOOL_PURPOSE_DEBUG_MARKERS_BIT_EXT        = 64
 *     }
 */
@Suppress("unused")
@JvmInline
value class ToolPurposeFlags(val value: Int) {
	
	
	companion object {
		
		val VALIDATION = ToolPurposeFlags(1)
		
		val PROFILING = ToolPurposeFlags(2)
		
		val TRACING = ToolPurposeFlags(4)
		
		val ADDITIONAL_FEATURES = ToolPurposeFlags(8)
		
		val MODIFYING_FEATURES = ToolPurposeFlags(16)
		
		val DEBUG_REPORTING = ToolPurposeFlags(32)
		
		val DEBUG_MARKERS = ToolPurposeFlags(64)
	
	}
	
	
	
	operator fun plus(mask: ToolPurposeFlags) = ToolPurposeFlags(value or mask.value)
	
	operator fun contains(mask: ToolPurposeFlags) = value and mask.value == mask.value


}