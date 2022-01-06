// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_AMD_shader_core_properties

 *     struct VkPhysicalDeviceShaderCorePropertiesAMD {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint32_t         shaderEngineCount
 *         uint32_t         shaderArraysPerEngineCount
 *         uint32_t         computeUnitsPerShaderArray
 *         uint32_t         simdPerComputeUnit
 *         uint32_t         wavefrontsPerSimd
 *         uint32_t         wavefrontSize
 *         uint32_t         sgprsPerSimd
 *         uint32_t         minSgprAllocation
 *         uint32_t         maxSgprAllocation
 *         uint32_t         sgprAllocationGranularity
 *         uint32_t         vgprsPerSimd
 *         uint32_t         minVgprAllocation
 *         uint32_t         maxVgprAllocation
 *         uint32_t         vgprAllocationGranularity
 *     }
 */
@JvmInline
value class PhysicalDeviceShaderCoreProperties(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var shaderEngineCount: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var shaderArraysPerEngineCount: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var computeUnitsPerShaderArray: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var simdPerComputeUnit: Int
		get()      = Unsafe.getInt(address + 28)
		set(value) = Unsafe.setInt(address + 28, value)
	
	var wavefrontsPerSimd: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var wavefrontSize: Int
		get()      = Unsafe.getInt(address + 36)
		set(value) = Unsafe.setInt(address + 36, value)
	
	var sgprsPerSimd: Int
		get()      = Unsafe.getInt(address + 40)
		set(value) = Unsafe.setInt(address + 40, value)
	
	var minSgprAllocation: Int
		get()      = Unsafe.getInt(address + 44)
		set(value) = Unsafe.setInt(address + 44, value)
	
	var maxSgprAllocation: Int
		get()      = Unsafe.getInt(address + 48)
		set(value) = Unsafe.setInt(address + 48, value)
	
	var sgprAllocationGranularity: Int
		get()      = Unsafe.getInt(address + 52)
		set(value) = Unsafe.setInt(address + 52, value)
	
	var vgprsPerSimd: Int
		get()      = Unsafe.getInt(address + 56)
		set(value) = Unsafe.setInt(address + 56, value)
	
	var minVgprAllocation: Int
		get()      = Unsafe.getInt(address + 60)
		set(value) = Unsafe.setInt(address + 60, value)
	
	var maxVgprAllocation: Int
		get()      = Unsafe.getInt(address + 64)
		set(value) = Unsafe.setInt(address + 64, value)
	
	var vgprAllocationGranularity: Int
		get()      = Unsafe.getInt(address + 68)
		set(value) = Unsafe.setInt(address + 68, value)


}