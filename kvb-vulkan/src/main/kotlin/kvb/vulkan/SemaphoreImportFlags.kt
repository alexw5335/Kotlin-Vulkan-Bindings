// This file has been automatically generated.

package kvb.vulkan

/**
 *     enum VkSemaphoreImportFlagBits {
 *         VK_SEMAPHORE_IMPORT_TEMPORARY_BIT      = 1
 *         VK_SEMAPHORE_IMPORT_TEMPORARY_BIT_KHR  = 1
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class SemaphoreImportFlags(val value: Int) {
	
	
	companion object {
		
		val TEMPORARY = SemaphoreImportFlags(1)
	
	}
	
	
	
	operator fun plus(mask: SemaphoreImportFlags) = SemaphoreImportFlags(value or mask.value)
	
	operator fun contains(mask: SemaphoreImportFlags) = value and mask.value == mask.value


}