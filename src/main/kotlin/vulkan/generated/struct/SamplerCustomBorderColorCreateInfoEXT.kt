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
 *     struct VkSamplerCustomBorderColorCreateInfoEXT {
 *         VkStructureType    sType
 *         void*              pNext (must be null)
 *         VkClearColorValue  customBorderColor
 *         VkFormat           format
 *     }
 */
@JvmInline
value class SamplerCustomBorderColorCreateInfoEXT(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var customBorderColor: ClearColorValue
		get()      = ClearColorValue(address + LAYOUT.offsets[2])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[2], value.structSize) }
	
	var format: Format
		get()      = Format(Unsafe.getInt(address + LAYOUT.offsets[3]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value.id) }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(ClearColorValue.LAYOUT)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = SamplerCustomBorderColorCreateInfoEXT(0)
		
		fun malloc(allocator: Allocator) = SamplerCustomBorderColorCreateInfoEXT(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.SAMPLER_CUSTOM_BORDER_COLOR_CREATE_INFO
		}
		
		fun calloc(allocator: Allocator) = SamplerCustomBorderColorCreateInfoEXT(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.SAMPLER_CUSTOM_BORDER_COLOR_CREATE_INFO
		}
	
	}


}