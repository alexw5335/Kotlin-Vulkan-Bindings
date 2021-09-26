// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkDeviceEventTypeEXT {
 *         DISPLAY_HOTPLUG  = 0
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class DeviceEventType(val id: Int) {
	
	
	val is_DISPLAY_HOTPLUG get() = id == 0
	
	
	
	override fun toString() = when(id) {
		DISPLAY_HOTPLUG.id -> "DISPLAY_HOTPLUG"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val DISPLAY_HOTPLUG get() = DeviceEventType(0)
	
	}


}