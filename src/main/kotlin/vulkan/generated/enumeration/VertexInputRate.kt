// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkVertexInputRate {
 *         VERTEX    = 0
 *         INSTANCE  = 1
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class VertexInputRate(val id: Int) {
	
	
	val is_VERTEX get() = id == 0
	val is_INSTANCE get() = id == 1
	
	
	
	override fun toString() = when(id) {
		VERTEX.id -> "VERTEX"
		INSTANCE.id -> "INSTANCE"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val VERTEX get() = VertexInputRate(0)
		val INSTANCE get() = VertexInputRate(1)
	
	}


}