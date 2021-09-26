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
 *     struct VkPipelineViewportCoarseSampleOrderStateCreateInfoNV {
 *         VkStructureType                sType
 *         void*                          pNext (must be null)
 *         VkCoarseSampleOrderTypeNV      sampleOrderType
 *         uint32_t                       customSampleOrderCount
 *         VkCoarseSampleOrderCustomNV**  pCustomSampleOrders
 *     }
 */
@JvmInline
value class PipelineViewportCoarseSampleOrderStateCreateInfoNV(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var sampleOrderType: CoarseSampleOrderType
		get()      = CoarseSampleOrderType(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.id) }
	
	var customSampleOrderCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value) }
	
	var pCustomSampleOrders: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[4], value) }
	
	
	
	var customSampleOrders: CoarseSampleOrderCustomNV.Buffer
		get()      = CoarseSampleOrderCustomNV.Buffer(Unsafe.getNativePointer(address + LAYOUT.offsets[4]), customSampleOrderCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[4], value.address); customSampleOrderCount = value.capacity }
	
	
	
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
		
		val NULL = PipelineViewportCoarseSampleOrderStateCreateInfoNV(0)
		
		fun malloc(allocator: Allocator) = PipelineViewportCoarseSampleOrderStateCreateInfoNV(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PIPELINE_VIEWPORT_COARSE_SAMPLE_ORDER_STATE_CREATE_INFO
		}
		
		fun calloc(allocator: Allocator) = PipelineViewportCoarseSampleOrderStateCreateInfoNV(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PIPELINE_VIEWPORT_COARSE_SAMPLE_ORDER_STATE_CREATE_INFO
		}
	
	}


}