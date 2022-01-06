// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_EXT_fragment_density_map2

 *     struct VkPhysicalDeviceFragmentDensityMap2PropertiesEXT {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkBool32         subsampledLoads
 *         VkBool32         subsampledCoarseReconstructionEarlyAccess
 *         uint32_t         maxSubsampledArrayLayers
 *         uint32_t         maxDescriptorSetSubsampledSamplers
 *     }
 */
@JvmInline
value class PhysicalDeviceFragmentDensityMap2Properties(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var subsampledLoads: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var subsampledCoarseReconstructionEarlyAccess: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var maxSubsampledArrayLayers: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var maxDescriptorSetSubsampledSamplers: Int
		get()      = Unsafe.getInt(address + 28)
		set(value) = Unsafe.setInt(address + 28, value)


}