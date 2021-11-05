// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.Unsafe

/**
 *     struct VkPipelineViewportShadingRateImageStateCreateInfoNV {
 *         VkStructureType          sType
 *         void*                    pNext (must be null)
 *         VkBool32                 shadingRateImageEnable
 *         uint32_t                 viewportCount
 *         VkShadingRatePaletteNV*  pShadingRatePalettes
 *     }
 */
@JvmInline
value class PipelineViewportShadingRateImageStateCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var shadingRateImageEnable: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var viewportCount: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var pShadingRatePalettes: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	
	
	var shadingRatePalettes: ShadingRatePalette.Buffer
		get()      = ShadingRatePalette.Buffer(Unsafe.getLong(address + 24), viewportCount)
		set(value) { Unsafe.setLong(address + 24, value.address); viewportCount = value.capacity }


}