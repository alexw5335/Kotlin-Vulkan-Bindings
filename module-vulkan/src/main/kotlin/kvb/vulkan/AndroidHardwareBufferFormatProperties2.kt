// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_ANDROID_external_memory_android_hardware_buffer

 *     struct VkAndroidHardwareBufferFormatProperties2ANDROID {
 *         VkStructureType                sType
 *         void*                          pNext (must be null)
 *         VkFormat                       format
 *         uint64_t                       externalFormat
 *         VkFormatFeatureFlags2KHR       formatFeatures
 *         VkComponentMapping             samplerYcbcrConversionComponents
 *         VkSamplerYcbcrModelConversion  suggestedYcbcrModel
 *         VkSamplerYcbcrRange            suggestedYcbcrRange
 *         VkChromaLocation               suggestedXChromaOffset
 *         VkChromaLocation               suggestedYChromaOffset
 *     }
 */
@JvmInline
value class AndroidHardwareBufferFormatProperties2(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var format: Format
		get()      = Format(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var externalFormat: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var formatFeatures: FormatFeatureFlags2
		get()      = FormatFeatureFlags2(Unsafe.getLong(address + 32))
		set(value) = Unsafe.setLong(address + 32, value.value)
	
	var samplerYcbcrConversionComponents: ComponentMapping
		get()      = ComponentMapping(address + 40)
		set(value) = Unsafe.copy(value.address, address + 40, 16)
	
	var suggestedYcbcrModel: SamplerYcbcrModelConversion
		get()      = _SamplerYcbcrModelConversion(Unsafe.getInt(address + 56))
		set(value) = Unsafe.setInt(address + 56, value.value)
	
	var suggestedYcbcrRange: SamplerYcbcrRange
		get()      = _SamplerYcbcrRange(Unsafe.getInt(address + 60))
		set(value) = Unsafe.setInt(address + 60, value.value)
	
	var suggestedXChromaOffset: ChromaLocation
		get()      = _ChromaLocation(Unsafe.getInt(address + 64))
		set(value) = Unsafe.setInt(address + 64, value.value)
	
	var suggestedYChromaOffset: ChromaLocation
		get()      = _ChromaLocation(Unsafe.getInt(address + 68))
		set(value) = Unsafe.setInt(address + 68, value.value)


}