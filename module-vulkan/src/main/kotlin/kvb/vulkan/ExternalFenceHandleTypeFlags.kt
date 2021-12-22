// This file has been automatically generated.

package kvb.vulkan

/**
 *     enum VkExternalFenceHandleTypeFlagBits {
 *         VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_FD_BIT             = 1
 *         VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT          = 2
 *         VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT      = 4
 *         VK_EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT               = 8
 *         VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_FD_BIT_KHR         = 1
 *         VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR      = 2
 *         VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHR  = 4
 *         VK_EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT_KHR           = 8
 *         VK_EXTERNAL_FENCE_HANDLE_TYPE_RESERVED_4_BIT_NV         = 16
 *         VK_EXTERNAL_FENCE_HANDLE_TYPE_RESERVED_5_BIT_NV         = 32
 *     }
 */
@Suppress("unused")
@JvmInline
value class ExternalFenceHandleTypeFlags(val value: Int) {
	
	
	companion object {
		
		val OPAQUE_FD = ExternalFenceHandleTypeFlags(1)
		
		val OPAQUE_WIN32 = ExternalFenceHandleTypeFlags(2)
		
		val OPAQUE_WIN32_KMT = ExternalFenceHandleTypeFlags(4)
		
		val SYNC_FD = ExternalFenceHandleTypeFlags(8)
	
	}
	
	
	
	operator fun plus(mask: ExternalFenceHandleTypeFlags) = ExternalFenceHandleTypeFlags(value or mask.value)
	
	operator fun contains(mask: ExternalFenceHandleTypeFlags) = value and mask.value == mask.value


}