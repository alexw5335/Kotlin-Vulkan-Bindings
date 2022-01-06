// This file has been automatically generated.

package kvb.vulkan

/**
 *     // provided by VK_VERSION_1_1

 *     enum VkSubgroupFeatureFlagBits {
 *         VK_SUBGROUP_FEATURE_BASIC_BIT             = 1
 *         VK_SUBGROUP_FEATURE_VOTE_BIT              = 2
 *         VK_SUBGROUP_FEATURE_ARITHMETIC_BIT        = 4
 *         VK_SUBGROUP_FEATURE_BALLOT_BIT            = 8
 *         VK_SUBGROUP_FEATURE_SHUFFLE_BIT           = 16
 *         VK_SUBGROUP_FEATURE_SHUFFLE_RELATIVE_BIT  = 32
 *         VK_SUBGROUP_FEATURE_CLUSTERED_BIT         = 64
 *         VK_SUBGROUP_FEATURE_QUAD_BIT              = 128
 *         VK_SUBGROUP_FEATURE_PARTITIONED_BIT_NV    = 256
 *     }
 */
@Suppress("unused")
@JvmInline
value class SubgroupFeatureFlags(val value: Int) {
	
	
	companion object {
		
		val BASIC = SubgroupFeatureFlags(1)
		
		val VOTE = SubgroupFeatureFlags(2)
		
		val ARITHMETIC = SubgroupFeatureFlags(4)
		
		val BALLOT = SubgroupFeatureFlags(8)
		
		val SHUFFLE = SubgroupFeatureFlags(16)
		
		val SHUFFLE_RELATIVE = SubgroupFeatureFlags(32)
		
		val CLUSTERED = SubgroupFeatureFlags(64)
		
		val QUAD = SubgroupFeatureFlags(128)
		
		val PARTITIONED = SubgroupFeatureFlags(256)
	
	}
	
	
	
	operator fun plus(mask: SubgroupFeatureFlags) = SubgroupFeatureFlags(value or mask.value)
	
	operator fun contains(mask: SubgroupFeatureFlags) = value and mask.value == mask.value


}