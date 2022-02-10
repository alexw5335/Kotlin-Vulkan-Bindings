package kvb.app

import kvb.core.memory.DirectList
import kvb.core.memory.MemStacks
import kvb.core.memory.direct.DirectByteBuffer
import kvb.vkwrapper.Vulkan
import kvb.vkwrapper.allocation.VkLinearAllocator
import kvb.vkwrapper.exception.VkException
import kvb.vkwrapper.handle.*
import kvb.vkwrapper.persistent.MemoryTypeP
import kvb.vulkan.*

class MemManager(
	val device           : Device,
	val queue            : Queue,
	val bufferMemorySize : Long = 10_000_000,
	val imageMemorySize  : Long = 32_000_000
) {


	val mappedType = device.physicalDevice.chooseMemoryType(
		property1 = MemoryPropertyFlags { HOST_VISIBLE },
		property2 = MemoryPropertyFlags { DEVICE_LOCAL },
		property3 = MemoryPropertyFlags { HOST_COHERENT }
	) ?: throw VkException("No mappable memory types")



	val dummyImage = device.createImage2D(32, 32, ImageUsageFlags.COLOR_ATTACHMENT)



	val bufferAllocator = VkLinearAllocator(
		device.allocateMemory(bufferMemorySize, mappedType.index)
	)



	val imageAllocator = VkLinearAllocator(
		device.allocateMemory(
			size = imageMemorySize,
			property1 = MemoryPropertyFlags { DEVICE_LOCAL },
			memoryTypeBits = dummyImage.memoryRequirementsP().memoryTypeBits
		)
	)



	/*
	Writing
	 */



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



	/*
	Allocation
	 */



	fun allocateBuffer(buffer: Buffer) = buffer.bindMemory(bufferAllocator.allocate(buffer))

	fun allocateImage(image: Image) = image.bindMemory(imageAllocator.allocate(image))



	fun buffer(size: Int, usage: BufferUsageFlags) =
		device.createBuffer(size.toLong(), usage).also(::allocateBuffer)

	fun image(width: Int, height: Int, usage: ImageUsageFlags, format: Format) =
		device.createImage2D(width, height, usage, format).also(::allocateImage)



	fun stagingBuffer(size: Int) = buffer(size, BufferUsageFlags.TRANSFER_SRC)

	fun vertexBuffer(size: Int) = buffer(size, BufferUsageFlags.VERTEX_BUFFER)

	fun uniformBuffer(size: Int) = buffer(size, BufferUsageFlags.UNIFORM_BUFFER)



	fun stagingBuffer(size: Int, block: (DirectByteBuffer) -> Unit) = stagingBuffer(size).also {
		write(it, block = block)
	}

	fun vertexBuffer(size: Int, block: (DirectByteBuffer) -> Unit) = vertexBuffer(size).also {
		write(it, block = block)
	}

	fun uniformBuffer(size: Int, block: (DirectByteBuffer) -> Unit) = uniformBuffer(size).also {
		write(it, block = block)
	}



	fun vertexBuffer(size: Int, floats: FloatArray) = vertexBuffer(size) {
		it.setFloats(0, floats)
	}

	fun stagingBuffer(size: Int, floats: FloatArray) = stagingBuffer(size) {
		it.setFloats(0, floats)
	}

	fun uniformBuffer(size: Int, floats: FloatArray) = uniformBuffer(size) {
		it.setFloats(0, floats)
	}



	/*
	Layout transitions
	 */



	private val commandPool = device.createTransientCommandPool(queue.family)

	private val commandBuffer = commandPool.allocatePrimary()

	private val fence = device.createFence()



	private fun oneTimeSubmit(block: (CommandBuffer) -> Unit) {
		commandBuffer.beginOneTimeSubmit()
		block(commandBuffer)
		commandBuffer.end()
		queue.submit(commandBuffer, fence)
		fence.wait()
		fence.reset()
		commandBuffer.reset()
	}



	private fun transitionImageLayout(
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



	fun updateImageForShaderRead(image: Image, stagingBuffer: Buffer) {
		oneTimeSubmit {
			transitionImageLayout(
				it,
				image,
				ImageLayout.SHADER_READ_ONLY_OPTIMAL,
				ImageLayout.TRANSFER_DST_OPTIMAL,
				AccessFlags { MEMORY_WRITE + MEMORY_READ },
				AccessFlags { MEMORY_WRITE + MEMORY_READ },
				PipelineStageFlags.ALL_COMMANDS,
				PipelineStageFlags.ALL_COMMANDS
			)
		}

		transitionImageForShaderRead(image, stagingBuffer)
	}



	fun transitionImageForShaderRead(image: Image, stagingBuffer: Buffer) = oneTimeSubmit {
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