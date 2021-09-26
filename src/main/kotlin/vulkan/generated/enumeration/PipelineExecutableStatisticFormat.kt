// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkPipelineExecutableStatisticFormatKHR {
 *         BOOL32   = 0
 *         INT64    = 1
 *         UINT64   = 2
 *         FLOAT64  = 3
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class PipelineExecutableStatisticFormat(val id: Int) {
	
	
	val is_BOOL32 get() = id == 0
	val is_INT64 get() = id == 1
	val is_UINT64 get() = id == 2
	val is_FLOAT64 get() = id == 3
	
	
	
	override fun toString() = when(id) {
		BOOL32.id -> "BOOL32"
		INT64.id -> "INT64"
		UINT64.id -> "UINT64"
		FLOAT64.id -> "FLOAT64"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val BOOL32 get() = PipelineExecutableStatisticFormat(0)
		val INT64 get() = PipelineExecutableStatisticFormat(1)
		val UINT64 get() = PipelineExecutableStatisticFormat(2)
		val FLOAT64 get() = PipelineExecutableStatisticFormat(3)
	
	}


}