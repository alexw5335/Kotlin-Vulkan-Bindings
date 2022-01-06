// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_VERSION_1_0

 *     struct VkImageCreateInfo {
 *         VkStructureType        sType
 *         void*                  pNext
 *         VkImageCreateFlags     flags
 *         VkImageType            imageType
 *         VkFormat               format
 *         VkExtent3D             extent
 *         uint32_t               mipLevels
 *         uint32_t               arrayLayers
 *         VkSampleCountFlagBits  samples
 *         VkImageTiling          tiling
 *         VkImageUsageFlags      usage
 *         VkSharingMode          sharingMode
 *         uint32_t               queueFamilyIndexCount
 *         uint32_t*              pQueueFamilyIndices
 *         VkImageLayout          initialLayout
 *     }
 * 
 *     Valid pNext types:
 *         - VkDedicatedAllocationImageCreateInfoNV
 *         - VkExternalMemoryImageCreateInfoNV
 *         - VkExternalMemoryImageCreateInfo
 *         - VkImageSwapchainCreateInfoKHR
 *         - VkImageFormatListCreateInfo
 *         - VkExternalFormatANDROID
 *         - VkImageDrmFormatModifierListCreateInfoEXT
 *         - VkImageDrmFormatModifierExplicitCreateInfoEXT
 *         - VkImageStencilUsageCreateInfo
 *         - VkVideoProfilesKHR
 *         - VkVideoProfileKHR
 *         - VkVideoDecodeH264ProfileEXT
 *         - VkVideoDecodeH265ProfileEXT
 *         - VkVideoEncodeH264ProfileEXT
 *         - VkVideoEncodeH265ProfileEXT
 *         - VkBufferCollectionImageCreateInfoFUCHSIA
 */
@JvmInline
value class ImageCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: ImageCreateFlags
		get()      = ImageCreateFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var imageType: ImageType
		get()      = _ImageType(Unsafe.getInt(address + 20))
		set(value) = Unsafe.setInt(address + 20, value.value)
	
	var format: Format
		get()      = Format(Unsafe.getInt(address + 24))
		set(value) = Unsafe.setInt(address + 24, value.value)
	
	var extent: Extent3D
		get()      = Extent3D(address + 28)
		set(value) = Unsafe.copy(value.address, address + 28, 12)
	
	var mipLevels: Int
		get()      = Unsafe.getInt(address + 40)
		set(value) = Unsafe.setInt(address + 40, value)
	
	var arrayLayers: Int
		get()      = Unsafe.getInt(address + 44)
		set(value) = Unsafe.setInt(address + 44, value)
	
	var samples: SampleCountFlags
		get()      = SampleCountFlags(Unsafe.getInt(address + 48))
		set(value) = Unsafe.setInt(address + 48, value.value)
	
	var tiling: ImageTiling
		get()      = _ImageTiling(Unsafe.getInt(address + 52))
		set(value) = Unsafe.setInt(address + 52, value.value)
	
	var usage: ImageUsageFlags
		get()      = ImageUsageFlags(Unsafe.getInt(address + 56))
		set(value) = Unsafe.setInt(address + 56, value.value)
	
	var sharingMode: SharingMode
		get()      = _SharingMode(Unsafe.getInt(address + 60))
		set(value) = Unsafe.setInt(address + 60, value.value)
	
	var queueFamilyIndexCount: Int
		get()      = Unsafe.getInt(address + 64)
		set(value) = Unsafe.setInt(address + 64, value)
	
	var pQueueFamilyIndices: Long
		get()      = Unsafe.getLong(address + 72)
		set(value) = Unsafe.setLong(address + 72, value)
	
	var initialLayout: ImageLayout
		get()      = _ImageLayout(Unsafe.getInt(address + 80))
		set(value) = Unsafe.setInt(address + 80, value.value)
	
	
	
	var queueFamilyIndices: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getLong(address + 72), queueFamilyIndexCount)
		set(value) { Unsafe.setLong(address + 72, value.address); queueFamilyIndexCount = value.capacity }


}