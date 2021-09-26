// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkPerformanceConfigurationTypeINTEL {
 *         COMMAND_QUEUE_METRICS_DISCOVERY_ACTIVATED  = 0
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class PerformanceConfigurationType(val id: Int) {
	
	
	val is_COMMAND_QUEUE_METRICS_DISCOVERY_ACTIVATED get() = id == 0
	
	
	
	override fun toString() = when(id) {
		COMMAND_QUEUE_METRICS_DISCOVERY_ACTIVATED.id -> "COMMAND_QUEUE_METRICS_DISCOVERY_ACTIVATED"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val COMMAND_QUEUE_METRICS_DISCOVERY_ACTIVATED get() = PerformanceConfigurationType(0)
	
	}


}