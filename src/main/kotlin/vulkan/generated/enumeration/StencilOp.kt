// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkStencilOp {
 *         KEEP                 = 0
 *         ZERO                 = 1
 *         REPLACE              = 2
 *         INCREMENT_AND_CLAMP  = 3
 *         DECREMENT_AND_CLAMP  = 4
 *         INVERT               = 5
 *         INCREMENT_AND_WRAP   = 6
 *         DECREMENT_AND_WRAP   = 7
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class StencilOp(val id: Int) {
	
	
	val is_KEEP get() = id == 0
	val is_ZERO get() = id == 1
	val is_REPLACE get() = id == 2
	val is_INCREMENT_AND_CLAMP get() = id == 3
	val is_DECREMENT_AND_CLAMP get() = id == 4
	val is_INVERT get() = id == 5
	val is_INCREMENT_AND_WRAP get() = id == 6
	val is_DECREMENT_AND_WRAP get() = id == 7
	
	
	
	override fun toString() = when(id) {
		KEEP.id -> "KEEP"
		ZERO.id -> "ZERO"
		REPLACE.id -> "REPLACE"
		INCREMENT_AND_CLAMP.id -> "INCREMENT_AND_CLAMP"
		DECREMENT_AND_CLAMP.id -> "DECREMENT_AND_CLAMP"
		INVERT.id -> "INVERT"
		INCREMENT_AND_WRAP.id -> "INCREMENT_AND_WRAP"
		DECREMENT_AND_WRAP.id -> "DECREMENT_AND_WRAP"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val KEEP get() = StencilOp(0)
		val ZERO get() = StencilOp(1)
		val REPLACE get() = StencilOp(2)
		val INCREMENT_AND_CLAMP get() = StencilOp(3)
		val DECREMENT_AND_CLAMP get() = StencilOp(4)
		val INVERT get() = StencilOp(5)
		val INCREMENT_AND_WRAP get() = StencilOp(6)
		val DECREMENT_AND_WRAP get() = StencilOp(7)
	
	}


}