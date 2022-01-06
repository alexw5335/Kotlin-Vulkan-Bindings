// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_KHR_video_queue

 *     struct VkVideoSessionCreateInfoKHR {
 *         VkStructureType               sType
 *         void*                         pNext
 *         uint32_t                      queueFamilyIndex
 *         VkVideoSessionCreateFlagsKHR  flags
 *         VkVideoProfileKHR*            pVideoProfile
 *         VkFormat                      pictureFormat
 *         VkExtent2D                    maxCodedExtent
 *         VkFormat                      referencePicturesFormat
 *         uint32_t                      maxReferencePicturesSlotsCount
 *         uint32_t                      maxReferencePicturesActiveCount
 *     }
 * 
 *     Valid pNext types:
 *         - VkVideoDecodeH264SessionCreateInfoEXT
 *         - VkVideoDecodeH265SessionCreateInfoEXT
 *         - VkVideoEncodeH264SessionCreateInfoEXT
 *         - VkVideoEncodeH265SessionCreateInfoEXT
 */
@JvmInline
value class VideoSessionCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var queueFamilyIndex: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var flags: VideoSessionCreateFlags
		get()      = VideoSessionCreateFlags(Unsafe.getInt(address + 20))
		set(value) = Unsafe.setInt(address + 20, value.value)
	
	var pVideoProfile: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var pictureFormat: Format
		get()      = Format(Unsafe.getInt(address + 32))
		set(value) = Unsafe.setInt(address + 32, value.value)
	
	var maxCodedExtent: Extent2D
		get()      = Extent2D(address + 36)
		set(value) = Unsafe.copy(value.address, address + 36, 8)
	
	var referencePicturesFormat: Format
		get()      = Format(Unsafe.getInt(address + 44))
		set(value) = Unsafe.setInt(address + 44, value.value)
	
	var maxReferencePicturesSlotsCount: Int
		get()      = Unsafe.getInt(address + 48)
		set(value) = Unsafe.setInt(address + 48, value)
	
	var maxReferencePicturesActiveCount: Int
		get()      = Unsafe.getInt(address + 52)
		set(value) = Unsafe.setInt(address + 52, value)
	
	
	
	var videoProfile: VideoProfile
		get()      = VideoProfile(Unsafe.getLong(address + 24))
		set(value) { Unsafe.setLong(address + 24, value.address) }


}