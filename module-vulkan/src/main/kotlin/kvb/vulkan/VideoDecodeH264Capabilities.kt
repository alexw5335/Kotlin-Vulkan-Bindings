// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_EXT_video_decode_h264

 *     struct VkVideoDecodeH264CapabilitiesEXT {
 *         VkStructureType        sType
 *         void*                  pNext (must be null)
 *         uint32_t               maxLevel
 *         VkOffset2D             fieldOffsetGranularity
 *         VkExtensionProperties  stdExtensionVersion
 *     }
 */
@JvmInline
value class VideoDecodeH264Capabilities(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var maxLevel: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var fieldOffsetGranularity: Offset2D
		get()      = Offset2D(address + 20)
		set(value) = Unsafe.copy(value.address, address + 20, 8)
	
	var stdExtensionVersion: ExtensionProperties
		get()      = ExtensionProperties(address + 28)
		set(value) = Unsafe.copy(value.address, address + 28, 260)


}