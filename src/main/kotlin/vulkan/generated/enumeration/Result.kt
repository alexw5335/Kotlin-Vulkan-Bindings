// This file has been automatically generated.

package vulkan.generated.enumeration

/**
 *     enum VkResult {
 *         SUCCESS                                         = 0
 *         NOT_READY                                       = 1
 *         TIMEOUT                                         = 2
 *         EVENT_SET                                       = 3
 *         EVENT_RESET                                     = 4
 *         INCOMPLETE                                      = 5
 *         ERROR_OUT_OF_HOST_MEMORY                        = -1
 *         ERROR_OUT_OF_DEVICE_MEMORY                      = -2
 *         ERROR_INITIALIZATION_FAILED                     = -3
 *         ERROR_DEVICE_LOST                               = -4
 *         ERROR_MEMORY_MAP_FAILED                         = -5
 *         ERROR_LAYER_NOT_PRESENT                         = -6
 *         ERROR_EXTENSION_NOT_PRESENT                     = -7
 *         ERROR_FEATURE_NOT_PRESENT                       = -8
 *         ERROR_INCOMPATIBLE_DRIVER                       = -9
 *         ERROR_TOO_MANY_OBJECTS                          = -10
 *         ERROR_FORMAT_NOT_SUPPORTED                      = -11
 *         ERROR_FRAGMENTED_POOL                           = -12
 *         ERROR_UNKNOWN                                   = -13
 *         ERROR_OUT_OF_POOL_MEMORY                        = -1000069000
 *         ERROR_INVALID_EXTERNAL_HANDLE                   = -1000072003
 *         ERROR_FRAGMENTATION                             = -1000161000
 *         ERROR_INVALID_OPAQUE_CAPTURE_ADDRESS            = -1000257000
 *         ERROR_SURFACE_LOST                              = -1000000000
 *         ERROR_NATIVE_WINDOW_IN_USE                      = -1000000001
 *         SUBOPTIMAL                                      = 1000001003
 *         ERROR_OUT_OF_DATE                               = -1000001004
 *         ERROR_INCOMPATIBLE_DISPLAY                      = -1000003001
 *         ERROR_VALIDATION_FAILED                         = -1000011001
 *         ERROR_INVALID_SHADER                            = -1000012000
 *         ERROR_OUT_OF_POOL_MEMORY_KHR                    = -1000069000
 *         ERROR_INVALID_EXTERNAL_HANDLE_KHR               = -1000072003
 *         ERROR_INVALID_DRM_FORMAT_MODIFIER_PLANE_LAYOUT  = -1000158000
 *         ERROR_FRAGMENTATION_EXT                         = -1000161000
 *         ERROR_NOT_PERMITTED                             = -1000174001
 *         ERROR_INVALID_DEVICE_ADDRESS                    = -1000257000
 *         ERROR_FULL_SCREEN_EXCLUSIVE_MODE_LOST           = -1000255000
 *         ERROR_INVALID_OPAQUE_CAPTURE_ADDRESS_KHR        = -1000257000
 *         THREAD_IDLE                                     = 1000268000
 *         THREAD_DONE                                     = 1000268001
 *         OPERATION_DEFERRED                              = 1000268002
 *         OPERATION_NOT_DEFERRED                          = 1000268003
 *         PIPELINE_COMPILE_REQUIRED                       = 1000297000
 *         ERROR_PIPELINE_COMPILE_REQUIRED                 = 1000297000
 *     }
 */
@Suppress("unused", "propertyName")
@JvmInline
value class Result(val id: Int) {
	
	
	val is_SUCCESS get() = id == 0
	val is_NOT_READY get() = id == 1
	val is_TIMEOUT get() = id == 2
	val is_EVENT_SET get() = id == 3
	val is_EVENT_RESET get() = id == 4
	val is_INCOMPLETE get() = id == 5
	val is_ERROR_OUT_OF_HOST_MEMORY get() = id == -1
	val is_ERROR_OUT_OF_DEVICE_MEMORY get() = id == -2
	val is_ERROR_INITIALIZATION_FAILED get() = id == -3
	val is_ERROR_DEVICE_LOST get() = id == -4
	val is_ERROR_MEMORY_MAP_FAILED get() = id == -5
	val is_ERROR_LAYER_NOT_PRESENT get() = id == -6
	val is_ERROR_EXTENSION_NOT_PRESENT get() = id == -7
	val is_ERROR_FEATURE_NOT_PRESENT get() = id == -8
	val is_ERROR_INCOMPATIBLE_DRIVER get() = id == -9
	val is_ERROR_TOO_MANY_OBJECTS get() = id == -10
	val is_ERROR_FORMAT_NOT_SUPPORTED get() = id == -11
	val is_ERROR_FRAGMENTED_POOL get() = id == -12
	val is_ERROR_UNKNOWN get() = id == -13
	val is_ERROR_OUT_OF_POOL_MEMORY get() = id == -1000069000
	val is_ERROR_INVALID_EXTERNAL_HANDLE get() = id == -1000072003
	val is_ERROR_FRAGMENTATION get() = id == -1000161000
	val is_ERROR_INVALID_OPAQUE_CAPTURE_ADDRESS get() = id == -1000257000
	val is_ERROR_SURFACE_LOST get() = id == -1000000000
	val is_ERROR_NATIVE_WINDOW_IN_USE get() = id == -1000000001
	val is_SUBOPTIMAL get() = id == 1000001003
	val is_ERROR_OUT_OF_DATE get() = id == -1000001004
	val is_ERROR_INCOMPATIBLE_DISPLAY get() = id == -1000003001
	val is_ERROR_VALIDATION_FAILED get() = id == -1000011001
	val is_ERROR_INVALID_SHADER get() = id == -1000012000
	val is_ERROR_OUT_OF_POOL_MEMORY_KHR get() = id == -1000069000
	val is_ERROR_INVALID_EXTERNAL_HANDLE_KHR get() = id == -1000072003
	val is_ERROR_INVALID_DRM_FORMAT_MODIFIER_PLANE_LAYOUT get() = id == -1000158000
	val is_ERROR_FRAGMENTATION_EXT get() = id == -1000161000
	val is_ERROR_NOT_PERMITTED get() = id == -1000174001
	val is_ERROR_INVALID_DEVICE_ADDRESS get() = id == -1000257000
	val is_ERROR_FULL_SCREEN_EXCLUSIVE_MODE_LOST get() = id == -1000255000
	val is_ERROR_INVALID_OPAQUE_CAPTURE_ADDRESS_KHR get() = id == -1000257000
	val is_THREAD_IDLE get() = id == 1000268000
	val is_THREAD_DONE get() = id == 1000268001
	val is_OPERATION_DEFERRED get() = id == 1000268002
	val is_OPERATION_NOT_DEFERRED get() = id == 1000268003
	val is_PIPELINE_COMPILE_REQUIRED get() = id == 1000297000
	val is_ERROR_PIPELINE_COMPILE_REQUIRED get() = id == 1000297000
	
	
	
	override fun toString() = when(id) {
		SUCCESS.id -> "SUCCESS"
		NOT_READY.id -> "NOT_READY"
		TIMEOUT.id -> "TIMEOUT"
		EVENT_SET.id -> "EVENT_SET"
		EVENT_RESET.id -> "EVENT_RESET"
		INCOMPLETE.id -> "INCOMPLETE"
		ERROR_OUT_OF_HOST_MEMORY.id -> "ERROR_OUT_OF_HOST_MEMORY"
		ERROR_OUT_OF_DEVICE_MEMORY.id -> "ERROR_OUT_OF_DEVICE_MEMORY"
		ERROR_INITIALIZATION_FAILED.id -> "ERROR_INITIALIZATION_FAILED"
		ERROR_DEVICE_LOST.id -> "ERROR_DEVICE_LOST"
		ERROR_MEMORY_MAP_FAILED.id -> "ERROR_MEMORY_MAP_FAILED"
		ERROR_LAYER_NOT_PRESENT.id -> "ERROR_LAYER_NOT_PRESENT"
		ERROR_EXTENSION_NOT_PRESENT.id -> "ERROR_EXTENSION_NOT_PRESENT"
		ERROR_FEATURE_NOT_PRESENT.id -> "ERROR_FEATURE_NOT_PRESENT"
		ERROR_INCOMPATIBLE_DRIVER.id -> "ERROR_INCOMPATIBLE_DRIVER"
		ERROR_TOO_MANY_OBJECTS.id -> "ERROR_TOO_MANY_OBJECTS"
		ERROR_FORMAT_NOT_SUPPORTED.id -> "ERROR_FORMAT_NOT_SUPPORTED"
		ERROR_FRAGMENTED_POOL.id -> "ERROR_FRAGMENTED_POOL"
		ERROR_UNKNOWN.id -> "ERROR_UNKNOWN"
		ERROR_OUT_OF_POOL_MEMORY.id -> "ERROR_OUT_OF_POOL_MEMORY"
		ERROR_INVALID_EXTERNAL_HANDLE.id -> "ERROR_INVALID_EXTERNAL_HANDLE"
		ERROR_FRAGMENTATION.id -> "ERROR_FRAGMENTATION"
		ERROR_INVALID_OPAQUE_CAPTURE_ADDRESS.id -> "ERROR_INVALID_OPAQUE_CAPTURE_ADDRESS"
		ERROR_SURFACE_LOST.id -> "ERROR_SURFACE_LOST"
		ERROR_NATIVE_WINDOW_IN_USE.id -> "ERROR_NATIVE_WINDOW_IN_USE"
		SUBOPTIMAL.id -> "SUBOPTIMAL"
		ERROR_OUT_OF_DATE.id -> "ERROR_OUT_OF_DATE"
		ERROR_INCOMPATIBLE_DISPLAY.id -> "ERROR_INCOMPATIBLE_DISPLAY"
		ERROR_VALIDATION_FAILED.id -> "ERROR_VALIDATION_FAILED"
		ERROR_INVALID_SHADER.id -> "ERROR_INVALID_SHADER"
		ERROR_OUT_OF_POOL_MEMORY_KHR.id -> "ERROR_OUT_OF_POOL_MEMORY_KHR"
		ERROR_INVALID_EXTERNAL_HANDLE_KHR.id -> "ERROR_INVALID_EXTERNAL_HANDLE_KHR"
		ERROR_INVALID_DRM_FORMAT_MODIFIER_PLANE_LAYOUT.id -> "ERROR_INVALID_DRM_FORMAT_MODIFIER_PLANE_LAYOUT"
		ERROR_FRAGMENTATION_EXT.id -> "ERROR_FRAGMENTATION_EXT"
		ERROR_NOT_PERMITTED.id -> "ERROR_NOT_PERMITTED"
		ERROR_INVALID_DEVICE_ADDRESS.id -> "ERROR_INVALID_DEVICE_ADDRESS"
		ERROR_FULL_SCREEN_EXCLUSIVE_MODE_LOST.id -> "ERROR_FULL_SCREEN_EXCLUSIVE_MODE_LOST"
		ERROR_INVALID_OPAQUE_CAPTURE_ADDRESS_KHR.id -> "ERROR_INVALID_OPAQUE_CAPTURE_ADDRESS_KHR"
		THREAD_IDLE.id -> "THREAD_IDLE"
		THREAD_DONE.id -> "THREAD_DONE"
		OPERATION_DEFERRED.id -> "OPERATION_DEFERRED"
		OPERATION_NOT_DEFERRED.id -> "OPERATION_NOT_DEFERRED"
		PIPELINE_COMPILE_REQUIRED.id -> "PIPELINE_COMPILE_REQUIRED"
		ERROR_PIPELINE_COMPILE_REQUIRED.id -> "ERROR_PIPELINE_COMPILE_REQUIRED"
		else -> "*INVALID*"
	}
	
	
	
	companion object {
		
		val SUCCESS get() = Result(0)
		val NOT_READY get() = Result(1)
		val TIMEOUT get() = Result(2)
		val EVENT_SET get() = Result(3)
		val EVENT_RESET get() = Result(4)
		val INCOMPLETE get() = Result(5)
		val ERROR_OUT_OF_HOST_MEMORY get() = Result(-1)
		val ERROR_OUT_OF_DEVICE_MEMORY get() = Result(-2)
		val ERROR_INITIALIZATION_FAILED get() = Result(-3)
		val ERROR_DEVICE_LOST get() = Result(-4)
		val ERROR_MEMORY_MAP_FAILED get() = Result(-5)
		val ERROR_LAYER_NOT_PRESENT get() = Result(-6)
		val ERROR_EXTENSION_NOT_PRESENT get() = Result(-7)
		val ERROR_FEATURE_NOT_PRESENT get() = Result(-8)
		val ERROR_INCOMPATIBLE_DRIVER get() = Result(-9)
		val ERROR_TOO_MANY_OBJECTS get() = Result(-10)
		val ERROR_FORMAT_NOT_SUPPORTED get() = Result(-11)
		val ERROR_FRAGMENTED_POOL get() = Result(-12)
		val ERROR_UNKNOWN get() = Result(-13)
		val ERROR_OUT_OF_POOL_MEMORY get() = Result(-1000069000)
		val ERROR_INVALID_EXTERNAL_HANDLE get() = Result(-1000072003)
		val ERROR_FRAGMENTATION get() = Result(-1000161000)
		val ERROR_INVALID_OPAQUE_CAPTURE_ADDRESS get() = Result(-1000257000)
		val ERROR_SURFACE_LOST get() = Result(-1000000000)
		val ERROR_NATIVE_WINDOW_IN_USE get() = Result(-1000000001)
		val SUBOPTIMAL get() = Result(1000001003)
		val ERROR_OUT_OF_DATE get() = Result(-1000001004)
		val ERROR_INCOMPATIBLE_DISPLAY get() = Result(-1000003001)
		val ERROR_VALIDATION_FAILED get() = Result(-1000011001)
		val ERROR_INVALID_SHADER get() = Result(-1000012000)
		val ERROR_OUT_OF_POOL_MEMORY_KHR get() = Result(-1000069000)
		val ERROR_INVALID_EXTERNAL_HANDLE_KHR get() = Result(-1000072003)
		val ERROR_INVALID_DRM_FORMAT_MODIFIER_PLANE_LAYOUT get() = Result(-1000158000)
		val ERROR_FRAGMENTATION_EXT get() = Result(-1000161000)
		val ERROR_NOT_PERMITTED get() = Result(-1000174001)
		val ERROR_INVALID_DEVICE_ADDRESS get() = Result(-1000257000)
		val ERROR_FULL_SCREEN_EXCLUSIVE_MODE_LOST get() = Result(-1000255000)
		val ERROR_INVALID_OPAQUE_CAPTURE_ADDRESS_KHR get() = Result(-1000257000)
		val THREAD_IDLE get() = Result(1000268000)
		val THREAD_DONE get() = Result(1000268001)
		val OPERATION_DEFERRED get() = Result(1000268002)
		val OPERATION_NOT_DEFERRED get() = Result(1000268003)
		val PIPELINE_COMPILE_REQUIRED get() = Result(1000297000)
		val ERROR_PIPELINE_COMPILE_REQUIRED get() = Result(1000297000)
	
	}


}