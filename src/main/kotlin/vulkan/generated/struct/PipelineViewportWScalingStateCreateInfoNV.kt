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
 *     struct VkPipelineViewportWScalingStateCreateInfoNV {
 *         VkStructureType         sType
 *         void*                   pNext (must be null)
 *         VkBool32                viewportWScalingEnable
 *         uint32_t                viewportCount
 *         VkViewportWScalingNV**  pViewportWScalings
 *     }
 */
@JvmInline
value class PipelineViewportWScalingStateCreateInfoNV(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var viewportWScalingEnable: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	var viewportCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value) }
	
	var pViewportWScalings: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[4], value) }
	
	
	
	var viewportWScalings: ViewportWScalingNV.Buffer
		get()      = ViewportWScalingNV.Buffer(Unsafe.getNativePointer(address + LAYOUT.offsets[4]), viewportCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[4], value.address); viewportCount = value.capacity }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(4)
			member(NativeSizes.POINTER)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = PipelineViewportWScalingStateCreateInfoNV(0)
		
		fun malloc(allocator: Allocator) = PipelineViewportWScalingStateCreateInfoNV(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PIPELINE_VIEWPORT_W_SCALING_STATE_CREATE_INFO
		}
		
		fun calloc(allocator: Allocator) = PipelineViewportWScalingStateCreateInfoNV(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PIPELINE_VIEWPORT_W_SCALING_STATE_CREATE_INFO
		}
	
	}


}