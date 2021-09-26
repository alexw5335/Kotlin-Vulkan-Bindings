// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkPrimitiveTopology {
 *         POINT_LIST                     = 0
 *         LINE_LIST                      = 1
 *         LINE_STRIP                     = 2
 *         TRIANGLE_LIST                  = 3
 *         TRIANGLE_STRIP                 = 4
 *         TRIANGLE_FAN                   = 5
 *         LINE_LIST_WITH_ADJACENCY       = 6
 *         LINE_STRIP_WITH_ADJACENCY      = 7
 *         TRIANGLE_LIST_WITH_ADJACENCY   = 8
 *         TRIANGLE_STRIP_WITH_ADJACENCY  = 9
 *         PATCH_LIST                     = 10
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class PrimitiveTopology(val id: Int) {
	
	
	val is_POINT_LIST get() = id == 0
	val is_LINE_LIST get() = id == 1
	val is_LINE_STRIP get() = id == 2
	val is_TRIANGLE_LIST get() = id == 3
	val is_TRIANGLE_STRIP get() = id == 4
	val is_TRIANGLE_FAN get() = id == 5
	val is_LINE_LIST_WITH_ADJACENCY get() = id == 6
	val is_LINE_STRIP_WITH_ADJACENCY get() = id == 7
	val is_TRIANGLE_LIST_WITH_ADJACENCY get() = id == 8
	val is_TRIANGLE_STRIP_WITH_ADJACENCY get() = id == 9
	val is_PATCH_LIST get() = id == 10
	
	
	
	override fun toString() = when(id) {
		POINT_LIST.id -> "POINT_LIST"
		LINE_LIST.id -> "LINE_LIST"
		LINE_STRIP.id -> "LINE_STRIP"
		TRIANGLE_LIST.id -> "TRIANGLE_LIST"
		TRIANGLE_STRIP.id -> "TRIANGLE_STRIP"
		TRIANGLE_FAN.id -> "TRIANGLE_FAN"
		LINE_LIST_WITH_ADJACENCY.id -> "LINE_LIST_WITH_ADJACENCY"
		LINE_STRIP_WITH_ADJACENCY.id -> "LINE_STRIP_WITH_ADJACENCY"
		TRIANGLE_LIST_WITH_ADJACENCY.id -> "TRIANGLE_LIST_WITH_ADJACENCY"
		TRIANGLE_STRIP_WITH_ADJACENCY.id -> "TRIANGLE_STRIP_WITH_ADJACENCY"
		PATCH_LIST.id -> "PATCH_LIST"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val POINT_LIST get() = PrimitiveTopology(0)
		val LINE_LIST get() = PrimitiveTopology(1)
		val LINE_STRIP get() = PrimitiveTopology(2)
		val TRIANGLE_LIST get() = PrimitiveTopology(3)
		val TRIANGLE_STRIP get() = PrimitiveTopology(4)
		val TRIANGLE_FAN get() = PrimitiveTopology(5)
		val LINE_LIST_WITH_ADJACENCY get() = PrimitiveTopology(6)
		val LINE_STRIP_WITH_ADJACENCY get() = PrimitiveTopology(7)
		val TRIANGLE_LIST_WITH_ADJACENCY get() = PrimitiveTopology(8)
		val TRIANGLE_STRIP_WITH_ADJACENCY get() = PrimitiveTopology(9)
		val PATCH_LIST get() = PrimitiveTopology(10)
	
	}


}