// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkDrmFormatModifierPropertiesListEXT {
 *         VkStructureType                    sType
 *         void*                              pNext (must be null)
 *         uint32_t                           drmFormatModifierCount
 *         VkDrmFormatModifierPropertiesEXT*  pDrmFormatModifierProperties
 *     }
 */
@JvmInline
value class DrmFormatModifierPropertiesList(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var drmFormatModifierCount: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var pDrmFormatModifierProperties: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	
	
	var drmFormatModifierProperties: DrmFormatModifierProperties.Buffer
		get()      = DrmFormatModifierProperties.Buffer(Unsafe.getLong(address + 24), drmFormatModifierCount)
		set(value) { Unsafe.setLong(address + 24, value.address); drmFormatModifierCount = value.capacity }


}