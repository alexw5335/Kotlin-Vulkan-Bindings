// This file has been automatically generated.

package vulkan.generated.struct

import memory.NativeSizes
import memory.type.DirectBuffer
import memory.struct.LayoutBuilder
import memory.allocation.Allocator
import memory.Unsafe
import memory.type.Addressable

import vulkan.generated.enumeration.*
import memory.primitive.*
import vulkan.generated.handle.*

/**
 *     struct VkAndroidHardwareBufferFormatPropertiesANDROID {
 *         VkStructureType                sType
 *         void*                          pNext (must be null)
 *         VkFormat                       format
 *         uint64_t                       externalFormat
 *         VkFormatFeatureFlags           formatFeatures
 *         VkComponentMapping             samplerYcbcrConversionComponents
 *         VkSamplerYcbcrModelConversion  suggestedYcbcrModel
 *         VkSamplerYcbcrRange            suggestedYcbcrRange
 *         VkChromaLocation               suggestedXChromaOffset
 *         VkChromaLocation               suggestedYChromaOffset
 *     }
 */
@JvmInline
value class AndroidHardwareBufferFormatPropertiesANDROID(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var format: Format
		get()      = Format(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.id) }
	
	var externalFormat: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[3], value) }
	
	var formatFeatures: FormatFeatureFlags
		get()      = FormatFeatureFlags(Unsafe.getInt(address + LAYOUT.offsets[4]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value.bitfield) }
	
	var samplerYcbcrConversionComponents: ComponentMapping
		get()      = ComponentMapping(address + LAYOUT.offsets[5])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[5], value.structSize) }
	
	var suggestedYcbcrModel: SamplerYcbcrModelConversion
		get()      = SamplerYcbcrModelConversion(Unsafe.getInt(address + LAYOUT.offsets[6]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[6], value.id) }
	
	var suggestedYcbcrRange: SamplerYcbcrRange
		get()      = SamplerYcbcrRange(Unsafe.getInt(address + LAYOUT.offsets[7]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[7], value.id) }
	
	var suggestedXChromaOffset: ChromaLocation
		get()      = ChromaLocation(Unsafe.getInt(address + LAYOUT.offsets[8]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[8], value.id) }
	
	var suggestedYChromaOffset: ChromaLocation
		get()      = ChromaLocation(Unsafe.getInt(address + LAYOUT.offsets[9]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[9], value.id) }
	
	
	
	class Persistent(
		val sType: StructureType,
		val format: Format,
		val externalFormat: Long,
		val formatFeatures: FormatFeatureFlags,
		val samplerYcbcrConversionComponents: ComponentMapping.Persistent,
		val suggestedYcbcrModel: SamplerYcbcrModelConversion,
		val suggestedYcbcrRange: SamplerYcbcrRange,
		val suggestedXChromaOffset: ChromaLocation,
		val suggestedYChromaOffset: ChromaLocation,
	) {
		override fun toString() = "AndroidHardwareBufferFormatPropertiesANDROID(" + 
			"sType=$sType, " +
			"format=$format, " +
			"externalFormat=$externalFormat, " +
			"formatFeatures=$formatFeatures, " +
			"samplerYcbcrConversionComponents=$samplerYcbcrConversionComponents, " +
			"suggestedYcbcrModel=$suggestedYcbcrModel, " +
			"suggestedYcbcrRange=$suggestedYcbcrRange, " +
			"suggestedXChromaOffset=$suggestedXChromaOffset, " +
			"suggestedYChromaOffset=$suggestedYChromaOffset)"
	}
	
	
	
	val asPersistent get() = Persistent(
		sType, 
		format, 
		externalFormat, 
		formatFeatures, 
		samplerYcbcrConversionComponents.asPersistent, 
		suggestedYcbcrModel, 
		suggestedYcbcrRange, 
		suggestedXChromaOffset, 
		suggestedYChromaOffset, 
	)
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(8)
			member(4)
			member(ComponentMapping.LAYOUT)
			member(4)
			member(4)
			member(4)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = AndroidHardwareBufferFormatPropertiesANDROID(0)
		
		fun malloc(allocator: Allocator) = AndroidHardwareBufferFormatPropertiesANDROID(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.ANDROID_HARDWARE_BUFFER_FORMAT_PROPERTIES
		}
		
		fun calloc(allocator: Allocator) = AndroidHardwareBufferFormatPropertiesANDROID(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.ANDROID_HARDWARE_BUFFER_FORMAT_PROPERTIES
		}
	
	}


}