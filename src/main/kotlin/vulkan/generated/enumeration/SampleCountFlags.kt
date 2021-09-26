// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkSampleCountFlagBits {
 *         _1   = 1
 *         _2   = 2
 *         _4   = 4
 *         _8   = 8
 *         _16  = 16
 *         _32  = 32
 *         _64  = 64
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class SampleCountFlags(val bitfield: Int) {
	
	
	val is_1 get() = bitfield and 1 != 0
	val is_2 get() = bitfield and 2 != 0
	val is_4 get() = bitfield and 4 != 0
	val is_8 get() = bitfield and 8 != 0
	val is_16 get() = bitfield and 16 != 0
	val is_32 get() = bitfield and 32 != 0
	val is_64 get() = bitfield and 64 != 0
	
	
	
	infix operator fun plus(other: SampleCountFlags) = SampleCountFlags(bitfield or other.bitfield)
	
	infix operator fun plus(other: Int) = SampleCountFlags(bitfield or other)
	
	infix fun containsAll(mask: SampleCountFlags) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Int) = bitfield and mask == mask
	
	infix fun containsSome(mask: SampleCountFlags) = bitfield and mask.bitfield != 0
	
	infix fun containsSome(mask: Int) = bitfield and mask != 0
	
	
	
	override fun toString() = buildString {
		append("{ ")
		if(is_1) append("_1, ")
		if(is_2) append("_2, ")
		if(is_4) append("_4, ")
		if(is_8) append("_8, ")
		if(is_16) append("_16, ")
		if(is_32) append("_32, ")
		if(is_64) append("_64, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = SampleCountFlags(0)
		val ALL get() = SampleCountFlags(127)
		val _1 get() = SampleCountFlags(1)
		val _2 get() = SampleCountFlags(2)
		val _4 get() = SampleCountFlags(4)
		val _8 get() = SampleCountFlags(8)
		val _16 get() = SampleCountFlags(16)
		val _32 get() = SampleCountFlags(32)
		val _64 get() = SampleCountFlags(64)
		
		inline fun compose(block: Companion.() -> SampleCountFlags) = block(Companion)
	
	}


}