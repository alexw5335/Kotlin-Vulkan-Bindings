// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_EXT_video_encode_h264

 *     struct VkVideoEncodeH264CapabilitiesEXT {
 *         VkStructureType                      sType
 *         void*                                pNext (must be null)
 *         VkVideoEncodeH264CapabilityFlagsEXT  flags
 *         VkVideoEncodeH264InputModeFlagsEXT   inputModeFlags
 *         VkVideoEncodeH264OutputModeFlagsEXT  outputModeFlags
 *         VkExtent2D                           minPictureSizeInMbs
 *         VkExtent2D                           maxPictureSizeInMbs
 *         VkExtent2D                           inputImageDataAlignment
 *         uint8_t                              maxNumL0ReferenceForP
 *         uint8_t                              maxNumL0ReferenceForB
 *         uint8_t                              maxNumL1Reference
 *         uint8_t                              qualityLevelCount
 *         VkExtensionProperties                stdExtensionVersion
 *     }
 */
@JvmInline
value class VideoEncodeH264Capabilities(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: VideoEncodeH264CapabilityFlags
		get()      = VideoEncodeH264CapabilityFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var inputModeFlags: VideoEncodeH264InputModeFlags
		get()      = VideoEncodeH264InputModeFlags(Unsafe.getInt(address + 20))
		set(value) = Unsafe.setInt(address + 20, value.value)
	
	var outputModeFlags: VideoEncodeH264OutputModeFlags
		get()      = VideoEncodeH264OutputModeFlags(Unsafe.getInt(address + 24))
		set(value) = Unsafe.setInt(address + 24, value.value)
	
	var minPictureSizeInMbs: Extent2D
		get()      = Extent2D(address + 28)
		set(value) = Unsafe.copy(value.address, address + 28, 8)
	
	var maxPictureSizeInMbs: Extent2D
		get()      = Extent2D(address + 36)
		set(value) = Unsafe.copy(value.address, address + 36, 8)
	
	var inputImageDataAlignment: Extent2D
		get()      = Extent2D(address + 44)
		set(value) = Unsafe.copy(value.address, address + 44, 8)
	
	var maxNumL0ReferenceForP: Byte
		get()      = Unsafe.getByte(address + 52)
		set(value) = Unsafe.setByte(address + 52, value)
	
	var maxNumL0ReferenceForB: Byte
		get()      = Unsafe.getByte(address + 53)
		set(value) = Unsafe.setByte(address + 53, value)
	
	var maxNumL1Reference: Byte
		get()      = Unsafe.getByte(address + 54)
		set(value) = Unsafe.setByte(address + 54, value)
	
	var qualityLevelCount: Byte
		get()      = Unsafe.getByte(address + 55)
		set(value) = Unsafe.setByte(address + 55, value)
	
	var stdExtensionVersion: ExtensionProperties
		get()      = ExtensionProperties(address + 56)
		set(value) = Unsafe.copy(value.address, address + 56, 260)


}