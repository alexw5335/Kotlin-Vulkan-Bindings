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
 *     struct VkPipelineRasterizationStateCreateInfo {
 *         VkStructureType                          sType
 *         void*                                    pNext
 *         VkPipelineRasterizationStateCreateFlags  flags (reserved, must be zero)
 *         VkBool32                                 depthClampEnable
 *         VkBool32                                 rasterizerDiscardEnable
 *         VkPolygonMode                            polygonMode
 *         VkCullModeFlags                          cullMode
 *         VkFrontFace                              frontFace
 *         VkBool32                                 depthBiasEnable
 *         float                                    depthBiasConstantFactor
 *         float                                    depthBiasClamp
 *         float                                    depthBiasSlopeFactor
 *         float                                    lineWidth
 *     }
 */
@JvmInline
value class PipelineRasterizationStateCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var flags: PipelineRasterizationStateCreateFlags
		get()      = PipelineRasterizationStateCreateFlags(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.bitfield) }
	
	var depthClampEnable: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value) }
	
	var rasterizerDiscardEnable: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value) }
	
	var polygonMode: PolygonMode
		get()      = PolygonMode(Unsafe.getInt(address + LAYOUT.offsets[5]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[5], value.id) }
	
	var cullMode: CullModeFlags
		get()      = CullModeFlags(Unsafe.getInt(address + LAYOUT.offsets[6]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[6], value.bitfield) }
	
	var frontFace: FrontFace
		get()      = FrontFace(Unsafe.getInt(address + LAYOUT.offsets[7]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[7], value.id) }
	
	var depthBiasEnable: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[8])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[8], value) }
	
	var depthBiasConstantFactor: Float
		get()      = Unsafe.getFloat(address + LAYOUT.offsets[9])
		set(value) { Unsafe.setFloat(address + LAYOUT.offsets[9], value) }
	
	var depthBiasClamp: Float
		get()      = Unsafe.getFloat(address + LAYOUT.offsets[10])
		set(value) { Unsafe.setFloat(address + LAYOUT.offsets[10], value) }
	
	var depthBiasSlopeFactor: Float
		get()      = Unsafe.getFloat(address + LAYOUT.offsets[11])
		set(value) { Unsafe.setFloat(address + LAYOUT.offsets[11], value) }
	
	var lineWidth: Float
		get()      = Unsafe.getFloat(address + LAYOUT.offsets[12])
		set(value) { Unsafe.setFloat(address + LAYOUT.offsets[12], value) }
	
	
	
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
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = PipelineRasterizationStateCreateInfo(0)
		
		fun malloc(allocator: Allocator) = PipelineRasterizationStateCreateInfo(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PIPELINE_RASTERIZATION_STATE_CREATE_INFO
		}
		
		fun calloc(allocator: Allocator) = PipelineRasterizationStateCreateInfo(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PIPELINE_RASTERIZATION_STATE_CREATE_INFO
		}
	
	}


}