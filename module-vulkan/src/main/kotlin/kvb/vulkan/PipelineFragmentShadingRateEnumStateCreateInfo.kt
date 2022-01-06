// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_NV_fragment_shading_rate_enums

 *     struct VkPipelineFragmentShadingRateEnumStateCreateInfoNV {
 *         VkStructureType                     sType
 *         void*                               pNext (must be null)
 *         VkFragmentShadingRateTypeNV         shadingRateType
 *         VkFragmentShadingRateNV             shadingRate
 *         VkFragmentShadingRateCombinerOpKHR  combinerOps[2]
 *     }
 */
@JvmInline
value class PipelineFragmentShadingRateEnumStateCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var shadingRateType: FragmentShadingRateType
		get()      = _FragmentShadingRateType(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var shadingRate: FragmentShadingRate
		get()      = _FragmentShadingRate(Unsafe.getInt(address + 20))
		set(value) = Unsafe.setInt(address + 20, value.value)
	
	var combinerOps: DirectIntBuffer
		get()      = DirectIntBuffer(address + 24, 2)
		set(value) = Unsafe.copy(value.address, address + 24, value.byteSize)


}