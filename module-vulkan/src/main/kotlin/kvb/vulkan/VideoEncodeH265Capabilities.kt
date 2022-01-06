// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_EXT_video_encode_h265

 *     struct VkVideoEncodeH265CapabilitiesEXT {
 *         VkStructureType                      sType
 *         void*                                pNext (must be null)
 *         VkVideoEncodeH265CapabilityFlagsEXT  flags (reserved, must be zero)
 *         VkVideoEncodeH265InputModeFlagsEXT   inputModeFlags
 *         VkVideoEncodeH265OutputModeFlagsEXT  outputModeFlags
 *         VkVideoEncodeH265CtbSizeFlagsEXT     ctbSizes
 *         VkExtent2D                           inputImageDataAlignment
 *         uint8_t                              maxNumL0ReferenceForP
 *         uint8_t                              maxNumL0ReferenceForB
 *         uint8_t                              maxNumL1Reference
 *         uint8_t                              maxNumSubLayers
 *         uint8_t                              qualityLevelCount
 *         VkExtensionProperties                stdExtensionVersion
 *     }
 */
@JvmInline
value class VideoEncodeH265Capabilities(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: Int
		get() = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var inputModeFlags: VideoEncodeH265InputModeFlags
		get()      = VideoEncodeH265InputModeFlags(Unsafe.getInt(address + 20))
		set(value) = Unsafe.setInt(address + 20, value.value)
	
	var outputModeFlags: VideoEncodeH265OutputModeFlags
		get()      = VideoEncodeH265OutputModeFlags(Unsafe.getInt(address + 24))
		set(value) = Unsafe.setInt(address + 24, value.value)
	
	var ctbSizes: VideoEncodeH265CtbSizeFlags
		get()      = VideoEncodeH265CtbSizeFlags(Unsafe.getInt(address + 28))
		set(value) = Unsafe.setInt(address + 28, value.value)
	
	var inputImageDataAlignment: Extent2D
		get()      = Extent2D(address + 32)
		set(value) = Unsafe.copy(value.address, address + 32, 8)
	
	var maxNumL0ReferenceForP: Byte
		get()      = Unsafe.getByte(address + 40)
		set(value) = Unsafe.setByte(address + 40, value)
	
	var maxNumL0ReferenceForB: Byte
		get()      = Unsafe.getByte(address + 41)
		set(value) = Unsafe.setByte(address + 41, value)
	
	var maxNumL1Reference: Byte
		get()      = Unsafe.getByte(address + 42)
		set(value) = Unsafe.setByte(address + 42, value)
	
	var maxNumSubLayers: Byte
		get()      = Unsafe.getByte(address + 43)
		set(value) = Unsafe.setByte(address + 43, value)
	
	var qualityLevelCount: Byte
		get()      = Unsafe.getByte(address + 44)
		set(value) = Unsafe.setByte(address + 44, value)
	
	var stdExtensionVersion: ExtensionProperties
		get()      = ExtensionProperties(address + 48)
		set(value) = Unsafe.copy(value.address, address + 48, 260)


}