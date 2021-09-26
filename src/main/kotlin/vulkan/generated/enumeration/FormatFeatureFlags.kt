// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkFormatFeatureFlagBits {
 *         SAMPLED_IMAGE                                                                = 1
 *         STORAGE_IMAGE                                                                = 2
 *         STORAGE_IMAGE_ATOMIC                                                         = 4
 *         UNIFORM_TEXEL_BUFFER                                                         = 8
 *         STORAGE_TEXEL_BUFFER                                                         = 16
 *         STORAGE_TEXEL_BUFFER_ATOMIC                                                  = 32
 *         VERTEX_BUFFER                                                                = 64
 *         COLOR_ATTACHMENT                                                             = 128
 *         COLOR_ATTACHMENT_BLEND                                                       = 256
 *         DEPTH_STENCIL_ATTACHMENT                                                     = 512
 *         BLIT_SRC                                                                     = 1024
 *         BLIT_DST                                                                     = 2048
 *         SAMPLED_IMAGE_FILTER_LINEAR                                                  = 4096
 *         TRANSFER_SRC                                                                 = 16384
 *         TRANSFER_DST                                                                 = 32768
 *         MIDPOINT_CHROMA_SAMPLES                                                      = 131072
 *         SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER                                 = 262144
 *         SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER                = 524288
 *         SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT                = 1048576
 *         SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE      = 2097152
 *         DISJOINT                                                                     = 4194304
 *         COSITED_CHROMA_SAMPLES                                                       = 8388608
 *         SAMPLED_IMAGE_FILTER_MINMAX                                                  = 65536
 *         SAMPLED_IMAGE_FILTER_CUBIC                                                   = 8192
 *         TRANSFER_SRC_KHR                                                             = 16384
 *         TRANSFER_DST_KHR                                                             = 32768
 *         SAMPLED_IMAGE_FILTER_MINMAX_EXT                                              = 65536
 *         ACCELERATION_STRUCTURE_VERTEX_BUFFER                                         = 536870912
 *         MIDPOINT_CHROMA_SAMPLES_KHR                                                  = 131072
 *         SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_KHR                             = 262144
 *         SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_KHR            = 524288
 *         SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_KHR            = 1048576
 *         SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_KHR  = 2097152
 *         DISJOINT_KHR                                                                 = 4194304
 *         COSITED_CHROMA_SAMPLES_KHR                                                   = 8388608
 *         SAMPLED_IMAGE_FILTER_CUBIC_EXT                                               = 8192
 *         FRAGMENT_DENSITY_MAP                                                         = 16777216
 *         FRAGMENT_SHADING_RATE_ATTACHMENT                                             = 1073741824
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class FormatFeatureFlags(val bitfield: Int) {
	
	
	val is_SAMPLED_IMAGE get() = bitfield and 1 != 0
	val is_STORAGE_IMAGE get() = bitfield and 2 != 0
	val is_STORAGE_IMAGE_ATOMIC get() = bitfield and 4 != 0
	val is_UNIFORM_TEXEL_BUFFER get() = bitfield and 8 != 0
	val is_STORAGE_TEXEL_BUFFER get() = bitfield and 16 != 0
	val is_STORAGE_TEXEL_BUFFER_ATOMIC get() = bitfield and 32 != 0
	val is_VERTEX_BUFFER get() = bitfield and 64 != 0
	val is_COLOR_ATTACHMENT get() = bitfield and 128 != 0
	val is_COLOR_ATTACHMENT_BLEND get() = bitfield and 256 != 0
	val is_DEPTH_STENCIL_ATTACHMENT get() = bitfield and 512 != 0
	val is_BLIT_SRC get() = bitfield and 1024 != 0
	val is_BLIT_DST get() = bitfield and 2048 != 0
	val is_SAMPLED_IMAGE_FILTER_LINEAR get() = bitfield and 4096 != 0
	val is_TRANSFER_SRC get() = bitfield and 16384 != 0
	val is_TRANSFER_DST get() = bitfield and 32768 != 0
	val is_MIDPOINT_CHROMA_SAMPLES get() = bitfield and 131072 != 0
	val is_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER get() = bitfield and 262144 != 0
	val is_SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER get() = bitfield and 524288 != 0
	val is_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT get() = bitfield and 1048576 != 0
	val is_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE get() = bitfield and 2097152 != 0
	val is_DISJOINT get() = bitfield and 4194304 != 0
	val is_COSITED_CHROMA_SAMPLES get() = bitfield and 8388608 != 0
	val is_SAMPLED_IMAGE_FILTER_MINMAX get() = bitfield and 65536 != 0
	val is_SAMPLED_IMAGE_FILTER_CUBIC get() = bitfield and 8192 != 0
	val is_TRANSFER_SRC_KHR get() = bitfield and 16384 != 0
	val is_TRANSFER_DST_KHR get() = bitfield and 32768 != 0
	val is_SAMPLED_IMAGE_FILTER_MINMAX_EXT get() = bitfield and 65536 != 0
	val is_ACCELERATION_STRUCTURE_VERTEX_BUFFER get() = bitfield and 536870912 != 0
	val is_MIDPOINT_CHROMA_SAMPLES_KHR get() = bitfield and 131072 != 0
	val is_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_KHR get() = bitfield and 262144 != 0
	val is_SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_KHR get() = bitfield and 524288 != 0
	val is_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_KHR get() = bitfield and 1048576 != 0
	val is_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_KHR get() = bitfield and 2097152 != 0
	val is_DISJOINT_KHR get() = bitfield and 4194304 != 0
	val is_COSITED_CHROMA_SAMPLES_KHR get() = bitfield and 8388608 != 0
	val is_SAMPLED_IMAGE_FILTER_CUBIC_EXT get() = bitfield and 8192 != 0
	val is_FRAGMENT_DENSITY_MAP get() = bitfield and 16777216 != 0
	val is_FRAGMENT_SHADING_RATE_ATTACHMENT get() = bitfield and 1073741824 != 0
	
	
	
	infix operator fun plus(other: FormatFeatureFlags) = FormatFeatureFlags(bitfield or other.bitfield)
	
	infix operator fun plus(other: Int) = FormatFeatureFlags(bitfield or other)
	
	infix fun containsAll(mask: FormatFeatureFlags) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Int) = bitfield and mask == mask
	
	infix fun containsSome(mask: FormatFeatureFlags) = bitfield and mask.bitfield != 0
	
	infix fun containsSome(mask: Int) = bitfield and mask != 0
	
	
	
	override fun toString() = buildString {
		append("{ ")
		if(is_SAMPLED_IMAGE) append("SAMPLED_IMAGE, ")
		if(is_STORAGE_IMAGE) append("STORAGE_IMAGE, ")
		if(is_STORAGE_IMAGE_ATOMIC) append("STORAGE_IMAGE_ATOMIC, ")
		if(is_UNIFORM_TEXEL_BUFFER) append("UNIFORM_TEXEL_BUFFER, ")
		if(is_STORAGE_TEXEL_BUFFER) append("STORAGE_TEXEL_BUFFER, ")
		if(is_STORAGE_TEXEL_BUFFER_ATOMIC) append("STORAGE_TEXEL_BUFFER_ATOMIC, ")
		if(is_VERTEX_BUFFER) append("VERTEX_BUFFER, ")
		if(is_COLOR_ATTACHMENT) append("COLOR_ATTACHMENT, ")
		if(is_COLOR_ATTACHMENT_BLEND) append("COLOR_ATTACHMENT_BLEND, ")
		if(is_DEPTH_STENCIL_ATTACHMENT) append("DEPTH_STENCIL_ATTACHMENT, ")
		if(is_BLIT_SRC) append("BLIT_SRC, ")
		if(is_BLIT_DST) append("BLIT_DST, ")
		if(is_SAMPLED_IMAGE_FILTER_LINEAR) append("SAMPLED_IMAGE_FILTER_LINEAR, ")
		if(is_TRANSFER_SRC) append("TRANSFER_SRC, ")
		if(is_TRANSFER_DST) append("TRANSFER_DST, ")
		if(is_MIDPOINT_CHROMA_SAMPLES) append("MIDPOINT_CHROMA_SAMPLES, ")
		if(is_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER) append("SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER, ")
		if(is_SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER) append("SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER, ")
		if(is_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT) append("SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT, ")
		if(is_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE) append("SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE, ")
		if(is_DISJOINT) append("DISJOINT, ")
		if(is_COSITED_CHROMA_SAMPLES) append("COSITED_CHROMA_SAMPLES, ")
		if(is_SAMPLED_IMAGE_FILTER_MINMAX) append("SAMPLED_IMAGE_FILTER_MINMAX, ")
		if(is_SAMPLED_IMAGE_FILTER_CUBIC) append("SAMPLED_IMAGE_FILTER_CUBIC, ")
		if(is_TRANSFER_SRC_KHR) append("TRANSFER_SRC_KHR, ")
		if(is_TRANSFER_DST_KHR) append("TRANSFER_DST_KHR, ")
		if(is_SAMPLED_IMAGE_FILTER_MINMAX_EXT) append("SAMPLED_IMAGE_FILTER_MINMAX_EXT, ")
		if(is_ACCELERATION_STRUCTURE_VERTEX_BUFFER) append("ACCELERATION_STRUCTURE_VERTEX_BUFFER, ")
		if(is_MIDPOINT_CHROMA_SAMPLES_KHR) append("MIDPOINT_CHROMA_SAMPLES_KHR, ")
		if(is_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_KHR) append("SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_KHR, ")
		if(is_SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_KHR) append("SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_KHR, ")
		if(is_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_KHR) append("SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_KHR, ")
		if(is_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_KHR) append("SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_KHR, ")
		if(is_DISJOINT_KHR) append("DISJOINT_KHR, ")
		if(is_COSITED_CHROMA_SAMPLES_KHR) append("COSITED_CHROMA_SAMPLES_KHR, ")
		if(is_SAMPLED_IMAGE_FILTER_CUBIC_EXT) append("SAMPLED_IMAGE_FILTER_CUBIC_EXT, ")
		if(is_FRAGMENT_DENSITY_MAP) append("FRAGMENT_DENSITY_MAP, ")
		if(is_FRAGMENT_SHADING_RATE_ATTACHMENT) append("FRAGMENT_SHADING_RATE_ATTACHMENT, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = FormatFeatureFlags(0)
		val ALL get() = FormatFeatureFlags(1660936191)
		val SAMPLED_IMAGE get() = FormatFeatureFlags(1)
		val STORAGE_IMAGE get() = FormatFeatureFlags(2)
		val STORAGE_IMAGE_ATOMIC get() = FormatFeatureFlags(4)
		val UNIFORM_TEXEL_BUFFER get() = FormatFeatureFlags(8)
		val STORAGE_TEXEL_BUFFER get() = FormatFeatureFlags(16)
		val STORAGE_TEXEL_BUFFER_ATOMIC get() = FormatFeatureFlags(32)
		val VERTEX_BUFFER get() = FormatFeatureFlags(64)
		val COLOR_ATTACHMENT get() = FormatFeatureFlags(128)
		val COLOR_ATTACHMENT_BLEND get() = FormatFeatureFlags(256)
		val DEPTH_STENCIL_ATTACHMENT get() = FormatFeatureFlags(512)
		val BLIT_SRC get() = FormatFeatureFlags(1024)
		val BLIT_DST get() = FormatFeatureFlags(2048)
		val SAMPLED_IMAGE_FILTER_LINEAR get() = FormatFeatureFlags(4096)
		val TRANSFER_SRC get() = FormatFeatureFlags(16384)
		val TRANSFER_DST get() = FormatFeatureFlags(32768)
		val MIDPOINT_CHROMA_SAMPLES get() = FormatFeatureFlags(131072)
		val SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER get() = FormatFeatureFlags(262144)
		val SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER get() = FormatFeatureFlags(524288)
		val SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT get() = FormatFeatureFlags(1048576)
		val SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE get() = FormatFeatureFlags(2097152)
		val DISJOINT get() = FormatFeatureFlags(4194304)
		val COSITED_CHROMA_SAMPLES get() = FormatFeatureFlags(8388608)
		val SAMPLED_IMAGE_FILTER_MINMAX get() = FormatFeatureFlags(65536)
		val SAMPLED_IMAGE_FILTER_CUBIC get() = FormatFeatureFlags(8192)
		val TRANSFER_SRC_KHR get() = FormatFeatureFlags(16384)
		val TRANSFER_DST_KHR get() = FormatFeatureFlags(32768)
		val SAMPLED_IMAGE_FILTER_MINMAX_EXT get() = FormatFeatureFlags(65536)
		val ACCELERATION_STRUCTURE_VERTEX_BUFFER get() = FormatFeatureFlags(536870912)
		val MIDPOINT_CHROMA_SAMPLES_KHR get() = FormatFeatureFlags(131072)
		val SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_KHR get() = FormatFeatureFlags(262144)
		val SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_KHR get() = FormatFeatureFlags(524288)
		val SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_KHR get() = FormatFeatureFlags(1048576)
		val SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_KHR get() = FormatFeatureFlags(2097152)
		val DISJOINT_KHR get() = FormatFeatureFlags(4194304)
		val COSITED_CHROMA_SAMPLES_KHR get() = FormatFeatureFlags(8388608)
		val SAMPLED_IMAGE_FILTER_CUBIC_EXT get() = FormatFeatureFlags(8192)
		val FRAGMENT_DENSITY_MAP get() = FormatFeatureFlags(16777216)
		val FRAGMENT_SHADING_RATE_ATTACHMENT get() = FormatFeatureFlags(1073741824)
		
		inline fun compose(block: Companion.() -> FormatFeatureFlags) = block(Companion)
	
	}


}