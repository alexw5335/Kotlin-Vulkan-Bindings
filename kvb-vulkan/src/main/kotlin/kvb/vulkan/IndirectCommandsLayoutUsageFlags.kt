// This file has been automatically generated.

package kvb.vulkan

/**
 *     enum VkIndirectCommandsLayoutUsageFlagBitsNV {
 *         VK_INDIRECT_COMMANDS_LAYOUT_USAGE_EXPLICIT_PREPROCESS_BIT_NV  = 1
 *         VK_INDIRECT_COMMANDS_LAYOUT_USAGE_INDEXED_SEQUENCES_BIT_NV    = 2
 *         VK_INDIRECT_COMMANDS_LAYOUT_USAGE_UNORDERED_SEQUENCES_BIT_NV  = 4
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class IndirectCommandsLayoutUsageFlags(val value: Int) {
	
	
	companion object {
		
		val EXPLICIT_PREPROCESS = IndirectCommandsLayoutUsageFlags(1)
		
		val INDEXED_SEQUENCES = IndirectCommandsLayoutUsageFlags(2)
		
		val UNORDERED_SEQUENCES = IndirectCommandsLayoutUsageFlags(4)
	
	}
	
	
	
	operator fun plus(mask: IndirectCommandsLayoutUsageFlags) = IndirectCommandsLayoutUsageFlags(value or mask.value)
	
	operator fun contains(mask: IndirectCommandsLayoutUsageFlags) = value and mask.value == mask.value


}