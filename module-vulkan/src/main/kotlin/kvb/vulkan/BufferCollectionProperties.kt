// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_FUCHSIA_buffer_collection

 *     struct VkBufferCollectionPropertiesFUCHSIA {
 *         VkStructureType                sType
 *         void*                          pNext (must be null)
 *         uint32_t                       memoryTypeBits
 *         uint32_t                       bufferCount
 *         uint32_t                       createInfoIndex
 *         uint64_t                       sysmemPixelFormat
 *         VkFormatFeatureFlags           formatFeatures
 *         VkSysmemColorSpaceFUCHSIA      sysmemColorSpaceIndex
 *         VkComponentMapping             samplerYcbcrConversionComponents
 *         VkSamplerYcbcrModelConversion  suggestedYcbcrModel
 *         VkSamplerYcbcrRange            suggestedYcbcrRange
 *         VkChromaLocation               suggestedXChromaOffset
 *         VkChromaLocation               suggestedYChromaOffset
 *     }
 */
@JvmInline
value class BufferCollectionProperties(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var memoryTypeBits: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var bufferCount: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var createInfoIndex: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var sysmemPixelFormat: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)
	
	var formatFeatures: FormatFeatureFlags
		get()      = FormatFeatureFlags(Unsafe.getInt(address + 40))
		set(value) = Unsafe.setInt(address + 40, value.value)
	
	var sysmemColorSpaceIndex: SysmemColorSpace
		get()      = SysmemColorSpace(address + 48)
		set(value) = Unsafe.copy(value.address, address + 48, 24)
	
	var samplerYcbcrConversionComponents: ComponentMapping
		get()      = ComponentMapping(address + 72)
		set(value) = Unsafe.copy(value.address, address + 72, 16)
	
	var suggestedYcbcrModel: SamplerYcbcrModelConversion
		get()      = _SamplerYcbcrModelConversion(Unsafe.getInt(address + 88))
		set(value) = Unsafe.setInt(address + 88, value.value)
	
	var suggestedYcbcrRange: SamplerYcbcrRange
		get()      = _SamplerYcbcrRange(Unsafe.getInt(address + 92))
		set(value) = Unsafe.setInt(address + 92, value.value)
	
	var suggestedXChromaOffset: ChromaLocation
		get()      = _ChromaLocation(Unsafe.getInt(address + 96))
		set(value) = Unsafe.setInt(address + 96, value.value)
	
	var suggestedYChromaOffset: ChromaLocation
		get()      = _ChromaLocation(Unsafe.getInt(address + 100))
		set(value) = Unsafe.setInt(address + 100, value.value)


}