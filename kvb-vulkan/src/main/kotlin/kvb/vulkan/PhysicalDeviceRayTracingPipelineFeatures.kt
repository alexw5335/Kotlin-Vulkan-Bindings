// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkPhysicalDeviceRayTracingPipelineFeaturesKHR {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkBool32         rayTracingPipeline
 *         VkBool32         rayTracingPipelineShaderGroupHandleCaptureReplay
 *         VkBool32         rayTracingPipelineShaderGroupHandleCaptureReplayMixed
 *         VkBool32         rayTracingPipelineTraceRaysIndirect
 *         VkBool32         rayTraversalPrimitiveCulling
 *     }
 */
@JvmInline
value class PhysicalDeviceRayTracingPipelineFeatures(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var rayTracingPipeline: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var rayTracingPipelineShaderGroupHandleCaptureReplay: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var rayTracingPipelineShaderGroupHandleCaptureReplayMixed: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var rayTracingPipelineTraceRaysIndirect: Int
		get()      = Unsafe.getInt(address + 28)
		set(value) = Unsafe.setInt(address + 28, value)
	
	var rayTraversalPrimitiveCulling: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)


}