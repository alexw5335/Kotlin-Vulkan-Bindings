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
 */
@JvmInline
value class SamplerYcbcrConversionCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var format: Format
		get()      = Format(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.id) }
	
	var ycbcrModel: SamplerYcbcrModelConversion
		get()      = SamplerYcbcrModelConversion(Unsafe.getInt(address + LAYOUT.offsets[3]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value.id) }
	
	var ycbcrRange: SamplerYcbcrRange
		get()      = SamplerYcbcrRange(Unsafe.getInt(address + LAYOUT.offsets[4]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value.id) }
	
	var components: ComponentMapping
		get()      = ComponentMapping(address + LAYOUT.offsets[5])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[5], value.structSize) }
	
	var xChromaOffset: ChromaLocation
		get()      = ChromaLocation(Unsafe.getInt(address + LAYOUT.offsets[6]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[6], value.id) }
	
	var yChromaOffset: ChromaLocation
		get()      = ChromaLocation(Unsafe.getInt(address + LAYOUT.offsets[7]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[7], value.id) }
	
	var chromaFilter: Filter
		get()      = Filter(Unsafe.getInt(address + LAYOUT.offsets[8]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[8], value.id) }
	
	var forceExplicitReconstruction: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[9])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[9], value) }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(4)
			member(4)
			member(ComponentMapping.LAYOUT)
			member(4)
			member(4)
			member(4)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = SamplerYcbcrConversionCreateInfo(0)
		
		fun malloc(allocator: Allocator) = SamplerYcbcrConversionCreateInfo(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.SAMPLER_YCBCR_CONVERSION_CREATE_INFO
		}
		
		fun calloc(allocator: Allocator) = SamplerYcbcrConversionCreateInfo(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.SAMPLER_YCBCR_CONVERSION_CREATE_INFO
		}
	
	}


}