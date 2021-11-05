// This file has been automatically generated.

package kvb.vulkan

/**
 *     enum VkExternalMemoryHandleTypeFlagBits {
 *         VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD_BIT                        = 1
 *         VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT                     = 2
 *         VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT                 = 4
 *         VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT                    = 8
 *         VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_KMT_BIT                = 16
 *         VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT                       = 32
 *         VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT                   = 64
 *         VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD_BIT_KHR                    = 1
 *         VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR                 = 2
 *         VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHR             = 4
 *         VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT_KHR                = 8
 *         VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_KMT_BIT_KHR            = 16
 *         VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT_KHR                   = 32
 *         VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT_KHR               = 64
 *         VK_EXTERNAL_MEMORY_HANDLE_TYPE_DMA_BUF_BIT_EXT                      = 512
 *         VK_EXTERNAL_MEMORY_HANDLE_TYPE_ANDROID_HARDWARE_BUFFER_BIT_ANDROID  = 1024
 *         VK_EXTERNAL_MEMORY_HANDLE_TYPE_HOST_ALLOCATION_BIT_EXT              = 128
 *         VK_EXTERNAL_MEMORY_HANDLE_TYPE_HOST_MAPPED_FOREIGN_MEMORY_BIT_EXT   = 256
 *         VK_EXTERNAL_MEMORY_HANDLE_TYPE_ZIRCON_VMO_BIT_FUCHSIA               = 2048
 *     }
 */
@Suppress("unused")
@JvmInline
value class ExternalMemoryHandleTypeFlags(val value: Int) {
	
	
	companion object {
		
		val OPAQUE_FD = ExternalMemoryHandleTypeFlags(1)
		
		val OPAQUE_WIN32 = ExternalMemoryHandleTypeFlags(2)
		
		val OPAQUE_WIN32_KMT = ExternalMemoryHandleTypeFlags(4)
		
		val D3D11_TEXTURE = ExternalMemoryHandleTypeFlags(8)
		
		val D3D11_TEXTURE_KMT = ExternalMemoryHandleTypeFlags(16)
		
		val D3D12_HEAP = ExternalMemoryHandleTypeFlags(32)
		
		val D3D12_RESOURCE = ExternalMemoryHandleTypeFlags(64)
		
		val DMA_BUF = ExternalMemoryHandleTypeFlags(512)
		
		val ANDROID_HARDWARE_BUFFER = ExternalMemoryHandleTypeFlags(1024)
		
		val HOST_ALLOCATION = ExternalMemoryHandleTypeFlags(128)
		
		val HOST_MAPPED_FOREIGN_MEMORY = ExternalMemoryHandleTypeFlags(256)
		
		val ZIRCON_VMO = ExternalMemoryHandleTypeFlags(2048)
	
	}
	
	
	
	operator fun plus(mask: ExternalMemoryHandleTypeFlags) = ExternalMemoryHandleTypeFlags(value or mask.value)
	
	operator fun contains(mask: ExternalMemoryHandleTypeFlags) = value and mask.value == mask.value


}