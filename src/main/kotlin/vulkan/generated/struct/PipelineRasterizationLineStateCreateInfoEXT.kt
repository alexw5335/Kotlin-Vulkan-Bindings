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
 *     struct VkPipelineRasterizationLineStateCreateInfoEXT {
 *         VkStructureType             sType
 *         void*                       pNext (must be null)
 *         VkLineRasterizationModeEXT  lineRasterizationMode
 *         VkBool32                    stippledLineEnable
 *         uint32_t                    lineStippleFactor
 *         uint16_t                    lineStipplePattern
 *     }
 */
@JvmInline
value class PipelineRasterizationLineStateCreateInfoEXT(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var lineRasterizationMode: LineRasterizationMode
		get()      = LineRasterizationMode(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.id) }
	
	var stippledLineEnable: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value) }
	
	var lineStippleFactor: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value) }
	
	var lineStipplePattern: Short
		get()      = Unsafe.getShort(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setShort(address + LAYOUT.offsets[5], value) }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(4)
			member(4)
			member(2)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = PipelineRasterizationLineStateCreateInfoEXT(0)
		
		fun malloc(allocator: Allocator) = PipelineRasterizationLineStateCreateInfoEXT(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO
		}
		
		fun calloc(allocator: Allocator) = PipelineRasterizationLineStateCreateInfoEXT(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO
		}
	
	}


}