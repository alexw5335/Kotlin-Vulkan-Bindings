// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkBlendOverlapEXT {
 *         UNCORRELATED  = 0
 *         DISJOINT      = 1
 *         CONJOINT      = 2
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class BlendOverlap(val id: Int) {
	
	
	val is_UNCORRELATED get() = id == 0
	val is_DISJOINT get() = id == 1
	val is_CONJOINT get() = id == 2
	
	
	
	override fun toString() = when(id) {
		UNCORRELATED.id -> "UNCORRELATED"
		DISJOINT.id -> "DISJOINT"
		CONJOINT.id -> "CONJOINT"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val UNCORRELATED get() = BlendOverlap(0)
		val DISJOINT get() = BlendOverlap(1)
		val CONJOINT get() = BlendOverlap(2)
	
	}


}