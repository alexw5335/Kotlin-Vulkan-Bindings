// This file has been automatically generated.

package kvb.vulkan

/**
 *     // provided by VK_VERSION_1_0

 *     enum VkSparseMemoryBindFlagBits {
 *         VK_SPARSE_MEMORY_BIND_METADATA_BIT  = 1
 *     }
 */
@Suppress("unused")
@JvmInline
value class SparseMemoryBindFlags(val value: Int) {
	
	
	companion object {
		
		val METADATA = SparseMemoryBindFlags(1)
	
	}
	
	
	
	operator fun plus(mask: SparseMemoryBindFlags) = SparseMemoryBindFlags(value or mask.value)
	
	operator fun contains(mask: SparseMemoryBindFlags) = value and mask.value == mask.value


}