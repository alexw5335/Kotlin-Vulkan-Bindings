// This file has been automatically generated.

package kvb.vulkan

/**
 *     // provided by VK_VERSION_1_0

 *     enum VkFormatFeatureFlagBits {
 *         VK_FORMAT_FEATURE_SAMPLED_IMAGE_BIT                                                                = 1
 *         VK_FORMAT_FEATURE_STORAGE_IMAGE_BIT                                                                = 2
 *         VK_FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT                                                         = 4
 *         VK_FORMAT_FEATURE_UNIFORM_TEXEL_BUFFER_BIT                                                         = 8
 *         VK_FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_BIT                                                         = 16
 *         VK_FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_ATOMIC_BIT                                                  = 32
 *         VK_FORMAT_FEATURE_VERTEX_BUFFER_BIT                                                                = 64
 *         VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BIT                                                             = 128
 *         VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT                                                       = 256
 *         VK_FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT                                                     = 512
 *         VK_FORMAT_FEATURE_BLIT_SRC_BIT                                                                     = 1024
 *         VK_FORMAT_FEATURE_BLIT_DST_BIT                                                                     = 2048
 *         VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT                                                  = 4096
 *         VK_FORMAT_FEATURE_TRANSFER_SRC_BIT                                                                 = 16384
 *         VK_FORMAT_FEATURE_TRANSFER_DST_BIT                                                                 = 32768
 *         VK_FORMAT_FEATURE_MIDPOINT_CHROMA_SAMPLES_BIT                                                      = 131072
 *         VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_BIT                                 = 262144
 *         VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_BIT                = 524288
 *         VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_BIT                = 1048576
 *         VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT      = 2097152
 *         VK_FORMAT_FEATURE_DISJOINT_BIT                                                                     = 4194304
 *         VK_FORMAT_FEATURE_COSITED_CHROMA_SAMPLES_BIT                                                       = 8388608
 *         VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_MINMAX_BIT                                                  = 65536
 *         VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_IMG                                               = 8192
 *         VK_FORMAT_FEATURE_VIDEO_DECODE_OUTPUT_BIT_KHR                                                      = 33554432
 *         VK_FORMAT_FEATURE_VIDEO_DECODE_DPB_BIT_KHR                                                         = 67108864
 *         VK_FORMAT_FEATURE_TRANSFER_SRC_BIT_KHR                                                             = 16384
 *         VK_FORMAT_FEATURE_TRANSFER_DST_BIT_KHR                                                             = 32768
 *         VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_MINMAX_BIT_EXT                                              = 65536
 *         VK_FORMAT_FEATURE_ACCELERATION_STRUCTURE_VERTEX_BUFFER_BIT_KHR                                     = 536870912
 *         VK_FORMAT_FEATURE_MIDPOINT_CHROMA_SAMPLES_BIT_KHR                                                  = 131072
 *         VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_BIT_KHR                             = 262144
 *         VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_BIT_KHR            = 524288
 *         VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_BIT_KHR            = 1048576
 *         VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT_KHR  = 2097152
 *         VK_FORMAT_FEATURE_DISJOINT_BIT_KHR                                                                 = 4194304
 *         VK_FORMAT_FEATURE_COSITED_CHROMA_SAMPLES_BIT_KHR                                                   = 8388608
 *         VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_EXT                                               = 8192
 *         VK_FORMAT_FEATURE_FRAGMENT_DENSITY_MAP_BIT_EXT                                                     = 16777216
 *         VK_FORMAT_FEATURE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR                                         = 1073741824
 *         VK_FORMAT_FEATURE_VIDEO_ENCODE_INPUT_BIT_KHR                                                       = 134217728
 *         VK_FORMAT_FEATURE_VIDEO_ENCODE_DPB_BIT_KHR                                                         = 268435456
 *     }
 */
@Suppress("unused")
@JvmInline
value class FormatFeatureFlags(val value: Int) {
	
	
	companion object {
		
		val SAMPLED_IMAGE = FormatFeatureFlags(1)
		
		val STORAGE_IMAGE = FormatFeatureFlags(2)
		
		val STORAGE_IMAGE_ATOMIC = FormatFeatureFlags(4)
		
		val UNIFORM_TEXEL_BUFFER = FormatFeatureFlags(8)
		
		val STORAGE_TEXEL_BUFFER = FormatFeatureFlags(16)
		
		val STORAGE_TEXEL_BUFFER_ATOMIC = FormatFeatureFlags(32)
		
		val VERTEX_BUFFER = FormatFeatureFlags(64)
		
		val COLOR_ATTACHMENT = FormatFeatureFlags(128)
		
		val COLOR_ATTACHMENT_BLEND = FormatFeatureFlags(256)
		
		val DEPTH_STENCIL_ATTACHMENT = FormatFeatureFlags(512)
		
		val BLIT_SRC = FormatFeatureFlags(1024)
		
		val BLIT_DST = FormatFeatureFlags(2048)
		
		val SAMPLED_IMAGE_FILTER_LINEAR = FormatFeatureFlags(4096)
		
		val TRANSFER_SRC = FormatFeatureFlags(16384)
		
		val TRANSFER_DST = FormatFeatureFlags(32768)
		
		val MIDPOINT_CHROMA_SAMPLES = FormatFeatureFlags(131072)
		
		val SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER = FormatFeatureFlags(262144)
		
		val SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER = FormatFeatureFlags(524288)
		
		val SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT = FormatFeatureFlags(1048576)
		
		val SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE = FormatFeatureFlags(2097152)
		
		val DISJOINT = FormatFeatureFlags(4194304)
		
		val COSITED_CHROMA_SAMPLES = FormatFeatureFlags(8388608)
		
		val SAMPLED_IMAGE_FILTER_MINMAX = FormatFeatureFlags(65536)
		
		val SAMPLED_IMAGE_FILTER_CUBIC = FormatFeatureFlags(8192)
		
		val VIDEO_DECODE_OUTPUT = FormatFeatureFlags(33554432)
		
		val VIDEO_DECODE_DPB = FormatFeatureFlags(67108864)
		
		val ACCELERATION_STRUCTURE_VERTEX_BUFFER = FormatFeatureFlags(536870912)
		
		val FRAGMENT_DENSITY_MAP = FormatFeatureFlags(16777216)
		
		val FRAGMENT_SHADING_RATE_ATTACHMENT = FormatFeatureFlags(1073741824)
		
		val VIDEO_ENCODE_INPUT = FormatFeatureFlags(134217728)
		
		val VIDEO_ENCODE_DPB = FormatFeatureFlags(268435456)
	
	}
	
	
	
	operator fun plus(mask: FormatFeatureFlags) = FormatFeatureFlags(value or mask.value)
	
	operator fun contains(mask: FormatFeatureFlags) = value and mask.value == mask.value


}