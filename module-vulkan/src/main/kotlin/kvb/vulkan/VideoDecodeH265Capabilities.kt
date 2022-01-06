// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_EXT_video_decode_h265

 *     struct VkVideoDecodeH265CapabilitiesEXT {
 *         VkStructureType        sType
 *         void*                  pNext (must be null)
 *         uint32_t               maxLevel
 *         VkExtensionProperties  stdExtensionVersion
 *     }
 */
@JvmInline
value class VideoDecodeH265Capabilities(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var maxLevel: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var stdExtensionVersion: ExtensionProperties
		get()      = ExtensionProperties(address + 20)
		set(value) = Unsafe.copy(value.address, address + 20, 260)


}