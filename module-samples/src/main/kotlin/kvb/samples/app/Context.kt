package kvb.samples.app

import kvb.core.memory.DirectList
import kvb.core.memory.MemStacks
import kvb.core.memory.direct.DirectByteBuffer
import kvb.vkwrapper.Vulkan
import kvb.vkwrapper.handle.*
import kvb.vkwrapper.persistent.QueueFamily
import kvb.vulkan.*

class Context(
	val instance       : Instance,
	val debugMessenger : DebugUtilsMessenger?,
	val physicalDevice : PhysicalDevice,
	val queueFamily    : QueueFamily,
	val device         : Device,
	val queue          : Queue,
	val surfaceSystem  : SurfaceSystem?,
	val descriptorPool : DescriptorPool
) {


	/*
	Memory
	 */



	/**
	 * 2 ^ 20 is about 1MB. 2 ^ 25 is about 32MB.
	 */
	val memoryManager = VkMemoryManager(device, bufferMemorySize = 1 shl 25, imageMemorySize = 1 shl 25)



	val memoryRanges = DirectList(Vulkan.mem, 10) { MappedMemoryRange(it) { } }



	fun flushMemoryRanges() {
		device.commands.flushMappedMemoryRanges(memoryRanges.size, memoryRanges.buffer)
		memoryRanges.reset()
	}



	inline fun writeLazy(
		buffer : Buffer,
		offset : Long = 0,
		size   : Long = buffer.size,
		block  : (DirectByteBuffer) -> Unit
	) {
		block(buffer.data())

		if(buffer.memory.type.isHostCoherent) return

		memoryRanges.buffer[memoryRanges.next].let {
			it.memory = buffer.memory
			it.offset = offset
			it.size = size
		}
	}



	inline fun write(
		buffer : Buffer,
		offset : Long = 0,
		size   : Long = buffer.size,
		block  : (DirectByteBuffer) -> Unit
	) {
		block(buffer.data())
		if(buffer.memory.type.isHostCoherent) return
		buffer.flush(offset, size)
	}



	fun vertexBuffer(size: Int, block: (DirectByteBuffer) -> Unit) = device.createBuffer(
		size.toLong(),
		BufferUsageFlags.VERTEX_BUFFER
	).also {
		it.bindMemory(memoryManager.bufferAllocator.allocate(it))
		write(it, block = block)
	}



	fun stagingBuffer(size: Int, block: (DirectByteBuffer) -> Unit) = device.createBuffer(
		size.toLong(),
		BufferUsageFlags.TRANSFER_SRC
	).also {
		it.bindMemory(memoryManager.bufferAllocator.allocate(it))
		write(it, block = block)
	}



	/*
	Image layout transitions
	 */



	val transientCommandPool = device.createTransientCommandPool(queueFamily)



	private fun oneTimeSubmit(block: (CommandBuffer) -> Unit) {
		val commandBuffer = transientCommandPool.allocatePrimary()
		commandBuffer.beginOneTimeSubmit()
		block(commandBuffer)
		commandBuffer.end()
		queue.submit(commandBuffer)
		queue.waitIdle()
		transientCommandPool.reset()
	}



	fun transitionImageLayout(
		commandBuffer : CommandBuffer,
		image         : Image,
		prevLayout    : ImageLayout,
		newLayout     : ImageLayout,
		srcAccessMask : AccessFlags,
		dstAccessMask : AccessFlags,
		srcStages     : PipelineStageFlags,
		dstStages     : PipelineStageFlags
	) = MemStacks.with {
		commandBuffer.pipelineImageMemoryBarrier(srcStages, dstStages, ImageMemoryBarrier {
			it.srcQueueFamilyIndex = VK_QUEUE_FAMILY_IGNORED
			it.dstQueueFamilyIndex = VK_QUEUE_FAMILY_IGNORED
			it.oldLayout = prevLayout
			it.newLayout = newLayout
			it.image = image
			it.subresourceRange.aspectMask = ImageAspectFlags.COLOR
			it.subresourceRange.baseMipLevel = 0
			it.subresourceRange.levelCount = image.mipLevels
			it.subresourceRange.baseArrayLayer = 0
			it.subresourceRange.layerCount = image.arrayLayers
			it.srcAccessMask = srcAccessMask
			it.dstAccessMask = dstAccessMask
		})
	}



	fun transitionImage(image: Image, stagingBuffer: Buffer) = oneTimeSubmit {
		transitionImageLayout(
			it,
			image,
			ImageLayout.UNDEFINED,
			ImageLayout.TRANSFER_DST_OPTIMAL,
			AccessFlags.NONE,
			AccessFlags.TRANSFER_WRITE,
			PipelineStageFlags.TOP_OF_PIPE,
			PipelineStageFlags.TRANSFER
		)

		it.copyBufferToImage2D(stagingBuffer, image, ImageLayout.TRANSFER_DST_OPTIMAL)

		transitionImageLayout(
			it,
			image,
			ImageLayout.TRANSFER_DST_OPTIMAL,
			ImageLayout.SHADER_READ_ONLY_OPTIMAL,
			AccessFlags.TRANSFER_WRITE,
			AccessFlags.SHADER_READ,
			PipelineStageFlags.TRANSFER,
			PipelineStageFlags.FRAGMENT_SHADER
		)
	}


}