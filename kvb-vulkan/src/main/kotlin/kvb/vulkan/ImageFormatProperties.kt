// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.Unsafe

/**
 *     struct VkImageFormatProperties {
 *         VkExtent3D          maxExtent
 *         uint32_t            maxMipLevels
 *         uint32_t            maxArrayLayers
 *         VkSampleCountFlags  sampleCounts
 *         VkDeviceSize        maxResourceSize
 *     }
 */
@JvmInline
value class ImageFormatProperties(override val address: Long) : Addressable {
	
	
	var maxExtent: Extent3D
		get()      = Extent3D(address + 0)
		set(value) = Unsafe.copy(value.address, address + 0, 12)
	
	var maxMipLevels: Int
		get()      = Unsafe.getInt(address + 12)
		set(value) = Unsafe.setInt(address + 12, value)
	
	var maxArrayLayers: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var sampleCounts: SampleCountFlags
		get()      = SampleCountFlags(Unsafe.getInt(address + 20))
		set(value) = Unsafe.setInt(address + 20, value.value)
	
	var maxResourceSize: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)


}