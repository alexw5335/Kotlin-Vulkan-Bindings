package kvb.vkwrapper.memory

import kvb.core.memory.DirectList
import kvb.core.memory.Persistent
import kvb.core.memory.direct.DirectByteBuffer
import kvb.core.memory.stack
import kvb.vkwrapper.exception.VkException
import kvb.vkwrapper.handle.*
import kvb.vulkan.BufferCopy
import kvb.vulkan.BufferUsageFlags
import kvb.vulkan.MappedMemoryRange
import kvb.vulkan.MemoryPropertyFlags

/**
 * Manages memory writes.
 * - Queued and immediate range flushing for host-visible, non-host-coherent memory.
 * - Queued and immediate copying from a staging buffer for non-host-visible memory.
 */
class VkMemoryManager(val device: Device, val queue: Queue, stagingBufferSize: Long) {


	private val commandPool = device.createCommandPool(queue.family)

	private val commandBuffer = commandPool.allocatePrimary()



	private val stagingBuffer = device.createBuffer(stagingBufferSize, BufferUsageFlags.TRANSFER_SRC)

	private val stagingBufferMemory = device.allocateMemory(
		size           = stagingBufferSize,
		property1      = MemoryPropertyFlags.HOST_VISIBLE,
		property2      = MemoryPropertyFlags.DEVICE_LOCAL,
		property3      = MemoryPropertyFlags.HOST_COHERENT,
		memoryTypeBits = stagingBuffer.memoryTypeBits
	).also(stagingBuffer::bindMemory).also(DeviceMemory::mapWhole)

	private val stagingAllocator = VkLinearAllocator(stagingBufferMemory)



	private val queuedFlushes = DirectList(Persistent) { MappedMemoryRange(it) { } }

	private val queuedCopies = ArrayList<CopyInfo>()



	private class CopyInfo(val dst: Buffer, val regions: ArrayList<CopyRegion>)

	private class CopyRegion(val srcOffset: Long, val dstOffset: Long, val size: Long)




	fun destroy() {
		stagingBuffer.destroy()
		stagingAllocator.destroy()
		commandPool.destroy()
	}



	/*
	Commands
	 */



	private inline fun oneTimeSubmit(block: (CommandBuffer) -> Unit) {
		commandBuffer.beginOneTimeSubmit()
		block(commandBuffer)
		commandBuffer.end()
		queue.submit(commandBuffer)
		queue.waitIdle()
		commandPool.reset()
	}



	fun executeCommands() {
		executeFlushes()
		executeCopies()
	}



	/*
	Copying
	 */



	fun copy(dst: Buffer, srcOffset: Long, dstOffset: Long, size: Long) {
		oneTimeSubmit {
			it.copyBuffer(stagingBuffer, dst, srcOffset, dstOffset, size)
		}
	}



	fun queueCopy(dst: Buffer, srcOffset: Long, dstOffset: Long, size: Long) {
		queuedCopies
			.firstOrNull { it.dst == dst }
			?: CopyInfo(dst, ArrayList())
			.also(queuedCopies::add)
			.regions
			.add(CopyRegion(srcOffset, dstOffset, size))
	}



	private fun executeCopies() {
		if(queuedCopies.isEmpty()) return

		oneTimeSubmit {
			stack {
				val regions = DirectList(this) { BufferCopy(it) { } }

				for(info in queuedCopies) {
					regions.reset()

					for(region in info.regions) {
						regions.buffer[regions.next].let {
							it.srcOffset = region.srcOffset
							it.dstOffset = region.dstOffset
							it.size = region.size
						}
					}

					commandBuffer.copyBuffer(stagingBuffer, info.dst, BufferCopy.Buffer(regions.address, regions.size))
				}
			}
		}

		queuedCopies.clear()
		stagingAllocator.reset()
	}



	/*
	Flushing
	 */



	fun flush(memory: DeviceMemory, offset: Long, size: Long) = stack {
		device.flushMappedMemoryRanges(
			MappedMemoryRange {
				it.memory = memory
				it.offset = offset
				it.size = size
			}.asBuffer
		)
	}



	fun queueFlush(buffer: Buffer, offset: Long, size: Long) {
		queuedFlushes.buffer[queuedFlushes.next].let {
			it.memory = buffer.memory
			it.offset = buffer.offset + offset
			it.size = size
		}
	}



	private fun executeFlushes() {
		if(queuedFlushes.isEmpty) return
		device.flushMappedMemoryRanges(MappedMemoryRange.Buffer(queuedFlushes.address, queuedFlushes.size))
		queuedFlushes.reset()
	}



	/*
	Writing
	 */



	fun queueWrite(
		buffer : Buffer,
		offset : Long = 0L,
		size   : Long = buffer.size,
		block  : (DirectByteBuffer) -> Unit
	) {
		if(buffer.memory.type.isHostVisible && buffer.isMapped(offset, size)) {
			block(buffer.data(offset, size))

			if(!buffer.memory.type.isHostCoherent)
				queueFlush(buffer, offset, size)

			return
		}

		if(BufferUsageFlags.TRANSFER_DST !in buffer.usage)
			throw VkException("Attempting to transfer data to a device-local " +
				"buffer that was not created with the TRANSFER_DST usage set.")

		val stagingOffset = stagingAllocator.allocate(size, 8).offset
		block(stagingBuffer.data(stagingOffset, size))
		if(!stagingBuffer.memory.type.isHostCoherent)
			queueFlush(stagingBuffer, stagingOffset, size)
		queueCopy(buffer, stagingOffset, offset, size)
	}



	fun write(
		buffer : Buffer,
		offset : Long = 0L,
		size   : Long = buffer.size,
		block  : (DirectByteBuffer) -> Unit
	) {
		if(buffer.memory.type.isHostVisible && buffer.isMapped(offset, size)) {
			block(buffer.data(offset, size))

			if(!buffer.memory.type.isHostCoherent)
				flush(buffer.memory, offset, size)

			return
		}

		if(BufferUsageFlags.TRANSFER_DST !in buffer.usage)
			throw VkException("Attempting to transfer data to a device-local " +
				"buffer that was not created with the TRANSFER_DST usage set.")

		stagingAllocator.stack {
			val stagingOffset = allocate(size, 8).offset
			block(stagingBuffer.data(stagingOffset, size))
			if(!stagingBuffer.memory.type.isHostCoherent)
				flush(stagingBuffer.memory, stagingOffset, size)
			copy(buffer, stagingOffset, offset, size)
		}
	}


}