// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkPerformanceCounterScopeKHR {
 *         COMMAND_BUFFER              = 0
 *         RENDER_PASS                 = 1
 *         COMMAND                     = 2
 *         QUERY_SCOPE_COMMAND_BUFFER  = 0
 *         QUERY_SCOPE_RENDER_PASS     = 1
 *         QUERY_SCOPE_COMMAND         = 2
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class PerformanceCounterScope(val id: Int) {
	
	
	val is_COMMAND_BUFFER get() = id == 0
	val is_RENDER_PASS get() = id == 1
	val is_COMMAND get() = id == 2
	val is_QUERY_SCOPE_COMMAND_BUFFER get() = id == 0
	val is_QUERY_SCOPE_RENDER_PASS get() = id == 1
	val is_QUERY_SCOPE_COMMAND get() = id == 2
	
	
	
	override fun toString() = when(id) {
		COMMAND_BUFFER.id -> "COMMAND_BUFFER"
		RENDER_PASS.id -> "RENDER_PASS"
		COMMAND.id -> "COMMAND"
		QUERY_SCOPE_COMMAND_BUFFER.id -> "QUERY_SCOPE_COMMAND_BUFFER"
		QUERY_SCOPE_RENDER_PASS.id -> "QUERY_SCOPE_RENDER_PASS"
		QUERY_SCOPE_COMMAND.id -> "QUERY_SCOPE_COMMAND"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val COMMAND_BUFFER get() = PerformanceCounterScope(0)
		val RENDER_PASS get() = PerformanceCounterScope(1)
		val COMMAND get() = PerformanceCounterScope(2)
		val QUERY_SCOPE_COMMAND_BUFFER get() = PerformanceCounterScope(0)
		val QUERY_SCOPE_RENDER_PASS get() = PerformanceCounterScope(1)
		val QUERY_SCOPE_COMMAND get() = PerformanceCounterScope(2)
	
	}


}