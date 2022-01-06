// This file has been automatically generated.

package kvb.vulkan

/**
 *     // provided by VK_KHR_format_feature_flags2

 *     enum VkFormatFeatureFlagBits2KHR {
 *         VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_BIT_KHR                                                            = 1
 *         VK_FORMAT_FEATURE_2_STORAGE_IMAGE_BIT_KHR                                                            = 2
 *         VK_FORMAT_FEATURE_2_STORAGE_IMAGE_ATOMIC_BIT_KHR                                                     = 4
 *         VK_FORMAT_FEATURE_2_UNIFORM_TEXEL_BUFFER_BIT_KHR                                                     = 8
 *         VK_FORMAT_FEATURE_2_STORAGE_TEXEL_BUFFER_BIT_KHR                                                     = 16
 *         VK_FORMAT_FEATURE_2_STORAGE_TEXEL_BUFFER_ATOMIC_BIT_KHR                                              = 32
 *         VK_FORMAT_FEATURE_2_VERTEX_BUFFER_BIT_KHR                                                            = 64
 *         VK_FORMAT_FEATURE_2_COLOR_ATTACHMENT_BIT_KHR                                                         = 128
 *         VK_FORMAT_FEATURE_2_COLOR_ATTACHMENT_BLEND_BIT_KHR                                                   = 256
 *         VK_FORMAT_FEATURE_2_DEPTH_STENCIL_ATTACHMENT_BIT_KHR                                                 = 512
 *         VK_FORMAT_FEATURE_2_BLIT_SRC_BIT_KHR                                                                 = 1024
 *         VK_FORMAT_FEATURE_2_BLIT_DST_BIT_KHR                                                                 = 2048
 *         VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_FILTER_LINEAR_BIT_KHR                                              = 4096
 *         VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_FILTER_CUBIC_BIT_EXT                                               = 8192
 *         VK_FORMAT_FEATURE_2_TRANSFER_SRC_BIT_KHR                                                             = 16384
 *         VK_FORMAT_FEATURE_2_TRANSFER_DST_BIT_KHR                                                             = 32768
 *         VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_FILTER_MINMAX_BIT_KHR                                              = 65536
 *         VK_FORMAT_FEATURE_2_MIDPOINT_CHROMA_SAMPLES_BIT_KHR                                                  = 131072
 *         VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_BIT_KHR                             = 262144
 *         VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_BIT_KHR            = 524288
 *         VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_BIT_KHR            = 1048576
 *         VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT_KHR  = 2097152
 *         VK_FORMAT_FEATURE_2_DISJOINT_BIT_KHR                                                                 = 4194304
 *         VK_FORMAT_FEATURE_2_COSITED_CHROMA_SAMPLES_BIT_KHR                                                   = 8388608
 *         VK_FORMAT_FEATURE_2_STORAGE_READ_WITHOUT_FORMAT_BIT_KHR                                              = 2147483648
 *         VK_FORMAT_FEATURE_2_STORAGE_WRITE_WITHOUT_FORMAT_BIT_KHR                                             = 4294967296
 *         VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_DEPTH_COMPARISON_BIT_KHR                                           = 8589934592
 *         VK_FORMAT_FEATURE_2_VIDEO_DECODE_OUTPUT_BIT_KHR                                                      = 33554432
 *         VK_FORMAT_FEATURE_2_VIDEO_DECODE_DPB_BIT_KHR                                                         = 67108864
 *         VK_FORMAT_FEATURE_2_ACCELERATION_STRUCTURE_VERTEX_BUFFER_BIT_KHR                                     = 536870912
 *         VK_FORMAT_FEATURE_2_FRAGMENT_DENSITY_MAP_BIT_EXT                                                     = 16777216
 *         VK_FORMAT_FEATURE_2_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR                                         = 1073741824
 *         VK_FORMAT_FEATURE_2_VIDEO_ENCODE_INPUT_BIT_KHR                                                       = 134217728
 *         VK_FORMAT_FEATURE_2_VIDEO_ENCODE_DPB_BIT_KHR                                                         = 268435456
 *         VK_FORMAT_FEATURE_2_LINEAR_COLOR_ATTACHMENT_BIT_NV                                                   = 274877906944
 *         VK_FORMAT_FEATURE_2_RESERVED_34_BIT_QCOM                                                             = 17179869184
 *         VK_FORMAT_FEATURE_2_RESERVED_35_BIT_QCOM                                                             = 34359738368
 *         VK_FORMAT_FEATURE_2_RESERVED_36_BIT_QCOM                                                             = 68719476736
 *         VK_FORMAT_FEATURE_2_RESERVED_37_BIT_QCOM                                                             = 137438953472
 *     }
 */
@Suppress("unused")
@JvmInline
value class FormatFeatureFlags2(val value: Long) {
	
	
	companion object {
		
		val SAMPLED_IMAGE = FormatFeatureFlags2(1)
		
		val STORAGE_IMAGE = FormatFeatureFlags2(2)
		
		val STORAGE_IMAGE_ATOMIC = FormatFeatureFlags2(4)
		
		val UNIFORM_TEXEL_BUFFER = FormatFeatureFlags2(8)
		
		val STORAGE_TEXEL_BUFFER = FormatFeatureFlags2(16)
		
		val STORAGE_TEXEL_BUFFER_ATOMIC = FormatFeatureFlags2(32)
		
		val VERTEX_BUFFER = FormatFeatureFlags2(64)
		
		val COLOR_ATTACHMENT = FormatFeatureFlags2(128)
		
		val COLOR_ATTACHMENT_BLEND = FormatFeatureFlags2(256)
		
		val DEPTH_STENCIL_ATTACHMENT = FormatFeatureFlags2(512)
		
		val BLIT_SRC = FormatFeatureFlags2(1024)
		
		val BLIT_DST = FormatFeatureFlags2(2048)
		
		val SAMPLED_IMAGE_FILTER_LINEAR = FormatFeatureFlags2(4096)
		
		val SAMPLED_IMAGE_FILTER_CUBIC = FormatFeatureFlags2(8192)
		
		val TRANSFER_SRC = FormatFeatureFlags2(16384)
		
		val TRANSFER_DST = FormatFeatureFlags2(32768)
		
		val SAMPLED_IMAGE_FILTER_MINMAX = FormatFeatureFlags2(65536)
		
		val MIDPOINT_CHROMA_SAMPLES = FormatFeatureFlags2(131072)
		
		val SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER = FormatFeatureFlags2(262144)
		
		val SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER = FormatFeatureFlags2(524288)
		
		val SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT = FormatFeatureFlags2(1048576)
		
		val SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE = FormatFeatureFlags2(2097152)
		
		val DISJOINT = FormatFeatureFlags2(4194304)
		
		val COSITED_CHROMA_SAMPLES = FormatFeatureFlags2(8388608)
		
		val STORAGE_READ_WITHOUT_FORMAT = FormatFeatureFlags2(2147483648)
		
		val STORAGE_WRITE_WITHOUT_FORMAT = FormatFeatureFlags2(4294967296)
		
		val SAMPLED_IMAGE_DEPTH_COMPARISON = FormatFeatureFlags2(8589934592)
		
		val VIDEO_DECODE_OUTPUT = FormatFeatureFlags2(33554432)
		
		val VIDEO_DECODE_DPB = FormatFeatureFlags2(67108864)
		
		val ACCELERATION_STRUCTURE_VERTEX_BUFFER = FormatFeatureFlags2(536870912)
		
		val FRAGMENT_DENSITY_MAP = FormatFeatureFlags2(16777216)
		
		val FRAGMENT_SHADING_RATE_ATTACHMENT = FormatFeatureFlags2(1073741824)
		
		val VIDEO_ENCODE_INPUT = FormatFeatureFlags2(134217728)
		
		val VIDEO_ENCODE_DPB = FormatFeatureFlags2(268435456)
		
		val LINEAR_COLOR_ATTACHMENT = FormatFeatureFlags2(274877906944)
	
	}
	
	
	
	operator fun plus(mask: FormatFeatureFlags2) = FormatFeatureFlags2(value or mask.value)
	
	operator fun contains(mask: FormatFeatureFlags2) = value and mask.value == mask.value


}