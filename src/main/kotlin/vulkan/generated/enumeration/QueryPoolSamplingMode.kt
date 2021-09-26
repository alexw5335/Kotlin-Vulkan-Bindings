// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkQueryPoolSamplingModeINTEL {
 *         MANUAL  = 0
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class QueryPoolSamplingMode(val id: Int) {
	
	
	val is_MANUAL get() = id == 0
	
	
	
	override fun toString() = when(id) {
		MANUAL.id -> "MANUAL"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val MANUAL get() = QueryPoolSamplingMode(0)
	
	}


}