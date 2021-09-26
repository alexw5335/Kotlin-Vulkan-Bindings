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
 *     struct VkRayTracingPipelineCreateInfoNV {
 *         VkStructureType                        sType
 *         void*                                  pNext
 *         VkPipelineCreateFlags                  flags
 *         uint32_t                               stageCount
 *         VkPipelineShaderStageCreateInfo**      pStages
 *         uint32_t                               groupCount
 *         VkRayTracingShaderGroupCreateInfoNV**  pGroups
 *         uint32_t                               maxRecursionDepth
 *         VkPipelineLayout                       layout
 *         VkPipeline                             basePipelineHandle
 *         int32_t                                basePipelineIndex
 *     }
 */
@JvmInline
value class RayTracingPipelineCreateInfoNV(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var flags: PipelineCreateFlags
		get()      = PipelineCreateFlags(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.bitfield) }
	
	var stageCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value) }
	
	var pStages: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[4], value) }
	
	var groupCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[5], value) }
	
	var pGroups: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[6])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[6], value) }
	
	var maxRecursionDepth: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[7])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[7], value) }
	
	var layout: PipelineLayoutH
		get()      = PipelineLayoutH(Unsafe.getNativePointer(address + LAYOUT.offsets[8]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[8], value.address) }
	
	var basePipelineHandle: PipelineH
		get()      = PipelineH(Unsafe.getNativePointer(address + LAYOUT.offsets[9]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[9], value.address) }
	
	var basePipelineIndex: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[10])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[10], value) }
	
	
	
	var stages: PipelineShaderStageCreateInfo.Buffer
		get()      = PipelineShaderStageCreateInfo.Buffer(Unsafe.getNativePointer(address + LAYOUT.offsets[4]), stageCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[4], value.address); stageCount = value.capacity }
	
	var groups: RayTracingShaderGroupCreateInfoNV.Buffer
		get()      = RayTracingShaderGroupCreateInfoNV.Buffer(Unsafe.getNativePointer(address + LAYOUT.offsets[6]), groupCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[6], value.address); groupCount = value.capacity }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		operator fun get(index: Int) = RayTracingPipelineCreateInfoNV(offset(index))
		
		operator fun set(index: Int, value: RayTracingPipelineCreateInfoNV) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (RayTracingPipelineCreateInfoNV) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (RayTracingPipelineCreateInfoNV) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "RayTracingPipelineCreateInfoNV[$capacity]"
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)
	
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
			member(4)
			member(NativeSizes.POINTER)
			member(NativeSizes.POINTER)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = RayTracingPipelineCreateInfoNV(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = RayTracingPipelineCreateInfoNV(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.RAY_TRACING_PIPELINE_CREATE_INFO_NV
		}
		
		fun calloc(allocator: Allocator) = RayTracingPipelineCreateInfoNV(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.RAY_TRACING_PIPELINE_CREATE_INFO_NV
		}
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.RAY_TRACING_PIPELINE_CREATE_INFO_NV }
		}
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.RAY_TRACING_PIPELINE_CREATE_INFO_NV }
		}
	
	}


}