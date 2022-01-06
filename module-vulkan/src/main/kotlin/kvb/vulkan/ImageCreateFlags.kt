// This file has been automatically generated.

package kvb.vulkan

/**
 *     // provided by VK_VERSION_1_0

 *     enum VkImageCreateFlagBits {
 *         VK_IMAGE_CREATE_SPARSE_BINDING_BIT                         = 1
 *         VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT                       = 2
 *         VK_IMAGE_CREATE_SPARSE_ALIASED_BIT                         = 4
 *         VK_IMAGE_CREATE_MUTABLE_FORMAT_BIT                         = 8
 *         VK_IMAGE_CREATE_CUBE_COMPATIBLE_BIT                        = 16
 *         VK_IMAGE_CREATE_ALIAS_BIT                                  = 1024
 *         VK_IMAGE_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT            = 64
 *         VK_IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT                    = 32
 *         VK_IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT            = 128
 *         VK_IMAGE_CREATE_EXTENDED_USAGE_BIT                         = 256
 *         VK_IMAGE_CREATE_PROTECTED_BIT                              = 2048
 *         VK_IMAGE_CREATE_DISJOINT_BIT                               = 512
 *         VK_IMAGE_CREATE_CORNER_SAMPLED_BIT_NV                      = 8192
 *         VK_IMAGE_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT_KHR        = 64
 *         VK_IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT_KHR                = 32
 *         VK_IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT_KHR        = 128
 *         VK_IMAGE_CREATE_EXTENDED_USAGE_BIT_KHR                     = 256
 *         VK_IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT  = 4096
 *         VK_IMAGE_CREATE_DISJOINT_BIT_KHR                           = 512
 *         VK_IMAGE_CREATE_ALIAS_BIT_KHR                              = 1024
 *         VK_IMAGE_CREATE_SUBSAMPLED_BIT_EXT                         = 16384
 *         VK_IMAGE_CREATE_RESERVED_16_BIT_AMD                        = 65536
 *         VK_IMAGE_CREATE_RESERVED_394_BIT_EXT                       = 131072
 *         VK_IMAGE_CREATE_FRAGMENT_DENSITY_MAP_OFFSET_BIT_QCOM       = 32768
 *     }
 */
@Suppress("unused")
@JvmInline
value class ImageCreateFlags(val value: Int) {
	
	
	companion object {
		
		val SPARSE_BINDING = ImageCreateFlags(1)
		
		val SPARSE_RESIDENCY = ImageCreateFlags(2)
		
		val SPARSE_ALIASED = ImageCreateFlags(4)
		
		val MUTABLE_FORMAT = ImageCreateFlags(8)
		
		val CUBE_COMPATIBLE = ImageCreateFlags(16)
		
		val ALIAS = ImageCreateFlags(1024)
		
		val SPLIT_INSTANCE_BIND_REGIONS = ImageCreateFlags(64)
		
		val _2D_ARRAY_COMPATIBLE = ImageCreateFlags(32)
		
		val BLOCK_TEXEL_VIEW_COMPATIBLE = ImageCreateFlags(128)
		
		val EXTENDED_USAGE = ImageCreateFlags(256)
		
		val PROTECTED = ImageCreateFlags(2048)
		
		val DISJOINT = ImageCreateFlags(512)
		
		val CORNER_SAMPLED = ImageCreateFlags(8192)
		
		val SAMPLE_LOCATIONS_COMPATIBLE_DEPTH = ImageCreateFlags(4096)
		
		val SUBSAMPLED = ImageCreateFlags(16384)
		
		val FRAGMENT_DENSITY_MAP_OFFSET = ImageCreateFlags(32768)
	
	}
	
	
	
	operator fun plus(mask: ImageCreateFlags) = ImageCreateFlags(value or mask.value)
	
	operator fun contains(mask: ImageCreateFlags) = value and mask.value == mask.value


}