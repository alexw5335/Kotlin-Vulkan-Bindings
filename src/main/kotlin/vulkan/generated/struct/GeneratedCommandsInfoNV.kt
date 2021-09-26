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
 *     struct VkGeneratedCommandsInfoNV {
 *         VkStructureType               sType
 *         void*                         pNext (must be null)
 *         VkPipelineBindPoint           pipelineBindPoint
 *         VkPipeline                    pipeline
 *         VkIndirectCommandsLayoutNV    indirectCommandsLayout
 *         uint32_t                      streamCount
 *         VkIndirectCommandsStreamNV**  pStreams
 *         uint32_t                      sequencesCount
 *         VkBuffer                      preprocessBuffer
 *         VkDeviceSize                  preprocessOffset
 *         VkDeviceSize                  preprocessSize
 *         VkBuffer                      sequencesCountBuffer
 *         VkDeviceSize                  sequencesCountOffset
 *         VkBuffer                      sequencesIndexBuffer
 *         VkDeviceSize                  sequencesIndexOffset
 *     }
 */
@JvmInline
value class GeneratedCommandsInfoNV(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var pipelineBindPoint: PipelineBindPoint
		get()      = PipelineBindPoint(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.id) }
	
	var pipeline: PipelineH
		get()      = PipelineH(Unsafe.getNativePointer(address + LAYOUT.offsets[3]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[3], value.address) }
	
	var indirectCommandsLayout: IndirectCommandsLayoutH
		get()      = IndirectCommandsLayoutH(Unsafe.getNativePointer(address + LAYOUT.offsets[4]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[4], value.address) }
	
	var streamCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[5], value) }
	
	var pStreams: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[6])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[6], value) }
	
	var sequencesCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[7])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[7], value) }
	
	var preprocessBuffer: BufferH
		get()      = BufferH(Unsafe.getNativePointer(address + LAYOUT.offsets[8]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[8], value.address) }
	
	var preprocessOffset: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[9])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[9], value) }
	
	var preprocessSize: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[10])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[10], value) }
	
	var sequencesCountBuffer: BufferH
		get()      = BufferH(Unsafe.getNativePointer(address + LAYOUT.offsets[11]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[11], value.address) }
	
	var sequencesCountOffset: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[12])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[12], value) }
	
	var sequencesIndexBuffer: BufferH
		get()      = BufferH(Unsafe.getNativePointer(address + LAYOUT.offsets[13]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[13], value.address) }
	
	var sequencesIndexOffset: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[14])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[14], value) }
	
	
	
	var streams: IndirectCommandsStreamNV.Buffer
		get()      = IndirectCommandsStreamNV.Buffer(Unsafe.getNativePointer(address + LAYOUT.offsets[6]), streamCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[6], value.address); streamCount = value.capacity }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(NativeSizes.POINTER)
			member(NativeSizes.POINTER)
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(NativeSizes.POINTER)
			member(8)
			member(8)
			member(NativeSizes.POINTER)
			member(8)
			member(NativeSizes.POINTER)
			member(8)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = GeneratedCommandsInfoNV(0)
		
		fun malloc(allocator: Allocator) = GeneratedCommandsInfoNV(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.GENERATED_COMMANDS_INFO
		}
		
		fun calloc(allocator: Allocator) = GeneratedCommandsInfoNV(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.GENERATED_COMMANDS_INFO
		}
	
	}


}