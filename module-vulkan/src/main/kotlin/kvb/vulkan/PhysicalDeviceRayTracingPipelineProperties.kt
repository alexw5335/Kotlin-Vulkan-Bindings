// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_KHR_ray_tracing_pipeline

 *     struct VkPhysicalDeviceRayTracingPipelinePropertiesKHR {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint32_t         shaderGroupHandleSize
 *         uint32_t         maxRayRecursionDepth
 *         uint32_t         maxShaderGroupStride
 *         uint32_t         shaderGroupBaseAlignment
 *         uint32_t         shaderGroupHandleCaptureReplaySize
 *         uint32_t         maxRayDispatchInvocationCount
 *         uint32_t         shaderGroupHandleAlignment
 *         uint32_t         maxRayHitAttributeSize
 *     }
 */
@JvmInline
value class PhysicalDeviceRayTracingPipelineProperties(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var shaderGroupHandleSize: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var maxRayRecursionDepth: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var maxShaderGroupStride: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var shaderGroupBaseAlignment: Int
		get()      = Unsafe.getInt(address + 28)
		set(value) = Unsafe.setInt(address + 28, value)
	
	var shaderGroupHandleCaptureReplaySize: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var maxRayDispatchInvocationCount: Int
		get()      = Unsafe.getInt(address + 36)
		set(value) = Unsafe.setInt(address + 36, value)
	
	var shaderGroupHandleAlignment: Int
		get()      = Unsafe.getInt(address + 40)
		set(value) = Unsafe.setInt(address + 40, value)
	
	var maxRayHitAttributeSize: Int
		get()      = Unsafe.getInt(address + 44)
		set(value) = Unsafe.setInt(address + 44, value)


}