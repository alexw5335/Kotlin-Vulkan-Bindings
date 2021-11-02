// This file has been automatically generated.

package kvb.vulkan

/**
 *     enum VkResult {
 *         VK_SUCCESS                                             = 0
 *         VK_NOT_READY                                           = 1
 *         VK_TIMEOUT                                             = 2
 *         VK_EVENT_SET                                           = 3
 *         VK_EVENT_RESET                                         = 4
 *         VK_INCOMPLETE                                          = 5
 *         VK_ERROR_OUT_OF_HOST_MEMORY                            = -1
 *         VK_ERROR_OUT_OF_DEVICE_MEMORY                          = -2
 *         VK_ERROR_INITIALIZATION_FAILED                         = -3
 *         VK_ERROR_DEVICE_LOST                                   = -4
 *         VK_ERROR_MEMORY_MAP_FAILED                             = -5
 *         VK_ERROR_LAYER_NOT_PRESENT                             = -6
 *         VK_ERROR_EXTENSION_NOT_PRESENT                         = -7
 *         VK_ERROR_FEATURE_NOT_PRESENT                           = -8
 *         VK_ERROR_INCOMPATIBLE_DRIVER                           = -9
 *         VK_ERROR_TOO_MANY_OBJECTS                              = -10
 *         VK_ERROR_FORMAT_NOT_SUPPORTED                          = -11
 *         VK_ERROR_FRAGMENTED_POOL                               = -12
 *         VK_ERROR_UNKNOWN                                       = -13
 *         VK_ERROR_OUT_OF_POOL_MEMORY                            = -1000069000
 *         VK_ERROR_INVALID_EXTERNAL_HANDLE                       = -1000072003
 *         VK_ERROR_FRAGMENTATION                                 = -1000161000
 *         VK_ERROR_INVALID_OPAQUE_CAPTURE_ADDRESS                = -1000257000
 *         VK_ERROR_SURFACE_LOST_KHR                              = -1000000000
 *         VK_ERROR_NATIVE_WINDOW_IN_USE_KHR                      = -1000000001
 *         VK_SUBOPTIMAL_KHR                                      = 1000001003
 *         VK_ERROR_OUT_OF_DATE_KHR                               = -1000001004
 *         VK_ERROR_INCOMPATIBLE_DISPLAY_KHR                      = -1000003001
 *         VK_ERROR_VALIDATION_FAILED_EXT                         = -1000011001
 *         VK_ERROR_INVALID_SHADER_NV                             = -1000012000
 *         VK_ERROR_OUT_OF_POOL_MEMORY_KHR                        = -1000069000
 *         VK_ERROR_INVALID_EXTERNAL_HANDLE_KHR                   = -1000072003
 *         VK_ERROR_INVALID_DRM_FORMAT_MODIFIER_PLANE_LAYOUT_EXT  = -1000158000
 *         VK_ERROR_FRAGMENTATION_EXT                             = -1000161000
 *         VK_ERROR_NOT_PERMITTED_EXT                             = -1000174001
 *         VK_ERROR_INVALID_DEVICE_ADDRESS_EXT                    = -1000257000
 *         VK_ERROR_FULL_SCREEN_EXCLUSIVE_MODE_LOST_EXT           = -1000255000
 *         VK_ERROR_INVALID_OPAQUE_CAPTURE_ADDRESS_KHR            = -1000257000
 *         VK_THREAD_IDLE_KHR                                     = 1000268000
 *         VK_THREAD_DONE_KHR                                     = 1000268001
 *         VK_OPERATION_DEFERRED_KHR                              = 1000268002
 *         VK_OPERATION_NOT_DEFERRED_KHR                          = 1000268003
 *         VK_PIPELINE_COMPILE_REQUIRED_EXT                       = 1000297000
 *         VK_ERROR_PIPELINE_COMPILE_REQUIRED_EXT                 = 1000297000
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class Result(val value: Int) {
	
	
	companion object {
		
		val SUCCESS = Result(0)
		
		val NOT_READY = Result(1)
		
		val TIMEOUT = Result(2)
		
		val EVENT_SET = Result(3)
		
		val EVENT_RESET = Result(4)
		
		val INCOMPLETE = Result(5)
		
		val ERROR_OUT_OF_HOST_MEMORY = Result(-1)
		
		val ERROR_OUT_OF_DEVICE_MEMORY = Result(-2)
		
		val ERROR_INITIALIZATION_FAILED = Result(-3)
		
		val ERROR_DEVICE_LOST = Result(-4)
		
		val ERROR_MEMORY_MAP_FAILED = Result(-5)
		
		val ERROR_LAYER_NOT_PRESENT = Result(-6)
		
		val ERROR_EXTENSION_NOT_PRESENT = Result(-7)
		
		val ERROR_FEATURE_NOT_PRESENT = Result(-8)
		
		val ERROR_INCOMPATIBLE_DRIVER = Result(-9)
		
		val ERROR_TOO_MANY_OBJECTS = Result(-10)
		
		val ERROR_FORMAT_NOT_SUPPORTED = Result(-11)
		
		val ERROR_FRAGMENTED_POOL = Result(-12)
		
		val ERROR_UNKNOWN = Result(-13)
		
		val ERROR_OUT_OF_POOL_MEMORY = Result(-1000069000)
		
		val ERROR_INVALID_EXTERNAL_HANDLE = Result(-1000072003)
		
		val ERROR_FRAGMENTATION = Result(-1000161000)
		
		val ERROR_INVALID_OPAQUE_CAPTURE_ADDRESS = Result(-1000257000)
		
		val ERROR_SURFACE_LOST = Result(-1000000000)
		
		val ERROR_NATIVE_WINDOW_IN_USE = Result(-1000000001)
		
		val SUBOPTIMAL = Result(1000001003)
		
		val ERROR_OUT_OF_DATE = Result(-1000001004)
		
		val ERROR_INCOMPATIBLE_DISPLAY = Result(-1000003001)
		
		val ERROR_INVALID_DRM_FORMAT_MODIFIER_PLANE_LAYOUT = Result(-1000158000)
		
		val ERROR_NOT_PERMITTED = Result(-1000174001)
		
		val ERROR_FULL_SCREEN_EXCLUSIVE_MODE_LOST = Result(-1000255000)
		
		val THREAD_IDLE = Result(1000268000)
		
		val THREAD_DONE = Result(1000268001)
		
		val OPERATION_DEFERRED = Result(1000268002)
		
		val OPERATION_NOT_DEFERRED = Result(1000268003)
		
		val PIPELINE_COMPILE_REQUIRED = Result(1000297000)
	
	}
	
	
	
	override fun toString() = when(value) {
		0 -> "SUCCESS"
		1 -> "NOT_READY"
		2 -> "TIMEOUT"
		3 -> "EVENT_SET"
		4 -> "EVENT_RESET"
		5 -> "INCOMPLETE"
		-1 -> "ERROR_OUT_OF_HOST_MEMORY"
		-2 -> "ERROR_OUT_OF_DEVICE_MEMORY"
		-3 -> "ERROR_INITIALIZATION_FAILED"
		-4 -> "ERROR_DEVICE_LOST"
		-5 -> "ERROR_MEMORY_MAP_FAILED"
		-6 -> "ERROR_LAYER_NOT_PRESENT"
		-7 -> "ERROR_EXTENSION_NOT_PRESENT"
		-8 -> "ERROR_FEATURE_NOT_PRESENT"
		-9 -> "ERROR_INCOMPATIBLE_DRIVER"
		-10 -> "ERROR_TOO_MANY_OBJECTS"
		-11 -> "ERROR_FORMAT_NOT_SUPPORTED"
		-12 -> "ERROR_FRAGMENTED_POOL"
		-13 -> "ERROR_UNKNOWN"
		-1000069000 -> "ERROR_OUT_OF_POOL_MEMORY"
		-1000072003 -> "ERROR_INVALID_EXTERNAL_HANDLE"
		-1000161000 -> "ERROR_FRAGMENTATION"
		-1000257000 -> "ERROR_INVALID_OPAQUE_CAPTURE_ADDRESS"
		-1000000000 -> "ERROR_SURFACE_LOST"
		-1000000001 -> "ERROR_NATIVE_WINDOW_IN_USE"
		1000001003 -> "SUBOPTIMAL"
		-1000001004 -> "ERROR_OUT_OF_DATE"
		-1000003001 -> "ERROR_INCOMPATIBLE_DISPLAY"
		-1000158000 -> "ERROR_INVALID_DRM_FORMAT_MODIFIER_PLANE_LAYOUT"
		-1000174001 -> "ERROR_NOT_PERMITTED"
		-1000255000 -> "ERROR_FULL_SCREEN_EXCLUSIVE_MODE_LOST"
		1000268000 -> "THREAD_IDLE"
		1000268001 -> "THREAD_DONE"
		1000268002 -> "OPERATION_DEFERRED"
		1000268003 -> "OPERATION_NOT_DEFERRED"
		1000297000 -> "PIPELINE_COMPILE_REQUIRED"
		else -> "*INVALID*"
	}


}