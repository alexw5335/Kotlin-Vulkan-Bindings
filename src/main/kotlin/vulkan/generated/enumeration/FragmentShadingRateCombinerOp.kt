// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkFragmentShadingRateCombinerOpKHR {
 *         KEEP     = 0
 *         REPLACE  = 1
 *         MIN      = 2
 *         MAX      = 3
 *         MUL      = 4
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class FragmentShadingRateCombinerOp(val id: Int) {
	
	
	val is_KEEP get() = id == 0
	val is_REPLACE get() = id == 1
	val is_MIN get() = id == 2
	val is_MAX get() = id == 3
	val is_MUL get() = id == 4
	
	
	
	override fun toString() = when(id) {
		KEEP.id -> "KEEP"
		REPLACE.id -> "REPLACE"
		MIN.id -> "MIN"
		MAX.id -> "MAX"
		MUL.id -> "MUL"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val KEEP get() = FragmentShadingRateCombinerOp(0)
		val REPLACE get() = FragmentShadingRateCombinerOp(1)
		val MIN get() = FragmentShadingRateCombinerOp(2)
		val MAX get() = FragmentShadingRateCombinerOp(3)
		val MUL get() = FragmentShadingRateCombinerOp(4)
	
	}


}