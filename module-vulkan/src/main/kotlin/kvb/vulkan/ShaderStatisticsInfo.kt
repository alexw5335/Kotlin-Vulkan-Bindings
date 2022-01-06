// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_AMD_shader_info

 *     struct VkShaderStatisticsInfoAMD {
 *         VkShaderStageFlags        shaderStageMask
 *         VkShaderResourceUsageAMD  resourceUsage
 *         uint32_t                  numPhysicalVgprs
 *         uint32_t                  numPhysicalSgprs
 *         uint32_t                  numAvailableVgprs
 *         uint32_t                  numAvailableSgprs
 *         uint32_t                  computeWorkGroupSize[3]
 *     }
 */
@JvmInline
value class ShaderStatisticsInfo(override val address: Long) : Addressable {
	
	
	var shaderStageMask: ShaderStageFlags
		get()      = ShaderStageFlags(Unsafe.getInt(address + 0))
		set(value) = Unsafe.setInt(address + 0, value.value)
	
	var resourceUsage: ShaderResourceUsage
		get()      = ShaderResourceUsage(address + 8)
		set(value) = Unsafe.copy(value.address, address + 8, 32)
	
	var numPhysicalVgprs: Int
		get()      = Unsafe.getInt(address + 40)
		set(value) = Unsafe.setInt(address + 40, value)
	
	var numPhysicalSgprs: Int
		get()      = Unsafe.getInt(address + 44)
		set(value) = Unsafe.setInt(address + 44, value)
	
	var numAvailableVgprs: Int
		get()      = Unsafe.getInt(address + 48)
		set(value) = Unsafe.setInt(address + 48, value)
	
	var numAvailableSgprs: Int
		get()      = Unsafe.getInt(address + 52)
		set(value) = Unsafe.setInt(address + 52, value)
	
	var computeWorkGroupSize: DirectIntBuffer
		get()      = DirectIntBuffer(address + 56, 3)
		set(value) = Unsafe.copy(value.address, address + 56, value.byteSize)


}