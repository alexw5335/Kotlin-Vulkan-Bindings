// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkChromaLocationKHR {
 *         COSITED_EVEN      = 0
 *         MIDPOINT          = 1
 *         COSITED_EVEN_KHR  = 0
 *         MIDPOINT_KHR      = 1
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class ChromaLocation(val id: Int) {
	
	
	val is_COSITED_EVEN get() = id == 0
	val is_MIDPOINT get() = id == 1
	val is_COSITED_EVEN_KHR get() = id == 0
	val is_MIDPOINT_KHR get() = id == 1
	
	
	
	override fun toString() = when(id) {
		COSITED_EVEN.id -> "COSITED_EVEN"
		MIDPOINT.id -> "MIDPOINT"
		COSITED_EVEN_KHR.id -> "COSITED_EVEN_KHR"
		MIDPOINT_KHR.id -> "MIDPOINT_KHR"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val COSITED_EVEN get() = ChromaLocation(0)
		val MIDPOINT get() = ChromaLocation(1)
		val COSITED_EVEN_KHR get() = ChromaLocation(0)
		val MIDPOINT_KHR get() = ChromaLocation(1)
	
	}


}