// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkPipelineCacheCreateFlagBits {
 *         EXTERNALLY_SYNCHRONIZED  = 1
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class PipelineCacheCreateFlags(val bitfield: Int) {
	
	
	val is_EXTERNALLY_SYNCHRONIZED get() = bitfield and 1 != 0
	
	
	
	infix operator fun plus(other: PipelineCacheCreateFlags) = PipelineCacheCreateFlags(bitfield or other.bitfield)
	
	infix operator fun plus(other: Int) = PipelineCacheCreateFlags(bitfield or other)
	
	infix fun containsAll(mask: PipelineCacheCreateFlags) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Int) = bitfield and mask == mask
	
	infix fun containsSome(mask: PipelineCacheCreateFlags) = bitfield and mask.bitfield != 0
	
	infix fun containsSome(mask: Int) = bitfield and mask != 0
	
	
	
	override fun toString() = buildString {
		append("{ ")
		if(is_EXTERNALLY_SYNCHRONIZED) append("EXTERNALLY_SYNCHRONIZED, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = PipelineCacheCreateFlags(0)
		val ALL get() = PipelineCacheCreateFlags(1)
		val EXTERNALLY_SYNCHRONIZED get() = PipelineCacheCreateFlags(1)
		
		inline fun compose(block: Companion.() -> PipelineCacheCreateFlags) = block(Companion)
	
	}


}