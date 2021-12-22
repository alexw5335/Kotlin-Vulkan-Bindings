// This file has been automatically generated.

package kvb.vulkan

/**
 *     enum VkIndirectStateFlagBitsNV {
 *         VK_INDIRECT_STATE_FLAG_FRONTFACE_BIT_NV  = 1
 *     }
 */
@Suppress("unused")
@JvmInline
value class IndirectStateFlags(val value: Int) {
	
	
	companion object {
		
		val FLAG_FRONTFACE = IndirectStateFlags(1)
	
	}
	
	
	
	operator fun plus(mask: IndirectStateFlags) = IndirectStateFlags(value or mask.value)
	
	operator fun contains(mask: IndirectStateFlags) = value and mask.value == mask.value


}