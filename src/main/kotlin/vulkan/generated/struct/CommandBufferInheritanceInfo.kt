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
 *     struct VkCommandBufferInheritanceInfo {
 *         VkStructureType                sType
 *         void*                          pNext
 *         VkRenderPass                   renderPass
 *         uint32_t                       subpass
 *         VkFramebuffer                  framebuffer
 *         VkBool32                       occlusionQueryEnable
 *         VkQueryControlFlags            queryFlags
 *         VkQueryPipelineStatisticFlags  pipelineStatistics
 *     }
 */
@JvmInline
value class CommandBufferInheritanceInfo(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var renderPass: RenderPassH
		get()      = RenderPassH(Unsafe.getNativePointer(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[2], value.address) }
	
	var subpass: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value) }
	
	var framebuffer: FramebufferH
		get()      = FramebufferH(Unsafe.getNativePointer(address + LAYOUT.offsets[4]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[4], value.address) }
	
	var occlusionQueryEnable: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[5], value) }
	
	var queryFlags: QueryControlFlags
		get()      = QueryControlFlags(Unsafe.getInt(address + LAYOUT.offsets[6]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[6], value.bitfield) }
	
	var pipelineStatistics: QueryPipelineStatisticFlags
		get()      = QueryPipelineStatisticFlags(Unsafe.getInt(address + LAYOUT.offsets[7]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[7], value.bitfield) }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(NativeSizes.POINTER)
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(4)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = CommandBufferInheritanceInfo(0)
		
		fun malloc(allocator: Allocator) = CommandBufferInheritanceInfo(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.COMMAND_BUFFER_INHERITANCE_INFO
		}
		
		fun calloc(allocator: Allocator) = CommandBufferInheritanceInfo(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.COMMAND_BUFFER_INHERITANCE_INFO
		}
	
	}


}