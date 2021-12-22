// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkGeneratedCommandsInfoNV {
 *         VkStructureType              sType
 *         void*                        pNext (must be null)
 *         VkPipelineBindPoint          pipelineBindPoint
 *         VkPipeline                   pipeline
 *         VkIndirectCommandsLayoutNV   indirectCommandsLayout
 *         uint32_t                     streamCount
 *         VkIndirectCommandsStreamNV*  pStreams
 *         uint32_t                     sequencesCount
 *         VkBuffer                     preprocessBuffer
 *         VkDeviceSize                 preprocessOffset
 *         VkDeviceSize                 preprocessSize
 *         VkBuffer                     sequencesCountBuffer
 *         VkDeviceSize                 sequencesCountOffset
 *         VkBuffer                     sequencesIndexBuffer
 *         VkDeviceSize                 sequencesIndexOffset
 *     }
 */
@JvmInline
value class GeneratedCommandsInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var pipelineBindPoint: PipelineBindPoint
		get()      = _PipelineBindPoint(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var pipeline: PipelineH
		get()      = PipelineH(Unsafe.getLong(address + 24))
		set(value) = Unsafe.setLong(address + 24, value.address)
	
	var indirectCommandsLayout: IndirectCommandsLayoutH
		get()      = IndirectCommandsLayoutH(Unsafe.getLong(address + 32))
		set(value) = Unsafe.setLong(address + 32, value.address)
	
	var streamCount: Int
		get()      = Unsafe.getInt(address + 40)
		set(value) = Unsafe.setInt(address + 40, value)
	
	var pStreams: Long
		get()      = Unsafe.getLong(address + 48)
		set(value) = Unsafe.setLong(address + 48, value)
	
	var sequencesCount: Int
		get()      = Unsafe.getInt(address + 56)
		set(value) = Unsafe.setInt(address + 56, value)
	
	var preprocessBuffer: BufferH
		get()      = BufferH(Unsafe.getLong(address + 64))
		set(value) = Unsafe.setLong(address + 64, value.address)
	
	var preprocessOffset: Long
		get()      = Unsafe.getLong(address + 72)
		set(value) = Unsafe.setLong(address + 72, value)
	
	var preprocessSize: Long
		get()      = Unsafe.getLong(address + 80)
		set(value) = Unsafe.setLong(address + 80, value)
	
	var sequencesCountBuffer: BufferH
		get()      = BufferH(Unsafe.getLong(address + 88))
		set(value) = Unsafe.setLong(address + 88, value.address)
	
	var sequencesCountOffset: Long
		get()      = Unsafe.getLong(address + 96)
		set(value) = Unsafe.setLong(address + 96, value)
	
	var sequencesIndexBuffer: BufferH
		get()      = BufferH(Unsafe.getLong(address + 104))
		set(value) = Unsafe.setLong(address + 104, value.address)
	
	var sequencesIndexOffset: Long
		get()      = Unsafe.getLong(address + 112)
		set(value) = Unsafe.setLong(address + 112, value)
	
	
	
	var streams: IndirectCommandsStream.Buffer
		get()      = IndirectCommandsStream.Buffer(Unsafe.getLong(address + 48), streamCount)
		set(value) { Unsafe.setLong(address + 48, value.address); streamCount = value.capacity }


}