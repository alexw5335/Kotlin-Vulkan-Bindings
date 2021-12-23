// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkImageFormatProperties2 {
 *         VkStructureType          sType
 *         void*                    pNext
 *         VkImageFormatProperties  imageFormatProperties
 *     }
 * 
 *     Valid pNext types:
 *         - VkExternalImageFormatProperties
 *         - VkSamplerYcbcrConversionImageFormatProperties
 *         - VkTextureLODGatherFormatPropertiesAMD
 *         - VkAndroidHardwareBufferUsageANDROID
 *         - VkFilterCubicImageViewImageFormatPropertiesEXT
 */
@JvmInline
value class ImageFormatProperties2(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var imageFormatProperties: ImageFormatProperties
		get()      = ImageFormatProperties(address + 16)
		set(value) = Unsafe.copy(value.address, address + 16, 32)


}