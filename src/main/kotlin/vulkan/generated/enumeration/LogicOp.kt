// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkLogicOp {
 *         CLEAR          = 0
 *         AND            = 1
 *         AND_REVERSE    = 2
 *         COPY           = 3
 *         AND_INVERTED   = 4
 *         NO_OP          = 5
 *         XOR            = 6
 *         OR             = 7
 *         NOR            = 8
 *         EQUIVALENT     = 9
 *         INVERT         = 10
 *         OR_REVERSE     = 11
 *         COPY_INVERTED  = 12
 *         OR_INVERTED    = 13
 *         NAND           = 14
 *         SET            = 15
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class LogicOp(val id: Int) {
	
	
	val is_CLEAR get() = id == 0
	val is_AND get() = id == 1
	val is_AND_REVERSE get() = id == 2
	val is_COPY get() = id == 3
	val is_AND_INVERTED get() = id == 4
	val is_NO_OP get() = id == 5
	val is_XOR get() = id == 6
	val is_OR get() = id == 7
	val is_NOR get() = id == 8
	val is_EQUIVALENT get() = id == 9
	val is_INVERT get() = id == 10
	val is_OR_REVERSE get() = id == 11
	val is_COPY_INVERTED get() = id == 12
	val is_OR_INVERTED get() = id == 13
	val is_NAND get() = id == 14
	val is_SET get() = id == 15
	
	
	
	override fun toString() = when(id) {
		CLEAR.id -> "CLEAR"
		AND.id -> "AND"
		AND_REVERSE.id -> "AND_REVERSE"
		COPY.id -> "COPY"
		AND_INVERTED.id -> "AND_INVERTED"
		NO_OP.id -> "NO_OP"
		XOR.id -> "XOR"
		OR.id -> "OR"
		NOR.id -> "NOR"
		EQUIVALENT.id -> "EQUIVALENT"
		INVERT.id -> "INVERT"
		OR_REVERSE.id -> "OR_REVERSE"
		COPY_INVERTED.id -> "COPY_INVERTED"
		OR_INVERTED.id -> "OR_INVERTED"
		NAND.id -> "NAND"
		SET.id -> "SET"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val CLEAR get() = LogicOp(0)
		val AND get() = LogicOp(1)
		val AND_REVERSE get() = LogicOp(2)
		val COPY get() = LogicOp(3)
		val AND_INVERTED get() = LogicOp(4)
		val NO_OP get() = LogicOp(5)
		val XOR get() = LogicOp(6)
		val OR get() = LogicOp(7)
		val NOR get() = LogicOp(8)
		val EQUIVALENT get() = LogicOp(9)
		val INVERT get() = LogicOp(10)
		val OR_REVERSE get() = LogicOp(11)
		val COPY_INVERTED get() = LogicOp(12)
		val OR_INVERTED get() = LogicOp(13)
		val NAND get() = LogicOp(14)
		val SET get() = LogicOp(15)
	
	}


}