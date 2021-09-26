// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkExternalFenceHandleTypeFlagBits {
 *         OPAQUE_FD             = 1
 *         OPAQUE_WIN32          = 2
 *         OPAQUE_WIN32_KMT      = 4
 *         SYNC_FD               = 8
 *         OPAQUE_FD_KHR         = 1
 *         OPAQUE_WIN32_KHR      = 2
 *         OPAQUE_WIN32_KMT_KHR  = 4
 *         SYNC_FD_KHR           = 8
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class ExternalFenceHandleTypeFlags(val bitfield: Int) {
	
	
	val is_OPAQUE_FD get() = bitfield and 1 != 0
	val is_OPAQUE_WIN32 get() = bitfield and 2 != 0
	val is_OPAQUE_WIN32_KMT get() = bitfield and 4 != 0
	val is_SYNC_FD get() = bitfield and 8 != 0
	val is_OPAQUE_FD_KHR get() = bitfield and 1 != 0
	val is_OPAQUE_WIN32_KHR get() = bitfield and 2 != 0
	val is_OPAQUE_WIN32_KMT_KHR get() = bitfield and 4 != 0
	val is_SYNC_FD_KHR get() = bitfield and 8 != 0
	
	
	
	infix operator fun plus(other: ExternalFenceHandleTypeFlags) = ExternalFenceHandleTypeFlags(bitfield or other.bitfield)
	
	infix operator fun plus(other: Int) = ExternalFenceHandleTypeFlags(bitfield or other)
	
	infix fun containsAll(mask: ExternalFenceHandleTypeFlags) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Int) = bitfield and mask == mask
	
	infix fun containsSome(mask: ExternalFenceHandleTypeFlags) = bitfield and mask.bitfield != 0
	
	infix fun containsSome(mask: Int) = bitfield and mask != 0
	
	
	
	override fun toString() = buildString {
		append("{ ")
		if(is_OPAQUE_FD) append("OPAQUE_FD, ")
		if(is_OPAQUE_WIN32) append("OPAQUE_WIN32, ")
		if(is_OPAQUE_WIN32_KMT) append("OPAQUE_WIN32_KMT, ")
		if(is_SYNC_FD) append("SYNC_FD, ")
		if(is_OPAQUE_FD_KHR) append("OPAQUE_FD_KHR, ")
		if(is_OPAQUE_WIN32_KHR) append("OPAQUE_WIN32_KHR, ")
		if(is_OPAQUE_WIN32_KMT_KHR) append("OPAQUE_WIN32_KMT_KHR, ")
		if(is_SYNC_FD_KHR) append("SYNC_FD_KHR, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = ExternalFenceHandleTypeFlags(0)
		val ALL get() = ExternalFenceHandleTypeFlags(30)
		val OPAQUE_FD get() = ExternalFenceHandleTypeFlags(1)
		val OPAQUE_WIN32 get() = ExternalFenceHandleTypeFlags(2)
		val OPAQUE_WIN32_KMT get() = ExternalFenceHandleTypeFlags(4)
		val SYNC_FD get() = ExternalFenceHandleTypeFlags(8)
		val OPAQUE_FD_KHR get() = ExternalFenceHandleTypeFlags(1)
		val OPAQUE_WIN32_KHR get() = ExternalFenceHandleTypeFlags(2)
		val OPAQUE_WIN32_KMT_KHR get() = ExternalFenceHandleTypeFlags(4)
		val SYNC_FD_KHR get() = ExternalFenceHandleTypeFlags(8)
		
		inline fun compose(block: Companion.() -> ExternalFenceHandleTypeFlags) = block(Companion)
	
	}


}