// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkCompareOp {
 *         NEVER             = 0
 *         LESS              = 1
 *         EQUAL             = 2
 *         LESS_OR_EQUAL     = 3
 *         GREATER           = 4
 *         NOT_EQUAL         = 5
 *         GREATER_OR_EQUAL  = 6
 *         ALWAYS            = 7
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class CompareOp(val id: Int) {
	
	
	val is_NEVER get() = id == 0
	val is_LESS get() = id == 1
	val is_EQUAL get() = id == 2
	val is_LESS_OR_EQUAL get() = id == 3
	val is_GREATER get() = id == 4
	val is_NOT_EQUAL get() = id == 5
	val is_GREATER_OR_EQUAL get() = id == 6
	val is_ALWAYS get() = id == 7
	
	
	
	override fun toString() = when(id) {
		NEVER.id -> "NEVER"
		LESS.id -> "LESS"
		EQUAL.id -> "EQUAL"
		LESS_OR_EQUAL.id -> "LESS_OR_EQUAL"
		GREATER.id -> "GREATER"
		NOT_EQUAL.id -> "NOT_EQUAL"
		GREATER_OR_EQUAL.id -> "GREATER_OR_EQUAL"
		ALWAYS.id -> "ALWAYS"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val NEVER get() = CompareOp(0)
		val LESS get() = CompareOp(1)
		val EQUAL get() = CompareOp(2)
		val LESS_OR_EQUAL get() = CompareOp(3)
		val GREATER get() = CompareOp(4)
		val NOT_EQUAL get() = CompareOp(5)
		val GREATER_OR_EQUAL get() = CompareOp(6)
		val ALWAYS get() = CompareOp(7)
	
	}


}