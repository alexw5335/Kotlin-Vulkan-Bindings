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
 *     struct VkCommandBufferInheritanceRenderPassTransformInfoQCOM {
 *         VkStructureType                sType
 *         void*                          pNext (must be null)
 *         VkSurfaceTransformFlagBitsKHR  transform
 *         VkRect2D                       renderArea
 *     }
 */
@JvmInline
value class CommandBufferInheritanceRenderPassTransformInfoQCOM(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var transform: SurfaceTransformFlags
		get()      = SurfaceTransformFlags(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.bitfield) }
	
	var renderArea: Rect2D
		get()      = Rect2D(address + LAYOUT.offsets[3])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[3], value.structSize) }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(Rect2D.LAYOUT)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = CommandBufferInheritanceRenderPassTransformInfoQCOM(0)
		
		fun malloc(allocator: Allocator) = CommandBufferInheritanceRenderPassTransformInfoQCOM(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.COMMAND_BUFFER_INHERITANCE_RENDER_PASS_TRANSFORM_INFO
		}
		
		fun calloc(allocator: Allocator) = CommandBufferInheritanceRenderPassTransformInfoQCOM(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.COMMAND_BUFFER_INHERITANCE_RENDER_PASS_TRANSFORM_INFO
		}
	
	}


}