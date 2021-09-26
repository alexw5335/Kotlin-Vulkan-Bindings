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
 *     struct VkPipelineDiscardRectangleStateCreateInfoEXT {
 *         VkStructureType                                sType
 *         void*                                          pNext (must be null)
 *         VkPipelineDiscardRectangleStateCreateFlagsEXT  flags (reserved, must be zero)
 *         VkDiscardRectangleModeEXT                      discardRectangleMode
 *         uint32_t                                       discardRectangleCount
 *         VkRect2D**                                     pDiscardRectangles
 *     }
 */
@JvmInline
value class PipelineDiscardRectangleStateCreateInfoEXT(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var flags: PipelineDiscardRectangleStateCreateFlags
		get()      = PipelineDiscardRectangleStateCreateFlags(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.bitfield) }
	
	var discardRectangleMode: DiscardRectangleMode
		get()      = DiscardRectangleMode(Unsafe.getInt(address + LAYOUT.offsets[3]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value.id) }
	
	var discardRectangleCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value) }
	
	var pDiscardRectangles: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[5], value) }
	
	
	
	var discardRectangles: Rect2D.Buffer
		get()      = Rect2D.Buffer(Unsafe.getNativePointer(address + LAYOUT.offsets[5]), discardRectangleCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[5], value.address); discardRectangleCount = value.capacity }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(4)
			member(4)
			member(NativeSizes.POINTER)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = PipelineDiscardRectangleStateCreateInfoEXT(0)
		
		fun malloc(allocator: Allocator) = PipelineDiscardRectangleStateCreateInfoEXT(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PIPELINE_DISCARD_RECTANGLE_STATE_CREATE_INFO
		}
		
		fun calloc(allocator: Allocator) = PipelineDiscardRectangleStateCreateInfoEXT(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PIPELINE_DISCARD_RECTANGLE_STATE_CREATE_INFO
		}
	
	}


}