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
 *     struct VkRenderPassBeginInfo {
 *         VkStructureType  sType
 *         void*            pNext
 *         VkRenderPass     renderPass
 *         VkFramebuffer    framebuffer
 *         VkRect2D         renderArea
 *         uint32_t         clearValueCount
 *         VkClearValue**   pClearValues
 *     }
 */
@JvmInline
value class RenderPassBeginInfo(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var renderPass: RenderPassH
		get()      = RenderPassH(Unsafe.getNativePointer(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[2], value.address) }
	
	var framebuffer: FramebufferH
		get()      = FramebufferH(Unsafe.getNativePointer(address + LAYOUT.offsets[3]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[3], value.address) }
	
	var renderArea: Rect2D
		get()      = Rect2D(address + LAYOUT.offsets[4])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[4], value.structSize) }
	
	var clearValueCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[5], value) }
	
	var pClearValues: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[6])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[6], value) }
	
	
	
	var clearValues: ClearValue.Buffer
		get()      = ClearValue.Buffer(Unsafe.getNativePointer(address + LAYOUT.offsets[6]), clearValueCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[6], value.address); clearValueCount = value.capacity }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(NativeSizes.POINTER)
			member(NativeSizes.POINTER)
			member(Rect2D.LAYOUT)
			member(4)
			member(NativeSizes.POINTER)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = RenderPassBeginInfo(0)
		
		fun malloc(allocator: Allocator) = RenderPassBeginInfo(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.RENDER_PASS_BEGIN_INFO
		}
		
		fun calloc(allocator: Allocator) = RenderPassBeginInfo(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.RENDER_PASS_BEGIN_INFO
		}
	
	}


}