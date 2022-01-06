// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_NV_cooperative_matrix

 *     struct VkPhysicalDeviceCooperativeMatrixPropertiesNV {
 *         VkStructureType     sType
 *         void*               pNext (must be null)
 *         VkShaderStageFlags  cooperativeMatrixSupportedStages
 *     }
 */
@JvmInline
value class PhysicalDeviceCooperativeMatrixProperties(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var cooperativeMatrixSupportedStages: ShaderStageFlags
		get()      = ShaderStageFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)


}