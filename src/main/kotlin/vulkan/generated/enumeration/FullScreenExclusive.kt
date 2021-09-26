// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkFullScreenExclusiveEXT {
 *         DEFAULT                 = 0
 *         ALLOWED                 = 1
 *         DISALLOWED              = 2
 *         APPLICATION_CONTROLLED  = 3
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class FullScreenExclusive(val id: Int) {
	
	
	val is_DEFAULT get() = id == 0
	val is_ALLOWED get() = id == 1
	val is_DISALLOWED get() = id == 2
	val is_APPLICATION_CONTROLLED get() = id == 3
	
	
	
	override fun toString() = when(id) {
		DEFAULT.id -> "DEFAULT"
		ALLOWED.id -> "ALLOWED"
		DISALLOWED.id -> "DISALLOWED"
		APPLICATION_CONTROLLED.id -> "APPLICATION_CONTROLLED"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val DEFAULT get() = FullScreenExclusive(0)
		val ALLOWED get() = FullScreenExclusive(1)
		val DISALLOWED get() = FullScreenExclusive(2)
		val APPLICATION_CONTROLLED get() = FullScreenExclusive(3)
	
	}


}