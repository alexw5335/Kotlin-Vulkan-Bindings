// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkCoverageReductionModeNV {
 *         MERGE     = 0
 *         TRUNCATE  = 1
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class CoverageReductionMode(val id: Int) {
	
	
	val is_MERGE get() = id == 0
	val is_TRUNCATE get() = id == 1
	
	
	
	override fun toString() = when(id) {
		MERGE.id -> "MERGE"
		TRUNCATE.id -> "TRUNCATE"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val MERGE get() = CoverageReductionMode(0)
		val TRUNCATE get() = CoverageReductionMode(1)
	
	}


}