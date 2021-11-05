// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.Unsafe

/**
 *     struct VkPhysicalDeviceRayTracingPropertiesNV {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint32_t         shaderGroupHandleSize
 *         uint32_t         maxRecursionDepth
 *         uint32_t         maxShaderGroupStride
 *         uint32_t         shaderGroupBaseAlignment
 *         uint64_t         maxGeometryCount
 *         uint64_t         maxInstanceCount
 *         uint64_t         maxTriangleCount
 *         uint32_t         maxDescriptorSetAccelerationStructures
 *     }
 */
@JvmInline
value class PhysicalDeviceRayTracingProperties(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var shaderGroupHandleSize: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var maxRecursionDepth: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var maxShaderGroupStride: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var shaderGroupBaseAlignment: Int
		get()      = Unsafe.getInt(address + 28)
		set(value) = Unsafe.setInt(address + 28, value)
	
	var maxGeometryCount: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)
	
	var maxInstanceCount: Long
		get()      = Unsafe.getLong(address + 40)
		set(value) = Unsafe.setLong(address + 40, value)
	
	var maxTriangleCount: Long
		get()      = Unsafe.getLong(address + 48)
		set(value) = Unsafe.setLong(address + 48, value)
	
	var maxDescriptorSetAccelerationStructures: Int
		get()      = Unsafe.getInt(address + 56)
		set(value) = Unsafe.setInt(address + 56, value)


}