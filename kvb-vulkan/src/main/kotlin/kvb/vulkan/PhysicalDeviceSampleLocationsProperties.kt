// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.Unsafe
import kvb.core.memory.direct.DirectFloatBuffer

/**
 *     struct VkPhysicalDeviceSampleLocationsPropertiesEXT {
 *         VkStructureType     sType
 *         void*               pNext (must be null)
 *         VkSampleCountFlags  sampleLocationSampleCounts
 *         VkExtent2D          maxSampleLocationGridSize
 *         float               sampleLocationCoordinateRange[2]
 *         uint32_t            sampleLocationSubPixelBits
 *         VkBool32            variableSampleLocations
 *     }
 */
@JvmInline
value class PhysicalDeviceSampleLocationsProperties(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var sampleLocationSampleCounts: SampleCountFlags
		get()      = SampleCountFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var maxSampleLocationGridSize: Extent2D
		get()      = Extent2D(address + 20)
		set(value) = Unsafe.copy(value.address, address + 20, 8)
	
	var sampleLocationCoordinateRange: DirectFloatBuffer
		get()      = DirectFloatBuffer(address + 28, 2)
		set(value) = Unsafe.copy(value.address, address + 28, value.byteSize)
	
	var sampleLocationSubPixelBits: Int
		get()      = Unsafe.getInt(address + 36)
		set(value) = Unsafe.setInt(address + 36, value)
	
	var variableSampleLocations: Int
		get()      = Unsafe.getInt(address + 40)
		set(value) = Unsafe.setInt(address + 40, value)


}