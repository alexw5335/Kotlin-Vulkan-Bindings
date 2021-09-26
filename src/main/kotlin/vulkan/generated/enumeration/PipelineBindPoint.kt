// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkPipelineBindPoint {
 *         GRAPHICS        = 0
 *         COMPUTE         = 1
 *         RAY_TRACING     = 1000165000
 *         RAY_TRACING_NV  = 1000165000
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class PipelineBindPoint(val id: Int) {
	
	
	val is_GRAPHICS get() = id == 0
	val is_COMPUTE get() = id == 1
	val is_RAY_TRACING get() = id == 1000165000
	val is_RAY_TRACING_NV get() = id == 1000165000
	
	
	
	override fun toString() = when(id) {
		GRAPHICS.id -> "GRAPHICS"
		COMPUTE.id -> "COMPUTE"
		RAY_TRACING.id -> "RAY_TRACING"
		RAY_TRACING_NV.id -> "RAY_TRACING_NV"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val GRAPHICS get() = PipelineBindPoint(0)
		val COMPUTE get() = PipelineBindPoint(1)
		val RAY_TRACING get() = PipelineBindPoint(1000165000)
		val RAY_TRACING_NV get() = PipelineBindPoint(1000165000)
	
	}


}