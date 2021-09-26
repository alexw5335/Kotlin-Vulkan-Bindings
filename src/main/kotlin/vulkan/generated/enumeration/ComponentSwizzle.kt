// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkComponentSwizzle {
 *         IDENTITY  = 0
 *         ZERO      = 1
 *         ONE       = 2
 *         R         = 3
 *         G         = 4
 *         B         = 5
 *         A         = 6
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class ComponentSwizzle(val id: Int) {
	
	
	val is_IDENTITY get() = id == 0
	val is_ZERO get() = id == 1
	val is_ONE get() = id == 2
	val is_R get() = id == 3
	val is_G get() = id == 4
	val is_B get() = id == 5
	val is_A get() = id == 6
	
	
	
	override fun toString() = when(id) {
		IDENTITY.id -> "IDENTITY"
		ZERO.id -> "ZERO"
		ONE.id -> "ONE"
		R.id -> "R"
		G.id -> "G"
		B.id -> "B"
		A.id -> "A"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val IDENTITY get() = ComponentSwizzle(0)
		val ZERO get() = ComponentSwizzle(1)
		val ONE get() = ComponentSwizzle(2)
		val R get() = ComponentSwizzle(3)
		val G get() = ComponentSwizzle(4)
		val B get() = ComponentSwizzle(5)
		val A get() = ComponentSwizzle(6)
	
	}


}