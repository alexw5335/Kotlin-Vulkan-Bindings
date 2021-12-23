// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkFormatProperties2 {
 *         VkStructureType     sType
 *         void*               pNext
 *         VkFormatProperties  formatProperties
 *     }
 * 
 *     Valid pNext types:
 *         - VkDrmFormatModifierPropertiesListEXT
 */
@JvmInline
value class FormatProperties2(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var formatProperties: FormatProperties
		get()      = FormatProperties(address + 16)
		set(value) = Unsafe.copy(value.address, address + 16, 12)


}