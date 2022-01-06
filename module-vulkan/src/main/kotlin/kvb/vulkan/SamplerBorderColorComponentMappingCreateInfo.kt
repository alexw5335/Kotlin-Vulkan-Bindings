// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_EXT_border_color_swizzle

 *     struct VkSamplerBorderColorComponentMappingCreateInfoEXT {
 *         VkStructureType     sType
 *         void*               pNext (must be null)
 *         VkComponentMapping  components
 *         VkBool32            srgb
 *     }
 */
@JvmInline
value class SamplerBorderColorComponentMappingCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var components: ComponentMapping
		get()      = ComponentMapping(address + 16)
		set(value) = Unsafe.copy(value.address, address + 16, 16)
	
	var srgb: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)


}