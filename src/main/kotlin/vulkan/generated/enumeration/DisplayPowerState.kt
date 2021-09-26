// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkDisplayPowerStateEXT {
 *         OFF      = 0
 *         SUSPEND  = 1
 *         ON       = 2
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class DisplayPowerState(val id: Int) {
	
	
	val is_OFF get() = id == 0
	val is_SUSPEND get() = id == 1
	val is_ON get() = id == 2
	
	
	
	override fun toString() = when(id) {
		OFF.id -> "OFF"
		SUSPEND.id -> "SUSPEND"
		ON.id -> "ON"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val OFF get() = DisplayPowerState(0)
		val SUSPEND get() = DisplayPowerState(1)
		val ON get() = DisplayPowerState(2)
	
	}


}