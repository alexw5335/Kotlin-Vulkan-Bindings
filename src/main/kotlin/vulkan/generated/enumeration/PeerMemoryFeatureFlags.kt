// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkPeerMemoryFeatureFlagBits {
 *         COPY_SRC         = 1
 *         COPY_DST         = 2
 *         GENERIC_SRC      = 4
 *         GENERIC_DST      = 8
 *         COPY_SRC_KHR     = 1
 *         COPY_DST_KHR     = 2
 *         GENERIC_SRC_KHR  = 4
 *         GENERIC_DST_KHR  = 8
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class PeerMemoryFeatureFlags(val bitfield: Int) {
	
	
	val is_COPY_SRC get() = bitfield and 1 != 0
	val is_COPY_DST get() = bitfield and 2 != 0
	val is_GENERIC_SRC get() = bitfield and 4 != 0
	val is_GENERIC_DST get() = bitfield and 8 != 0
	val is_COPY_SRC_KHR get() = bitfield and 1 != 0
	val is_COPY_DST_KHR get() = bitfield and 2 != 0
	val is_GENERIC_SRC_KHR get() = bitfield and 4 != 0
	val is_GENERIC_DST_KHR get() = bitfield and 8 != 0
	
	
	
	infix operator fun plus(other: PeerMemoryFeatureFlags) = PeerMemoryFeatureFlags(bitfield or other.bitfield)
	
	infix operator fun plus(other: Int) = PeerMemoryFeatureFlags(bitfield or other)
	
	infix fun containsAll(mask: PeerMemoryFeatureFlags) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Int) = bitfield and mask == mask
	
	infix fun containsSome(mask: PeerMemoryFeatureFlags) = bitfield and mask.bitfield != 0
	
	infix fun containsSome(mask: Int) = bitfield and mask != 0
	
	
	
	override fun toString() = buildString {
		append("{ ")
		if(is_COPY_SRC) append("COPY_SRC, ")
		if(is_COPY_DST) append("COPY_DST, ")
		if(is_GENERIC_SRC) append("GENERIC_SRC, ")
		if(is_GENERIC_DST) append("GENERIC_DST, ")
		if(is_COPY_SRC_KHR) append("COPY_SRC_KHR, ")
		if(is_COPY_DST_KHR) append("COPY_DST_KHR, ")
		if(is_GENERIC_SRC_KHR) append("GENERIC_SRC_KHR, ")
		if(is_GENERIC_DST_KHR) append("GENERIC_DST_KHR, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = PeerMemoryFeatureFlags(0)
		val ALL get() = PeerMemoryFeatureFlags(30)
		val COPY_SRC get() = PeerMemoryFeatureFlags(1)
		val COPY_DST get() = PeerMemoryFeatureFlags(2)
		val GENERIC_SRC get() = PeerMemoryFeatureFlags(4)
		val GENERIC_DST get() = PeerMemoryFeatureFlags(8)
		val COPY_SRC_KHR get() = PeerMemoryFeatureFlags(1)
		val COPY_DST_KHR get() = PeerMemoryFeatureFlags(2)
		val GENERIC_SRC_KHR get() = PeerMemoryFeatureFlags(4)
		val GENERIC_DST_KHR get() = PeerMemoryFeatureFlags(8)
		
		inline fun compose(block: Companion.() -> PeerMemoryFeatureFlags) = block(Companion)
	
	}


}