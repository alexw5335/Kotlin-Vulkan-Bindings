// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkPipelineCreationFeedbackFlagBitsEXT {
 *         VALID                           = 1
 *         APPLICATION_PIPELINE_CACHE_HIT  = 2
 *         BASE_PIPELINE_ACCELERATION      = 4
 *     }
 */
@Suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
@JvmInline
value class PipelineCreationFeedbackFlags(val bitfield: Int) {
	
	
	val is_VALID get() = bitfield and 1 != 0
	val is_APPLICATION_PIPELINE_CACHE_HIT get() = bitfield and 2 != 0
	val is_BASE_PIPELINE_ACCELERATION get() = bitfield and 4 != 0
	
	
	
	infix operator fun plus(other: PipelineCreationFeedbackFlags) = PipelineCreationFeedbackFlags(bitfield or other.bitfield)
	
	infix operator fun plus(other: Int) = PipelineCreationFeedbackFlags(bitfield or other)
	
	infix fun containsAll(mask: PipelineCreationFeedbackFlags) = bitfield and mask.bitfield == mask.bitfield
	
	infix fun containsAll(mask: Int) = bitfield and mask == mask
	
	infix fun containsSome(mask: PipelineCreationFeedbackFlags) = bitfield and mask.bitfield != 0
	
	infix fun containsSome(mask: Int) = bitfield and mask != 0
	
	
	
	override fun toString() = buildString {
		append("{ ")
		if(is_VALID) append("VALID, ")
		if(is_APPLICATION_PIPELINE_CACHE_HIT) append("APPLICATION_PIPELINE_CACHE_HIT, ")
		if(is_BASE_PIPELINE_ACCELERATION) append("BASE_PIPELINE_ACCELERATION, ")
		if(length == 2) append("*EMPTY*") else setLength(length - 2)
		append(" }")
	}
	
	
	
	companion object {
		
		val NONE get() = PipelineCreationFeedbackFlags(0)
		val ALL get() = PipelineCreationFeedbackFlags(7)
		val VALID get() = PipelineCreationFeedbackFlags(1)
		val APPLICATION_PIPELINE_CACHE_HIT get() = PipelineCreationFeedbackFlags(2)
		val BASE_PIPELINE_ACCELERATION get() = PipelineCreationFeedbackFlags(4)
		
		inline fun compose(block: Companion.() -> PipelineCreationFeedbackFlags) = block(Companion)
	
	}


}