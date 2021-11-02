// This file has been automatically generated.

package kvb.vulkan

/**
 *     enum VkSparseImageFormatFlagBits {
 *         VK_SPARSE_IMAGE_FORMAT_SINGLE_MIPTAIL_BIT          = 1
 *         VK_SPARSE_IMAGE_FORMAT_ALIGNED_MIP_SIZE_BIT        = 2
 *         VK_SPARSE_IMAGE_FORMAT_NONSTANDARD_BLOCK_SIZE_BIT  = 4
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class SparseImageFormatFlags(val value: Int) {
	
	
	companion object {
		
		val SINGLE_MIPTAIL = SparseImageFormatFlags(1)
		
		val ALIGNED_MIP_SIZE = SparseImageFormatFlags(2)
		
		val NONSTANDARD_BLOCK_SIZE = SparseImageFormatFlags(4)
	
	}
	
	
	
	operator fun plus(mask: SparseImageFormatFlags) = SparseImageFormatFlags(value or mask.value)
	
	operator fun contains(mask: SparseImageFormatFlags) = value and mask.value == mask.value


}