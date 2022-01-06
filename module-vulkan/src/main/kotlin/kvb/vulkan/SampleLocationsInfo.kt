// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_EXT_sample_locations

 *     struct VkSampleLocationsInfoEXT {
 *         VkStructureType        sType
 *         void*                  pNext (must be null)
 *         VkSampleCountFlagBits  sampleLocationsPerPixel
 *         VkExtent2D             sampleLocationGridSize
 *         uint32_t               sampleLocationsCount
 *         VkSampleLocationEXT*   pSampleLocations
 *     }
 */
@JvmInline
value class SampleLocationsInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var sampleLocationsPerPixel: SampleCountFlags
		get()      = SampleCountFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var sampleLocationGridSize: Extent2D
		get()      = Extent2D(address + 20)
		set(value) = Unsafe.copy(value.address, address + 20, 8)
	
	var sampleLocationsCount: Int
		get()      = Unsafe.getInt(address + 28)
		set(value) = Unsafe.setInt(address + 28, value)
	
	var pSampleLocations: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)
	
	
	
	var sampleLocations: SampleLocation.Buffer
		get()      = SampleLocation.Buffer(Unsafe.getLong(address + 32), sampleLocationsCount)
		set(value) { Unsafe.setLong(address + 32, value.address); sampleLocationsCount = value.capacity }


}