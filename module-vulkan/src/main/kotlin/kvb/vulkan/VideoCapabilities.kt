// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_KHR_video_queue

 *     struct VkVideoCapabilitiesKHR {
 *         VkStructureType            sType
 *         void*                      pNext
 *         VkVideoCapabilityFlagsKHR  capabilityFlags
 *         VkDeviceSize               minBitstreamBufferOffsetAlignment
 *         VkDeviceSize               minBitstreamBufferSizeAlignment
 *         VkExtent2D                 videoPictureExtentGranularity
 *         VkExtent2D                 minExtent
 *         VkExtent2D                 maxExtent
 *         uint32_t                   maxReferencePicturesSlotsCount
 *         uint32_t                   maxReferencePicturesActiveCount
 *     }
 * 
 *     Valid pNext types:
 *         - VkVideoDecodeH264CapabilitiesEXT
 *         - VkVideoDecodeH265CapabilitiesEXT
 *         - VkVideoEncodeH264CapabilitiesEXT
 *         - VkVideoEncodeH265CapabilitiesEXT
 */
@JvmInline
value class VideoCapabilities(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var capabilityFlags: VideoCapabilityFlags
		get()      = VideoCapabilityFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var minBitstreamBufferOffsetAlignment: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var minBitstreamBufferSizeAlignment: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)
	
	var videoPictureExtentGranularity: Extent2D
		get()      = Extent2D(address + 40)
		set(value) = Unsafe.copy(value.address, address + 40, 8)
	
	var minExtent: Extent2D
		get()      = Extent2D(address + 48)
		set(value) = Unsafe.copy(value.address, address + 48, 8)
	
	var maxExtent: Extent2D
		get()      = Extent2D(address + 56)
		set(value) = Unsafe.copy(value.address, address + 56, 8)
	
	var maxReferencePicturesSlotsCount: Int
		get()      = Unsafe.getInt(address + 64)
		set(value) = Unsafe.setInt(address + 64, value)
	
	var maxReferencePicturesActiveCount: Int
		get()      = Unsafe.getInt(address + 68)
		set(value) = Unsafe.setInt(address + 68, value)


}