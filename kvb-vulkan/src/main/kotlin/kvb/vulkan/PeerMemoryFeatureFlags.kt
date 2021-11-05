// This file has been automatically generated.

package kvb.vulkan

/**
 *     enum VkPeerMemoryFeatureFlagBits {
 *         VK_PEER_MEMORY_FEATURE_COPY_SRC_BIT         = 1
 *         VK_PEER_MEMORY_FEATURE_COPY_DST_BIT         = 2
 *         VK_PEER_MEMORY_FEATURE_GENERIC_SRC_BIT      = 4
 *         VK_PEER_MEMORY_FEATURE_GENERIC_DST_BIT      = 8
 *         VK_PEER_MEMORY_FEATURE_COPY_SRC_BIT_KHR     = 1
 *         VK_PEER_MEMORY_FEATURE_COPY_DST_BIT_KHR     = 2
 *         VK_PEER_MEMORY_FEATURE_GENERIC_SRC_BIT_KHR  = 4
 *         VK_PEER_MEMORY_FEATURE_GENERIC_DST_BIT_KHR  = 8
 *     }
 */
@Suppress("unused")
@JvmInline
value class PeerMemoryFeatureFlags(val value: Int) {
	
	
	companion object {
		
		val COPY_SRC = PeerMemoryFeatureFlags(1)
		
		val COPY_DST = PeerMemoryFeatureFlags(2)
		
		val GENERIC_SRC = PeerMemoryFeatureFlags(4)
		
		val GENERIC_DST = PeerMemoryFeatureFlags(8)
	
	}
	
	
	
	operator fun plus(mask: PeerMemoryFeatureFlags) = PeerMemoryFeatureFlags(value or mask.value)
	
	operator fun contains(mask: PeerMemoryFeatureFlags) = value and mask.value == mask.value


}