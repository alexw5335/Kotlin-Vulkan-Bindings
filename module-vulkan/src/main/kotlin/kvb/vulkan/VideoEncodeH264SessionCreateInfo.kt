// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_EXT_video_encode_h264

 *     struct VkVideoEncodeH264SessionCreateInfoEXT {
 *         VkStructureType                  sType
 *         void*                            pNext (must be null)
 *         VkVideoEncodeH264CreateFlagsEXT  flags
 *         VkExtent2D                       maxPictureSizeInMbs
 *         VkExtensionProperties*           pStdExtensionVersion
 *     }
 */
@JvmInline
value class VideoEncodeH264SessionCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: VideoEncodeH264CreateFlags
		get()      = VideoEncodeH264CreateFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var maxPictureSizeInMbs: Extent2D
		get()      = Extent2D(address + 20)
		set(value) = Unsafe.copy(value.address, address + 20, 8)
	
	var pStdExtensionVersion: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)
	
	
	
	var stdExtensionVersion: ExtensionProperties
		get()      = ExtensionProperties(Unsafe.getLong(address + 32))
		set(value) { Unsafe.setLong(address + 32, value.address) }


}