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
 *     struct VkPipelineViewportStateCreateInfo {
 *         VkStructureType                     sType
 *         void*                               pNext
 *         VkPipelineViewportStateCreateFlags  flags (reserved, must be zero)
 *         uint32_t                            viewportCount
 *         VkViewport**                        pViewports
 *         uint32_t                            scissorCount
 *         VkRect2D**                          pScissors
 *     }
 */
@JvmInline
value class PipelineViewportStateCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var flags: PipelineViewportStateCreateFlags
		get()      = PipelineViewportStateCreateFlags(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.bitfield) }
	
	var viewportCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value) }
	
	var pViewports: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[4], value) }
	
	var scissorCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[5], value) }
	
	var pScissors: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[6])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[6], value) }
	
	
	
	var viewports: Viewport.Buffer
		get()      = Viewport.Buffer(Unsafe.getNativePointer(address + LAYOUT.offsets[4]), viewportCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[4], value.address); viewportCount = value.capacity }
	
	var scissors: Rect2D.Buffer
		get()      = Rect2D.Buffer(Unsafe.getNativePointer(address + LAYOUT.offsets[6]), scissorCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[6], value.address); scissorCount = value.capacity }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(NativeSizes.POINTER)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = PipelineViewportStateCreateInfo(0)
		
		fun malloc(allocator: Allocator) = PipelineViewportStateCreateInfo(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PIPELINE_VIEWPORT_STATE_CREATE_INFO
		}
		
		fun calloc(allocator: Allocator) = PipelineViewportStateCreateInfo(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PIPELINE_VIEWPORT_STATE_CREATE_INFO
		}
	
	}


}