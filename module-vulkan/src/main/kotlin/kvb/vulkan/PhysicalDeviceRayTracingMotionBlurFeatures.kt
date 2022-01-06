// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_NV_ray_tracing_motion_blur

 *     struct VkPhysicalDeviceRayTracingMotionBlurFeaturesNV {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkBool32         rayTracingMotionBlur
 *         VkBool32         rayTracingMotionBlurPipelineTraceRaysIndirect
 *     }
 */
@JvmInline
value class PhysicalDeviceRayTracingMotionBlurFeatures(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var rayTracingMotionBlur: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var rayTracingMotionBlurPipelineTraceRaysIndirect: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)


}