// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkExternalSemaphoreHandleTypeFlagBits {
 *         OPAQUE_FD             = 1
 *         OPAQUE_WIN32          = 2
 *         OPAQUE_WIN32_KMT      = 4
 *         D3D12_FENCE           = 8
 *         D3D11_FENCE           = 8
 *         SYNC_FD               = 16
 *         OPAQUE_FD_KHR         = 1
 *         OPAQUE_WIN32_KHR      = 2
 *         OPAQUE_WIN32_KMT_KHR  = 4
 *         D3D12_FENCE_KHR       = 8
 *         SYNC_FD_KHR           = 16
 *         ZIRCON_EVENT          = 128
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class ExternalSemaphoreHandleTypeFlags(val bitfield: Int) {
	
	
	val is_OPAQUE_FD get() = bitfield and 1 != 0
	val is_OPAQUE_WIN32 get() = bitfield and 2 != 0
	val is_OPAQUE_WIN32_KMT get() = bitfield and 4 != 0
	val is_D3D12_FENCE get() = bitfield and 8 != 0
	val is_D3D11_FENCE get() = bitfield and 8 != 0
	val is_SYNC_FD get() = bitfield and 16 != 0
	val is_OPAQUE_FD_KHR get() = bitfield and 1 != 0
	val is_OPAQUE_WIN32_KHR get() = bitfield and 2 != 0
	val is_OPAQUE_WIN32_KMT_KHR get() = bitfield and 4 != 0
	val is_D3D12_FENCE_KHR get() = bitfield and 8 != 0
	val is_SYNC_FD_KHR get() = bitfield and 16 != 0
	val is_ZIRCON_EVENT get() = bitfield and 128 != 0
	
	
	
	infix operator fun plus(other: ExternalSemaphoreHandleTypeFlags) = ExternalSemaphoreHandleTypeFlags(bitfield or other.bitfield)
	
	infix operator fun plus(other: Int) = ExternalSemaphoreHandleTypeFlags(bitfield or other)
	
	infix fun containsAll(mask: ExternalSemaphoreHandleTypeFlags) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Int) = bitfield and mask == mask
	
	infix fun containsSome(mask: ExternalSemaphoreHandleTypeFlags) = bitfield and mask.bitfield != 0
	
	infix fun containsSome(mask: Int) = bitfield and mask != 0
	
	
	
	override fun toString() = buildString {
		append("{ ")
		if(is_OPAQUE_FD) append("OPAQUE_FD, ")
		if(is_OPAQUE_WIN32) append("OPAQUE_WIN32, ")
		if(is_OPAQUE_WIN32_KMT) append("OPAQUE_WIN32_KMT, ")
		if(is_D3D12_FENCE) append("D3D12_FENCE, ")
		if(is_D3D11_FENCE) append("D3D11_FENCE, ")
		if(is_SYNC_FD) append("SYNC_FD, ")
		if(is_OPAQUE_FD_KHR) append("OPAQUE_FD_KHR, ")
		if(is_OPAQUE_WIN32_KHR) append("OPAQUE_WIN32_KHR, ")
		if(is_OPAQUE_WIN32_KMT_KHR) append("OPAQUE_WIN32_KMT_KHR, ")
		if(is_D3D12_FENCE_KHR) append("D3D12_FENCE_KHR, ")
		if(is_SYNC_FD_KHR) append("SYNC_FD_KHR, ")
		if(is_ZIRCON_EVENT) append("ZIRCON_EVENT, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = ExternalSemaphoreHandleTypeFlags(0)
		val ALL get() = ExternalSemaphoreHandleTypeFlags(198)
		val OPAQUE_FD get() = ExternalSemaphoreHandleTypeFlags(1)
		val OPAQUE_WIN32 get() = ExternalSemaphoreHandleTypeFlags(2)
		val OPAQUE_WIN32_KMT get() = ExternalSemaphoreHandleTypeFlags(4)
		val D3D12_FENCE get() = ExternalSemaphoreHandleTypeFlags(8)
		val D3D11_FENCE get() = ExternalSemaphoreHandleTypeFlags(8)
		val SYNC_FD get() = ExternalSemaphoreHandleTypeFlags(16)
		val OPAQUE_FD_KHR get() = ExternalSemaphoreHandleTypeFlags(1)
		val OPAQUE_WIN32_KHR get() = ExternalSemaphoreHandleTypeFlags(2)
		val OPAQUE_WIN32_KMT_KHR get() = ExternalSemaphoreHandleTypeFlags(4)
		val D3D12_FENCE_KHR get() = ExternalSemaphoreHandleTypeFlags(8)
		val SYNC_FD_KHR get() = ExternalSemaphoreHandleTypeFlags(16)
		val ZIRCON_EVENT get() = ExternalSemaphoreHandleTypeFlags(128)
		
		inline fun compose(block: Companion.() -> ExternalSemaphoreHandleTypeFlags) = block(Companion)
	
	}


}