// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkDescriptorType {
 *         SAMPLER                    = 0
 *         COMBINED_IMAGE_SAMPLER     = 1
 *         SAMPLED_IMAGE              = 2
 *         STORAGE_IMAGE              = 3
 *         UNIFORM_TEXEL_BUFFER       = 4
 *         STORAGE_TEXEL_BUFFER       = 5
 *         UNIFORM_BUFFER             = 6
 *         STORAGE_BUFFER             = 7
 *         UNIFORM_BUFFER_DYNAMIC     = 8
 *         STORAGE_BUFFER_DYNAMIC     = 9
 *         INPUT_ATTACHMENT           = 10
 *         INLINE_UNIFORM_BLOCK       = 1000138000
 *         ACCELERATION_STRUCTURE     = 1000150000
 *         ACCELERATION_STRUCTURE_NV  = 1000165000
 *         MUTABLE                    = 1000351000
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class DescriptorType(val id: Int) {
	
	
	val is_SAMPLER get() = id == 0
	val is_COMBINED_IMAGE_SAMPLER get() = id == 1
	val is_SAMPLED_IMAGE get() = id == 2
	val is_STORAGE_IMAGE get() = id == 3
	val is_UNIFORM_TEXEL_BUFFER get() = id == 4
	val is_STORAGE_TEXEL_BUFFER get() = id == 5
	val is_UNIFORM_BUFFER get() = id == 6
	val is_STORAGE_BUFFER get() = id == 7
	val is_UNIFORM_BUFFER_DYNAMIC get() = id == 8
	val is_STORAGE_BUFFER_DYNAMIC get() = id == 9
	val is_INPUT_ATTACHMENT get() = id == 10
	val is_INLINE_UNIFORM_BLOCK get() = id == 1000138000
	val is_ACCELERATION_STRUCTURE get() = id == 1000150000
	val is_ACCELERATION_STRUCTURE_NV get() = id == 1000165000
	val is_MUTABLE get() = id == 1000351000
	
	
	
	override fun toString() = when(id) {
		SAMPLER.id -> "SAMPLER"
		COMBINED_IMAGE_SAMPLER.id -> "COMBINED_IMAGE_SAMPLER"
		SAMPLED_IMAGE.id -> "SAMPLED_IMAGE"
		STORAGE_IMAGE.id -> "STORAGE_IMAGE"
		UNIFORM_TEXEL_BUFFER.id -> "UNIFORM_TEXEL_BUFFER"
		STORAGE_TEXEL_BUFFER.id -> "STORAGE_TEXEL_BUFFER"
		UNIFORM_BUFFER.id -> "UNIFORM_BUFFER"
		STORAGE_BUFFER.id -> "STORAGE_BUFFER"
		UNIFORM_BUFFER_DYNAMIC.id -> "UNIFORM_BUFFER_DYNAMIC"
		STORAGE_BUFFER_DYNAMIC.id -> "STORAGE_BUFFER_DYNAMIC"
		INPUT_ATTACHMENT.id -> "INPUT_ATTACHMENT"
		INLINE_UNIFORM_BLOCK.id -> "INLINE_UNIFORM_BLOCK"
		ACCELERATION_STRUCTURE.id -> "ACCELERATION_STRUCTURE"
		ACCELERATION_STRUCTURE_NV.id -> "ACCELERATION_STRUCTURE_NV"
		MUTABLE.id -> "MUTABLE"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val SAMPLER get() = DescriptorType(0)
		val COMBINED_IMAGE_SAMPLER get() = DescriptorType(1)
		val SAMPLED_IMAGE get() = DescriptorType(2)
		val STORAGE_IMAGE get() = DescriptorType(3)
		val UNIFORM_TEXEL_BUFFER get() = DescriptorType(4)
		val STORAGE_TEXEL_BUFFER get() = DescriptorType(5)
		val UNIFORM_BUFFER get() = DescriptorType(6)
		val STORAGE_BUFFER get() = DescriptorType(7)
		val UNIFORM_BUFFER_DYNAMIC get() = DescriptorType(8)
		val STORAGE_BUFFER_DYNAMIC get() = DescriptorType(9)
		val INPUT_ATTACHMENT get() = DescriptorType(10)
		val INLINE_UNIFORM_BLOCK get() = DescriptorType(1000138000)
		val ACCELERATION_STRUCTURE get() = DescriptorType(1000150000)
		val ACCELERATION_STRUCTURE_NV get() = DescriptorType(1000165000)
		val MUTABLE get() = DescriptorType(1000351000)
	
	}


}