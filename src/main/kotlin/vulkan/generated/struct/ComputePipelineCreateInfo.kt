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
 *     struct VkComputePipelineCreateInfo {
 *         VkStructureType                  sType
 *         void*                            pNext
 *         VkPipelineCreateFlags            flags
 *         VkPipelineShaderStageCreateInfo  stage
 *         VkPipelineLayout                 layout
 *         VkPipeline                       basePipelineHandle
 *         int32_t                          basePipelineIndex
 *     }
 */
@JvmInline
value class ComputePipelineCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var flags: PipelineCreateFlags
		get()      = PipelineCreateFlags(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.bitfield) }
	
	var stage: PipelineShaderStageCreateInfo
		get()      = PipelineShaderStageCreateInfo(address + LAYOUT.offsets[3])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[3], value.structSize) }
	
	var layout: PipelineLayoutH
		get()      = PipelineLayoutH(Unsafe.getNativePointer(address + LAYOUT.offsets[4]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[4], value.address) }
	
	var basePipelineHandle: PipelineH
		get()      = PipelineH(Unsafe.getNativePointer(address + LAYOUT.offsets[5]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[5], value.address) }
	
	var basePipelineIndex: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[6])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[6], value) }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		operator fun get(index: Int) = ComputePipelineCreateInfo(offset(index))
		
		operator fun set(index: Int, value: ComputePipelineCreateInfo) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (ComputePipelineCreateInfo) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (ComputePipelineCreateInfo) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "ComputePipelineCreateInfo[$capacity]"
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(PipelineShaderStageCreateInfo.LAYOUT)
			member(NativeSizes.POINTER)
			member(NativeSizes.POINTER)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = ComputePipelineCreateInfo(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = ComputePipelineCreateInfo(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.COMPUTE_PIPELINE_CREATE_INFO
		}
		
		fun calloc(allocator: Allocator) = ComputePipelineCreateInfo(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.COMPUTE_PIPELINE_CREATE_INFO
		}
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.COMPUTE_PIPELINE_CREATE_INFO }
		}
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.COMPUTE_PIPELINE_CREATE_INFO }
		}
	
	}


}