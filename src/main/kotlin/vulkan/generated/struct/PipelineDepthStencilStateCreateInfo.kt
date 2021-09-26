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
 *     struct VkPipelineDepthStencilStateCreateInfo {
 *         VkStructureType                         sType
 *         void*                                   pNext (must be null)
 *         VkPipelineDepthStencilStateCreateFlags  flags (reserved, must be zero)
 *         VkBool32                                depthTestEnable
 *         VkBool32                                depthWriteEnable
 *         VkCompareOp                             depthCompareOp
 *         VkBool32                                depthBoundsTestEnable
 *         VkBool32                                stencilTestEnable
 *         VkStencilOpState                        front
 *         VkStencilOpState                        back
 *         float                                   minDepthBounds
 *         float                                   maxDepthBounds
 *     }
 */
@JvmInline
value class PipelineDepthStencilStateCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var flags: PipelineDepthStencilStateCreateFlags
		get()      = PipelineDepthStencilStateCreateFlags(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.bitfield) }
	
	var depthTestEnable: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value) }
	
	var depthWriteEnable: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value) }
	
	var depthCompareOp: CompareOp
		get()      = CompareOp(Unsafe.getInt(address + LAYOUT.offsets[5]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[5], value.id) }
	
	var depthBoundsTestEnable: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[6])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[6], value) }
	
	var stencilTestEnable: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[7])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[7], value) }
	
	var front: StencilOpState
		get()      = StencilOpState(address + LAYOUT.offsets[8])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[8], value.structSize) }
	
	var back: StencilOpState
		get()      = StencilOpState(address + LAYOUT.offsets[9])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[9], value.structSize) }
	
	var minDepthBounds: Float
		get()      = Unsafe.getFloat(address + LAYOUT.offsets[10])
		set(value) { Unsafe.setFloat(address + LAYOUT.offsets[10], value) }
	
	var maxDepthBounds: Float
		get()      = Unsafe.getFloat(address + LAYOUT.offsets[11])
		set(value) { Unsafe.setFloat(address + LAYOUT.offsets[11], value) }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(StencilOpState.LAYOUT)
			member(StencilOpState.LAYOUT)
			member(4)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = PipelineDepthStencilStateCreateInfo(0)
		
		fun malloc(allocator: Allocator) = PipelineDepthStencilStateCreateInfo(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PIPELINE_DEPTH_STENCIL_STATE_CREATE_INFO
		}
		
		fun calloc(allocator: Allocator) = PipelineDepthStencilStateCreateInfo(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PIPELINE_DEPTH_STENCIL_STATE_CREATE_INFO
		}
	
	}


}