// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_VERSION_1_1

 *     struct VkSamplerYcbcrConversionCreateInfo {
 *         VkStructureType                sType
 *         void*                          pNext
 *         VkFormat                       format
 *         VkSamplerYcbcrModelConversion  ycbcrModel
 *         VkSamplerYcbcrRange            ycbcrRange
 *         VkComponentMapping             components
 *         VkChromaLocation               xChromaOffset
 *         VkChromaLocation               yChromaOffset
 *         VkFilter                       chromaFilter
 *         VkBool32                       forceExplicitReconstruction
 *     }
 * 
 *     Valid pNext types:
 *         - VkExternalFormatANDROID
 */
@JvmInline
value class SamplerYcbcrConversionCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var format: Format
		get()      = Format(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var ycbcrModel: SamplerYcbcrModelConversion
		get()      = _SamplerYcbcrModelConversion(Unsafe.getInt(address + 20))
		set(value) = Unsafe.setInt(address + 20, value.value)
	
	var ycbcrRange: SamplerYcbcrRange
		get()      = _SamplerYcbcrRange(Unsafe.getInt(address + 24))
		set(value) = Unsafe.setInt(address + 24, value.value)
	
	var components: ComponentMapping
		get()      = ComponentMapping(address + 28)
		set(value) = Unsafe.copy(value.address, address + 28, 16)
	
	var xChromaOffset: ChromaLocation
		get()      = _ChromaLocation(Unsafe.getInt(address + 44))
		set(value) = Unsafe.setInt(address + 44, value.value)
	
	var yChromaOffset: ChromaLocation
		get()      = _ChromaLocation(Unsafe.getInt(address + 48))
		set(value) = Unsafe.setInt(address + 48, value.value)
	
	var chromaFilter: Filter
		get()      = _Filter(Unsafe.getInt(address + 52))
		set(value) = Unsafe.setInt(address + 52, value.value)
	
	var forceExplicitReconstruction: Int
		get()      = Unsafe.getInt(address + 56)
		set(value) = Unsafe.setInt(address + 56, value)


}