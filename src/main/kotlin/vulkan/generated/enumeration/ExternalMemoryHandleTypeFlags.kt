// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkExternalMemoryHandleTypeFlagBits {
 *         OPAQUE_FD                   = 1
 *         OPAQUE_WIN32                = 2
 *         OPAQUE_WIN32_KMT            = 4
 *         D3D11_TEXTURE               = 8
 *         D3D11_TEXTURE_KMT           = 16
 *         D3D12_HEAP                  = 32
 *         D3D12_RESOURCE              = 64
 *         OPAQUE_FD_KHR               = 1
 *         OPAQUE_WIN32_KHR            = 2
 *         OPAQUE_WIN32_KMT_KHR        = 4
 *         D3D11_TEXTURE_KHR           = 8
 *         D3D11_TEXTURE_KMT_KHR       = 16
 *         D3D12_HEAP_KHR              = 32
 *         D3D12_RESOURCE_KHR          = 64
 *         DMA_BUF                     = 512
 *         ANDROID_HARDWARE_BUFFER     = 1024
 *         HOST_ALLOCATION             = 128
 *         HOST_MAPPED_FOREIGN_MEMORY  = 256
 *         ZIRCON_VMO                  = 2048
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class ExternalMemoryHandleTypeFlags(val bitfield: Int) {
	
	
	val is_OPAQUE_FD get() = bitfield and 1 != 0
	val is_OPAQUE_WIN32 get() = bitfield and 2 != 0
	val is_OPAQUE_WIN32_KMT get() = bitfield and 4 != 0
	val is_D3D11_TEXTURE get() = bitfield and 8 != 0
	val is_D3D11_TEXTURE_KMT get() = bitfield and 16 != 0
	val is_D3D12_HEAP get() = bitfield and 32 != 0
	val is_D3D12_RESOURCE get() = bitfield and 64 != 0
	val is_OPAQUE_FD_KHR get() = bitfield and 1 != 0
	val is_OPAQUE_WIN32_KHR get() = bitfield and 2 != 0
	val is_OPAQUE_WIN32_KMT_KHR get() = bitfield and 4 != 0
	val is_D3D11_TEXTURE_KHR get() = bitfield and 8 != 0
	val is_D3D11_TEXTURE_KMT_KHR get() = bitfield and 16 != 0
	val is_D3D12_HEAP_KHR get() = bitfield and 32 != 0
	val is_D3D12_RESOURCE_KHR get() = bitfield and 64 != 0
	val is_DMA_BUF get() = bitfield and 512 != 0
	val is_ANDROID_HARDWARE_BUFFER get() = bitfield and 1024 != 0
	val is_HOST_ALLOCATION get() = bitfield and 128 != 0
	val is_HOST_MAPPED_FOREIGN_MEMORY get() = bitfield and 256 != 0
	val is_ZIRCON_VMO get() = bitfield and 2048 != 0
	
	
	
	infix operator fun plus(other: ExternalMemoryHandleTypeFlags) = ExternalMemoryHandleTypeFlags(bitfield or other.bitfield)
	
	infix operator fun plus(other: Int) = ExternalMemoryHandleTypeFlags(bitfield or other)
	
	infix fun containsAll(mask: ExternalMemoryHandleTypeFlags) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Int) = bitfield and mask == mask
	
	infix fun containsSome(mask: ExternalMemoryHandleTypeFlags) = bitfield and mask.bitfield != 0
	
	infix fun containsSome(mask: Int) = bitfield and mask != 0
	
	
	
	override fun toString() = buildString {
		append("{ ")
		if(is_OPAQUE_FD) append("OPAQUE_FD, ")
		if(is_OPAQUE_WIN32) append("OPAQUE_WIN32, ")
		if(is_OPAQUE_WIN32_KMT) append("OPAQUE_WIN32_KMT, ")
		if(is_D3D11_TEXTURE) append("D3D11_TEXTURE, ")
		if(is_D3D11_TEXTURE_KMT) append("D3D11_TEXTURE_KMT, ")
		if(is_D3D12_HEAP) append("D3D12_HEAP, ")
		if(is_D3D12_RESOURCE) append("D3D12_RESOURCE, ")
		if(is_OPAQUE_FD_KHR) append("OPAQUE_FD_KHR, ")
		if(is_OPAQUE_WIN32_KHR) append("OPAQUE_WIN32_KHR, ")
		if(is_OPAQUE_WIN32_KMT_KHR) append("OPAQUE_WIN32_KMT_KHR, ")
		if(is_D3D11_TEXTURE_KHR) append("D3D11_TEXTURE_KHR, ")
		if(is_D3D11_TEXTURE_KMT_KHR) append("D3D11_TEXTURE_KMT_KHR, ")
		if(is_D3D12_HEAP_KHR) append("D3D12_HEAP_KHR, ")
		if(is_D3D12_RESOURCE_KHR) append("D3D12_RESOURCE_KHR, ")
		if(is_DMA_BUF) append("DMA_BUF, ")
		if(is_ANDROID_HARDWARE_BUFFER) append("ANDROID_HARDWARE_BUFFER, ")
		if(is_HOST_ALLOCATION) append("HOST_ALLOCATION, ")
		if(is_HOST_MAPPED_FOREIGN_MEMORY) append("HOST_MAPPED_FOREIGN_MEMORY, ")
		if(is_ZIRCON_VMO) append("ZIRCON_VMO, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = ExternalMemoryHandleTypeFlags(0)
		val ALL get() = ExternalMemoryHandleTypeFlags(4222)
		val OPAQUE_FD get() = ExternalMemoryHandleTypeFlags(1)
		val OPAQUE_WIN32 get() = ExternalMemoryHandleTypeFlags(2)
		val OPAQUE_WIN32_KMT get() = ExternalMemoryHandleTypeFlags(4)
		val D3D11_TEXTURE get() = ExternalMemoryHandleTypeFlags(8)
		val D3D11_TEXTURE_KMT get() = ExternalMemoryHandleTypeFlags(16)
		val D3D12_HEAP get() = ExternalMemoryHandleTypeFlags(32)
		val D3D12_RESOURCE get() = ExternalMemoryHandleTypeFlags(64)
		val OPAQUE_FD_KHR get() = ExternalMemoryHandleTypeFlags(1)
		val OPAQUE_WIN32_KHR get() = ExternalMemoryHandleTypeFlags(2)
		val OPAQUE_WIN32_KMT_KHR get() = ExternalMemoryHandleTypeFlags(4)
		val D3D11_TEXTURE_KHR get() = ExternalMemoryHandleTypeFlags(8)
		val D3D11_TEXTURE_KMT_KHR get() = ExternalMemoryHandleTypeFlags(16)
		val D3D12_HEAP_KHR get() = ExternalMemoryHandleTypeFlags(32)
		val D3D12_RESOURCE_KHR get() = ExternalMemoryHandleTypeFlags(64)
		val DMA_BUF get() = ExternalMemoryHandleTypeFlags(512)
		val ANDROID_HARDWARE_BUFFER get() = ExternalMemoryHandleTypeFlags(1024)
		val HOST_ALLOCATION get() = ExternalMemoryHandleTypeFlags(128)
		val HOST_MAPPED_FOREIGN_MEMORY get() = ExternalMemoryHandleTypeFlags(256)
		val ZIRCON_VMO get() = ExternalMemoryHandleTypeFlags(2048)
		
		inline fun compose(block: Companion.() -> ExternalMemoryHandleTypeFlags) = block(Companion)
	
	}


}