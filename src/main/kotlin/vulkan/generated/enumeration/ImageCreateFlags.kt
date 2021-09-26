// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkImageCreateFlagBits {
 *         SPARSE_BINDING                     = 1
 *         SPARSE_RESIDENCY                   = 2
 *         SPARSE_ALIASED                     = 4
 *         MUTABLE_FORMAT                     = 8
 *         CUBE_COMPATIBLE                    = 16
 *         ALIAS                              = 1024
 *         SPLIT_INSTANCE_BIND_REGIONS        = 64
 *         _2D_ARRAY_COMPATIBLE               = 32
 *         BLOCK_TEXEL_VIEW_COMPATIBLE        = 128
 *         EXTENDED_USAGE                     = 256
 *         PROTECTED                          = 2048
 *         DISJOINT                           = 512
 *         CORNER_SAMPLED                     = 8192
 *         SPLIT_INSTANCE_BIND_REGIONS_KHR    = 64
 *         _2D_ARRAY_COMPATIBLE_KHR           = 32
 *         BLOCK_TEXEL_VIEW_COMPATIBLE_KHR    = 128
 *         EXTENDED_USAGE_KHR                 = 256
 *         SAMPLE_LOCATIONS_COMPATIBLE_DEPTH  = 4096
 *         DISJOINT_KHR                       = 512
 *         ALIAS_KHR                          = 1024
 *         SUBSAMPLED                         = 16384
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class ImageCreateFlags(val bitfield: Int) {
	
	
	val is_SPARSE_BINDING get() = bitfield and 1 != 0
	val is_SPARSE_RESIDENCY get() = bitfield and 2 != 0
	val is_SPARSE_ALIASED get() = bitfield and 4 != 0
	val is_MUTABLE_FORMAT get() = bitfield and 8 != 0
	val is_CUBE_COMPATIBLE get() = bitfield and 16 != 0
	val is_ALIAS get() = bitfield and 1024 != 0
	val is_SPLIT_INSTANCE_BIND_REGIONS get() = bitfield and 64 != 0
	val is_2D_ARRAY_COMPATIBLE get() = bitfield and 32 != 0
	val is_BLOCK_TEXEL_VIEW_COMPATIBLE get() = bitfield and 128 != 0
	val is_EXTENDED_USAGE get() = bitfield and 256 != 0
	val is_PROTECTED get() = bitfield and 2048 != 0
	val is_DISJOINT get() = bitfield and 512 != 0
	val is_CORNER_SAMPLED get() = bitfield and 8192 != 0
	val is_SPLIT_INSTANCE_BIND_REGIONS_KHR get() = bitfield and 64 != 0
	val is_2D_ARRAY_COMPATIBLE_KHR get() = bitfield and 32 != 0
	val is_BLOCK_TEXEL_VIEW_COMPATIBLE_KHR get() = bitfield and 128 != 0
	val is_EXTENDED_USAGE_KHR get() = bitfield and 256 != 0
	val is_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH get() = bitfield and 4096 != 0
	val is_DISJOINT_KHR get() = bitfield and 512 != 0
	val is_ALIAS_KHR get() = bitfield and 1024 != 0
	val is_SUBSAMPLED get() = bitfield and 16384 != 0
	
	
	
	infix operator fun plus(other: ImageCreateFlags) = ImageCreateFlags(bitfield or other.bitfield)
	
	infix operator fun plus(other: Int) = ImageCreateFlags(bitfield or other)
	
	infix fun containsAll(mask: ImageCreateFlags) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Int) = bitfield and mask == mask
	
	infix fun containsSome(mask: ImageCreateFlags) = bitfield and mask.bitfield != 0
	
	infix fun containsSome(mask: Int) = bitfield and mask != 0
	
	
	
	override fun toString() = buildString {
		append("{ ")
		if(is_SPARSE_BINDING) append("SPARSE_BINDING, ")
		if(is_SPARSE_RESIDENCY) append("SPARSE_RESIDENCY, ")
		if(is_SPARSE_ALIASED) append("SPARSE_ALIASED, ")
		if(is_MUTABLE_FORMAT) append("MUTABLE_FORMAT, ")
		if(is_CUBE_COMPATIBLE) append("CUBE_COMPATIBLE, ")
		if(is_ALIAS) append("ALIAS, ")
		if(is_SPLIT_INSTANCE_BIND_REGIONS) append("SPLIT_INSTANCE_BIND_REGIONS, ")
		if(is_2D_ARRAY_COMPATIBLE) append("_2D_ARRAY_COMPATIBLE, ")
		if(is_BLOCK_TEXEL_VIEW_COMPATIBLE) append("BLOCK_TEXEL_VIEW_COMPATIBLE, ")
		if(is_EXTENDED_USAGE) append("EXTENDED_USAGE, ")
		if(is_PROTECTED) append("PROTECTED, ")
		if(is_DISJOINT) append("DISJOINT, ")
		if(is_CORNER_SAMPLED) append("CORNER_SAMPLED, ")
		if(is_SPLIT_INSTANCE_BIND_REGIONS_KHR) append("SPLIT_INSTANCE_BIND_REGIONS_KHR, ")
		if(is_2D_ARRAY_COMPATIBLE_KHR) append("_2D_ARRAY_COMPATIBLE_KHR, ")
		if(is_BLOCK_TEXEL_VIEW_COMPATIBLE_KHR) append("BLOCK_TEXEL_VIEW_COMPATIBLE_KHR, ")
		if(is_EXTENDED_USAGE_KHR) append("EXTENDED_USAGE_KHR, ")
		if(is_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH) append("SAMPLE_LOCATIONS_COMPATIBLE_DEPTH, ")
		if(is_DISJOINT_KHR) append("DISJOINT_KHR, ")
		if(is_ALIAS_KHR) append("ALIAS_KHR, ")
		if(is_SUBSAMPLED) append("SUBSAMPLED, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = ImageCreateFlags(0)
		val ALL get() = ImageCreateFlags(34783)
		val SPARSE_BINDING get() = ImageCreateFlags(1)
		val SPARSE_RESIDENCY get() = ImageCreateFlags(2)
		val SPARSE_ALIASED get() = ImageCreateFlags(4)
		val MUTABLE_FORMAT get() = ImageCreateFlags(8)
		val CUBE_COMPATIBLE get() = ImageCreateFlags(16)
		val ALIAS get() = ImageCreateFlags(1024)
		val SPLIT_INSTANCE_BIND_REGIONS get() = ImageCreateFlags(64)
		val _2D_ARRAY_COMPATIBLE get() = ImageCreateFlags(32)
		val BLOCK_TEXEL_VIEW_COMPATIBLE get() = ImageCreateFlags(128)
		val EXTENDED_USAGE get() = ImageCreateFlags(256)
		val PROTECTED get() = ImageCreateFlags(2048)
		val DISJOINT get() = ImageCreateFlags(512)
		val CORNER_SAMPLED get() = ImageCreateFlags(8192)
		val SPLIT_INSTANCE_BIND_REGIONS_KHR get() = ImageCreateFlags(64)
		val _2D_ARRAY_COMPATIBLE_KHR get() = ImageCreateFlags(32)
		val BLOCK_TEXEL_VIEW_COMPATIBLE_KHR get() = ImageCreateFlags(128)
		val EXTENDED_USAGE_KHR get() = ImageCreateFlags(256)
		val SAMPLE_LOCATIONS_COMPATIBLE_DEPTH get() = ImageCreateFlags(4096)
		val DISJOINT_KHR get() = ImageCreateFlags(512)
		val ALIAS_KHR get() = ImageCreateFlags(1024)
		val SUBSAMPLED get() = ImageCreateFlags(16384)
		
		inline fun compose(block: Companion.() -> ImageCreateFlags) = block(Companion)
	
	}


}