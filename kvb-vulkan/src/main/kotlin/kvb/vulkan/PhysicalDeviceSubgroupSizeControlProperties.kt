// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.Unsafe

/**
 *     struct VkPhysicalDeviceSubgroupSizeControlPropertiesEXT {
 *         VkStructureType     sType
 *         void*               pNext (must be null)
 *         uint32_t            minSubgroupSize
 *         uint32_t            maxSubgroupSize
 *         uint32_t            maxComputeWorkgroupSubgroups
 *         VkShaderStageFlags  requiredSubgroupSizeStages
 *     }
 */
@JvmInline
value class PhysicalDeviceSubgroupSizeControlProperties(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var minSubgroupSize: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var maxSubgroupSize: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var maxComputeWorkgroupSubgroups: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var requiredSubgroupSizeStages: ShaderStageFlags
		get()      = ShaderStageFlags(Unsafe.getInt(address + 28))
		set(value) = Unsafe.setInt(address + 28, value.value)


}