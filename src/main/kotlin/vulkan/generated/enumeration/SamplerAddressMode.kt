// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkSamplerAddressMode {
 *         REPEAT                    = 0
 *         MIRRORED_REPEAT           = 1
 *         CLAMP_TO_EDGE             = 2
 *         CLAMP_TO_BORDER           = 3
 *         MIRROR_CLAMP_TO_EDGE      = 4
 *         MIRROR_CLAMP_TO_EDGE_KHR  = 4
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class SamplerAddressMode(val id: Int) {
	
	
	val is_REPEAT get() = id == 0
	val is_MIRRORED_REPEAT get() = id == 1
	val is_CLAMP_TO_EDGE get() = id == 2
	val is_CLAMP_TO_BORDER get() = id == 3
	val is_MIRROR_CLAMP_TO_EDGE get() = id == 4
	val is_MIRROR_CLAMP_TO_EDGE_KHR get() = id == 4
	
	
	
	override fun toString() = when(id) {
		REPEAT.id -> "REPEAT"
		MIRRORED_REPEAT.id -> "MIRRORED_REPEAT"
		CLAMP_TO_EDGE.id -> "CLAMP_TO_EDGE"
		CLAMP_TO_BORDER.id -> "CLAMP_TO_BORDER"
		MIRROR_CLAMP_TO_EDGE.id -> "MIRROR_CLAMP_TO_EDGE"
		MIRROR_CLAMP_TO_EDGE_KHR.id -> "MIRROR_CLAMP_TO_EDGE_KHR"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val REPEAT get() = SamplerAddressMode(0)
		val MIRRORED_REPEAT get() = SamplerAddressMode(1)
		val CLAMP_TO_EDGE get() = SamplerAddressMode(2)
		val CLAMP_TO_BORDER get() = SamplerAddressMode(3)
		val MIRROR_CLAMP_TO_EDGE get() = SamplerAddressMode(4)
		val MIRROR_CLAMP_TO_EDGE_KHR get() = SamplerAddressMode(4)
	
	}


}