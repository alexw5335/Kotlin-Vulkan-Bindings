// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.Unsafe

/**
 *     struct VkPhysicalDeviceSubgroupProperties {
 *         VkStructureType         sType
 *         void*                   pNext (must be null)
 *         uint32_t                subgroupSize
 *         VkShaderStageFlags      supportedStages
 *         VkSubgroupFeatureFlags  supportedOperations
 *         VkBool32                quadOperationsInAllStages
 *     }
 */
@JvmInline
value class PhysicalDeviceSubgroupProperties(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var subgroupSize: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var supportedStages: ShaderStageFlags
		get()      = ShaderStageFlags(Unsafe.getInt(address + 20))
		set(value) = Unsafe.setInt(address + 20, value.value)
	
	var supportedOperations: SubgroupFeatureFlags
		get()      = SubgroupFeatureFlags(Unsafe.getInt(address + 24))
		set(value) = Unsafe.setInt(address + 24, value.value)
	
	var quadOperationsInAllStages: Int
		get()      = Unsafe.getInt(address + 28)
		set(value) = Unsafe.setInt(address + 28, value)


}