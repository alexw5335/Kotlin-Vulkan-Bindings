// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkFilter {
 *         NEAREST    = 0
 *         LINEAR     = 1
 *         CUBIC      = 1000015000
 *         CUBIC_EXT  = 1000015000
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class Filter(val id: Int) {
	
	
	val is_NEAREST get() = id == 0
	val is_LINEAR get() = id == 1
	val is_CUBIC get() = id == 1000015000
	val is_CUBIC_EXT get() = id == 1000015000
	
	
	
	override fun toString() = when(id) {
		NEAREST.id -> "NEAREST"
		LINEAR.id -> "LINEAR"
		CUBIC.id -> "CUBIC"
		CUBIC_EXT.id -> "CUBIC_EXT"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val NEAREST get() = Filter(0)
		val LINEAR get() = Filter(1)
		val CUBIC get() = Filter(1000015000)
		val CUBIC_EXT get() = Filter(1000015000)
	
	}


}