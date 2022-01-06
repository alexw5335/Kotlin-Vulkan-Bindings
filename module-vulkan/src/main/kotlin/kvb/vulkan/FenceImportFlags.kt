// This file has been automatically generated.

package kvb.vulkan

/**
 *     // provided by VK_VERSION_1_1

 *     enum VkFenceImportFlagBits {
 *         VK_FENCE_IMPORT_TEMPORARY_BIT      = 1
 *         VK_FENCE_IMPORT_TEMPORARY_BIT_KHR  = 1
 *     }
 */
@Suppress("unused")
@JvmInline
value class FenceImportFlags(val value: Int) {
	
	
	companion object {
		
		val TEMPORARY = FenceImportFlags(1)
	
	}
	
	
	
	operator fun plus(mask: FenceImportFlags) = FenceImportFlags(value or mask.value)
	
	operator fun contains(mask: FenceImportFlags) = value and mask.value == mask.value


}