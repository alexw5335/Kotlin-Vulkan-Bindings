// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_EXT_conservative_rasterization

 *     struct VkPipelineRasterizationConservativeStateCreateInfoEXT {
 *         VkStructureType                                         sType
 *         void*                                                   pNext (must be null)
 *         VkPipelineRasterizationConservativeStateCreateFlagsEXT  flags (reserved, must be zero)
 *         VkConservativeRasterizationModeEXT                      conservativeRasterizationMode
 *         float                                                   extraPrimitiveOverestimationSize
 *     }
 */
@JvmInline
value class PipelineRasterizationConservativeStateCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: Int
		get() = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var conservativeRasterizationMode: ConservativeRasterizationMode
		get()      = _ConservativeRasterizationMode(Unsafe.getInt(address + 20))
		set(value) = Unsafe.setInt(address + 20, value.value)
	
	var extraPrimitiveOverestimationSize: Float
		get()      = Unsafe.getFloat(address + 24)
		set(value) = Unsafe.setFloat(address + 24, value)


}