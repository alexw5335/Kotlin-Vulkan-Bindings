// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkCoverageModulationModeNV {
 *         NONE   = 0
 *         RGB    = 1
 *         ALPHA  = 2
 *         RGBA   = 3
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class CoverageModulationMode(val id: Int) {
	
	
	val is_NONE get() = id == 0
	val is_RGB get() = id == 1
	val is_ALPHA get() = id == 2
	val is_RGBA get() = id == 3
	
	
	
	override fun toString() = when(id) {
		NONE.id -> "NONE"
		RGB.id -> "RGB"
		ALPHA.id -> "ALPHA"
		RGBA.id -> "RGBA"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val NONE get() = CoverageModulationMode(0)
		val RGB get() = CoverageModulationMode(1)
		val ALPHA get() = CoverageModulationMode(2)
		val RGBA get() = CoverageModulationMode(3)
	
	}


}