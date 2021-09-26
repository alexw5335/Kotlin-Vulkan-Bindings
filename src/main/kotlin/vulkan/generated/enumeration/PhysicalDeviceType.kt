// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkPhysicalDeviceType {
 *         OTHER           = 0
 *         INTEGRATED_GPU  = 1
 *         DISCRETE_GPU    = 2
 *         VIRTUAL_GPU     = 3
 *         CPU             = 4
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class PhysicalDeviceType(val id: Int) {
	
	
	val is_OTHER get() = id == 0
	val is_INTEGRATED_GPU get() = id == 1
	val is_DISCRETE_GPU get() = id == 2
	val is_VIRTUAL_GPU get() = id == 3
	val is_CPU get() = id == 4
	
	
	
	override fun toString() = when(id) {
		OTHER.id -> "OTHER"
		INTEGRATED_GPU.id -> "INTEGRATED_GPU"
		DISCRETE_GPU.id -> "DISCRETE_GPU"
		VIRTUAL_GPU.id -> "VIRTUAL_GPU"
		CPU.id -> "CPU"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val OTHER get() = PhysicalDeviceType(0)
		val INTEGRATED_GPU get() = PhysicalDeviceType(1)
		val DISCRETE_GPU get() = PhysicalDeviceType(2)
		val VIRTUAL_GPU get() = PhysicalDeviceType(3)
		val CPU get() = PhysicalDeviceType(4)
	
	}


}