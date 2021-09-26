// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkSharingMode {
 *         EXCLUSIVE   = 0
 *         CONCURRENT  = 1
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class SharingMode(val id: Int) {
	
	
	val is_EXCLUSIVE get() = id == 0
	val is_CONCURRENT get() = id == 1
	
	
	
	override fun toString() = when(id) {
		EXCLUSIVE.id -> "EXCLUSIVE"
		CONCURRENT.id -> "CONCURRENT"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val EXCLUSIVE get() = SharingMode(0)
		val CONCURRENT get() = SharingMode(1)
	
	}


}