// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkPhysicalDeviceShadingRateImagePropertiesNV {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkExtent2D       shadingRateTexelSize
 *         uint32_t         shadingRatePaletteSize
 *         uint32_t         shadingRateMaxCoarseSamples
 *     }
 */
@JvmInline
value class PhysicalDeviceShadingRateImageProperties(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var shadingRateTexelSize: Extent2D
		get()      = Extent2D(address + 16)
		set(value) = Unsafe.copy(value.address, address + 16, 8)
	
	var shadingRatePaletteSize: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var shadingRateMaxCoarseSamples: Int
		get()      = Unsafe.getInt(address + 28)
		set(value) = Unsafe.setInt(address + 28, value)


}