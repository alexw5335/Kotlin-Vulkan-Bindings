// This file has been automatically generated.

package kvb.vulkan

/**
 *     // provided by VK_VERSION_1_1

 *     enum VkExternalSemaphoreHandleTypeFlagBits {
 *         VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD_BIT             = 1
 *         VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_BIT          = 2
 *         VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT      = 4
 *         VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE_BIT           = 8
 *         VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D11_FENCE_BIT           = 8
 *         VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_SYNC_FD_BIT               = 16
 *         VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD_BIT_KHR         = 1
 *         VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR      = 2
 *         VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHR  = 4
 *         VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE_BIT_KHR       = 8
 *         VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_SYNC_FD_BIT_KHR           = 16
 *         VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_ZIRCON_EVENT_BIT_FUCHSIA  = 128
 *         VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_RESERVED_5_BIT_NV         = 32
 *         VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_RESERVED_6_BIT_NV         = 64
 *     }
 */
@Suppress("unused")
@JvmInline
value class ExternalSemaphoreHandleTypeFlags(val value: Int) {
	
	
	companion object {
		
		val OPAQUE_FD = ExternalSemaphoreHandleTypeFlags(1)
		
		val OPAQUE_WIN32 = ExternalSemaphoreHandleTypeFlags(2)
		
		val OPAQUE_WIN32_KMT = ExternalSemaphoreHandleTypeFlags(4)
		
		val D3D12_FENCE = ExternalSemaphoreHandleTypeFlags(8)
		
		val SYNC_FD = ExternalSemaphoreHandleTypeFlags(16)
		
		val ZIRCON_EVENT = ExternalSemaphoreHandleTypeFlags(128)
	
	}
	
	
	
	operator fun plus(mask: ExternalSemaphoreHandleTypeFlags) = ExternalSemaphoreHandleTypeFlags(value or mask.value)
	
	operator fun contains(mask: ExternalSemaphoreHandleTypeFlags) = value and mask.value == mask.value


}